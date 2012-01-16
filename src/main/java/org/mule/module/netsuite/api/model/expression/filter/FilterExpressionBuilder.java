/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.expression.filter;

import static org.apache.commons.beanutils.MethodUtils.*;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;
import org.mule.module.netsuite.api.model.expression.PropertyAccess;
import org.mule.module.netsuite.api.model.expression.Quotes;
import org.mule.modules.utils.date.DateConventions;
import org.mule.modules.utils.date.XmlGregorianCalendars;

import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

public class FilterExpressionBuilder
{
    private SearchRecord target;
    private SearchRecord basic;
    private static ConvertUtilsBean convertUtils = new ConvertUtilsBean() { {
        register(new Converter() {
            @SuppressWarnings("rawtypes")
            @Override
            public Object convert(Class type, Object value)
            {
                return XmlGregorianCalendars.from(parse((String) value));
            }
            private Date parse(String value)
            {
                return DateConventions.defaultDateTimeFormat().parseDateTime(value).toDate();
            }
        }, XMLGregorianCalendar.class);
    } };
    

    public void setTarget(SearchRecordType targetRecordType)
    {
        target = targetRecordType.newSearchInstance();
        try
        {
            PropertyDescriptor descriptor = newDescriptor("basic", target);
            basic = (SearchRecord) descriptor.getPropertyType().newInstance();
            descriptor.getWriteMethod().invoke(target, basic);
        }
        catch (Exception e)
        {
            throw soften(e);
        }
    }

    public void addSimpleExpression(String operationName,
                                    String attributeName,
                                    Object firstArg,
                                    String secondArg)
    {
        try
        {
            addExpressionToGroup(operationName, attributeName, firstArg, secondArg, basic);
        }
        catch (Exception e)
        {
            throw soften(e);
        }
    }

    public void addJoinedExpression(String operationName,
                                    String joinName,
                                    String attributeName,
                                    Object firstArg,
                                    String secondArg)
    {
        try
        {
            addExpressionToGroup(operationName, attributeName, firstArg, secondArg,
                createOrGetAttributeGroup(joinName));
        }
        catch (Exception e)
        {
            throw soften(e);
        }
    }

    private SearchRecord createOrGetAttributeGroup(String joinName) throws Exception
    {
        PropertyDescriptor d = newDescriptor(joinName + "Join", target);
        SearchRecord attributeGroup = (SearchRecord) d.getReadMethod().invoke(target);
        if (attributeGroup == null)
        {
            attributeGroup = (SearchRecord) d.getPropertyType().newInstance();
            d.getWriteMethod().invoke(target, attributeGroup);
        }
        return attributeGroup;
    }

    private void addExpressionToGroup(String operationName,
                                      String attributeName,
                                      Object firstArg,
                                      String secondArg,
                                      SearchRecord attributeGroup) throws Exception
    {
        Object attribute = addAttribute(attributeName, attributeGroup);
        if (operationName.equals("isTrue"))
        {
            addBooleanOperation(attribute, firstArg, secondArg, "true");
        }
        else if (operationName.equals("isFalse"))
        {
            addBooleanOperation(attribute, firstArg, secondArg, "false");
        }
        else
        {
            addSimpleOperation(operationName, firstArg, secondArg, attribute);
        }
    }

    private void addBooleanOperation(Object attribute,
                                     Object firstArg,
                                     Object secondArg,
                                     String booleanValueAsString) throws Exception
    {
        Validate.isTrue(firstArg == null && secondArg == null, "isTrue/isFalse do not take arguments");
        setFirstArg(booleanValueAsString, attribute);
    }

    private void addSimpleOperation(String operationName, Object firstArg, String secondArg, Object attribute)
        throws Exception
    {
        if (firstArg != null)
        {
            setFirstArg(firstArg, attribute);
        }
        if (secondArg != null)
        {
            setSecondArg(secondArg, attribute);
        }
        setOperation(operationName, attribute);
    }

    private void setOperation(String operationName, Object attribute) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor("operator", attribute);
        descriptor.getWriteMethod().invoke(attribute,
            parseOperation(operationName, descriptor));
    }

	private Object parseOperation(String operationName,
			PropertyDescriptor descriptor) {
		try {
			return invokeExactStaticMethod(descriptor.getPropertyType(), "fromValue", operationName);
		} catch (Exception e) {
			throw new IllegalArgumentException(String.format(
					"Unsupported operation %s for operator type %s",
					operationName, descriptor.getPropertyType().getSimpleName()));
		}
	}

    private Object addAttribute(String attributeName, SearchRecord attributeGroup) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor(attributeName, attributeGroup);
        Object attributeObject = descriptor.getPropertyType().newInstance();
        descriptor.getWriteMethod().invoke(attributeGroup, attributeObject);
        return attributeObject;

    }

    private void setFirstArg(Object argument, Object attribute) throws Exception
    {
        convertAndSet(argument, "searchValue", attribute);
    }

    private void setSecondArg(String argument, Object attribute) throws Exception
    {
        convertAndSet(argument, "searchValue2", attribute);
    }

    private void convertAndSet(Object argument, String propertyName, Object attribute) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor(propertyName, attribute);
        
        try{
        	descriptor.getWriteMethod().invoke(attribute,
        			convert(argument, descriptor.getPropertyType(), attribute.getClass()));
        } catch(Exception e) {
			throw new IllegalArgumentException(String.format(
					"Can not set property %s of class %s with value %s",
					propertyName, attribute.getClass().getSimpleName(), argument), e);
        }
    }

    private Object convert(Object argument, Class<?> propertyType, Class<?> attributeClass)
    {
        return convertUtils.convert(removeQuotesIfPresent(argument), propertyType);
    }

    private Object removeQuotesIfPresent(Object argument)
    {
        return argument instanceof String ? Quotes.removeQuotesIfPresent((String) argument) : argument;
    }

    private PropertyDescriptor newDescriptor(String propertyName, Object object)
    {
        try
        {
            return new PropertyDescriptor(propertyName, object.getClass());
        }
        catch (IntrospectionException e)
        {
            throw PropertyAccess.propertyNotFound(propertyName, object);
        }
    }

    private RuntimeException soften(Exception e)
    {
        return (RuntimeException) (e instanceof RuntimeException ? e : new UnhandledException(e));
    }

    public SearchRecord build()
    {
        return target;
    }
    
    public static ConvertUtilsBean getConvertUtils()
    {
        return convertUtils;
    }

}

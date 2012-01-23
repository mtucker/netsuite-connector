/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.core_2010_2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.netsuite.webservices.platform.core_2010_2.types.SearchEnumMultiSelectFieldOperator;


/**
 * <p>Java class for SearchEnumMultiSelectField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchEnumMultiSelectField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{urn:types.core_2010_2.platform.webservices.netsuite.com}SearchEnumMultiSelectFieldOperator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchEnumMultiSelectField", propOrder = {
    "searchValue"
})
public class SearchEnumMultiSelectField {

    protected List<String> searchValue;
    @XmlAttribute(name = "operator")
    protected SearchEnumMultiSelectFieldOperator operator;
    
    public SearchEnumMultiSelectField()
    {
    }

    public SearchEnumMultiSelectField(List<String> searchValue, SearchEnumMultiSelectFieldOperator operator)
    {
        this.searchValue = searchValue;
        this.operator = operator;
    }

    /**
     * Gets the value of the searchValue property.
     */
    public List<String> getSearchValue() {
        if (searchValue == null) {
            searchValue = new ArrayList<String>();
        }
        return this.searchValue;
    }
    
    public void setSearchValue(List<String> searchValue)
    {
        this.searchValue = searchValue;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectFieldOperator }
     *     
     */
    public SearchEnumMultiSelectFieldOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectFieldOperator }
     *     
     */
    public void setOperator(SearchEnumMultiSelectFieldOperator value) {
        this.operator = value;
    }

}

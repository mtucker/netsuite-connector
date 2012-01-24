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

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mule.module.netsuite.api.model.expression.filter.parser.FilterExpressionParser;

import com.netsuite.webservices.documents.filecabinet_2010_2.FolderSearch;
import com.netsuite.webservices.lists.employees_2010_2.EmployeeSearch;
import com.netsuite.webservices.lists.relationships_2010_2.CustomerSearch;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.types.SearchEnumMultiSelectFieldOperator;
import com.netsuite.webservices.platform.core_2010_2.types.SearchLongFieldOperator;
import com.netsuite.webservices.platform.core_2010_2.types.SearchMultiSelectFieldOperator;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

/**
 * Test for {@link FilterExpressionParser}
 * 
 * @author flbulgarelli
 */
public class FilterExpressionParserUnitTest
{
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
    @Test
    public void testNullOrEmptyExpression() throws Exception
    {
        SearchRecord record = FilterExpressionParser.parse(SearchRecordType.EMPLOYEE, null);
        assertTrue(record instanceof EmployeeSearch);
    }
    
    @Test
    public void testBasicSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "greaterThan(consolDaysOverdue, 25)");
    }

    @Test
    public void testJoinedSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "equalTo(job.internalIdNumber, 136904)");
    }

    @Test
    public void testStringSyntaxQuotes() throws Exception
    {
        EmployeeSearch searchRecord = (EmployeeSearch) FilterExpressionParser.parse(
            SearchRecordType.EMPLOYEE, "is(email, 'john.doe@foobar.com')");
        assertEquals("john.doe@foobar.com", searchRecord.getBasic().getEmail().getSearchValue());
    }

    @Test
    public void testStringSyntaxDoubleQuotes() throws Exception
    {
        EmployeeSearch searchRecord = (EmployeeSearch) FilterExpressionParser.parse(
            SearchRecordType.EMPLOYEE, "is(email, \"john.doe@foobar.com\")");
        assertEquals("john.doe@foobar.com", searchRecord.getBasic().getEmail().getSearchValue());
    }

    @Test
    public void testBooleanSyntax() throws Exception
    {
        CustomerSearch record = (CustomerSearch) FilterExpressionParser.parse(SearchRecordType.CUSTOMER,
            "isTrue(job.giveAccess)");
        assertTrue(record.getJobJoin().getGiveAccess().isSearchValue());

        record = (CustomerSearch) FilterExpressionParser.parse(SearchRecordType.CUSTOMER,
            "isFalse(job.giveAccess)");
        assertFalse(record.getJobJoin().getGiveAccess().isSearchValue());
    }
    
    @Test
    public void testMultiEnumSyntax() throws Exception
    {
        EmployeeSearch record = (EmployeeSearch) FilterExpressionParser.parse(SearchRecordType.EMPLOYEE,
            "anyOf(globalSubscriptionStatus, [_confirmedOptOut, _softOptIn])");
        assertSame(SearchEnumMultiSelectFieldOperator.ANY_OF, record.getBasic()
            .getGlobalSubscriptionStatus()
            .getOperator());
        assertEquals(Arrays.asList("_confirmedOptOut", "_softOptIn"), record.getBasic().getGlobalSubscriptionStatus().getSearchValue());
    }
    
    @Test
    public void testMultiIdSyntax() throws Exception
    {
        FolderSearch record = (FolderSearch) FilterExpressionParser.parse(SearchRecordType.FOLDER,
            "noneOf(group, [internal('10'), internal('898')])");
        assertSame(SearchMultiSelectFieldOperator.NONE_OF, record.getBasic()
            .getGroup()
            .getOperator());
        List<RecordRef> searchValue = record.getBasic().getGroup().getSearchValue();
        assertEquals(2, searchValue.size());
        assertEquals("10", searchValue.get(0).getInternalId());
        assertEquals("898", searchValue.get(1).getInternalId());
    }

    @Test
    public void testAndSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER,
            "greaterThan(job.internalIdNumber, 136904), equalTo(consolDaysOverdue, 25) ");
    }

    @Test
    public void testTernarySyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "between(consolDaysOverdue, 10, 62)");
    }

    @Test
    public void testBadAttribute() throws Exception
    {
    	thrown.expect(IllegalArgumentException.class);
    	thrown.expectMessage("Invallid property consolOverdue for class CustomerSearchBasic");
    	
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "between(consolOverdue, 10, 62)");
    }
    
    @Test
    public void testBadAttributeType() throws Exception
    {
    	thrown.expect(IllegalArgumentException.class);
    	thrown.expectMessage("Can not set property searchValue of class SearchDateField with value 'hello'");
    	
    	FilterExpressionParser.parse(SearchRecordType.CUSTOMER,
                "greaterThan(file.modified, 'hello')");
    }

    @Test
    public void testBadSyntax() throws Exception
    {
    	thrown.expect(IllegalArgumentException.class);
    	thrown.expectMessage("Syntax error in date expression foobar");
    	
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "foobar");
    }

    @Test
    public void testParse() throws Exception
    {
        CustomerSearch searchRecord = (CustomerSearch) FilterExpressionParser.parse(
            SearchRecordType.CUSTOMER,
            "greaterThan(job.internalIdNumber, 136904), between(consolDaysOverdue, 10, 62), isTrue(job.giveAccess)");

        assertNotNull(searchRecord.getBasic());
        assertNotNull(searchRecord.getBasic().getConsolDaysOverdue());
        assertSame(SearchLongFieldOperator.BETWEEN, searchRecord.getBasic()
            .getConsolDaysOverdue()
            .getOperator());
        assertEquals((Long) 10L, searchRecord.getBasic().getConsolDaysOverdue().getSearchValue());
        assertEquals((Long) 62L, searchRecord.getBasic().getConsolDaysOverdue().getSearchValue2());

        assertNotNull(searchRecord.getJobJoin());
        assertEquals((Long) 136904L, searchRecord.getJobJoin().getInternalIdNumber().getSearchValue());
        assertSame(SearchLongFieldOperator.GREATER_THAN, searchRecord.getJobJoin()
            .getInternalIdNumber()
            .getOperator());
        assertNull(searchRecord.getJobJoin().getInternalIdNumber().getSearchValue2());

        assertNotNull(searchRecord.getJobJoin().getGiveAccess());
        assertTrue(searchRecord.getJobJoin().getGiveAccess().isSearchValue());
    }

}

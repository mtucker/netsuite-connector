/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite;

import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

/**
 * 
 * SearchRecordType
 * @author flbulgarelli
 */
public enum SearchRecordTypeEnum
{
    ACCOUNT(SearchRecordType.ACCOUNT),
    ACCOUNTING_PERIOD(SearchRecordType.ACCOUNTING_PERIOD),
    BIN(SearchRecordType.BIN),
    BUDGET(SearchRecordType.BUDGET),
    CALENDAR_EVENT(SearchRecordType.CALENDAR_EVENT),
    CAMPAIGN(SearchRecordType.CAMPAIGN),
    CLASSIFICATION(SearchRecordType.CLASSIFICATION),
    CONTACT(SearchRecordType.CONTACT),
    CUSTOMER(SearchRecordType.CUSTOMER),
    CUSTOM_RECORD(SearchRecordType.CUSTOM_RECORD),
    DEPARTMENT(SearchRecordType.DEPARTMENT),
    EMPLOYEE(SearchRecordType.EMPLOYEE),
    ENTITY_GROUP(SearchRecordType.ENTITY_GROUP),
    FILE(SearchRecordType.FILE),
    FOLDER(SearchRecordType.FOLDER),
    GIFT_CERTIFICATE(SearchRecordType.GIFT_CERTIFICATE),
    GROUP_MEMBER(SearchRecordType.GROUP_MEMBER),
    ITEM(SearchRecordType.ITEM),
    ISSUE(SearchRecordType.ISSUE),
    JOB(SearchRecordType.JOB),
    LOCATION(SearchRecordType.LOCATION),
    MESSAGE(SearchRecordType.MESSAGE),
    NOTE(SearchRecordType.NOTE),
    OPPORTUNITY(SearchRecordType.OPPORTUNITY),
    PARTNER(SearchRecordType.PARTNER),
    PHONE_CALL(SearchRecordType.PHONE_CALL),
    PRICE_LEVEL(SearchRecordType.PRICE_LEVEL),
    PROJECT_TASK(SearchRecordType.PROJECT_TASK),
    PROMOTION_CODE(SearchRecordType.PROMOTION_CODE),
    SALES_ROLE(SearchRecordType.SALES_ROLE),
    SOLUTION(SearchRecordType.SOLUTION),
    SITE_CATEGORY(SearchRecordType.SITE_CATEGORY),
    SUBSIDIARY(SearchRecordType.SUBSIDIARY),
    SUPPORT_CASE(SearchRecordType.SUPPORT_CASE),
    TASK(SearchRecordType.TASK),
    TIME_BILL(SearchRecordType.TIME_BILL),
    TOPIC(SearchRecordType.TOPIC),
    TRANSACTION(SearchRecordType.TRANSACTION),
    VENDOR(SearchRecordType.VENDOR);
        
    private SearchRecordType value;
        

    private SearchRecordTypeEnum(SearchRecordType value)
    {
        this.value = value;
    }


    public SearchRecordType toSearchRecordType()
    {
        return value;
    }
}



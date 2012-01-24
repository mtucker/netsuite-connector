/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import java.util.Date;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.mule.module.netsuite.api.annotation.NetSuiteOperation;
import org.mule.module.netsuite.api.annotation.ReturnType;
import org.mule.module.netsuite.api.model.entity.RecordId;
import org.mule.module.netsuite.api.model.entity.RecordReference;
import org.mule.module.netsuite.api.model.expression.date.DateExpression;

import com.netsuite.webservices.platform.core_2010_2.AsyncStatusResult;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;
import com.netsuite.webservices.platform.core_2010_2.types.InitializeType;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

public interface SoapNetSuiteClient extends NetSuiteClient<Object, Exception, Object>
{
    @NetSuiteOperation
    Object updateRecord(@NotNull RecordReference recordReference,
                        @NotNull Map<String, Object> recordAttributes) throws Exception;

    @NetSuiteOperation(resultName = "BaseRef", resultType = ReturnType.RECORD)
    Object addRecord(@NotNull RecordType recordType, @NotNull Map<String, Object> recordAttributes)
        throws Exception;

    @NetSuiteOperation
    Object attachRecord(@NotNull RecordReference sourceEntity,
                        @NotNull RecordReference destinationEntity,
                        RecordReference contactEntity) throws Exception;

    @NetSuiteOperation
    Object deleteRecord(RecordReference entity) throws Exception;

    @NetSuiteOperation
    Object detachRecord(@NotNull RecordReference sourceEntity, @NotNull RecordReference destinationEntity)
        throws Exception;

    @NetSuiteOperation(responseName = "GetDeletedResult", resultName = "DeletedRecord", resultType = ReturnType.LIST)
    Object getDeletedRecords(@NotNull RecordType type, @NotNull DateExpression whenExpression)
        throws Exception;

    @NetSuiteOperation(responseName = "ReadResponse", resultName = "Record", resultType = ReturnType.RECORD)
    Object getRecord(RecordReference entity) throws Exception;

    @NetSuiteOperation(responseName = "GetAllResult", resultName = "Record", resultType = ReturnType.LIST)
    Object getRecords(RecordType type) throws Exception;

    @NetSuiteOperation(responseName = "GetBudgetExchangeRateResult", resultName = "BudgetExchangeRate", resultType = ReturnType.LIST)
    Object getBudgetExchangeRates(@NotNull RecordId period,
                                  @NotNull RecordId fromSubsidiary,
                                  RecordId toSubsidiary) throws Exception;

    @NetSuiteOperation(responseName = "GetConsolidatedExchangeRateResult", resultName = "ConsolidatedExchangeRate", resultType = ReturnType.LIST)
    Object getConsolidatedExchangeRates(@NotNull RecordId period,
                                        @NotNull RecordId fromSubsidiary,
                                        RecordId toSubsidiary) throws Exception;

    @NetSuiteOperation(responseName = "GetCustomizationIdResult", resultName = "CustomizationRef", resultType = ReturnType.LIST)
    Object getCustomizationIds(@NotNull GetCustomizationType type, boolean includeInactives) throws Exception;

    @NetSuiteOperation(responseName = "GetItemAvailabilityResult", resultName = "ItemAvailability", resultType = ReturnType.LIST)
    Object getItemAvailabilities(@NotNull RecordReference recordReference, Date ifNotModifiedSince)
        throws Exception;

    @NetSuiteOperation(responseName = "GetSavedSearchResult", resultName = "RecordRef", resultType = ReturnType.LIST)
    Object getSavedSearch(@NotNull RecordType type) throws Exception;

    @NetSuiteOperation(responseName = "GetServerTimeResult", resultName = "ServerTime", resultType = ReturnType.RECORD)
    Object getServerTime() throws Exception;

    @NetSuiteOperation
    Object updateInviteeStatus(@NotNull RecordId eventId, @NotNull CalendarEventAttendeeResponse status)
        throws Exception;

    @NetSuiteOperation(adapt = false)
    Iterable<Record> findRecords(@NotNull SearchRecordType recordType, String expression) throws Exception;

    @NetSuiteOperation(adapt = false)
    Iterable<Record> savedFindRecords(@NotNull final SearchRecordType recordType, @NotNull String searchId)
        throws Exception; 

    @NetSuiteOperation(responseName = "ReadResponse", resultName = "Record", resultType = ReturnType.RECORD)
    Object initialize(@NotNull InitializeType type, @NotNull RecordReference recordReference) throws Exception;

    @NetSuiteOperation(adapt = false)
    AsyncStatusResult asyncFindRecord(@NotNull SearchRecordType recordType, @NotNull String expression)
        throws Exception;

    @NetSuiteOperation(adapt = false)
    Iterable<Record> getAsyncFindResult(@NotNull String jobId) throws Exception;

    @NetSuiteOperation(adapt = false)
    AsyncStatusResult checkAsyncStatus(@NotNull String jobId) throws Exception;

}

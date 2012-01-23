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

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;
import org.mule.module.netsuite.api.model.entity.RecordReference;

/**
 * Utility class for creating {@link RecordReferences} from connector arguments
 */
public final class RecordReferences
{
    private RecordReferences()
    {
    }

    public static RecordReference from(@NotNull RecordTypeEnum recordType,
                                       @NotNull String id,
                                       @NotNull RecordIdType idType)
    {
        Validate.notNull(recordType, "Must specify recordType");
        return new RecordReference(RecordIds.from(id, idType), recordType.toRecordType());
    }

    public static RecordReference nulSafeFrom(@NotNull RecordTypeEnum recordType,
                                              @NotNull String id,
                                              @NotNull RecordIdType idType)
    {
        return recordType != null ? from(recordType, id, idType)// 
                                 : fromNull(id, idType);
    }

    private static RecordReference fromNull(String id, RecordIdType idType)
    {
        Validate.isTrue(id == null, "Must specify recordType");
        return null;
    }

}

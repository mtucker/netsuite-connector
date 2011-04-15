/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.entity;

import org.mule.module.netsuite.api.internal.RecordRef;

public interface EntityId
{
    RecordRef createRef();

    abstract class AbstractId implements EntityId
    {
        public RecordRef createRef()
        {
            RecordRef recordRef = new RecordRef();
            populate(recordRef);
            return recordRef;
        }

        abstract void populate(RecordRef recordRef);
    }

    class ExternalId extends AbstractId
    {
        private final String id;

        public ExternalId(String id)
        {
            this.id = id;
        }

        public void populate(RecordRef recordRef)
        {
            recordRef.setInternalId(id);
        }
    }

    class InternalId extends AbstractId
    {
        private final String id;

        public InternalId(String id)
        {
            this.id = id;
        }

        public void populate(RecordRef recordRef)
        {
            recordRef.setInternalId(id);
        }
    }

}
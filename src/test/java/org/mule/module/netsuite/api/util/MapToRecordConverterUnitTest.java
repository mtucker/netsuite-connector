/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.util;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;

import org.junit.Test;
import org.mule.modules.utils.mom.JaxbMapObjectMappers;

import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEvent;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.zauberlabs.commons.mom.MapObjectMapper;

/**
 * Test for {@link MapToRecordConverter}
 * 
 * @author flbulgarelli
 */
@SuppressWarnings("serial")
public class MapToRecordConverterUnitTest
{
    private final MapObjectMapper mom = JaxbMapObjectMappers.defaultWithPackage("com.netsuite.webservices").build();
    
    /**
     * Test that a map can be converted into record, applying attribute conversions
     * if necessary
     */
    @Test
    public void testToRecord() throws Exception
    {
        final String title = "An importat event";
        final String location = "Pekin";
        CalendarEvent record = (CalendarEvent) mom.unmap(
            new HashMap<String, Object>()
            {
                {
                    put("sendEmail", true);
                    put("title", title);
                    put("period", "2");
                    put("location", location);
                    put("startDate", new Date());
                }
            }, RecordType.CALENDAR_EVENT.getRecordClass());

        assertTrue(record.isSendEmail());
        assertEquals((Long) 2L, record.getPeriod());
        assertEquals(title, record.getTitle());
        assertEquals(location, record.getLocation());
        assertNotNull(record.getStartDate());
    }
    
    /**
     * Test that a map can be converted into record, applying attribute conversions
     * if necessary
     */
    @Test(expected = IllegalArgumentException.class)
    public void testToRecordBadAttribute() throws Exception
    {
        mom.unmap(
            new HashMap<String, Object>()
            {
                {
                    put("sendEmail", true);
                    put("title", "title");
                    put("foobar", "2");
                }
            }, RecordType.CALENDAR_EVENT.getRecordClass());
    }
}

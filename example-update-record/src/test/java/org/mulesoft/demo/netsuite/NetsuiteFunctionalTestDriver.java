/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mulesoft.demo.netsuite;

import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.tck.FunctionalTestCase;

public class NetsuiteFunctionalTestDriver extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "mule-config.xml";
    }

    public void testUpdateFlow() throws Exception
    {
        final MuleEvent event = getTestEvent("");
        final MessageProcessor flow = lookupFlowConstruct("MainFlow");
        final MuleEvent responseEvent = flow.process(event);
        System.out.println(responseEvent);
    }

    private MessageProcessor lookupFlowConstruct(final String name)
    {
        return (MessageProcessor) muleContext.getRegistry().lookupFlowConstruct(name);
    }

}

/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.messages_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.netsuite.webservices.platform.core_2010_2.GetDeletedResult;


/**
 * <p>Java class for GetDeletedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeletedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}getDeletedResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeletedResponse", propOrder = {
    "getDeletedResult"
})
public class GetDeletedResponse {

    @XmlElement(namespace = "urn:core_2010_2.platform.webservices.netsuite.com", required = true)
    protected GetDeletedResult getDeletedResult;

    /**
     * Gets the value of the getDeletedResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeletedResult }
     *     
     */
    public GetDeletedResult getGetDeletedResult() {
        return getDeletedResult;
    }

    /**
     * Sets the value of the getDeletedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeletedResult }
     *     
     */
    public void setGetDeletedResult(GetDeletedResult value) {
        this.getDeletedResult = value;
    }

}

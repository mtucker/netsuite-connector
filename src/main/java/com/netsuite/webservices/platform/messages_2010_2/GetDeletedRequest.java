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

import com.netsuite.webservices.platform.core_2010_2.GetDeletedFilter;


/**
 * <p>Java class for GetDeletedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeletedRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDeletedFilter" type="{urn:core_2010_2.platform.webservices.netsuite.com}GetDeletedFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeletedRequest", propOrder = {
    "getDeletedFilter"
})
public class GetDeletedRequest {

    @XmlElement(required = true)
    protected GetDeletedFilter getDeletedFilter;
    
    public GetDeletedRequest()
    {
    }
    
    public GetDeletedRequest(GetDeletedFilter getDeletedFilter)
    {
        this.getDeletedFilter = getDeletedFilter;
    }

    /**
     * Gets the value of the getDeletedFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeletedFilter }
     *     
     */
    public GetDeletedFilter getGetDeletedFilter() {
        return getDeletedFilter;
    }

    /**
     * Sets the value of the getDeletedFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeletedFilter }
     *     
     */
    public void setGetDeletedFilter(GetDeletedFilter value) {
        this.getDeletedFilter = value;
    }

}

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

import com.netsuite.webservices.platform.core_2010_2.UpdateInviteeStatusReference;


/**
 * <p>Java class for UpdateInviteeStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInviteeStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateInviteeStatusReference" type="{urn:core_2010_2.platform.webservices.netsuite.com}UpdateInviteeStatusReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInviteeStatusRequest", propOrder = {
    "updateInviteeStatusReference"
})
public class UpdateInviteeStatusRequest {

    @XmlElement(required = true)
    protected UpdateInviteeStatusReference updateInviteeStatusReference;
    
    
    public UpdateInviteeStatusRequest()
    {
    }

    public UpdateInviteeStatusRequest(UpdateInviteeStatusReference updateInviteeStatusReference)
    {
        this.updateInviteeStatusReference = updateInviteeStatusReference;
    }

    /**
     * Gets the value of the updateInviteeStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateInviteeStatusReference }
     *     
     */
    public UpdateInviteeStatusReference getUpdateInviteeStatusReference() {
        return updateInviteeStatusReference;
    }

    /**
     * Sets the value of the updateInviteeStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateInviteeStatusReference }
     *     
     */
    public void setUpdateInviteeStatusReference(UpdateInviteeStatusReference value) {
        this.updateInviteeStatusReference = value;
    }

}

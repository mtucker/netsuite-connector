/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.accounting_2010_2;

import com.netsuite.webservices.platform.core_2010_2.RecordRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingRates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billingClass" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="rateList" type="{urn:accounting_2010_2.lists.webservices.netsuite.com}RateList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingRates", propOrder = {
    "currency",
    "billingClass",
    "rateList"
})
public class BillingRates {

    protected RecordRef currency;
    protected RecordRef billingClass;
    protected RateList rateList;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the billingClass property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingClass() {
        return billingClass;
    }

    /**
     * Sets the value of the billingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingClass(RecordRef value) {
        this.billingClass = value;
    }

    /**
     * Gets the value of the rateList property.
     * 
     * @return
     *     possible object is
     *     {@link RateList }
     *     
     */
    public RateList getRateList() {
        return rateList;
    }

    /**
     * Sets the value of the rateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateList }
     *     
     */
    public void setRateList(RateList value) {
        this.rateList = value;
    }

}

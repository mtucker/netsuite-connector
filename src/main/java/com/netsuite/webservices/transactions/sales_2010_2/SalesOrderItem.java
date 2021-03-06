/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.sales_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.netsuite.webservices.platform.common_2010_2.types.ItemCostEstimateType;
import com.netsuite.webservices.platform.common_2010_2.types.VsoeDeferral;
import com.netsuite.webservices.platform.common_2010_2.types.VsoePermitDiscount;
import com.netsuite.webservices.platform.core_2010_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.transactions.sales_2010_2.types.SalesOrderItemCommitInventory;
import com.netsuite.webservices.transactions.sales_2010_2.types.SalesOrderItemCreatePo;


/**
 * <p>Java class for SalesOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="job" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantityAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="units" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="commitInventory" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}SalesOrderItemCommitInventory" minOccurs="0"/>
 *         &lt;element name="licenseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="options" type="{urn:core_2010_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createPo" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}SalesOrderItemCreatePo" minOccurs="0"/>
 *         &lt;element name="createdPo" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="altSalesAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="createWo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="poVendor" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="poCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revRecTermInMonths" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="revRecEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deferRevRec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fromJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="grossAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isEstimate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="percentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityBilled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityCommitted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityFulfilled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityPacked" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityPicked" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tax1Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxRate1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxRate2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="giftCertFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCertRecipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCertRecipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCertMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCertNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="itemIsFulfilled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipAddress" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipMethod" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="vsoePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vsoeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vsoeAllocation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderItem", propOrder = {
    "job",
    "item",
    "quantityAvailable",
    "quantityOnHand",
    "quantity",
    "units",
    "description",
    "price",
    "rate",
    "serialNumbers",
    "amount",
    "isTaxable",
    "commitInventory",
    "licenseCode",
    "options",
    "department",
    "clazz",
    "location",
    "createPo",
    "createdPo",
    "altSalesAmt",
    "createWo",
    "poVendor",
    "poCurrency",
    "poRate",
    "revRecSchedule",
    "revRecStartDate",
    "revRecTermInMonths",
    "revRecEndDate",
    "deferRevRec",
    "isClosed",
    "billingSchedule",
    "fromJob",
    "grossAmt",
    "isEstimate",
    "line",
    "percentComplete",
    "costEstimateType",
    "costEstimate",
    "quantityBackOrdered",
    "quantityBilled",
    "quantityCommitted",
    "quantityFulfilled",
    "quantityPacked",
    "quantityPicked",
    "tax1Amt",
    "taxCode",
    "taxRate1",
    "taxRate2",
    "giftCertFrom",
    "giftCertRecipientName",
    "giftCertRecipientEmail",
    "giftCertMessage",
    "giftCertNumber",
    "shipGroup",
    "itemIsFulfilled",
    "shipAddress",
    "shipMethod",
    "vsoePrice",
    "vsoeAmount",
    "vsoeAllocation",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "customFieldList"
})
public class SalesOrderItem {

    protected RecordRef job;
    protected RecordRef item;
    protected Double quantityAvailable;
    protected Double quantityOnHand;
    protected Double quantity;
    protected RecordRef units;
    protected String description;
    protected RecordRef price;
    protected String rate;
    protected String serialNumbers;
    protected Double amount;
    protected Boolean isTaxable;
    protected SalesOrderItemCommitInventory commitInventory;
    protected String licenseCode;
    protected CustomFieldList options;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected SalesOrderItemCreatePo createPo;
    protected RecordRef createdPo;
    protected Double altSalesAmt;
    protected Boolean createWo;
    protected RecordRef poVendor;
    protected String poCurrency;
    protected Double poRate;
    protected RecordRef revRecSchedule;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecStartDate;
    protected Long revRecTermInMonths;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecEndDate;
    protected Boolean deferRevRec;
    protected Boolean isClosed;
    protected RecordRef billingSchedule;
    protected Boolean fromJob;
    protected Double grossAmt;
    protected Boolean isEstimate;
    protected Long line;
    protected Double percentComplete;
    protected ItemCostEstimateType costEstimateType;
    protected Double costEstimate;
    protected Double quantityBackOrdered;
    protected Double quantityBilled;
    protected Double quantityCommitted;
    protected Double quantityFulfilled;
    protected Double quantityPacked;
    protected Double quantityPicked;
    protected Double tax1Amt;
    protected RecordRef taxCode;
    protected Double taxRate1;
    protected Double taxRate2;
    protected String giftCertFrom;
    protected String giftCertRecipientName;
    protected String giftCertRecipientEmail;
    protected String giftCertMessage;
    protected String giftCertNumber;
    protected Long shipGroup;
    protected Boolean itemIsFulfilled;
    protected RecordRef shipAddress;
    protected RecordRef shipMethod;
    protected Double vsoePrice;
    protected Double vsoeAmount;
    protected Double vsoeAllocation;
    protected VsoeDeferral vsoeDeferral;
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected CustomFieldList customFieldList;

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJob(RecordRef value) {
        this.job = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityAvailable(Double value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnHand(Double value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnits(RecordRef value) {
        this.units = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPrice(RecordRef value) {
        this.price = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the serialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * Sets the value of the serialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumbers(String value) {
        this.serialNumbers = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxable() {
        return isTaxable;
    }

    /**
     * Sets the value of the isTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxable(Boolean value) {
        this.isTaxable = value;
    }

    /**
     * Gets the value of the commitInventory property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderItemCommitInventory }
     *     
     */
    public SalesOrderItemCommitInventory getCommitInventory() {
        return commitInventory;
    }

    /**
     * Sets the value of the commitInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderItemCommitInventory }
     *     
     */
    public void setCommitInventory(SalesOrderItemCommitInventory value) {
        this.commitInventory = value;
    }

    /**
     * Gets the value of the licenseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseCode() {
        return licenseCode;
    }

    /**
     * Sets the value of the licenseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseCode(String value) {
        this.licenseCode = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setOptions(CustomFieldList value) {
        this.options = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * Gets the value of the createPo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderItemCreatePo }
     *     
     */
    public SalesOrderItemCreatePo getCreatePo() {
        return createPo;
    }

    /**
     * Sets the value of the createPo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderItemCreatePo }
     *     
     */
    public void setCreatePo(SalesOrderItemCreatePo value) {
        this.createPo = value;
    }

    /**
     * Gets the value of the createdPo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreatedPo() {
        return createdPo;
    }

    /**
     * Sets the value of the createdPo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreatedPo(RecordRef value) {
        this.createdPo = value;
    }

    /**
     * Gets the value of the altSalesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltSalesAmt() {
        return altSalesAmt;
    }

    /**
     * Sets the value of the altSalesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltSalesAmt(Double value) {
        this.altSalesAmt = value;
    }

    /**
     * Gets the value of the createWo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateWo() {
        return createWo;
    }

    /**
     * Sets the value of the createWo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateWo(Boolean value) {
        this.createWo = value;
    }

    /**
     * Gets the value of the poVendor property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPoVendor() {
        return poVendor;
    }

    /**
     * Sets the value of the poVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPoVendor(RecordRef value) {
        this.poVendor = value;
    }

    /**
     * Gets the value of the poCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoCurrency() {
        return poCurrency;
    }

    /**
     * Sets the value of the poCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoCurrency(String value) {
        this.poCurrency = value;
    }

    /**
     * Gets the value of the poRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPoRate() {
        return poRate;
    }

    /**
     * Sets the value of the poRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoRate(Double value) {
        this.poRate = value;
    }

    /**
     * Gets the value of the revRecSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }

    /**
     * Sets the value of the revRecSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecSchedule(RecordRef value) {
        this.revRecSchedule = value;
    }

    /**
     * Gets the value of the revRecStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecStartDate() {
        return revRecStartDate;
    }

    /**
     * Sets the value of the revRecStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecStartDate(XMLGregorianCalendar value) {
        this.revRecStartDate = value;
    }

    /**
     * Gets the value of the revRecTermInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevRecTermInMonths() {
        return revRecTermInMonths;
    }

    /**
     * Sets the value of the revRecTermInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevRecTermInMonths(Long value) {
        this.revRecTermInMonths = value;
    }

    /**
     * Gets the value of the revRecEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecEndDate() {
        return revRecEndDate;
    }

    /**
     * Sets the value of the revRecEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecEndDate(XMLGregorianCalendar value) {
        this.revRecEndDate = value;
    }

    /**
     * Gets the value of the deferRevRec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferRevRec() {
        return deferRevRec;
    }

    /**
     * Sets the value of the deferRevRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferRevRec(Boolean value) {
        this.deferRevRec = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClosed(Boolean value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingSchedule(RecordRef value) {
        this.billingSchedule = value;
    }

    /**
     * Gets the value of the fromJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromJob() {
        return fromJob;
    }

    /**
     * Sets the value of the fromJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromJob(Boolean value) {
        this.fromJob = value;
    }

    /**
     * Gets the value of the grossAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossAmt() {
        return grossAmt;
    }

    /**
     * Sets the value of the grossAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossAmt(Double value) {
        this.grossAmt = value;
    }

    /**
     * Gets the value of the isEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEstimate() {
        return isEstimate;
    }

    /**
     * Sets the value of the isEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEstimate(Boolean value) {
        this.isEstimate = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLine(Long value) {
        this.line = value;
    }

    /**
     * Gets the value of the percentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Gets the value of the costEstimateType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCostEstimateType }
     *     
     */
    public ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }

    /**
     * Sets the value of the costEstimateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCostEstimateType }
     *     
     */
    public void setCostEstimateType(ItemCostEstimateType value) {
        this.costEstimateType = value;
    }

    /**
     * Gets the value of the costEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostEstimate() {
        return costEstimate;
    }

    /**
     * Sets the value of the costEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostEstimate(Double value) {
        this.costEstimate = value;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * Sets the value of the quantityBackOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBackOrdered(Double value) {
        this.quantityBackOrdered = value;
    }

    /**
     * Gets the value of the quantityBilled property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBilled() {
        return quantityBilled;
    }

    /**
     * Sets the value of the quantityBilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBilled(Double value) {
        this.quantityBilled = value;
    }

    /**
     * Gets the value of the quantityCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * Sets the value of the quantityCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityCommitted(Double value) {
        this.quantityCommitted = value;
    }

    /**
     * Gets the value of the quantityFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityFulfilled() {
        return quantityFulfilled;
    }

    /**
     * Sets the value of the quantityFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityFulfilled(Double value) {
        this.quantityFulfilled = value;
    }

    /**
     * Gets the value of the quantityPacked property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityPacked() {
        return quantityPacked;
    }

    /**
     * Sets the value of the quantityPacked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityPacked(Double value) {
        this.quantityPacked = value;
    }

    /**
     * Gets the value of the quantityPicked property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityPicked() {
        return quantityPicked;
    }

    /**
     * Sets the value of the quantityPicked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityPicked(Double value) {
        this.quantityPicked = value;
    }

    /**
     * Gets the value of the tax1Amt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax1Amt() {
        return tax1Amt;
    }

    /**
     * Sets the value of the tax1Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax1Amt(Double value) {
        this.tax1Amt = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxCode(RecordRef value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate1() {
        return taxRate1;
    }

    /**
     * Sets the value of the taxRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate1(Double value) {
        this.taxRate1 = value;
    }

    /**
     * Gets the value of the taxRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate2() {
        return taxRate2;
    }

    /**
     * Sets the value of the taxRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate2(Double value) {
        this.taxRate2 = value;
    }

    /**
     * Gets the value of the giftCertFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertFrom() {
        return giftCertFrom;
    }

    /**
     * Sets the value of the giftCertFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertFrom(String value) {
        this.giftCertFrom = value;
    }

    /**
     * Gets the value of the giftCertRecipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertRecipientName() {
        return giftCertRecipientName;
    }

    /**
     * Sets the value of the giftCertRecipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertRecipientName(String value) {
        this.giftCertRecipientName = value;
    }

    /**
     * Gets the value of the giftCertRecipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertRecipientEmail() {
        return giftCertRecipientEmail;
    }

    /**
     * Sets the value of the giftCertRecipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertRecipientEmail(String value) {
        this.giftCertRecipientEmail = value;
    }

    /**
     * Gets the value of the giftCertMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertMessage() {
        return giftCertMessage;
    }

    /**
     * Sets the value of the giftCertMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertMessage(String value) {
        this.giftCertMessage = value;
    }

    /**
     * Gets the value of the giftCertNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertNumber() {
        return giftCertNumber;
    }

    /**
     * Sets the value of the giftCertNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertNumber(String value) {
        this.giftCertNumber = value;
    }

    /**
     * Gets the value of the shipGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipGroup() {
        return shipGroup;
    }

    /**
     * Sets the value of the shipGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipGroup(Long value) {
        this.shipGroup = value;
    }

    /**
     * Gets the value of the itemIsFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemIsFulfilled() {
        return itemIsFulfilled;
    }

    /**
     * Sets the value of the itemIsFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemIsFulfilled(Boolean value) {
        this.itemIsFulfilled = value;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipAddress() {
        return shipAddress;
    }

    /**
     * Sets the value of the shipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipAddress(RecordRef value) {
        this.shipAddress = value;
    }

    /**
     * Gets the value of the shipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipMethod() {
        return shipMethod;
    }

    /**
     * Sets the value of the shipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipMethod(RecordRef value) {
        this.shipMethod = value;
    }

    /**
     * Gets the value of the vsoePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVsoePrice() {
        return vsoePrice;
    }

    /**
     * Sets the value of the vsoePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVsoePrice(Double value) {
        this.vsoePrice = value;
    }

    /**
     * Gets the value of the vsoeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVsoeAmount() {
        return vsoeAmount;
    }

    /**
     * Sets the value of the vsoeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVsoeAmount(Double value) {
        this.vsoeAmount = value;
    }

    /**
     * Gets the value of the vsoeAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVsoeAllocation() {
        return vsoeAllocation;
    }

    /**
     * Sets the value of the vsoeAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVsoeAllocation(Double value) {
        this.vsoeAllocation = value;
    }

    /**
     * Gets the value of the vsoeDeferral property.
     * 
     * @return
     *     possible object is
     *     {@link VsoeDeferral }
     *     
     */
    public VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }

    /**
     * Sets the value of the vsoeDeferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsoeDeferral }
     *     
     */
    public void setVsoeDeferral(VsoeDeferral value) {
        this.vsoeDeferral = value;
    }

    /**
     * Gets the value of the vsoePermitDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }

    /**
     * Sets the value of the vsoePermitDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public void setVsoePermitDiscount(VsoePermitDiscount value) {
        this.vsoePermitDiscount = value;
    }

    /**
     * Gets the value of the vsoeDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoeDelivered() {
        return vsoeDelivered;
    }

    /**
     * Sets the value of the vsoeDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoeDelivered(Boolean value) {
        this.vsoeDelivered = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

}

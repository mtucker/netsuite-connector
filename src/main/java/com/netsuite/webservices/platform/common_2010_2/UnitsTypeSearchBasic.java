/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.common_2010_2;

import com.netsuite.webservices.platform.core_2010_2.SearchBooleanField;
import com.netsuite.webservices.platform.core_2010_2.SearchLongField;
import com.netsuite.webservices.platform.core_2010_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.SearchStringField;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitsTypeSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitsTypeSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="abbreviation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="baseUnit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isInActive" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="pluralAbbreviation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="pluralName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="unitName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitsTypeSearchBasic", propOrder = {
    "abbreviation",
    "baseUnit",
    "conversionRate",
    "externalId",
    "externalIdString",
    "internalId",
    "internalIdNumber",
    "isInActive",
    "name",
    "pluralAbbreviation",
    "pluralName",
    "unitName"
})
public class UnitsTypeSearchBasic
    extends SearchRecord
{

    protected SearchStringField abbreviation;
    protected SearchBooleanField baseUnit;
    protected SearchStringField conversionRate;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInActive;
    protected SearchStringField name;
    protected SearchStringField pluralAbbreviation;
    protected SearchStringField pluralName;
    protected SearchStringField unitName;

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAbbreviation(SearchStringField value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the baseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBaseUnit() {
        return baseUnit;
    }

    /**
     * Sets the value of the baseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBaseUnit(SearchBooleanField value) {
        this.baseUnit = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setConversionRate(SearchStringField value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalIdString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * Sets the value of the externalIdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the isInActive property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInActive() {
        return isInActive;
    }

    /**
     * Sets the value of the isInActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInActive(SearchBooleanField value) {
        this.isInActive = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setName(SearchStringField value) {
        this.name = value;
    }

    /**
     * Gets the value of the pluralAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPluralAbbreviation() {
        return pluralAbbreviation;
    }

    /**
     * Sets the value of the pluralAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPluralAbbreviation(SearchStringField value) {
        this.pluralAbbreviation = value;
    }

    /**
     * Gets the value of the pluralName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPluralName() {
        return pluralName;
    }

    /**
     * Sets the value of the pluralName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPluralName(SearchStringField value) {
        this.pluralName = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setUnitName(SearchStringField value) {
        this.unitName = value;
    }

}

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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.netsuite.webservices.platform.core_2010_2.SearchRecord;


/**
 * <p>Java class for ContactCategorySearchAdvanced complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactCategorySearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{urn:accounting_2010_2.lists.webservices.netsuite.com}ContactCategorySearch" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:accounting_2010_2.lists.webservices.netsuite.com}ContactCategorySearchRow" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="savedSearchId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="savedSearchScriptId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactCategorySearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class ContactCategorySearchAdvanced
    extends SearchRecord
{

    protected ContactCategorySearch criteria;
    protected ContactCategorySearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ContactCategorySearch }
     *     
     */
    public ContactCategorySearch getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactCategorySearch }
     *     
     */
    public void setCriteria(ContactCategorySearch value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ContactCategorySearchRow }
     *     
     */
    public ContactCategorySearchRow getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactCategorySearchRow }
     *     
     */
    public void setColumns(ContactCategorySearchRow value) {
        this.columns = value;
    }

    /**
     * Gets the value of the savedSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Sets the value of the savedSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchId(String value) {
        this.savedSearchId = value;
    }

    /**
     * Gets the value of the savedSearchScriptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }

    /**
     * Sets the value of the savedSearchScriptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchScriptId(String value) {
        this.savedSearchScriptId = value;
    }

}

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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.netsuite.webservices.platform.core_2010_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnCustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDateField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDoubleField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnLongField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnStringField;


/**
 * <p>Java class for VendorSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address1" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address2" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address3" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addressee" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addressInternalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addressLabel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addressPhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altContact" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altEmail" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altPhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attention" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="balance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billAddress" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billAddress1" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billAddress2" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billAddress3" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billAddressee" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billAttention" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billCity" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billCountry" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billCountryCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billPhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billState" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billZipCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="city" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comments" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currentExchangeRate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eligibleForCommission" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emailTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entityId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entityNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expenseAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fax" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="faxTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasDuplicates" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="is1099Eligible" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isDefaultBilling" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isDefaultShipping" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isJobResourceVend" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isPerson" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="laborCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="level" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="middleName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pec" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="permission" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="printOnCheckAs" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="printTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salutation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipAddress" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipAddress1" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipAddress2" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipAddress3" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipAddressee" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipAttention" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipCity" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipCountry" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipCountryCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipPhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipState" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipZip" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="state" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subscription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subscriptionDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subscriptionStatus" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxIdNum" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="terms" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unbilledOrders" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vatRegNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="workCalendar" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorSearchRowBasic", propOrder = {
    "accountNumber",
    "address",
    "address1",
    "address2",
    "address3",
    "addressee",
    "addressInternalId",
    "addressLabel",
    "addressPhone",
    "altContact",
    "altEmail",
    "altName",
    "altPhone",
    "attention",
    "balance",
    "billAddress",
    "billAddress1",
    "billAddress2",
    "billAddress3",
    "billAddressee",
    "billAttention",
    "billCity",
    "billCountry",
    "billCountryCode",
    "billPhone",
    "billState",
    "billZipCode",
    "category",
    "city",
    "comments",
    "companyName",
    "contact",
    "country",
    "countryCode",
    "creditLimit",
    "currency",
    "currentExchangeRate",
    "dateCreated",
    "eligibleForCommission",
    "email",
    "emailTransactions",
    "entityId",
    "entityNumber",
    "expenseAccount",
    "externalId",
    "fax",
    "faxTransactions",
    "firstName",
    "giveAccess",
    "globalSubscriptionStatus",
    "hasDuplicates",
    "homePhone",
    "image",
    "internalId",
    "is1099Eligible",
    "isDefaultBilling",
    "isDefaultShipping",
    "isInactive",
    "isJobResourceVend",
    "isPerson",
    "laborCost",
    "language",
    "lastModifiedDate",
    "lastName",
    "level",
    "middleName",
    "mobilePhone",
    "pec",
    "permission",
    "phone",
    "phoneticName",
    "printOnCheckAs",
    "printTransactions",
    "salutation",
    "shipAddress",
    "shipAddress1",
    "shipAddress2",
    "shipAddress3",
    "shipAddressee",
    "shipAttention",
    "shipCity",
    "shipCountry",
    "shipCountryCode",
    "shipPhone",
    "shipState",
    "shipZip",
    "state",
    "subscription",
    "subscriptionDate",
    "subscriptionStatus",
    "subsidiary",
    "taxIdNum",
    "terms",
    "title",
    "unbilledOrders",
    "url",
    "vatRegNumber",
    "workCalendar",
    "zipCode",
    "customFieldList"
})
public class VendorSearchRowBasic {

    protected List<SearchColumnStringField> accountNumber;
    protected List<SearchColumnStringField> address;
    protected List<SearchColumnStringField> address1;
    protected List<SearchColumnStringField> address2;
    protected List<SearchColumnStringField> address3;
    protected List<SearchColumnStringField> addressee;
    protected List<SearchColumnStringField> addressInternalId;
    protected List<SearchColumnStringField> addressLabel;
    protected List<SearchColumnStringField> addressPhone;
    protected List<SearchColumnStringField> altContact;
    protected List<SearchColumnStringField> altEmail;
    protected List<SearchColumnStringField> altName;
    protected List<SearchColumnStringField> altPhone;
    protected List<SearchColumnStringField> attention;
    protected List<SearchColumnDoubleField> balance;
    protected List<SearchColumnStringField> billAddress;
    protected List<SearchColumnStringField> billAddress1;
    protected List<SearchColumnStringField> billAddress2;
    protected List<SearchColumnStringField> billAddress3;
    protected List<SearchColumnStringField> billAddressee;
    protected List<SearchColumnStringField> billAttention;
    protected List<SearchColumnStringField> billCity;
    protected List<SearchColumnEnumSelectField> billCountry;
    protected List<SearchColumnStringField> billCountryCode;
    protected List<SearchColumnStringField> billPhone;
    protected List<SearchColumnStringField> billState;
    protected List<SearchColumnStringField> billZipCode;
    protected List<SearchColumnSelectField> category;
    protected List<SearchColumnStringField> city;
    protected List<SearchColumnStringField> comments;
    protected List<SearchColumnStringField> companyName;
    protected List<SearchColumnStringField> contact;
    protected List<SearchColumnEnumSelectField> country;
    protected List<SearchColumnStringField> countryCode;
    protected List<SearchColumnDoubleField> creditLimit;
    protected List<SearchColumnSelectField> currency;
    protected List<SearchColumnDoubleField> currentExchangeRate;
    protected List<SearchColumnDateField> dateCreated;
    protected List<SearchColumnBooleanField> eligibleForCommission;
    protected List<SearchColumnStringField> email;
    protected List<SearchColumnBooleanField> emailTransactions;
    protected List<SearchColumnStringField> entityId;
    protected List<SearchColumnLongField> entityNumber;
    protected List<SearchColumnSelectField> expenseAccount;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnStringField> fax;
    protected List<SearchColumnBooleanField> faxTransactions;
    protected List<SearchColumnStringField> firstName;
    protected List<SearchColumnBooleanField> giveAccess;
    protected List<SearchColumnEnumSelectField> globalSubscriptionStatus;
    protected List<SearchColumnBooleanField> hasDuplicates;
    protected List<SearchColumnStringField> homePhone;
    protected List<SearchColumnSelectField> image;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnBooleanField> is1099Eligible;
    protected List<SearchColumnBooleanField> isDefaultBilling;
    protected List<SearchColumnBooleanField> isDefaultShipping;
    protected List<SearchColumnBooleanField> isInactive;
    protected List<SearchColumnBooleanField> isJobResourceVend;
    protected List<SearchColumnBooleanField> isPerson;
    protected List<SearchColumnDoubleField> laborCost;
    protected List<SearchColumnEnumSelectField> language;
    protected List<SearchColumnDateField> lastModifiedDate;
    protected List<SearchColumnStringField> lastName;
    protected List<SearchColumnEnumSelectField> level;
    protected List<SearchColumnStringField> middleName;
    protected List<SearchColumnStringField> mobilePhone;
    protected List<SearchColumnStringField> pec;
    protected List<SearchColumnEnumSelectField> permission;
    protected List<SearchColumnStringField> phone;
    protected List<SearchColumnStringField> phoneticName;
    protected List<SearchColumnStringField> printOnCheckAs;
    protected List<SearchColumnBooleanField> printTransactions;
    protected List<SearchColumnStringField> salutation;
    protected List<SearchColumnStringField> shipAddress;
    protected List<SearchColumnStringField> shipAddress1;
    protected List<SearchColumnStringField> shipAddress2;
    protected List<SearchColumnStringField> shipAddress3;
    protected List<SearchColumnStringField> shipAddressee;
    protected List<SearchColumnStringField> shipAttention;
    protected List<SearchColumnStringField> shipCity;
    protected List<SearchColumnEnumSelectField> shipCountry;
    protected List<SearchColumnStringField> shipCountryCode;
    protected List<SearchColumnStringField> shipPhone;
    protected List<SearchColumnStringField> shipState;
    protected List<SearchColumnStringField> shipZip;
    protected List<SearchColumnStringField> state;
    protected List<SearchColumnSelectField> subscription;
    protected List<SearchColumnDateField> subscriptionDate;
    protected List<SearchColumnBooleanField> subscriptionStatus;
    protected List<SearchColumnSelectField> subsidiary;
    protected List<SearchColumnStringField> taxIdNum;
    protected List<SearchColumnSelectField> terms;
    protected List<SearchColumnStringField> title;
    protected List<SearchColumnDoubleField> unbilledOrders;
    protected List<SearchColumnStringField> url;
    protected List<SearchColumnStringField> vatRegNumber;
    protected List<SearchColumnSelectField> workCalendar;
    protected List<SearchColumnStringField> zipCode;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the accountNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAccountNumber() {
        if (accountNumber == null) {
            accountNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.accountNumber;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress() {
        if (address == null) {
            address = new ArrayList<SearchColumnStringField>();
        }
        return this.address;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress1() {
        if (address1 == null) {
            address1 = new ArrayList<SearchColumnStringField>();
        }
        return this.address1;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress2() {
        if (address2 == null) {
            address2 = new ArrayList<SearchColumnStringField>();
        }
        return this.address2;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddress3() {
        if (address3 == null) {
            address3 = new ArrayList<SearchColumnStringField>();
        }
        return this.address3;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressee() {
        if (addressee == null) {
            addressee = new ArrayList<SearchColumnStringField>();
        }
        return this.addressee;
    }

    /**
     * Gets the value of the addressInternalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInternalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressInternalId() {
        if (addressInternalId == null) {
            addressInternalId = new ArrayList<SearchColumnStringField>();
        }
        return this.addressInternalId;
    }

    /**
     * Gets the value of the addressLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressLabel() {
        if (addressLabel == null) {
            addressLabel = new ArrayList<SearchColumnStringField>();
        }
        return this.addressLabel;
    }

    /**
     * Gets the value of the addressPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAddressPhone() {
        if (addressPhone == null) {
            addressPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.addressPhone;
    }

    /**
     * Gets the value of the altContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltContact() {
        if (altContact == null) {
            altContact = new ArrayList<SearchColumnStringField>();
        }
        return this.altContact;
    }

    /**
     * Gets the value of the altEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltEmail() {
        if (altEmail == null) {
            altEmail = new ArrayList<SearchColumnStringField>();
        }
        return this.altEmail;
    }

    /**
     * Gets the value of the altName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltName() {
        if (altName == null) {
            altName = new ArrayList<SearchColumnStringField>();
        }
        return this.altName;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltPhone() {
        if (altPhone == null) {
            altPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.altPhone;
    }

    /**
     * Gets the value of the attention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAttention() {
        if (attention == null) {
            attention = new ArrayList<SearchColumnStringField>();
        }
        return this.attention;
    }

    /**
     * Gets the value of the balance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBalance() {
        if (balance == null) {
            balance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.balance;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress() {
        if (billAddress == null) {
            billAddress = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress;
    }

    /**
     * Gets the value of the billAddress1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress1() {
        if (billAddress1 == null) {
            billAddress1 = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress1;
    }

    /**
     * Gets the value of the billAddress2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress2() {
        if (billAddress2 == null) {
            billAddress2 = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress2;
    }

    /**
     * Gets the value of the billAddress3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress3() {
        if (billAddress3 == null) {
            billAddress3 = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress3;
    }

    /**
     * Gets the value of the billAddressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddressee() {
        if (billAddressee == null) {
            billAddressee = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddressee;
    }

    /**
     * Gets the value of the billAttention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAttention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAttention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAttention() {
        if (billAttention == null) {
            billAttention = new ArrayList<SearchColumnStringField>();
        }
        return this.billAttention;
    }

    /**
     * Gets the value of the billCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillCity() {
        if (billCity == null) {
            billCity = new ArrayList<SearchColumnStringField>();
        }
        return this.billCity;
    }

    /**
     * Gets the value of the billCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getBillCountry() {
        if (billCountry == null) {
            billCountry = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.billCountry;
    }

    /**
     * Gets the value of the billCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillCountryCode() {
        if (billCountryCode == null) {
            billCountryCode = new ArrayList<SearchColumnStringField>();
        }
        return this.billCountryCode;
    }

    /**
     * Gets the value of the billPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillPhone() {
        if (billPhone == null) {
            billPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.billPhone;
    }

    /**
     * Gets the value of the billState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillState() {
        if (billState == null) {
            billState = new ArrayList<SearchColumnStringField>();
        }
        return this.billState;
    }

    /**
     * Gets the value of the billZipCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billZipCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillZipCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillZipCode() {
        if (billZipCode == null) {
            billZipCode = new ArrayList<SearchColumnStringField>();
        }
        return this.billZipCode;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCategory() {
        if (category == null) {
            category = new ArrayList<SearchColumnSelectField>();
        }
        return this.category;
    }

    /**
     * Gets the value of the city property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the city property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCity() {
        if (city == null) {
            city = new ArrayList<SearchColumnStringField>();
        }
        return this.city;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getComments() {
        if (comments == null) {
            comments = new ArrayList<SearchColumnStringField>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCompanyName() {
        if (companyName == null) {
            companyName = new ArrayList<SearchColumnStringField>();
        }
        return this.companyName;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getContact() {
        if (contact == null) {
            contact = new ArrayList<SearchColumnStringField>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCountry() {
        if (country == null) {
            country = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.country;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCountryCode() {
        if (countryCode == null) {
            countryCode = new ArrayList<SearchColumnStringField>();
        }
        return this.countryCode;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCreditLimit() {
        if (creditLimit == null) {
            creditLimit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.creditLimit;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<SearchColumnSelectField>();
        }
        return this.currency;
    }

    /**
     * Gets the value of the currentExchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentExchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCurrentExchangeRate() {
        if (currentExchangeRate == null) {
            currentExchangeRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.currentExchangeRate;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateCreated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDateCreated() {
        if (dateCreated == null) {
            dateCreated = new ArrayList<SearchColumnDateField>();
        }
        return this.dateCreated;
    }

    /**
     * Gets the value of the eligibleForCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibleForCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibleForCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getEligibleForCommission() {
        if (eligibleForCommission == null) {
            eligibleForCommission = new ArrayList<SearchColumnBooleanField>();
        }
        return this.eligibleForCommission;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEmail() {
        if (email == null) {
            email = new ArrayList<SearchColumnStringField>();
        }
        return this.email;
    }

    /**
     * Gets the value of the emailTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getEmailTransactions() {
        if (emailTransactions == null) {
            emailTransactions = new ArrayList<SearchColumnBooleanField>();
        }
        return this.emailTransactions;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEntityId() {
        if (entityId == null) {
            entityId = new ArrayList<SearchColumnStringField>();
        }
        return this.entityId;
    }

    /**
     * Gets the value of the entityNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getEntityNumber() {
        if (entityNumber == null) {
            entityNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.entityNumber;
    }

    /**
     * Gets the value of the expenseAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExpenseAccount() {
        if (expenseAccount == null) {
            expenseAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.expenseAccount;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFax() {
        if (fax == null) {
            fax = new ArrayList<SearchColumnStringField>();
        }
        return this.fax;
    }

    /**
     * Gets the value of the faxTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faxTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getFaxTransactions() {
        if (faxTransactions == null) {
            faxTransactions = new ArrayList<SearchColumnBooleanField>();
        }
        return this.faxTransactions;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFirstName() {
        if (firstName == null) {
            firstName = new ArrayList<SearchColumnStringField>();
        }
        return this.firstName;
    }

    /**
     * Gets the value of the giveAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giveAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiveAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getGiveAccess() {
        if (giveAccess == null) {
            giveAccess = new ArrayList<SearchColumnBooleanField>();
        }
        return this.giveAccess;
    }

    /**
     * Gets the value of the globalSubscriptionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalSubscriptionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalSubscriptionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getGlobalSubscriptionStatus() {
        if (globalSubscriptionStatus == null) {
            globalSubscriptionStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.globalSubscriptionStatus;
    }

    /**
     * Gets the value of the hasDuplicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasDuplicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasDuplicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getHasDuplicates() {
        if (hasDuplicates == null) {
            hasDuplicates = new ArrayList<SearchColumnBooleanField>();
        }
        return this.hasDuplicates;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getHomePhone() {
        if (homePhone == null) {
            homePhone = new ArrayList<SearchColumnStringField>();
        }
        return this.homePhone;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getImage() {
        if (image == null) {
            image = new ArrayList<SearchColumnSelectField>();
        }
        return this.image;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the is1099Eligible property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the is1099Eligible property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIs1099Eligible().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIs1099Eligible() {
        if (is1099Eligible == null) {
            is1099Eligible = new ArrayList<SearchColumnBooleanField>();
        }
        return this.is1099Eligible;
    }

    /**
     * Gets the value of the isDefaultBilling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isDefaultBilling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsDefaultBilling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsDefaultBilling() {
        if (isDefaultBilling == null) {
            isDefaultBilling = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isDefaultBilling;
    }

    /**
     * Gets the value of the isDefaultShipping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isDefaultShipping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsDefaultShipping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsDefaultShipping() {
        if (isDefaultShipping == null) {
            isDefaultShipping = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isDefaultShipping;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isInactive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsInactive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsInactive() {
        if (isInactive == null) {
            isInactive = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isInactive;
    }

    /**
     * Gets the value of the isJobResourceVend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isJobResourceVend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsJobResourceVend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsJobResourceVend() {
        if (isJobResourceVend == null) {
            isJobResourceVend = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isJobResourceVend;
    }

    /**
     * Gets the value of the isPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsPerson() {
        if (isPerson == null) {
            isPerson = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isPerson;
    }

    /**
     * Gets the value of the laborCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLaborCost() {
        if (laborCost == null) {
            laborCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.laborCost;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLanguage() {
        if (language == null) {
            language = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.language;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastModifiedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastModifiedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastModifiedDate() {
        if (lastModifiedDate == null) {
            lastModifiedDate = new ArrayList<SearchColumnDateField>();
        }
        return this.lastModifiedDate;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLastName() {
        if (lastName == null) {
            lastName = new ArrayList<SearchColumnStringField>();
        }
        return this.lastName;
    }

    /**
     * Gets the value of the level property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getLevel() {
        if (level == null) {
            level = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.level;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<SearchColumnStringField>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMobilePhone() {
        if (mobilePhone == null) {
            mobilePhone = new ArrayList<SearchColumnStringField>();
        }
        return this.mobilePhone;
    }

    /**
     * Gets the value of the pec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPec() {
        if (pec == null) {
            pec = new ArrayList<SearchColumnStringField>();
        }
        return this.pec;
    }

    /**
     * Gets the value of the permission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPermission() {
        if (permission == null) {
            permission = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.permission;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPhone() {
        if (phone == null) {
            phone = new ArrayList<SearchColumnStringField>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the phoneticName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneticName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneticName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPhoneticName() {
        if (phoneticName == null) {
            phoneticName = new ArrayList<SearchColumnStringField>();
        }
        return this.phoneticName;
    }

    /**
     * Gets the value of the printOnCheckAs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printOnCheckAs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrintOnCheckAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPrintOnCheckAs() {
        if (printOnCheckAs == null) {
            printOnCheckAs = new ArrayList<SearchColumnStringField>();
        }
        return this.printOnCheckAs;
    }

    /**
     * Gets the value of the printTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrintTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPrintTransactions() {
        if (printTransactions == null) {
            printTransactions = new ArrayList<SearchColumnBooleanField>();
        }
        return this.printTransactions;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salutation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalutation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSalutation() {
        if (salutation == null) {
            salutation = new ArrayList<SearchColumnStringField>();
        }
        return this.salutation;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress() {
        if (shipAddress == null) {
            shipAddress = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress;
    }

    /**
     * Gets the value of the shipAddress1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress1() {
        if (shipAddress1 == null) {
            shipAddress1 = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress1;
    }

    /**
     * Gets the value of the shipAddress2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress2() {
        if (shipAddress2 == null) {
            shipAddress2 = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress2;
    }

    /**
     * Gets the value of the shipAddress3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress3() {
        if (shipAddress3 == null) {
            shipAddress3 = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress3;
    }

    /**
     * Gets the value of the shipAddressee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddressee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddressee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddressee() {
        if (shipAddressee == null) {
            shipAddressee = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddressee;
    }

    /**
     * Gets the value of the shipAttention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAttention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAttention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAttention() {
        if (shipAttention == null) {
            shipAttention = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAttention;
    }

    /**
     * Gets the value of the shipCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipCity() {
        if (shipCity == null) {
            shipCity = new ArrayList<SearchColumnStringField>();
        }
        return this.shipCity;
    }

    /**
     * Gets the value of the shipCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getShipCountry() {
        if (shipCountry == null) {
            shipCountry = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.shipCountry;
    }

    /**
     * Gets the value of the shipCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipCountryCode() {
        if (shipCountryCode == null) {
            shipCountryCode = new ArrayList<SearchColumnStringField>();
        }
        return this.shipCountryCode;
    }

    /**
     * Gets the value of the shipPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipPhone() {
        if (shipPhone == null) {
            shipPhone = new ArrayList<SearchColumnStringField>();
        }
        return this.shipPhone;
    }

    /**
     * Gets the value of the shipState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipState() {
        if (shipState == null) {
            shipState = new ArrayList<SearchColumnStringField>();
        }
        return this.shipState;
    }

    /**
     * Gets the value of the shipZip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipZip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipZip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipZip() {
        if (shipZip == null) {
            shipZip = new ArrayList<SearchColumnStringField>();
        }
        return this.shipZip;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getState() {
        if (state == null) {
            state = new ArrayList<SearchColumnStringField>();
        }
        return this.state;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<SearchColumnSelectField>();
        }
        return this.subscription;
    }

    /**
     * Gets the value of the subscriptionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getSubscriptionDate() {
        if (subscriptionDate == null) {
            subscriptionDate = new ArrayList<SearchColumnDateField>();
        }
        return this.subscriptionDate;
    }

    /**
     * Gets the value of the subscriptionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSubscriptionStatus() {
        if (subscriptionStatus == null) {
            subscriptionStatus = new ArrayList<SearchColumnBooleanField>();
        }
        return this.subscriptionStatus;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSubsidiary() {
        if (subsidiary == null) {
            subsidiary = new ArrayList<SearchColumnSelectField>();
        }
        return this.subsidiary;
    }

    /**
     * Gets the value of the taxIdNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxIdNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxIdNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTaxIdNum() {
        if (taxIdNum == null) {
            taxIdNum = new ArrayList<SearchColumnStringField>();
        }
        return this.taxIdNum;
    }

    /**
     * Gets the value of the terms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTerms() {
        if (terms == null) {
            terms = new ArrayList<SearchColumnSelectField>();
        }
        return this.terms;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTitle() {
        if (title == null) {
            title = new ArrayList<SearchColumnStringField>();
        }
        return this.title;
    }

    /**
     * Gets the value of the unbilledOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unbilledOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbilledOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getUnbilledOrders() {
        if (unbilledOrders == null) {
            unbilledOrders = new ArrayList<SearchColumnDoubleField>();
        }
        return this.unbilledOrders;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUrl() {
        if (url == null) {
            url = new ArrayList<SearchColumnStringField>();
        }
        return this.url;
    }

    /**
     * Gets the value of the vatRegNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatRegNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVatRegNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVatRegNumber() {
        if (vatRegNumber == null) {
            vatRegNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.vatRegNumber;
    }

    /**
     * Gets the value of the workCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getWorkCalendar() {
        if (workCalendar == null) {
            workCalendar = new ArrayList<SearchColumnSelectField>();
        }
        return this.workCalendar;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zipCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZipCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getZipCode() {
        if (zipCode == null) {
            zipCode = new ArrayList<SearchColumnStringField>();
        }
        return this.zipCode;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchColumnCustomFieldList value) {
        this.customFieldList = value;
    }

}

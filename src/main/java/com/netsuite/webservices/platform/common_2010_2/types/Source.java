
package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Source.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Source">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_adp"/>
 *     &lt;enumeration value="_automatedMemorizedTransaction"/>
 *     &lt;enumeration value="_csv"/>
 *     &lt;enumeration value="_customerCenter"/>
 *     &lt;enumeration value="_ebay"/>
 *     &lt;enumeration value="_offlineClient"/>
 *     &lt;enumeration value="_perquest"/>
 *     &lt;enumeration value="_qif"/>
 *     &lt;enumeration value="_quickbooks"/>
 *     &lt;enumeration value="_smbxml"/>
 *     &lt;enumeration value="_sync"/>
 *     &lt;enumeration value="_web"/>
 *     &lt;enumeration value="_webServices"/>
 *     &lt;enumeration value="_yahoo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Source", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum Source {

    @XmlEnumValue("_adp")
    ADP("_adp"),
    @XmlEnumValue("_automatedMemorizedTransaction")
    AUTOMATED_MEMORIZED_TRANSACTION("_automatedMemorizedTransaction"),
    @XmlEnumValue("_csv")
    CSV("_csv"),
    @XmlEnumValue("_customerCenter")
    CUSTOMER_CENTER("_customerCenter"),
    @XmlEnumValue("_ebay")
    EBAY("_ebay"),
    @XmlEnumValue("_offlineClient")
    OFFLINE_CLIENT("_offlineClient"),
    @XmlEnumValue("_perquest")
    PERQUEST("_perquest"),
    @XmlEnumValue("_qif")
    QIF("_qif"),
    @XmlEnumValue("_quickbooks")
    QUICKBOOKS("_quickbooks"),
    @XmlEnumValue("_smbxml")
    SMBXML("_smbxml"),
    @XmlEnumValue("_sync")
    SYNC("_sync"),
    @XmlEnumValue("_web")
    WEB("_web"),
    @XmlEnumValue("_webServices")
    WEB_SERVICES("_webServices"),
    @XmlEnumValue("_yahoo")
    YAHOO("_yahoo");
    private final String value;

    Source(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Source fromValue(String v) {
        for (Source c: Source.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

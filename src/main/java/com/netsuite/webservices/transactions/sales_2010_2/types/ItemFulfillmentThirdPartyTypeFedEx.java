
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentThirdPartyTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentThirdPartyTypeFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_billRecipient"/>
 *     &lt;enumeration value="_billThirdParty"/>
 *     &lt;enumeration value="_noneSelected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentThirdPartyTypeFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentThirdPartyTypeFedEx {

    @XmlEnumValue("_billRecipient")
    BILL_RECIPIENT("_billRecipient"),
    @XmlEnumValue("_billThirdParty")
    BILL_THIRD_PARTY("_billThirdParty"),
    @XmlEnumValue("_noneSelected")
    NONE_SELECTED("_noneSelected");
    private final String value;

    ItemFulfillmentThirdPartyTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentThirdPartyTypeFedEx fromValue(String v) {
        for (ItemFulfillmentThirdPartyTypeFedEx c: ItemFulfillmentThirdPartyTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

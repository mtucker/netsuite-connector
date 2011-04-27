
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageUspsDeliveryConfUsps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageUspsDeliveryConfUsps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_deliveryConfirmation"/>
 *     &lt;enumeration value="_signatureConfirmation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageUspsDeliveryConfUsps", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageUspsDeliveryConfUsps {

    @XmlEnumValue("_deliveryConfirmation")
    DELIVERY_CONFIRMATION("_deliveryConfirmation"),
    @XmlEnumValue("_signatureConfirmation")
    SIGNATURE_CONFIRMATION("_signatureConfirmation");
    private final String value;

    ItemFulfillmentPackageUspsDeliveryConfUsps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageUspsDeliveryConfUsps fromValue(String v) {
        for (ItemFulfillmentPackageUspsDeliveryConfUsps c: ItemFulfillmentPackageUspsDeliveryConfUsps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

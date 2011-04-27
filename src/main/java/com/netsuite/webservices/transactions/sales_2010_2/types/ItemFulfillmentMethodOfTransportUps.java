
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentMethodOfTransportUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentMethodOfTransportUps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_air"/>
 *     &lt;enumeration value="_airContainerized"/>
 *     &lt;enumeration value="_auto"/>
 *     &lt;enumeration value="_fixedTransportInstallations"/>
 *     &lt;enumeration value="_mail"/>
 *     &lt;enumeration value="_passengerHandcarried"/>
 *     &lt;enumeration value="_pedestrian"/>
 *     &lt;enumeration value="_rail"/>
 *     &lt;enumeration value="_railContainerized"/>
 *     &lt;enumeration value="_roadOther"/>
 *     &lt;enumeration value="_seaBarge"/>
 *     &lt;enumeration value="_seaContainerized"/>
 *     &lt;enumeration value="_seaNoncontainerized"/>
 *     &lt;enumeration value="_truck"/>
 *     &lt;enumeration value="_truckContainerized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentMethodOfTransportUps", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentMethodOfTransportUps {

    @XmlEnumValue("_air")
    AIR("_air"),
    @XmlEnumValue("_airContainerized")
    AIR_CONTAINERIZED("_airContainerized"),
    @XmlEnumValue("_auto")
    AUTO("_auto"),
    @XmlEnumValue("_fixedTransportInstallations")
    FIXED_TRANSPORT_INSTALLATIONS("_fixedTransportInstallations"),
    @XmlEnumValue("_mail")
    MAIL("_mail"),
    @XmlEnumValue("_passengerHandcarried")
    PASSENGER_HANDCARRIED("_passengerHandcarried"),
    @XmlEnumValue("_pedestrian")
    PEDESTRIAN("_pedestrian"),
    @XmlEnumValue("_rail")
    RAIL("_rail"),
    @XmlEnumValue("_railContainerized")
    RAIL_CONTAINERIZED("_railContainerized"),
    @XmlEnumValue("_roadOther")
    ROAD_OTHER("_roadOther"),
    @XmlEnumValue("_seaBarge")
    SEA_BARGE("_seaBarge"),
    @XmlEnumValue("_seaContainerized")
    SEA_CONTAINERIZED("_seaContainerized"),
    @XmlEnumValue("_seaNoncontainerized")
    SEA_NONCONTAINERIZED("_seaNoncontainerized"),
    @XmlEnumValue("_truck")
    TRUCK("_truck"),
    @XmlEnumValue("_truckContainerized")
    TRUCK_CONTAINERIZED("_truckContainerized");
    private final String value;

    ItemFulfillmentMethodOfTransportUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentMethodOfTransportUps fromValue(String v) {
        for (ItemFulfillmentMethodOfTransportUps c: ItemFulfillmentMethodOfTransportUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

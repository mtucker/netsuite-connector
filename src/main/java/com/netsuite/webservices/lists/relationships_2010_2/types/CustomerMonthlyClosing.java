
package com.netsuite.webservices.lists.relationships_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerMonthlyClosing.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerMonthlyClosing">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_one"/>
 *     &lt;enumeration value="_five"/>
 *     &lt;enumeration value="_ten"/>
 *     &lt;enumeration value="_fifteen"/>
 *     &lt;enumeration value="_twenty"/>
 *     &lt;enumeration value="_twentyFive"/>
 *     &lt;enumeration value="_endOfTheMonth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerMonthlyClosing", namespace = "urn:types.relationships_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerMonthlyClosing {

    @XmlEnumValue("_one")
    ONE("_one"),
    @XmlEnumValue("_five")
    FIVE("_five"),
    @XmlEnumValue("_ten")
    TEN("_ten"),
    @XmlEnumValue("_fifteen")
    FIFTEEN("_fifteen"),
    @XmlEnumValue("_twenty")
    TWENTY("_twenty"),
    @XmlEnumValue("_twentyFive")
    TWENTY_FIVE("_twentyFive"),
    @XmlEnumValue("_endOfTheMonth")
    END_OF_THE_MONTH("_endOfTheMonth");
    private final String value;

    CustomerMonthlyClosing(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerMonthlyClosing fromValue(String v) {
        for (CustomerMonthlyClosing c: CustomerMonthlyClosing.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

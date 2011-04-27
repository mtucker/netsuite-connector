
package com.netsuite.webservices.lists.accounting_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemMatrixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemMatrixType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_parent"/>
 *     &lt;enumeration value="_child"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemMatrixType", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemMatrixType {

    @XmlEnumValue("_parent")
    PARENT("_parent"),
    @XmlEnumValue("_child")
    CHILD("_child");
    private final String value;

    ItemMatrixType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemMatrixType fromValue(String v) {
        for (ItemMatrixType c: ItemMatrixType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

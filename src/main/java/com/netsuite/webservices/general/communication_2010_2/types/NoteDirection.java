
package com.netsuite.webservices.general.communication_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoteDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_incoming"/>
 *     &lt;enumeration value="_outgoing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoteDirection", namespace = "urn:types.communication_2010_2.general.webservices.netsuite.com")
@XmlEnum
public enum NoteDirection {

    @XmlEnumValue("_incoming")
    INCOMING("_incoming"),
    @XmlEnumValue("_outgoing")
    OUTGOING("_outgoing");
    private final String value;

    NoteDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteDirection fromValue(String v) {
        for (NoteDirection c: NoteDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

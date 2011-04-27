
package com.netsuite.webservices.documents.filecabinet_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextFileEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextFileEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_big5"/>
 *     &lt;enumeration value="_gb2312"/>
 *     &lt;enumeration value="_gb18030"/>
 *     &lt;enumeration value="_iso88591"/>
 *     &lt;enumeration value="_macRoman"/>
 *     &lt;enumeration value="_shiftJis"/>
 *     &lt;enumeration value="_utf8"/>
 *     &lt;enumeration value="_windows1252"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextFileEncoding", namespace = "urn:types.filecabinet_2010_2.documents.webservices.netsuite.com")
@XmlEnum
public enum TextFileEncoding {

    @XmlEnumValue("_big5")
    BIG_5("_big5"),
    @XmlEnumValue("_gb2312")
    GB_2312("_gb2312"),
    @XmlEnumValue("_gb18030")
    GB_18030("_gb18030"),
    @XmlEnumValue("_iso88591")
    ISO_88591("_iso88591"),
    @XmlEnumValue("_macRoman")
    MAC_ROMAN("_macRoman"),
    @XmlEnumValue("_shiftJis")
    SHIFT_JIS("_shiftJis"),
    @XmlEnumValue("_utf8")
    UTF_8("_utf8"),
    @XmlEnumValue("_windows1252")
    WINDOWS_1252("_windows1252");
    private final String value;

    TextFileEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextFileEncoding fromValue(String v) {
        for (TextFileEncoding c: TextFileEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_KTRUMaxMathNotationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_KTRUMaxMathNotationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="less"/>
 *     &lt;enumeration value="lessOrEqual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_KTRUMaxMathNotationType")
@XmlEnum
public enum ZfcsKTRUMaxMathNotationType {

    @XmlEnumValue("less")
    LESS("less"),
    @XmlEnumValue("lessOrEqual")
    LESS_OR_EQUAL("lessOrEqual");
    private final String value;

    ZfcsKTRUMaxMathNotationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsKTRUMaxMathNotationType fromValue(String v) {
        for (ZfcsKTRUMaxMathNotationType c: ZfcsKTRUMaxMathNotationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_nsiBusinessControlActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_nsiBusinessControlActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Edit"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Publish"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_nsiBusinessControlActionEnum")
@XmlEnum
public enum ZfcsNsiBusinessControlActionEnum {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Publish")
    PUBLISH("Publish");
    private final String value;

    ZfcsNsiBusinessControlActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsNsiBusinessControlActionEnum fromValue(String v) {
        for (ZfcsNsiBusinessControlActionEnum c: ZfcsNsiBusinessControlActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

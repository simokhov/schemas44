//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_placingWayTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_placingWayTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FZ94"/>
 *     &lt;enumeration value="FZ44"/>
 *     &lt;enumeration value="PP615"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_placingWayTypeEnum")
@XmlEnum
public enum ZfcsPlacingWayTypeEnum {

    @XmlEnumValue("FZ94")
    FZ_94("FZ94"),
    @XmlEnumValue("FZ44")
    FZ_44("FZ44"),
    @XmlEnumValue("PP615")
    PP_615("PP615");
    private final String value;

    ZfcsPlacingWayTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsPlacingWayTypeEnum fromValue(String v) {
        for (ZfcsPlacingWayTypeEnum c: ZfcsPlacingWayTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

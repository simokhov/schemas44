//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:58:14 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_subsystemTypeDTEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_subsystemTypeDTEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FZ44"/>
 *     &lt;enumeration value="ISO"/>
 *     &lt;enumeration value="ISM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_subsystemTypeDTEnum")
@XmlEnum
public enum ZfcsSubsystemTypeDTEnum {

    @XmlEnumValue("FZ44")
    FZ_44("FZ44"),
    ISO("ISO"),
    ISM("ISM");
    private final String value;

    ZfcsSubsystemTypeDTEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsSubsystemTypeDTEnum fromValue(String v) {
        for (ZfcsSubsystemTypeDTEnum c: ZfcsSubsystemTypeDTEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

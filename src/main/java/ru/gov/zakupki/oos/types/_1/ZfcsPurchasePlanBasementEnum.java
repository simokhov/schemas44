//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:01:57 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_purchasePlanBasementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_purchasePlanBasementEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PPF552"/>
 *     &lt;enumeration value="PPF1043"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_purchasePlanBasementEnum")
@XmlEnum
public enum ZfcsPurchasePlanBasementEnum {

    @XmlEnumValue("PPF552")
    PPF_552("PPF552"),
    @XmlEnumValue("PPF1043")
    PPF_1043("PPF1043");
    private final String value;

    ZfcsPurchasePlanBasementEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsPurchasePlanBasementEnum fromValue(String v) {
        for (ZfcsPurchasePlanBasementEnum c: ZfcsPurchasePlanBasementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

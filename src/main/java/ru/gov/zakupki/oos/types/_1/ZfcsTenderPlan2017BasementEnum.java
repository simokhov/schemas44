//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_tenderPlan2017BasementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_tenderPlan2017BasementEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PPF553"/>
 *     &lt;enumeration value="PPF554"/>
 *     &lt;enumeration value="PPF552"/>
 *     &lt;enumeration value="PPF1043"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_tenderPlan2017BasementEnum")
@XmlEnum
public enum ZfcsTenderPlan2017BasementEnum {

    @XmlEnumValue("PPF553")
    PPF_553("PPF553"),
    @XmlEnumValue("PPF554")
    PPF_554("PPF554"),
    @XmlEnumValue("PPF552")
    PPF_552("PPF552"),
    @XmlEnumValue("PPF1043")
    PPF_1043("PPF1043");
    private final String value;

    ZfcsTenderPlan2017BasementEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsTenderPlan2017BasementEnum fromValue(String v) {
        for (ZfcsTenderPlan2017BasementEnum c: ZfcsTenderPlan2017BasementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:02:32 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_signatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_signatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAdES-BES"/>
 *     &lt;enumeration value="CAdES-A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_signatureType")
@XmlEnum
public enum ZfcsSignatureType {

    @XmlEnumValue("CAdES-BES")
    C_AD_ES_BES("CAdES-BES"),
    @XmlEnumValue("CAdES-A")
    C_AD_ES_A("CAdES-A");
    private final String value;

    ZfcsSignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsSignatureType fromValue(String v) {
        for (ZfcsSignatureType c: ZfcsSignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

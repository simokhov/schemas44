//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_control99ConfirmationResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_control99ConfirmationResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_control99ConfirmationResultType")
@XmlEnum
public enum ZfcsControl99ConfirmationResultType {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failure")
    FAILURE("failure");
    private final String value;

    ZfcsControl99ConfirmationResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsControl99ConfirmationResultType fromValue(String v) {
        for (ZfcsControl99ConfirmationResultType c: ZfcsControl99ConfirmationResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for zfcs_subsystemTypePurchaseRejectReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_subsystemTypePurchaseRejectReasonEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FZ94"/>
 *     &lt;enumeration value="FZ44"/>
 *     &lt;enumeration value="PP615"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_subsystemTypePurchaseRejectReasonEnum")
@XmlEnum
public enum ZfcsSubsystemTypePurchaseRejectReasonEnum {

    @XmlEnumValue("FZ94")
    FZ_94("FZ94"),
    @XmlEnumValue("FZ44")
    FZ_44("FZ44"),
    @XmlEnumValue("PP615")
    PP_615("PP615");
    private final String value;

    ZfcsSubsystemTypePurchaseRejectReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsSubsystemTypePurchaseRejectReasonEnum fromValue(String v) {
        for (ZfcsSubsystemTypePurchaseRejectReasonEnum c: ZfcsSubsystemTypePurchaseRejectReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

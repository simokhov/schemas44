//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_control99DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_control99DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contract"/>
 *     &lt;enumeration value="contractProcedure"/>
 *     &lt;enumeration value="purchasePlan"/>
 *     &lt;enumeration value="tenderPlan2017"/>
 *     &lt;enumeration value="notification"/>
 *     &lt;enumeration value="protocol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_control99DocumentType")
@XmlEnum
public enum ZfcsControl99DocumentType {

    @XmlEnumValue("contract")
    CONTRACT("contract"),
    @XmlEnumValue("contractProcedure")
    CONTRACT_PROCEDURE("contractProcedure"),
    @XmlEnumValue("purchasePlan")
    PURCHASE_PLAN("purchasePlan"),
    @XmlEnumValue("tenderPlan2017")
    TENDER_PLAN_2017("tenderPlan2017"),
    @XmlEnumValue("notification")
    NOTIFICATION("notification"),
    @XmlEnumValue("protocol")
    PROTOCOL("protocol");
    private final String value;

    ZfcsControl99DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsControl99DocumentType fromValue(String v) {
        for (ZfcsControl99DocumentType c: ZfcsControl99DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

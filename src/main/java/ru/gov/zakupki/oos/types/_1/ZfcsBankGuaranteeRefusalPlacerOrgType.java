//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_bankGuaranteeRefusalPlacerOrgType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_bankGuaranteeRefusalPlacerOrgType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="OCU"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="OA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_bankGuaranteeRefusalPlacerOrgType")
@XmlEnum
public enum ZfcsBankGuaranteeRefusalPlacerOrgType {

    CU,
    OCU,
    RA,
    AI,
    CS,
    OA;

    public String value() {
        return name();
    }

    public static ZfcsBankGuaranteeRefusalPlacerOrgType fromValue(String v) {
        return valueOf(v);
    }

}

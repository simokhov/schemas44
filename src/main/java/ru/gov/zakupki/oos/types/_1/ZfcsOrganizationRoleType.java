//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:54:10 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_organizationRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_organizationRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="EO"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="CIA"/>
 *     &lt;enumeration value="ICB"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="OV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_organizationRoleType")
@XmlEnum
public enum ZfcsOrganizationRoleType {

    CU,
    RA,
    AI,
    SO,
    CO,
    SP,
    FO,
    EO,
    AA,
    CA,
    NA,
    DA,
    BA,
    TA,
    OA,
    CIA,
    ICB,
    NP,
    GR,
    OV;

    public String value() {
        return name();
    }

    public static ZfcsOrganizationRoleType fromValue(String v) {
        return valueOf(v);
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_placementOrgRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_placementOrgRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="ICB"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="CA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_placementOrgRoleType")
@XmlEnum
public enum ZfcsPlacementOrgRoleType {

    CU,
    RA,
    AI,
    SO,
    CO,
    ICB,
    BA,
    SP,
    AA,
    NA,
    DA,
    TA,
    CC,
    AU,
    CS,
    OA,
    BT,
    CA;

    public String value() {
        return name();
    }

    public static ZfcsPlacementOrgRoleType fromValue(String v) {
        return valueOf(v);
    }

}

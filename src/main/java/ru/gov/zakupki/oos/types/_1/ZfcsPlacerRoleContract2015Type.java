//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_placerRoleContract2015Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_placerRoleContract2015Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="CS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_placerRoleContract2015Type")
@XmlEnum
public enum ZfcsPlacerRoleContract2015Type {

    CU,
    RA,
    AI,
    OA,
    CS;

    public String value() {
        return name();
    }

    public static ZfcsPlacerRoleContract2015Type fromValue(String v) {
        return valueOf(v);
    }

}

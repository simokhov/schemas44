//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:48:40 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="OU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organizationType")
@XmlEnum
public enum OrganizationType {

    Z,
    O,
    U,
    S,
    OU;

    public String value() {
        return name();
    }

    public static OrganizationType fromValue(String v) {
        return valueOf(v);
    }

}

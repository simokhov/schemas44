//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:00:50 PM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="partnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OOS"/>
 *     &lt;enumeration value="GIIS_EB"/>
 *     &lt;enumeration value="RMIS"/>
 *     &lt;enumeration value="OVK"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="FAS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "partnerType")
@XmlEnum
public enum PartnerType {

    OOS,
    GIIS_EB,
    RMIS,
    OVK,
    OA,
    KO,
    FAS;

    public String value() {
        return name();
    }

    public static PartnerType fromValue(String v) {
        return valueOf(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:23:43 AM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subsystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="subsystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIZ"/>
 *     &lt;enumeration value="RGK"/>
 *     &lt;enumeration value="RPG"/>
 *     &lt;enumeration value="RPZ"/>
 *     &lt;enumeration value="RBG"/>
 *     &lt;enumeration value="DIZK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "subsystemType")
@XmlEnum
public enum SubsystemType {

    PRIZ,
    RGK,
    RPG,
    RPZ,
    RBG,
    DIZK;

    public String value() {
        return name();
    }

    public static SubsystemType fromValue(String v) {
        return valueOf(v);
    }

}

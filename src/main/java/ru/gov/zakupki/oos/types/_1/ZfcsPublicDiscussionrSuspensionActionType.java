//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:26:31 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_publicDiscussionrSuspensionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_publicDiscussionrSuspensionActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUSPENSION"/>
 *     &lt;enumeration value="RESUME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_publicDiscussionrSuspensionActionType")
@XmlEnum
public enum ZfcsPublicDiscussionrSuspensionActionType {

    SUSPENSION,
    RESUME;

    public String value() {
        return name();
    }

    public static ZfcsPublicDiscussionrSuspensionActionType fromValue(String v) {
        return valueOf(v);
    }

}

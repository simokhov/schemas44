//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:01:24 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_eventResult.resultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_eventResult.resultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIOLATIONS"/>
 *     &lt;enumeration value="NO_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_NO_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_PARTLY_VALID"/>
 *     &lt;enumeration value="COMPLAINT_NOT_MATCHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_eventResult.resultType")
@XmlEnum
public enum ZfcsEventResultResultType {

    VIOLATIONS,
    NO_VIOLATIONS,
    COMPLAINT_VIOLATIONS,
    COMPLAINT_NO_VIOLATIONS,
    COMPLAINT_PARTLY_VALID,
    COMPLAINT_NOT_MATCHED;

    public String value() {
        return name();
    }

    public static ZfcsEventResultResultType fromValue(String v) {
        return valueOf(v);
    }

}

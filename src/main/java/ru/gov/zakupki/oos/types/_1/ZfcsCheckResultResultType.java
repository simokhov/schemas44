//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_checkResult.resultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_checkResult.resultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIOLATIONS"/>
 *     &lt;enumeration value="NO_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_NO_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_PARTLY_VALID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_checkResult.resultType")
@XmlEnum
public enum ZfcsCheckResultResultType {

    VIOLATIONS,
    NO_VIOLATIONS,
    COMPLAINT_VIOLATIONS,
    COMPLAINT_NO_VIOLATIONS,
    COMPLAINT_PARTLY_VALID;

    public String value() {
        return name();
    }

    public static ZfcsCheckResultResultType fromValue(String v) {
        return valueOf(v);
    }

}

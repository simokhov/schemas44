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
 * <p>Java class for zfcs_admissionResultsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_admissionResultsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WIN_OFFER"/>
 *     &lt;enumeration value="LIKE_WIN_OFFER"/>
 *     &lt;enumeration value="SECOND_OFFER"/>
 *     &lt;enumeration value="PASS_OFFER"/>
 *     &lt;enumeration value="ADMITTED_OFFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_admissionResultsEnum")
@XmlEnum
public enum ZfcsAdmissionResultsEnum {

    WIN_OFFER,
    LIKE_WIN_OFFER,
    SECOND_OFFER,
    PASS_OFFER,
    ADMITTED_OFFER;

    public String value() {
        return name();
    }

    public static ZfcsAdmissionResultsEnum fromValue(String v) {
        return valueOf(v);
    }

}

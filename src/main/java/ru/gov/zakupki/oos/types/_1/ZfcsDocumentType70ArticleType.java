//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_documentType70ArticleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_documentType70ArticleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPWOS"/>
 *     &lt;enumeration value="PDWWS"/>
 *     &lt;enumeration value="RRWCS"/>
 *     &lt;enumeration value="CPWWS"/>
 *     &lt;enumeration value="ECWWS"/>
 *     &lt;enumeration value="CPWWCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_documentType70ArticleType")
@XmlEnum
public enum ZfcsDocumentType70ArticleType {

    CPWOS,
    PDWWS,
    RRWCS,
    CPWWS,
    ECWWS,
    CPWWCS;

    public String value() {
        return name();
    }

    public static ZfcsDocumentType70ArticleType fromValue(String v) {
        return valueOf(v);
    }

}

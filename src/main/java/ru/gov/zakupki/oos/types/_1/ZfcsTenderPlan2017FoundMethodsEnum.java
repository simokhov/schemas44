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
 * <p>Java class for zfcs_tenderPlan2017FoundMethodsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_tenderPlan2017FoundMethodsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_tenderPlan2017FoundMethodsEnum")
@XmlEnum
public enum ZfcsTenderPlan2017FoundMethodsEnum {

    C,
    R,
    T,
    D,
    E;

    public String value() {
        return name();
    }

    public static ZfcsTenderPlan2017FoundMethodsEnum fromValue(String v) {
        return valueOf(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:00 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_nsiBusinessControlSubSystemEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_nsiBusinessControlSubSystemEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIZ"/>
 *     &lt;enumeration value="RK"/>
 *     &lt;enumeration value="RBG"/>
 *     &lt;enumeration value="RPZ"/>
 *     &lt;enumeration value="RPG"/>
 *     &lt;enumeration value="OZ"/>
 *     &lt;enumeration value="RDI"/>
 *     &lt;enumeration value="OOKZ"/>
 *     &lt;enumeration value="BTK"/>
 *     &lt;enumeration value="RPNZ"/>
 *     &lt;enumeration value="ZC"/>
 *     &lt;enumeration value="RZH"/>
 *     &lt;enumeration value="RRK"/>
 *     &lt;enumeration value="RPP"/>
 *     &lt;enumeration value="RVP"/>
 *     &lt;enumeration value="RRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_nsiBusinessControlSubSystemEnum")
@XmlEnum
public enum ZfcsNsiBusinessControlSubSystemEnum {

    PRIZ,
    RK,
    RBG,
    RPZ,
    RPG,
    OZ,
    RDI,
    OOKZ,
    BTK,
    RPNZ,
    ZC,
    RZH,
    RRK,
    RPP,
    RVP,
    RRA;

    public String value() {
        return name();
    }

    public static ZfcsNsiBusinessControlSubSystemEnum fromValue(String v) {
        return valueOf(v);
    }

}

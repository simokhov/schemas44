//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_criterionCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_criterionCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="QF"/>
 *     &lt;enumeration value="QO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_criterionCodeEnum")
@XmlEnum
public enum ZfcsCriterionCodeEnum {

    CP,
    MC,
    TC,
    EN,
    QF,
    QO;

    public String value() {
        return name();
    }

    public static ZfcsCriterionCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}

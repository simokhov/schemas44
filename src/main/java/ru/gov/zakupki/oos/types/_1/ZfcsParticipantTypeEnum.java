//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:53:38 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_participantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_participantTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="UF"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="BF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_participantTypeEnum")
@XmlEnum
public enum ZfcsParticipantTypeEnum {

    P,
    PF,
    U,
    UF,
    B,
    BF;

    public String value() {
        return name();
    }

    public static ZfcsParticipantTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:50:10 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPTY"/>
 *     &lt;enumeration value="YEAR"/>
 *     &lt;enumeration value="QUATER"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="HOUR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timeUnitType")
@XmlEnum
public enum TimeUnitType {

    EMPTY,
    YEAR,
    QUATER,
    MONTH,
    WEEK,
    DAY,
    HOUR;

    public String value() {
        return name();
    }

    public static TimeUnitType fromValue(String v) {
        return valueOf(v);
    }

}

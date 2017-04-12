//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:54:41 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_tenderStageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_tenderStageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="CW"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="CO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_tenderStageType")
@XmlEnum
public enum ZfcsTenderStageType {


    /**
     * Заказы на этапе подготовки извещения
     * 
     */
    NP,

    /**
     * Заказы на этапе подачи заявок
     * 
     */
    AP,

    /**
     * Заказы на этапе работы комиссии
     * 
     */
    CW,

    /**
     * Завершенные заказы
     * 
     */
    FO,

    /**
     * Отмененные заказы
     * 
     */
    CO;

    public String value() {
        return name();
    }

    public static ZfcsTenderStageType fromValue(String v) {
        return valueOf(v);
    }

}
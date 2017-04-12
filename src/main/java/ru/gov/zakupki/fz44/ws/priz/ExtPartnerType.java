//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:03:02 PM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extPartnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extPartnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VSRZ"/>
 *     &lt;enumeration value="RMIS"/>
 *     &lt;enumeration value="FAS"/>
 *     &lt;enumeration value="ETP"/>
 *     &lt;enumeration value="BANK"/>
 *     &lt;enumeration value="GIIS_EB"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="OVK"/>
 *     &lt;enumeration value="IKO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extPartnerType")
@XmlEnum
public enum ExtPartnerType {


    /**
     * Внешняя система размещения заказов
     * 
     */
    VSRZ,

    /**
     * Региональная муниципальная информационная система
     * 
     */
    RMIS,

    /**
     * Федеральная антимонопольная служба
     * 
     */
    FAS,

    /**
     * Электронная торговая площадка
     * 
     */
    ETP,

    /**
     * Банк
     * 
     */
    BANK,

    /**
     * ГИИС Электронный бюджет
     * 
     */
    GIIS_EB,

    /**
     * Информационные системы органов аудита
     * 
     */
    OA,

    /**
     * Информационные системы органов внутреннего контроля
     * 
     */
    OVK,

    /**
     * Информационные системы контрольных органов
     * 
     */
    IKO;

    public String value() {
        return name();
    }

    public static ExtPartnerType fromValue(String v) {
        return valueOf(v);
    }

}

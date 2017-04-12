//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:13 PM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RKDocumentKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RKDocumentKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contract"/>
 *     &lt;enumeration value="contractProcedure"/>
 *     &lt;enumeration value="control99BeginMessage"/>
 *     &lt;enumeration value="control99RefusalMessage"/>
 *     &lt;enumeration value="control99NoticeCompliance"/>
 *     &lt;enumeration value="control99ProtocolMismatch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RKDocumentKindType")
@XmlEnum
public enum RKDocumentKindType {


    /**
     * Информация о заключенном контракте
     * 
     */
    @XmlEnumValue("contract")
    CONTRACT("contract"),

    /**
     * Информация об исполнении (расторжении) контракта
     * 
     */
    @XmlEnumValue("contractProcedure")
    CONTRACT_PROCEDURE("contractProcedure"),

    /**
     * Сообщение о начале контроля по 99 статье
     * 
     */
    @XmlEnumValue("control99BeginMessage")
    CONTROL_99_BEGIN_MESSAGE("control99BeginMessage"),

    /**
     * Сообщение об отказе в принятии на контроль по 99 статье
     * 
     */
    @XmlEnumValue("control99RefusalMessage")
    CONTROL_99_REFUSAL_MESSAGE("control99RefusalMessage"),

    /**
     * Уведомление о соответствии контролируемой информации
     * 
     */
    @XmlEnumValue("control99NoticeCompliance")
    CONTROL_99_NOTICE_COMPLIANCE("control99NoticeCompliance"),

    /**
     * Протокол о несоответствии контролируемой информации
     * 
     */
    @XmlEnumValue("control99ProtocolMismatch")
    CONTROL_99_PROTOCOL_MISMATCH("control99ProtocolMismatch");
    private final String value;

    RKDocumentKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RKDocumentKindType fromValue(String v) {
        for (RKDocumentKindType c: RKDocumentKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

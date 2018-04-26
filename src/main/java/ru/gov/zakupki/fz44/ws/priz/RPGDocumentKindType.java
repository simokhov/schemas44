//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RPGDocumentKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RPGDocumentKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tenderPlan"/>
 *     &lt;enumeration value="tenderPlan2017"/>
 *     &lt;enumeration value="tenderPlanCancel"/>
 *     &lt;enumeration value="control99BeginMessage"/>
 *     &lt;enumeration value="control99RefusalMessage"/>
 *     &lt;enumeration value="control99NoticeCompliance"/>
 *     &lt;enumeration value="control99ProtocolMismatch"/>
 *     &lt;enumeration value="control99ProtocolMismatchReductFunds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RPGDocumentKindType")
@XmlEnum
public enum RPGDocumentKindType {


    /**
     * Cведения плана-графика закупок товаров, работ, услуг
     * 
     */
    @XmlEnumValue("tenderPlan")
    TENDER_PLAN("tenderPlan"),

    /**
     * Cведения плана-графика закупок товаров, работ, услуг с 01.01.2017
     * 
     */
    @XmlEnumValue("tenderPlan2017")
    TENDER_PLAN_2017("tenderPlan2017"),

    /**
     * Cведения об  аннулировании плана-графика товаров, работ, услуг
     * 
     */
    @XmlEnumValue("tenderPlanCancel")
    TENDER_PLAN_CANCEL("tenderPlanCancel"),

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
    CONTROL_99_PROTOCOL_MISMATCH("control99ProtocolMismatch"),

    /**
     * Протокол о несоответствии контролируемой информации  в связи с уменьшением средств
     * 
     */
    @XmlEnumValue("control99ProtocolMismatchReductFunds")
    CONTROL_99_PROTOCOL_MISMATCH_REDUCT_FUNDS("control99ProtocolMismatchReductFunds");
    private final String value;

    RPGDocumentKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RPGDocumentKindType fromValue(String v) {
        for (RPGDocumentKindType c: RPGDocumentKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

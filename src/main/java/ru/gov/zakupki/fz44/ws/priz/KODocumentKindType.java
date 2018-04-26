//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KODocumentKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KODocumentKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="complaint"/>
 *     &lt;enumeration value="complaintCancel"/>
 *     &lt;enumeration value="complaintGroup"/>
 *     &lt;enumeration value="checkPlan"/>
 *     &lt;enumeration value="unplannedCheck"/>
 *     &lt;enumeration value="unplannedCheckCancel"/>
 *     &lt;enumeration value="checkResult"/>
 *     &lt;enumeration value="checkResultCancel"/>
 *     &lt;enumeration value="eventPlan"/>
 *     &lt;enumeration value="unplannedEvent"/>
 *     &lt;enumeration value="unplannedEventCancel"/>
 *     &lt;enumeration value="eventResult"/>
 *     &lt;enumeration value="eventResultCancel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KODocumentKindType")
@XmlEnum
public enum KODocumentKindType {


    /**
     * Информация по жалобе для ИС КО
     * 
     */
    @XmlEnumValue("complaint")
    COMPLAINT("complaint"),

    /**
     * Информация об отзыве жалобы для ИС КО
     * 
     */
    @XmlEnumValue("complaintCancel")
    COMPLAINT_CANCEL("complaintCancel"),

    /**
     * Информация по групповой жалобе для ИС КО
     * 
     */
    @XmlEnumValue("complaintGroup")
    COMPLAINT_GROUP("complaintGroup"),

    /**
     * План проверок для ИС КО
     * 
     */
    @XmlEnumValue("checkPlan")
    CHECK_PLAN("checkPlan"),

    /**
     * Информация по внеплановой проверке для ИС КО
     * 
     */
    @XmlEnumValue("unplannedCheck")
    UNPLANNED_CHECK("unplannedCheck"),

    /**
     * Информация об отмене проведения внеплановой проверки для ИС КО
     * 
     */
    @XmlEnumValue("unplannedCheckCancel")
    UNPLANNED_CHECK_CANCEL("unplannedCheckCancel"),

    /**
     * Результат контроля для ИС КО
     * 
     */
    @XmlEnumValue("checkResult")
    CHECK_RESULT("checkResult"),

    /**
     * Информация об отмене результата контроля для ИС КО
     * 
     */
    @XmlEnumValue("checkResultCancel")
    CHECK_RESULT_CANCEL("checkResultCancel"),

    /**
     * План контрольных мероприятий для ИС ОВК
     * 
     */
    @XmlEnumValue("eventPlan")
    EVENT_PLAN("eventPlan"),

    /**
     * Информация по внеплановому контрольному мероприятию для ИС ОВК
     * 
     */
    @XmlEnumValue("unplannedEvent")
    UNPLANNED_EVENT("unplannedEvent"),

    /**
     * Информация об отмене проведения внепланового контрольного мероприятия для ИС ОВК
     * 
     */
    @XmlEnumValue("unplannedEventCancel")
    UNPLANNED_EVENT_CANCEL("unplannedEventCancel"),

    /**
     * Результат контроля для ИС ОВК
     * 
     */
    @XmlEnumValue("eventResult")
    EVENT_RESULT("eventResult"),

    /**
     * Информация об отмене результата контроля для ИС ОВК
     * 
     */
    @XmlEnumValue("eventResultCancel")
    EVENT_RESULT_CANCEL("eventResultCancel");
    private final String value;

    KODocumentKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KODocumentKindType fromValue(String v) {
        for (KODocumentKindType c: KODocumentKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

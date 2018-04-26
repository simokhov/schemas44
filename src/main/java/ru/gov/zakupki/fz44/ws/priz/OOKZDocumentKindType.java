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
 * <p>Java class for OOKZDocumentKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OOKZDocumentKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="publicDiscussionLargePurchasePhase1"/>
 *     &lt;enumeration value="publicDiscussionLargePurchasePhase2"/>
 *     &lt;enumeration value="publicDiscussionSuspensionPhase1"/>
 *     &lt;enumeration value="publicDiscussionSuspensionPhase2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OOKZDocumentKindType")
@XmlEnum
public enum OOKZDocumentKindType {


    /**
     * Информация о первом этапе обязательного общественного обсуждения крупной закупки (ООКЗ)
     * 
     */
    @XmlEnumValue("publicDiscussionLargePurchasePhase1")
    PUBLIC_DISCUSSION_LARGE_PURCHASE_PHASE_1("publicDiscussionLargePurchasePhase1"),

    /**
     * Информация о втором этапе обязательного общественного обсуждения крупной закупки (ООКЗ)
     * 
     */
    @XmlEnumValue("publicDiscussionLargePurchasePhase2")
    PUBLIC_DISCUSSION_LARGE_PURCHASE_PHASE_2("publicDiscussionLargePurchasePhase2"),

    /**
     * Приостановление/возобновление первого этапа ООКЗ
     * 
     */
    @XmlEnumValue("publicDiscussionSuspensionPhase1")
    PUBLIC_DISCUSSION_SUSPENSION_PHASE_1("publicDiscussionSuspensionPhase1"),

    /**
     * Приостановление/возобновление второго этапа ООКЗ
     * 
     */
    @XmlEnumValue("publicDiscussionSuspensionPhase2")
    PUBLIC_DISCUSSION_SUSPENSION_PHASE_2("publicDiscussionSuspensionPhase2");
    private final String value;

    OOKZDocumentKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OOKZDocumentKindType fromValue(String v) {
        for (OOKZDocumentKindType c: OOKZDocumentKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

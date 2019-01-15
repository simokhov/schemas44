//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.fz44.https;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RBGDocumentKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RBGDocumentKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bankGuarantee"/>
 *     &lt;enumeration value="bankGuaranteeInvalid"/>
 *     &lt;enumeration value="bankGuaranteeRefusal"/>
 *     &lt;enumeration value="bankGuaranteeRefusalInvalid"/>
 *     &lt;enumeration value="bankGuaranteeTermination"/>
 *     &lt;enumeration value="bankGuaranteeTerminationInvalid"/>
 *     &lt;enumeration value="bankGuaranteeReturn"/>
 *     &lt;enumeration value="bankGuaranteeReturnInvalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RBGDocumentKindType")
@XmlEnum
public enum RBGDocumentKindType {


    /**
     * Информация о выданной банковской гарантии; внесение изменений
     * 
     */
    @XmlEnumValue("bankGuarantee")
    BANK_GUARANTEE("bankGuarantee"),

    /**
     * Информация о недействительности сведений о банков-ской гарантии
     * 
     */
    @XmlEnumValue("bankGuaranteeInvalid")
    BANK_GUARANTEE_INVALID("bankGuaranteeInvalid"),

    /**
     * Сведения об отказе заказчика в принятии банковской гарантии; внесение изменений
     * 
     */
    @XmlEnumValue("bankGuaranteeRefusal")
    BANK_GUARANTEE_REFUSAL("bankGuaranteeRefusal"),

    /**
     * Сведения о недействительности отказа заказчика в принятии банковской гарантии
     * 
     */
    @XmlEnumValue("bankGuaranteeRefusalInvalid")
    BANK_GUARANTEE_REFUSAL_INVALID("bankGuaranteeRefusalInvalid"),

    /**
     * Информация о прекращении обязательств поставщика по банковской гарантии; внесение изменений
     * 
     */
    @XmlEnumValue("bankGuaranteeTermination")
    BANK_GUARANTEE_TERMINATION("bankGuaranteeTermination"),

    /**
     * Сведения о недействительности информации о прекращении обязательств поставщика по банковской гарантии
     * 
     */
    @XmlEnumValue("bankGuaranteeTerminationInvalid")
    BANK_GUARANTEE_TERMINATION_INVALID("bankGuaranteeTerminationInvalid"),

    /**
     * Информация о возвращении банковской гарантии или об освобождении от обязательств по банковской гарантии; внесение изменений
     * 
     */
    @XmlEnumValue("bankGuaranteeReturn")
    BANK_GUARANTEE_RETURN("bankGuaranteeReturn"),

    /**
     * Сведения о недействительности информации о воз-вращении банковской гарантии или об освобождении от обязательств по банковской гарантии
     * 
     */
    @XmlEnumValue("bankGuaranteeReturnInvalid")
    BANK_GUARANTEE_RETURN_INVALID("bankGuaranteeReturnInvalid");
    private final String value;

    RBGDocumentKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RBGDocumentKindType fromValue(String v) {
        for (RBGDocumentKindType c: RBGDocumentKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
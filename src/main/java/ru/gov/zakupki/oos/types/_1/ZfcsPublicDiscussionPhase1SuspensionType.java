//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Приостановление/возобновление первого этапа ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionPhase1SuspensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionPhase1SuspensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionCommonInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="publicDiscussionPhase1Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phase1" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPhase1Type" minOccurs="0"/>
 *         &lt;element name="action" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionrSuspensionActionType"/>
 *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionPhase1SuspensionType", propOrder = {
    "commonInfo",
    "phase1",
    "action",
    "reason",
    "printForm",
    "extPrintForm"
})
public class ZfcsPublicDiscussionPhase1SuspensionType {

    @XmlElement(required = true)
    protected ZfcsPublicDiscussionPhase1SuspensionType.CommonInfo commonInfo;
    protected ZfcsPublicDiscussionPhase1Type phase1;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPublicDiscussionrSuspensionActionType action;
    @XmlElement(required = true)
    protected String reason;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase1SuspensionType.CommonInfo }
     *     
     */
    public ZfcsPublicDiscussionPhase1SuspensionType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase1SuspensionType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsPublicDiscussionPhase1SuspensionType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the phase1 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase1Type }
     *     
     */
    public ZfcsPublicDiscussionPhase1Type getPhase1() {
        return phase1;
    }

    /**
     * Sets the value of the phase1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase1Type }
     *     
     */
    public void setPhase1(ZfcsPublicDiscussionPhase1Type value) {
        this.phase1 = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionrSuspensionActionType }
     *     
     */
    public ZfcsPublicDiscussionrSuspensionActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionrSuspensionActionType }
     *     
     */
    public void setAction(ZfcsPublicDiscussionrSuspensionActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionCommonInfoType">
     *       &lt;sequence>
     *         &lt;element name="publicDiscussionPhase1Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publicDiscussionPhase1Num"
    })
    public static class CommonInfo
        extends ZfcsPublicDiscussionCommonInfoType
    {

        @XmlElement(required = true)
        protected String publicDiscussionPhase1Num;

        /**
         * Gets the value of the publicDiscussionPhase1Num property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublicDiscussionPhase1Num() {
            return publicDiscussionPhase1Num;
        }

        /**
         * Sets the value of the publicDiscussionPhase1Num property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublicDiscussionPhase1Num(String value) {
            this.publicDiscussionPhase1Num = value;
        }

    }

}

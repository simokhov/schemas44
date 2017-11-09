//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Решение (заключение) результата контроля
 * 
 * <p>Java class for zfcs_checkResultDecisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultDecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="decisionNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="decisionText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *         &lt;element name="decisionAppeal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appealDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkResultDecisionType", propOrder = {
    "decisionNumber",
    "decisionDate",
    "decisionText",
    "attachments",
    "decisionAppeal"
})
public class ZfcsCheckResultDecisionType {

    @XmlElement(required = true)
    protected String decisionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
    protected String decisionText;
    @XmlElement(required = true)
    protected ZfcsControlRegistersAttachmentListType attachments;
    protected ZfcsAppealDetailsType decisionAppeal;

    /**
     * Gets the value of the decisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNumber() {
        return decisionNumber;
    }

    /**
     * Sets the value of the decisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNumber(String value) {
        this.decisionNumber = value;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionText() {
        return decisionText;
    }

    /**
     * Sets the value of the decisionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionText(String value) {
        this.decisionText = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public ZfcsControlRegistersAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the decisionAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAppealDetailsType }
     *     
     */
    public ZfcsAppealDetailsType getDecisionAppeal() {
        return decisionAppeal;
    }

    /**
     * Sets the value of the decisionAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAppealDetailsType }
     *     
     */
    public void setDecisionAppeal(ZfcsAppealDetailsType value) {
        this.decisionAppeal = value;
    }

}

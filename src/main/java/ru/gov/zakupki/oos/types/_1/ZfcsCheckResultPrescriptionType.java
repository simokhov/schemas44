//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Предписание результата контроля
 * 
 * <p>Java class for zfcs_checkResultPrescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultPrescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
 *         &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="prescriptionText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *         &lt;element name="prescriptionAppeal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appealDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkResultPrescriptionType", propOrder = {
    "prescriptionNumber",
    "prescriptionDate",
    "prescriptionText",
    "attachments",
    "prescriptionAppeal"
})
public class ZfcsCheckResultPrescriptionType {

    @XmlElement(required = true)
    protected String prescriptionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prescriptionDate;
    @XmlElement(required = true)
    protected String prescriptionText;
    @XmlElement(required = true)
    protected ZfcsControlRegistersAttachmentListType attachments;
    protected ZfcsAppealDetailsType prescriptionAppeal;

    /**
     * Gets the value of the prescriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionNumber() {
        return prescriptionNumber;
    }

    /**
     * Sets the value of the prescriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionNumber(String value) {
        this.prescriptionNumber = value;
    }

    /**
     * Gets the value of the prescriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * Sets the value of the prescriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrescriptionDate(XMLGregorianCalendar value) {
        this.prescriptionDate = value;
    }

    /**
     * Gets the value of the prescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionText() {
        return prescriptionText;
    }

    /**
     * Sets the value of the prescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionText(String value) {
        this.prescriptionText = value;
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
     * Gets the value of the prescriptionAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAppealDetailsType }
     *     
     */
    public ZfcsAppealDetailsType getPrescriptionAppeal() {
        return prescriptionAppeal;
    }

    /**
     * Sets the value of the prescriptionAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAppealDetailsType }
     *     
     */
    public void setPrescriptionAppeal(ZfcsAppealDetailsType value) {
        this.prescriptionAppeal = value;
    }

}

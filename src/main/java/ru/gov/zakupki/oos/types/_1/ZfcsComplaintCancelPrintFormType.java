//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип:Информация об отзыве жалобы для печатной формы
 * 
 * <p>Java class for zfcs_complaintCancelPrintFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintCancelPrintFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoReceivingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="text" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_complaintCancelPrintFormType", propOrder = {
    "infoReceivingDate",
    "name",
    "text",
    "attachments"
})
public class ZfcsComplaintCancelPrintFormType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar infoReceivingDate;
    protected String name;
    protected String text;
    protected ZfcsControlRegistersAttachmentListType attachments;

    /**
     * Gets the value of the infoReceivingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInfoReceivingDate() {
        return infoReceivingDate;
    }

    /**
     * Sets the value of the infoReceivingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInfoReceivingDate(XMLGregorianCalendar value) {
        this.infoReceivingDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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

}

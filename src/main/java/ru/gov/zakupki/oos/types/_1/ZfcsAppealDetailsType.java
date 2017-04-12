//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:00 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Реквизиты обжалования решения (акта, заключения) для результата контроля
 * 
 * <p>Java class for zfcs_appealDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_appealDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="actNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="actDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appealStatusType"/>
 *         &lt;element name="partialCancelText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
@XmlType(name = "zfcs_appealDetailsType", propOrder = {
    "authorityName",
    "actNumber",
    "actDate",
    "status",
    "partialCancelText",
    "attachments"
})
public class ZfcsAppealDetailsType {

    @XmlElement(required = true)
    protected String authorityName;
    @XmlElement(required = true)
    protected String actNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsAppealStatusType status;
    @XmlElement(required = true)
    protected String partialCancelText;
    protected ZfcsControlRegistersAttachmentListType attachments;

    /**
     * Gets the value of the authorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

    /**
     * Gets the value of the actNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActNumber() {
        return actNumber;
    }

    /**
     * Sets the value of the actNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActNumber(String value) {
        this.actNumber = value;
    }

    /**
     * Gets the value of the actDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActDate() {
        return actDate;
    }

    /**
     * Sets the value of the actDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActDate(XMLGregorianCalendar value) {
        this.actDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAppealStatusType }
     *     
     */
    public ZfcsAppealStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAppealStatusType }
     *     
     */
    public void setStatus(ZfcsAppealStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the partialCancelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialCancelText() {
        return partialCancelText;
    }

    /**
     * Sets the value of the partialCancelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialCancelText(String value) {
        this.partialCancelText = value;
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

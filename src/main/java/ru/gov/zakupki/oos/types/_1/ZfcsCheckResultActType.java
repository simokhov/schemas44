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
 * Тип: Акт результата контроля
 * 
 * <p>Java class for zfcs_checkResultActType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultActType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="actDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="actText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *         &lt;element name="actAppeal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appealDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkResultActType", propOrder = {
    "actNumber",
    "actDate",
    "actText",
    "attachments",
    "actAppeal"
})
public class ZfcsCheckResultActType {

    @XmlElement(required = true)
    protected String actNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actDate;
    @XmlElement(required = true)
    protected String actText;
    @XmlElement(required = true)
    protected ZfcsControlRegistersAttachmentListType attachments;
    protected ZfcsAppealDetailsType actAppeal;

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
     * Gets the value of the actText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActText() {
        return actText;
    }

    /**
     * Sets the value of the actText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActText(String value) {
        this.actText = value;
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
     * Gets the value of the actAppeal property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAppealDetailsType }
     *     
     */
    public ZfcsAppealDetailsType getActAppeal() {
        return actAppeal;
    }

    /**
     * Sets the value of the actAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAppealDetailsType }
     *     
     */
    public void setActAppeal(ZfcsAppealDetailsType value) {
        this.actAppeal = value;
    }

}

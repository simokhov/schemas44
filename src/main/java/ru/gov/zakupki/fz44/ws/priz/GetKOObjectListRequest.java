//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sender">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="senderType" type="{http://zakupki.gov.ru/fz44/ws/priz}partnerType"/>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/fz44/ws/priz}spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/fz44/ws/priz}consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="documentKind" type="{http://zakupki.gov.ru/fz44/ws/priz}KODocumentKindType" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sender",
    "senderType",
    "code",
    "consRegistryNum",
    "documentKind",
    "fromDate",
    "toDate"
})
@XmlRootElement(name = "getKOObjectListRequest")
public class GetKOObjectListRequest {

    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PartnerType senderType;
    @XmlElement(required = true)
    protected String code;
    protected String consRegistryNum;
    @XmlSchemaType(name = "string")
    protected KODocumentKindType documentKind;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the senderType property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerType }
     *     
     */
    public PartnerType getSenderType() {
        return senderType;
    }

    /**
     * Sets the value of the senderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerType }
     *     
     */
    public void setSenderType(PartnerType value) {
        this.senderType = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the consRegistryNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsRegistryNum() {
        return consRegistryNum;
    }

    /**
     * Sets the value of the consRegistryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsRegistryNum(String value) {
        this.consRegistryNum = value;
    }

    /**
     * Gets the value of the documentKind property.
     * 
     * @return
     *     possible object is
     *     {@link KODocumentKindType }
     *     
     */
    public KODocumentKindType getDocumentKind() {
        return documentKind;
    }

    /**
     * Sets the value of the documentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link KODocumentKindType }
     *     
     */
    public void setDocumentKind(KODocumentKindType value) {
        this.documentKind = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

}

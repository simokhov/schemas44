//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:01:57 PM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="documentUid" type="{http://zakupki.gov.ru/fz44/ws/priz}guidType"/>
 *         &lt;element name="documentKind" type="{http://zakupki.gov.ru/fz44/ws/priz}KODocumentKindType"/>
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
    "documentUid",
    "documentKind"
})
@XmlRootElement(name = "getKOObjectInfoRequest")
public class GetKOObjectInfoRequest {

    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PartnerType senderType;
    @XmlElement(required = true)
    protected String documentUid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected KODocumentKindType documentKind;

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
     * Gets the value of the documentUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentUid() {
        return documentUid;
    }

    /**
     * Sets the value of the documentUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentUid(String value) {
        this.documentUid = value;
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

}

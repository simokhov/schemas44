//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Общая информация о протоколе
 * 
 * <p>Java class for protocolCommonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolCommonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumberType"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType" minOccurs="0"/>
 *         &lt;element name="publishDTInEIS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/base/1}hrefType" minOccurs="0"/>
 *         &lt;element name="docNumberExternal" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
 *         &lt;element name="publishDTInETP" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="procedureDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hrefExternal" type="{http://zakupki.gov.ru/oos/base/1}hrefType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolCommonInfoType", propOrder = {
    "purchaseNumber",
    "docNumber",
    "publishDTInEIS",
    "href",
    "docNumberExternal",
    "publishDTInETP",
    "place",
    "procedureDT",
    "signDT",
    "hrefExternal"
})
public class ProtocolCommonInfoType {

    @XmlElement(required = true)
    protected String purchaseNumber;
    protected String docNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDTInEIS;
    protected String href;
    @XmlElement(required = true)
    protected String docNumberExternal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDTInETP;
    @XmlElement(required = true)
    protected String place;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procedureDT;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signDT;
    @XmlElement(required = true)
    protected String hrefExternal;

    /**
     * Gets the value of the purchaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    /**
     * Sets the value of the purchaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseNumber(String value) {
        this.purchaseNumber = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the publishDTInEIS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDTInEIS() {
        return publishDTInEIS;
    }

    /**
     * Sets the value of the publishDTInEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDTInEIS(XMLGregorianCalendar value) {
        this.publishDTInEIS = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the docNumberExternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumberExternal() {
        return docNumberExternal;
    }

    /**
     * Sets the value of the docNumberExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumberExternal(String value) {
        this.docNumberExternal = value;
    }

    /**
     * Gets the value of the publishDTInETP property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDTInETP() {
        return publishDTInETP;
    }

    /**
     * Sets the value of the publishDTInETP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDTInETP(XMLGregorianCalendar value) {
        this.publishDTInETP = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the procedureDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcedureDT() {
        return procedureDT;
    }

    /**
     * Sets the value of the procedureDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcedureDT(XMLGregorianCalendar value) {
        this.procedureDT = value;
    }

    /**
     * Gets the value of the signDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDT() {
        return signDT;
    }

    /**
     * Sets the value of the signDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDT(XMLGregorianCalendar value) {
        this.signDT = value;
    }

    /**
     * Gets the value of the hrefExternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrefExternal() {
        return hrefExternal;
    }

    /**
     * Sets the value of the hrefExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrefExternal(String value) {
        this.hrefExternal = value;
    }

}

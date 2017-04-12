//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:00:50 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Контактная информация
 * 
 * <p>Java class for zfcs_contactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgPostAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="orgFactAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="contactPerson" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
 *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
 *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
 *         &lt;element name="contactFax" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contactInfoType", propOrder = {
    "orgPostAddress",
    "orgFactAddress",
    "contactPerson",
    "contactEMail",
    "contactPhone",
    "contactFax",
    "addInfo"
})
public class ZfcsContactInfoType {

    @XmlElement(required = true)
    protected String orgPostAddress;
    @XmlElement(required = true)
    protected String orgFactAddress;
    @XmlElement(required = true)
    protected ZfcsContactPersonType contactPerson;
    @XmlElement(required = true)
    protected String contactEMail;
    @XmlElement(required = true)
    protected String contactPhone;
    protected String contactFax;
    protected String addInfo;

    /**
     * Gets the value of the orgPostAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPostAddress() {
        return orgPostAddress;
    }

    /**
     * Sets the value of the orgPostAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPostAddress(String value) {
        this.orgPostAddress = value;
    }

    /**
     * Gets the value of the orgFactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgFactAddress() {
        return orgFactAddress;
    }

    /**
     * Sets the value of the orgFactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgFactAddress(String value) {
        this.orgFactAddress = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContactPersonType }
     *     
     */
    public ZfcsContactPersonType getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContactPersonType }
     *     
     */
    public void setContactPerson(ZfcsContactPersonType value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the contactEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEMail() {
        return contactEMail;
    }

    /**
     * Sets the value of the contactEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEMail(String value) {
        this.contactEMail = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the value of the contactFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

}

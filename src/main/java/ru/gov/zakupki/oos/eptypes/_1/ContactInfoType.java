//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.PersonType;


/**
 * Тип: Контактная информация
 * 
 * <p>Java class for contactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgPostAddress" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="orgFactAddress" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="contactPersonInfo" type="{http://zakupki.gov.ru/oos/common/1}personType"/>
 *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
 *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/base/1}phoneType"/>
 *         &lt;element name="contactFax" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInfoType", propOrder = {
    "orgPostAddress",
    "orgFactAddress",
    "contactPersonInfo",
    "contactEMail",
    "contactPhone",
    "contactFax",
    "addInfo"
})
public class ContactInfoType {

    @XmlElement(required = true)
    protected String orgPostAddress;
    @XmlElement(required = true)
    protected String orgFactAddress;
    @XmlElement(required = true)
    protected PersonType contactPersonInfo;
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
     * Gets the value of the contactPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getContactPersonInfo() {
        return contactPersonInfo;
    }

    /**
     * Sets the value of the contactPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setContactPersonInfo(PersonType value) {
        this.contactPersonInfo = value;
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

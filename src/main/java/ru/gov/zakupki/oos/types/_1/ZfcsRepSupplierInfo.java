//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о поставщике в реестровой записи РЕП
 * 
 * <p>Java class for zfcs_repSupplierInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_repSupplierInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="shortName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType"/>
 *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType"/>
 *         &lt;element name="OGRN" type="{http://zakupki.gov.ru/oos/base/1}ogrnCodeType"/>
 *         &lt;element name="taxRegDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="addressPost" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType"/>
 *         &lt;element name="email" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_repSupplierInfo", propOrder = {
    "fullName",
    "shortName",
    "firmName",
    "inn",
    "kpp",
    "ogrn",
    "taxRegDate",
    "address",
    "addressPost",
    "phone",
    "email"
})
public class ZfcsRepSupplierInfo {

    @XmlElement(required = true)
    protected String fullName;
    protected String shortName;
    protected String firmName;
    @XmlElement(name = "INN", required = true)
    protected String inn;
    @XmlElement(name = "KPP", required = true)
    protected String kpp;
    @XmlElement(name = "OGRN", required = true)
    protected String ogrn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxRegDate;
    @XmlElement(required = true)
    protected String address;
    protected String addressPost;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String email;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the firmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * Sets the value of the firmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmName(String value) {
        this.firmName = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the taxRegDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxRegDate() {
        return taxRegDate;
    }

    /**
     * Sets the value of the taxRegDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxRegDate(XMLGregorianCalendar value) {
        this.taxRegDate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPost() {
        return addressPost;
    }

    /**
     * Sets the value of the addressPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPost(String value) {
        this.addressPost = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}

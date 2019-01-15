//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Страна происхождения товара, страна производителя в информации об исполненни (исполнении обязательств по предоставленной гарантии качества, расторжении) контракта
 * 
 * <p>Java class for zfcs_contractProcedure2015ProductsCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015ProductsCountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *         &lt;element name="sid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="externalSid" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *           &lt;element name="KTRU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRURef"/>
 *         &lt;/choice>
 *         &lt;element name="productName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedure2015ProductsCountryType", propOrder = {
    "country",
    "sid",
    "externalSid",
    "okpd",
    "okpd2",
    "ktru",
    "productName"
})
public class ZfcsContractProcedure2015ProductsCountryType {

    @XmlElement(required = true)
    protected ZfcsCountryRef country;
    protected Long sid;
    protected String externalSid;
    @XmlElement(name = "OKPD")
    protected ZfcsOKPDRef okpd;
    @XmlElement(name = "OKPD2")
    protected ZfcsOKPDRef okpd2;
    @XmlElement(name = "KTRU")
    protected ZfcsKTRURef ktru;
    protected String productName;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCountryRef }
     *     
     */
    public ZfcsCountryRef getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCountryRef }
     *     
     */
    public void setCountry(ZfcsCountryRef value) {
        this.country = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSid(Long value) {
        this.sid = value;
    }

    /**
     * Gets the value of the externalSid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSid() {
        return externalSid;
    }

    /**
     * Sets the value of the externalSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSid(String value) {
        this.externalSid = value;
    }

    /**
     * Gets the value of the okpd property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public ZfcsOKPDRef getOKPD() {
        return okpd;
    }

    /**
     * Sets the value of the okpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public void setOKPD(ZfcsOKPDRef value) {
        this.okpd = value;
    }

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public ZfcsOKPDRef getOKPD2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public void setOKPD2(ZfcsOKPDRef value) {
        this.okpd2 = value;
    }

    /**
     * Gets the value of the ktru property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKTRURef }
     *     
     */
    public ZfcsKTRURef getKTRU() {
        return ktru;
    }

    /**
     * Sets the value of the ktru property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKTRURef }
     *     
     */
    public void setKTRU(ZfcsKTRURef value) {
        this.ktru = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}

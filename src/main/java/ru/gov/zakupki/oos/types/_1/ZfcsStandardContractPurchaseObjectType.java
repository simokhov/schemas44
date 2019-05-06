//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Описание объектов закупки, для которых применяются типовой контракт, типовые условия контракта
 * 
 * <p>Java class for zfcs_standardContractPurchaseObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_standardContractPurchaseObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
 *           &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *           &lt;element name="KTRU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRURef"/>
 *         &lt;/choice>
 *         &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_standardContractPurchaseObjectType", propOrder = {
    "okved",
    "okved2",
    "okpd",
    "okpd2",
    "ktru",
    "description"
})
public class ZfcsStandardContractPurchaseObjectType {

    @XmlElement(name = "OKVED")
    protected ZfcsOKVEDRef okved;
    @XmlElement(name = "OKVED2")
    protected ZfcsOKVEDRef okved2;
    @XmlElement(name = "OKPD")
    protected ZfcsOKPDRef okpd;
    @XmlElement(name = "OKPD2")
    protected ZfcsOKPDRef okpd2;
    @XmlElement(name = "KTRU")
    protected ZfcsKTRURef ktru;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKVEDRef }
     *     
     */
    public ZfcsOKVEDRef getOKVED() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKVEDRef }
     *     
     */
    public void setOKVED(ZfcsOKVEDRef value) {
        this.okved = value;
    }

    /**
     * Gets the value of the okved2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKVEDRef }
     *     
     */
    public ZfcsOKVEDRef getOKVED2() {
        return okved2;
    }

    /**
     * Sets the value of the okved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKVEDRef }
     *     
     */
    public void setOKVED2(ZfcsOKVEDRef value) {
        this.okved2 = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}

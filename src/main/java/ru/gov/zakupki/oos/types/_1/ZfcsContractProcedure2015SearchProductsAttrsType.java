//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Реквизиты предмета контракта для поиска в исполнении контракта
 * 
 * <p>Java class for zfcs_contractProcedure2015SearchProductsAttrsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015SearchProductsAttrsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *           &lt;element name="KTRU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRURef"/>
 *         &lt;/choice>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType"/>
 *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedure2015SearchProductsAttrsType", propOrder = {
    "okpd",
    "okpd2",
    "ktru",
    "name",
    "okei",
    "price",
    "quantity",
    "sum"
})
public class ZfcsContractProcedure2015SearchProductsAttrsType {

    @XmlElement(name = "OKPD")
    protected ZfcsOKPDRef okpd;
    @XmlElement(name = "OKPD2")
    protected ZfcsOKPDRef okpd2;
    @XmlElement(name = "KTRU")
    protected ZfcsKTRURef ktru;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "OKEI", required = true)
    protected ZfcsContractOKEIType okei;
    @XmlElement(required = true)
    protected String price;
    protected Double quantity;
    protected String sum;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the okei property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractOKEIType }
     *     
     */
    public ZfcsContractOKEIType getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractOKEIType }
     *     
     */
    public void setOKEI(ZfcsContractOKEIType value) {
        this.okei = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSum(String value) {
        this.sum = value;
    }

}

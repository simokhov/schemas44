//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о товаре, производство которого создается или модернизируется и (или) осваивается на территории Российской Федерации в соответствии с контрактом
 * 
 * <p>Java class for zfcs_repProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_repProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef"/>
 *         &lt;element name="marginalUnitPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_repProductType", propOrder = {
    "okpd2",
    "okei",
    "marginalUnitPrice"
})
public class ZfcsRepProductType {

    @XmlElement(name = "OKPD2", required = true)
    protected ZfcsOKPDRef okpd2;
    @XmlElement(name = "OKEI", required = true)
    protected ZfcsOKEIRef okei;
    @XmlElement(required = true)
    protected String marginalUnitPrice;

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
     * Gets the value of the okei property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public ZfcsOKEIRef getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public void setOKEI(ZfcsOKEIRef value) {
        this.okei = value;
    }

    /**
     * Gets the value of the marginalUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginalUnitPrice() {
        return marginalUnitPrice;
    }

    /**
     * Sets the value of the marginalUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginalUnitPrice(String value) {
        this.marginalUnitPrice = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.lanit.gmu.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capitalInvestment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="financialProvision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="healthInsurance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="item781" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="kbk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentIndex", propOrder = {
    "capitalInvestment",
    "financialProvision",
    "healthInsurance",
    "item781",
    "kbk",
    "serviceTotal"
})
public class PaymentIndex {

    protected BigDecimal capitalInvestment;
    protected BigDecimal financialProvision;
    protected BigDecimal healthInsurance;
    protected BigDecimal item781;
    protected String kbk;
    protected BigDecimal serviceTotal;

    /**
     * Gets the value of the capitalInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalInvestment() {
        return capitalInvestment;
    }

    /**
     * Sets the value of the capitalInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalInvestment(BigDecimal value) {
        this.capitalInvestment = value;
    }

    /**
     * Gets the value of the financialProvision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinancialProvision() {
        return financialProvision;
    }

    /**
     * Sets the value of the financialProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinancialProvision(BigDecimal value) {
        this.financialProvision = value;
    }

    /**
     * Gets the value of the healthInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHealthInsurance() {
        return healthInsurance;
    }

    /**
     * Sets the value of the healthInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHealthInsurance(BigDecimal value) {
        this.healthInsurance = value;
    }

    /**
     * Gets the value of the item781 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItem781() {
        return item781;
    }

    /**
     * Sets the value of the item781 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItem781(BigDecimal value) {
        this.item781 = value;
    }

    /**
     * Gets the value of the kbk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbk() {
        return kbk;
    }

    /**
     * Sets the value of the kbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbk(String value) {
        this.kbk = value;
    }

    /**
     * Gets the value of the serviceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceTotal() {
        return serviceTotal;
    }

    /**
     * Sets the value of the serviceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceTotal(BigDecimal value) {
        this.serviceTotal = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.lanit.gmu.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for financialActivityPlanDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialActivityPlanDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://ws.gmu.lanit.ru/}organizationType" minOccurs="0"/>
 *         &lt;element name="requisiteElements" type="{http://ws.gmu.lanit.ru/}requisiteElements" minOccurs="0"/>
 *         &lt;element name="contractPaymentSums1001" type="{http://ws.gmu.lanit.ru/}sums" minOccurs="0"/>
 *         &lt;element name="productPurchaseSums2001" type="{http://ws.gmu.lanit.ru/}sums" minOccurs="0"/>
 *         &lt;element name="productPayment260" type="{http://ws.gmu.lanit.ru/}paymentIndex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialActivityPlanDto", propOrder = {
    "planYear",
    "organization",
    "requisiteElements",
    "contractPaymentSums1001",
    "productPurchaseSums2001",
    "productPayment260"
})
public class FinancialActivityPlanDto {

    protected Integer planYear;
    protected OrganizationType organization;
    protected RequisiteElements requisiteElements;
    protected Sums contractPaymentSums1001;
    protected Sums productPurchaseSums2001;
    protected PaymentIndex productPayment260;

    /**
     * Gets the value of the planYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanYear() {
        return planYear;
    }

    /**
     * Sets the value of the planYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanYear(Integer value) {
        this.planYear = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganization(OrganizationType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the requisiteElements property.
     * 
     * @return
     *     possible object is
     *     {@link RequisiteElements }
     *     
     */
    public RequisiteElements getRequisiteElements() {
        return requisiteElements;
    }

    /**
     * Sets the value of the requisiteElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequisiteElements }
     *     
     */
    public void setRequisiteElements(RequisiteElements value) {
        this.requisiteElements = value;
    }

    /**
     * Gets the value of the contractPaymentSums1001 property.
     * 
     * @return
     *     possible object is
     *     {@link Sums }
     *     
     */
    public Sums getContractPaymentSums1001() {
        return contractPaymentSums1001;
    }

    /**
     * Sets the value of the contractPaymentSums1001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sums }
     *     
     */
    public void setContractPaymentSums1001(Sums value) {
        this.contractPaymentSums1001 = value;
    }

    /**
     * Gets the value of the productPurchaseSums2001 property.
     * 
     * @return
     *     possible object is
     *     {@link Sums }
     *     
     */
    public Sums getProductPurchaseSums2001() {
        return productPurchaseSums2001;
    }

    /**
     * Sets the value of the productPurchaseSums2001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sums }
     *     
     */
    public void setProductPurchaseSums2001(Sums value) {
        this.productPurchaseSums2001 = value;
    }

    /**
     * Gets the value of the productPayment260 property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIndex }
     *     
     */
    public PaymentIndex getProductPayment260() {
        return productPayment260;
    }

    /**
     * Sets the value of the productPayment260 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIndex }
     *     
     */
    public void setProductPayment260(PaymentIndex value) {
        this.productPayment260 = value;
    }

}

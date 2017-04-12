//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:46 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Финансовое обеспечение закупки для плана закупок
 * 
 * <p>Java class for zfcs_purchasePlanFinanceResourcesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanFinanceResourcesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="currentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="subsecYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchasePlanFinanceResourcesType", propOrder = {
    "total",
    "currentYear",
    "firstYear",
    "secondYear",
    "subsecYears"
})
public class ZfcsPurchasePlanFinanceResourcesType {

    protected String total;
    protected String currentYear;
    protected String firstYear;
    protected String secondYear;
    protected String subsecYears;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the currentYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentYear() {
        return currentYear;
    }

    /**
     * Sets the value of the currentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentYear(String value) {
        this.currentYear = value;
    }

    /**
     * Gets the value of the firstYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstYear() {
        return firstYear;
    }

    /**
     * Sets the value of the firstYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstYear(String value) {
        this.firstYear = value;
    }

    /**
     * Gets the value of the secondYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondYear() {
        return secondYear;
    }

    /**
     * Sets the value of the secondYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondYear(String value) {
        this.secondYear = value;
    }

    /**
     * Gets the value of the subsecYears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsecYears() {
        return subsecYears;
    }

    /**
     * Sets the value of the subsecYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsecYears(String value) {
        this.subsecYears = value;
    }

}

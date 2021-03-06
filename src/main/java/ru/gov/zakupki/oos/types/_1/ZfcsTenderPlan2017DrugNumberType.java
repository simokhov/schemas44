//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Количество (объем) закупаемых лекарственных препаратов в плане-графике
 * 
 * <p>Java class for zfcs_tenderPlan2017DrugNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017DrugNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://zakupki.gov.ru/oos/base/1}quantity18p11Type" minOccurs="0"/>
 *         &lt;element name="currentYear" type="{http://zakupki.gov.ru/oos/base/1}quantity18p11Type" minOccurs="0"/>
 *         &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/base/1}quantity18p11Type" minOccurs="0"/>
 *         &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/base/1}quantity18p11Type" minOccurs="0"/>
 *         &lt;element name="subsecYears" type="{http://zakupki.gov.ru/oos/base/1}quantity18p11Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan2017DrugNumberType", propOrder = {
    "total",
    "currentYear",
    "firstYear",
    "secondYear",
    "subsecYears"
})
public class ZfcsTenderPlan2017DrugNumberType {

    protected BigDecimal total;
    protected BigDecimal currentYear;
    protected BigDecimal firstYear;
    protected BigDecimal secondYear;
    protected BigDecimal subsecYears;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the currentYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentYear() {
        return currentYear;
    }

    /**
     * Sets the value of the currentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentYear(BigDecimal value) {
        this.currentYear = value;
    }

    /**
     * Gets the value of the firstYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstYear() {
        return firstYear;
    }

    /**
     * Sets the value of the firstYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstYear(BigDecimal value) {
        this.firstYear = value;
    }

    /**
     * Gets the value of the secondYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondYear() {
        return secondYear;
    }

    /**
     * Sets the value of the secondYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondYear(BigDecimal value) {
        this.secondYear = value;
    }

    /**
     * Gets the value of the subsecYears property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsecYears() {
        return subsecYears;
    }

    /**
     * Sets the value of the subsecYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsecYears(BigDecimal value) {
        this.subsecYears = value;
    }

}

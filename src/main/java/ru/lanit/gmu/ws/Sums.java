//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.lanit.gmu.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sums complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sums">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentYearFz223Sum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currentYearFz44Sum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currentYearTotalSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="firstYearFz223Sum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="firstYearFz44Sum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="firstYearTotalSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="secondYearFz223Sum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="secondYearFz44Sum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="secondYearTotalSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sums", propOrder = {
    "currentYearFz223Sum",
    "currentYearFz44Sum",
    "currentYearTotalSum",
    "firstYearFz223Sum",
    "firstYearFz44Sum",
    "firstYearTotalSum",
    "secondYearFz223Sum",
    "secondYearFz44Sum",
    "secondYearTotalSum"
})
public class Sums {

    protected BigDecimal currentYearFz223Sum;
    protected BigDecimal currentYearFz44Sum;
    protected BigDecimal currentYearTotalSum;
    protected BigDecimal firstYearFz223Sum;
    protected BigDecimal firstYearFz44Sum;
    protected BigDecimal firstYearTotalSum;
    protected BigDecimal secondYearFz223Sum;
    protected BigDecimal secondYearFz44Sum;
    protected BigDecimal secondYearTotalSum;

    /**
     * Gets the value of the currentYearFz223Sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentYearFz223Sum() {
        return currentYearFz223Sum;
    }

    /**
     * Sets the value of the currentYearFz223Sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentYearFz223Sum(BigDecimal value) {
        this.currentYearFz223Sum = value;
    }

    /**
     * Gets the value of the currentYearFz44Sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentYearFz44Sum() {
        return currentYearFz44Sum;
    }

    /**
     * Sets the value of the currentYearFz44Sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentYearFz44Sum(BigDecimal value) {
        this.currentYearFz44Sum = value;
    }

    /**
     * Gets the value of the currentYearTotalSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentYearTotalSum() {
        return currentYearTotalSum;
    }

    /**
     * Sets the value of the currentYearTotalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentYearTotalSum(BigDecimal value) {
        this.currentYearTotalSum = value;
    }

    /**
     * Gets the value of the firstYearFz223Sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstYearFz223Sum() {
        return firstYearFz223Sum;
    }

    /**
     * Sets the value of the firstYearFz223Sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstYearFz223Sum(BigDecimal value) {
        this.firstYearFz223Sum = value;
    }

    /**
     * Gets the value of the firstYearFz44Sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstYearFz44Sum() {
        return firstYearFz44Sum;
    }

    /**
     * Sets the value of the firstYearFz44Sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstYearFz44Sum(BigDecimal value) {
        this.firstYearFz44Sum = value;
    }

    /**
     * Gets the value of the firstYearTotalSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstYearTotalSum() {
        return firstYearTotalSum;
    }

    /**
     * Sets the value of the firstYearTotalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstYearTotalSum(BigDecimal value) {
        this.firstYearTotalSum = value;
    }

    /**
     * Gets the value of the secondYearFz223Sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondYearFz223Sum() {
        return secondYearFz223Sum;
    }

    /**
     * Sets the value of the secondYearFz223Sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondYearFz223Sum(BigDecimal value) {
        this.secondYearFz223Sum = value;
    }

    /**
     * Gets the value of the secondYearFz44Sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondYearFz44Sum() {
        return secondYearFz44Sum;
    }

    /**
     * Sets the value of the secondYearFz44Sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondYearFz44Sum(BigDecimal value) {
        this.secondYearFz44Sum = value;
    }

    /**
     * Gets the value of the secondYearTotalSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondYearTotalSum() {
        return secondYearTotalSum;
    }

    /**
     * Sets the value of the secondYearTotalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondYearTotalSum(BigDecimal value) {
        this.secondYearTotalSum = value;
    }

}

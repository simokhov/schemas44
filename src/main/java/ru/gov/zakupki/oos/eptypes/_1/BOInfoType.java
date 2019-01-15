//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Информация о бюджетном обязательстве в требованиях заказчика
 * 
 * <p>Java class for BOInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BONumber" type="{http://zakupki.gov.ru/oos/base/1}boNumberType"/>
 *         &lt;element name="BODate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="inputBOFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="auto"/>
 *               &lt;enumeration value="manual"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/EPtypes/1}BOBudgetFinancingsType" minOccurs="0"/>
 *         &lt;element name="nonbudgetFinancings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/base/1}moneyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BORegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOInfoType", propOrder = {
    "boNumber",
    "boDate",
    "inputBOFlag",
    "budgetFinancings",
    "nonbudgetFinancings",
    "boRegistered"
})
public class BOInfoType {

    @XmlElement(name = "BONumber", required = true)
    protected String boNumber;
    @XmlElement(name = "BODate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boDate;
    protected String inputBOFlag;
    protected BOBudgetFinancingsType budgetFinancings;
    protected BOInfoType.NonbudgetFinancings nonbudgetFinancings;
    @XmlElement(name = "BORegistered", defaultValue = "true")
    protected Boolean boRegistered;

    /**
     * Gets the value of the boNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBONumber() {
        return boNumber;
    }

    /**
     * Sets the value of the boNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBONumber(String value) {
        this.boNumber = value;
    }

    /**
     * Gets the value of the boDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBODate() {
        return boDate;
    }

    /**
     * Sets the value of the boDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBODate(XMLGregorianCalendar value) {
        this.boDate = value;
    }

    /**
     * Gets the value of the inputBOFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBOFlag() {
        return inputBOFlag;
    }

    /**
     * Sets the value of the inputBOFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBOFlag(String value) {
        this.inputBOFlag = value;
    }

    /**
     * Gets the value of the budgetFinancings property.
     * 
     * @return
     *     possible object is
     *     {@link BOBudgetFinancingsType }
     *     
     */
    public BOBudgetFinancingsType getBudgetFinancings() {
        return budgetFinancings;
    }

    /**
     * Sets the value of the budgetFinancings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOBudgetFinancingsType }
     *     
     */
    public void setBudgetFinancings(BOBudgetFinancingsType value) {
        this.budgetFinancings = value;
    }

    /**
     * Gets the value of the nonbudgetFinancings property.
     * 
     * @return
     *     possible object is
     *     {@link BOInfoType.NonbudgetFinancings }
     *     
     */
    public BOInfoType.NonbudgetFinancings getNonbudgetFinancings() {
        return nonbudgetFinancings;
    }

    /**
     * Sets the value of the nonbudgetFinancings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOInfoType.NonbudgetFinancings }
     *     
     */
    public void setNonbudgetFinancings(BOInfoType.NonbudgetFinancings value) {
        this.nonbudgetFinancings = value;
    }

    /**
     * Gets the value of the boRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBORegistered() {
        return boRegistered;
    }

    /**
     * Sets the value of the boRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBORegistered(Boolean value) {
        this.boRegistered = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/base/1}moneyType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalSum"
    })
    public static class NonbudgetFinancings {

        @XmlElement(required = true)
        protected String totalSum;

        /**
         * Gets the value of the totalSum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalSum() {
            return totalSum;
        }

        /**
         * Sets the value of the totalSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalSum(String value) {
            this.totalSum = value;
        }

    }

}

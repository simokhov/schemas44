//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * План исполнения контракта за счет бюджетных средств
 * 
 * <p>Java class for zfcs_budgetFinancingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_budgetFinancingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetFinancing" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
 *                     &lt;element name="kbkCode2016" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
 *                   &lt;/choice>
 *                   &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                   &lt;element name="sum" type="{http://zakupki.gov.ru/oos/base/1}moneyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/base/1}moneyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_budgetFinancingsType", propOrder = {
    "budgetFinancing",
    "totalSum"
})
public class ZfcsBudgetFinancingsType {

    @XmlElement(required = true)
    protected List<ZfcsBudgetFinancingsType.BudgetFinancing> budgetFinancing;
    protected String totalSum;

    /**
     * Gets the value of the budgetFinancing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetFinancing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetFinancing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsBudgetFinancingsType.BudgetFinancing }
     * 
     * 
     */
    public List<ZfcsBudgetFinancingsType.BudgetFinancing> getBudgetFinancing() {
        if (budgetFinancing == null) {
            budgetFinancing = new ArrayList<ZfcsBudgetFinancingsType.BudgetFinancing>();
        }
        return this.budgetFinancing;
    }

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
     *         &lt;choice>
     *           &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
     *           &lt;element name="kbkCode2016" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
     *         &lt;/choice>
     *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/base/1}moneyType" minOccurs="0"/>
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
        "kbkCode",
        "kbkCode2016",
        "year",
        "sum"
    })
    public static class BudgetFinancing {

        protected String kbkCode;
        protected String kbkCode2016;
        protected int year;
        protected String sum;

        /**
         * Gets the value of the kbkCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKbkCode() {
            return kbkCode;
        }

        /**
         * Sets the value of the kbkCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKbkCode(String value) {
            this.kbkCode = value;
        }

        /**
         * Gets the value of the kbkCode2016 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKbkCode2016() {
            return kbkCode2016;
        }

        /**
         * Sets the value of the kbkCode2016 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKbkCode2016(String value) {
            this.kbkCode2016 = value;
        }

        /**
         * Gets the value of the year property.
         * 
         */
        public int getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         */
        public void setYear(int value) {
            this.year = value;
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

}

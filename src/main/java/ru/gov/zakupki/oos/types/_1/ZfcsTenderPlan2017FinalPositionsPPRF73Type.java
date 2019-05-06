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
 * Итоговые показатели плана-графика по ПП РФ 73
 * 
 * <p>Java class for zfcs_tenderPlan2017FinalPositionsPPRF73Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017FinalPositionsPPRF73Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financeSupport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sumPushasesSingleSupplier" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                   &lt;element name="financeSupportTotal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="financeSupportPushasesZK">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sumPushasesZK" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                   &lt;element name="sumPushasesZKPlannedPayments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="yearTotal" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan2017FinalPositionsPPRF73Type", propOrder = {
    "financeSupport",
    "financeSupportPushasesZK",
    "yearTotal"
})
public class ZfcsTenderPlan2017FinalPositionsPPRF73Type {

    protected ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupport financeSupport;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupportPushasesZK financeSupportPushasesZK;
    @XmlElement(required = true)
    protected String yearTotal;

    /**
     * Gets the value of the financeSupport property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupport }
     *     
     */
    public ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupport getFinanceSupport() {
        return financeSupport;
    }

    /**
     * Sets the value of the financeSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupport }
     *     
     */
    public void setFinanceSupport(ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupport value) {
        this.financeSupport = value;
    }

    /**
     * Gets the value of the financeSupportPushasesZK property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupportPushasesZK }
     *     
     */
    public ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupportPushasesZK getFinanceSupportPushasesZK() {
        return financeSupportPushasesZK;
    }

    /**
     * Sets the value of the financeSupportPushasesZK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupportPushasesZK }
     *     
     */
    public void setFinanceSupportPushasesZK(ZfcsTenderPlan2017FinalPositionsPPRF73Type.FinanceSupportPushasesZK value) {
        this.financeSupportPushasesZK = value;
    }

    /**
     * Gets the value of the yearTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearTotal() {
        return yearTotal;
    }

    /**
     * Sets the value of the yearTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearTotal(String value) {
        this.yearTotal = value;
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
     *         &lt;element name="sumPushasesSingleSupplier" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *         &lt;element name="financeSupportTotal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType" minOccurs="0"/>
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
        "sumPushasesSingleSupplier",
        "financeSupportTotal"
    })
    public static class FinanceSupport {

        protected String sumPushasesSingleSupplier;
        protected ZfcsTenderPlan2017FinanceResourcesType financeSupportTotal;

        /**
         * Gets the value of the sumPushasesSingleSupplier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumPushasesSingleSupplier() {
            return sumPushasesSingleSupplier;
        }

        /**
         * Sets the value of the sumPushasesSingleSupplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumPushasesSingleSupplier(String value) {
            this.sumPushasesSingleSupplier = value;
        }

        /**
         * Gets the value of the financeSupportTotal property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public ZfcsTenderPlan2017FinanceResourcesType getFinanceSupportTotal() {
            return financeSupportTotal;
        }

        /**
         * Sets the value of the financeSupportTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public void setFinanceSupportTotal(ZfcsTenderPlan2017FinanceResourcesType value) {
            this.financeSupportTotal = value;
        }

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
     *         &lt;element name="sumPushasesZK" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *         &lt;element name="sumPushasesZKPlannedPayments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType"/>
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
        "sumPushasesZK",
        "sumPushasesZKPlannedPayments"
    })
    public static class FinanceSupportPushasesZK {

        protected String sumPushasesZK;
        @XmlElement(required = true)
        protected ZfcsTenderPlan2017FinanceResourcesType sumPushasesZKPlannedPayments;

        /**
         * Gets the value of the sumPushasesZK property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumPushasesZK() {
            return sumPushasesZK;
        }

        /**
         * Sets the value of the sumPushasesZK property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumPushasesZK(String value) {
            this.sumPushasesZK = value;
        }

        /**
         * Gets the value of the sumPushasesZKPlannedPayments property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public ZfcsTenderPlan2017FinanceResourcesType getSumPushasesZKPlannedPayments() {
            return sumPushasesZKPlannedPayments;
        }

        /**
         * Sets the value of the sumPushasesZKPlannedPayments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public void setSumPushasesZKPlannedPayments(ZfcsTenderPlan2017FinanceResourcesType value) {
            this.sumPushasesZKPlannedPayments = value;
        }

    }

}

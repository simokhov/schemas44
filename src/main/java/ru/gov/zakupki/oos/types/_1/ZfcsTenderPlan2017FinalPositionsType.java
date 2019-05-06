//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Итоговые показатели плана-графика с 01.01.2017
 * 
 * <p>Java class for zfcs_tenderPlan2017FinalPositionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017FinalPositionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outcomeIndicators">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sumPushasesSmallBusiness" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType"/>
 *                   &lt;element name="sumPushasesRequest" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="financeSupport">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="financeSupportTotal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType" minOccurs="0"/>
 *                   &lt;element name="yearTotal" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan2017FinalPositionsType", propOrder = {
    "outcomeIndicators",
    "financeSupport"
})
public class ZfcsTenderPlan2017FinalPositionsType {

    @XmlElement(required = true)
    protected ZfcsTenderPlan2017FinalPositionsType.OutcomeIndicators outcomeIndicators;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017FinalPositionsType.FinanceSupport financeSupport;

    /**
     * Gets the value of the outcomeIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017FinalPositionsType.OutcomeIndicators }
     *     
     */
    public ZfcsTenderPlan2017FinalPositionsType.OutcomeIndicators getOutcomeIndicators() {
        return outcomeIndicators;
    }

    /**
     * Sets the value of the outcomeIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017FinalPositionsType.OutcomeIndicators }
     *     
     */
    public void setOutcomeIndicators(ZfcsTenderPlan2017FinalPositionsType.OutcomeIndicators value) {
        this.outcomeIndicators = value;
    }

    /**
     * Gets the value of the financeSupport property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017FinalPositionsType.FinanceSupport }
     *     
     */
    public ZfcsTenderPlan2017FinalPositionsType.FinanceSupport getFinanceSupport() {
        return financeSupport;
    }

    /**
     * Sets the value of the financeSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017FinalPositionsType.FinanceSupport }
     *     
     */
    public void setFinanceSupport(ZfcsTenderPlan2017FinalPositionsType.FinanceSupport value) {
        this.financeSupport = value;
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
     *         &lt;element name="financeSupportTotal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "financeSupportTotal",
        "yearTotal"
    })
    public static class FinanceSupport {

        protected ZfcsTenderPlan2017FinanceResourcesType financeSupportTotal;
        @XmlElement(required = true)
        protected String yearTotal;

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
     *         &lt;element name="sumPushasesSmallBusiness" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType"/>
     *         &lt;element name="sumPushasesRequest" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FinanceResourcesType"/>
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
        "sumPushasesSmallBusiness",
        "sumPushasesRequest"
    })
    public static class OutcomeIndicators {

        @XmlElement(required = true)
        protected ZfcsTenderPlan2017FinanceResourcesType sumPushasesSmallBusiness;
        @XmlElement(required = true)
        protected ZfcsTenderPlan2017FinanceResourcesType sumPushasesRequest;

        /**
         * Gets the value of the sumPushasesSmallBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public ZfcsTenderPlan2017FinanceResourcesType getSumPushasesSmallBusiness() {
            return sumPushasesSmallBusiness;
        }

        /**
         * Sets the value of the sumPushasesSmallBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public void setSumPushasesSmallBusiness(ZfcsTenderPlan2017FinanceResourcesType value) {
            this.sumPushasesSmallBusiness = value;
        }

        /**
         * Gets the value of the sumPushasesRequest property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public ZfcsTenderPlan2017FinanceResourcesType getSumPushasesRequest() {
            return sumPushasesRequest;
        }

        /**
         * Sets the value of the sumPushasesRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017FinanceResourcesType }
         *     
         */
        public void setSumPushasesRequest(ZfcsTenderPlan2017FinanceResourcesType value) {
            this.sumPushasesRequest = value;
        }

    }

}

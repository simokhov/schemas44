//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:53:38 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Итоговые позиции плана-графика
 * 
 * <p>Java class for zfcs_tenderPlanFinalPositionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlanFinalPositionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchase83" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="teachingService" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="guideService" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="medicine" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchase93" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseAmountLess100" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="purchaseAmountLess400" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outcomeIndicators">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sumPushaseSingleSupplier4" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="sumPushaseSingleSupplier5" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="sumPushaseSmallBusiness" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="sumPushaseRequest" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="sumContractMaxPrice" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sumPaymentsTotal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
@XmlType(name = "zfcs_tenderPlanFinalPositionsType", propOrder = {
    "purchase83",
    "purchase93",
    "outcomeIndicators"
})
public class ZfcsTenderPlanFinalPositionsType {

    protected ZfcsTenderPlanFinalPositionsType.Purchase83 purchase83;
    protected ZfcsTenderPlanFinalPositionsType.Purchase93 purchase93;
    @XmlElement(required = true)
    protected ZfcsTenderPlanFinalPositionsType.OutcomeIndicators outcomeIndicators;

    /**
     * Gets the value of the purchase83 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 }
     *     
     */
    public ZfcsTenderPlanFinalPositionsType.Purchase83 getPurchase83() {
        return purchase83;
    }

    /**
     * Sets the value of the purchase83 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 }
     *     
     */
    public void setPurchase83(ZfcsTenderPlanFinalPositionsType.Purchase83 value) {
        this.purchase83 = value;
    }

    /**
     * Gets the value of the purchase93 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanFinalPositionsType.Purchase93 }
     *     
     */
    public ZfcsTenderPlanFinalPositionsType.Purchase93 getPurchase93() {
        return purchase93;
    }

    /**
     * Sets the value of the purchase93 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanFinalPositionsType.Purchase93 }
     *     
     */
    public void setPurchase93(ZfcsTenderPlanFinalPositionsType.Purchase93 value) {
        this.purchase93 = value;
    }

    /**
     * Gets the value of the outcomeIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanFinalPositionsType.OutcomeIndicators }
     *     
     */
    public ZfcsTenderPlanFinalPositionsType.OutcomeIndicators getOutcomeIndicators() {
        return outcomeIndicators;
    }

    /**
     * Sets the value of the outcomeIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanFinalPositionsType.OutcomeIndicators }
     *     
     */
    public void setOutcomeIndicators(ZfcsTenderPlanFinalPositionsType.OutcomeIndicators value) {
        this.outcomeIndicators = value;
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
     *         &lt;element name="sumPushaseSingleSupplier4" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="sumPushaseSingleSupplier5" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="sumPushaseSmallBusiness" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="sumPushaseRequest" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="sumContractMaxPrice" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sumPaymentsTotal" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
        "sumPushaseSingleSupplier4",
        "sumPushaseSingleSupplier5",
        "sumPushaseSmallBusiness",
        "sumPushaseRequest",
        "sumContractMaxPrice",
        "sumPaymentsTotal"
    })
    public static class OutcomeIndicators {

        @XmlElement(required = true)
        protected String sumPushaseSingleSupplier4;
        @XmlElement(required = true)
        protected String sumPushaseSingleSupplier5;
        @XmlElement(required = true)
        protected String sumPushaseSmallBusiness;
        @XmlElement(required = true)
        protected String sumPushaseRequest;
        protected String sumContractMaxPrice;
        protected String sumPaymentsTotal;

        /**
         * Gets the value of the sumPushaseSingleSupplier4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumPushaseSingleSupplier4() {
            return sumPushaseSingleSupplier4;
        }

        /**
         * Sets the value of the sumPushaseSingleSupplier4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumPushaseSingleSupplier4(String value) {
            this.sumPushaseSingleSupplier4 = value;
        }

        /**
         * Gets the value of the sumPushaseSingleSupplier5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumPushaseSingleSupplier5() {
            return sumPushaseSingleSupplier5;
        }

        /**
         * Sets the value of the sumPushaseSingleSupplier5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumPushaseSingleSupplier5(String value) {
            this.sumPushaseSingleSupplier5 = value;
        }

        /**
         * Gets the value of the sumPushaseSmallBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumPushaseSmallBusiness() {
            return sumPushaseSmallBusiness;
        }

        /**
         * Sets the value of the sumPushaseSmallBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumPushaseSmallBusiness(String value) {
            this.sumPushaseSmallBusiness = value;
        }

        /**
         * Gets the value of the sumPushaseRequest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumPushaseRequest() {
            return sumPushaseRequest;
        }

        /**
         * Sets the value of the sumPushaseRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumPushaseRequest(String value) {
            this.sumPushaseRequest = value;
        }

        /**
         * Gets the value of the sumContractMaxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumContractMaxPrice() {
            return sumContractMaxPrice;
        }

        /**
         * Sets the value of the sumContractMaxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumContractMaxPrice(String value) {
            this.sumContractMaxPrice = value;
        }

        /**
         * Gets the value of the sumPaymentsTotal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSumPaymentsTotal() {
            return sumPaymentsTotal;
        }

        /**
         * Sets the value of the sumPaymentsTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSumPaymentsTotal(String value) {
            this.sumPaymentsTotal = value;
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
     *         &lt;element name="teachingService" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="guideService" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="medicine" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
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
    @XmlType(name = "", propOrder = {
        "teachingService",
        "guideService",
        "medicine"
    })
    public static class Purchase83 {

        protected ZfcsTenderPlanFinalPositionsType.Purchase83 .TeachingService teachingService;
        protected ZfcsTenderPlanFinalPositionsType.Purchase83 .GuideService guideService;
        protected ZfcsTenderPlanFinalPositionsType.Purchase83 .Medicine medicine;

        /**
         * Gets the value of the teachingService property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 .TeachingService }
         *     
         */
        public ZfcsTenderPlanFinalPositionsType.Purchase83 .TeachingService getTeachingService() {
            return teachingService;
        }

        /**
         * Sets the value of the teachingService property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 .TeachingService }
         *     
         */
        public void setTeachingService(ZfcsTenderPlanFinalPositionsType.Purchase83 .TeachingService value) {
            this.teachingService = value;
        }

        /**
         * Gets the value of the guideService property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 .GuideService }
         *     
         */
        public ZfcsTenderPlanFinalPositionsType.Purchase83 .GuideService getGuideService() {
            return guideService;
        }

        /**
         * Sets the value of the guideService property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 .GuideService }
         *     
         */
        public void setGuideService(ZfcsTenderPlanFinalPositionsType.Purchase83 .GuideService value) {
            this.guideService = value;
        }

        /**
         * Gets the value of the medicine property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 .Medicine }
         *     
         */
        public ZfcsTenderPlanFinalPositionsType.Purchase83 .Medicine getMedicine() {
            return medicine;
        }

        /**
         * Sets the value of the medicine property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase83 .Medicine }
         *     
         */
        public void setMedicine(ZfcsTenderPlanFinalPositionsType.Purchase83 .Medicine value) {
            this.medicine = value;
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
         *         &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
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
            "finances"
        })
        public static class GuideService {

            @XmlElement(required = true)
            protected ZfcsTenderPlanContextType finances;

            /**
             * Gets the value of the finances property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public ZfcsTenderPlanContextType getFinances() {
                return finances;
            }

            /**
             * Sets the value of the finances property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public void setFinances(ZfcsTenderPlanContextType value) {
                this.finances = value;
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
         *         &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
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
            "finances"
        })
        public static class Medicine {

            @XmlElement(required = true)
            protected ZfcsTenderPlanContextType finances;

            /**
             * Gets the value of the finances property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public ZfcsTenderPlanContextType getFinances() {
                return finances;
            }

            /**
             * Sets the value of the finances property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public void setFinances(ZfcsTenderPlanContextType value) {
                this.finances = value;
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
         *         &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
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
            "finances"
        })
        public static class TeachingService {

            @XmlElement(required = true)
            protected ZfcsTenderPlanContextType finances;

            /**
             * Gets the value of the finances property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public ZfcsTenderPlanContextType getFinances() {
                return finances;
            }

            /**
             * Sets the value of the finances property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public void setFinances(ZfcsTenderPlanContextType value) {
                this.finances = value;
            }

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
     *         &lt;element name="purchaseAmountLess100" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="purchaseAmountLess400" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
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
    @XmlType(name = "", propOrder = {
        "purchaseAmountLess100",
        "purchaseAmountLess400"
    })
    public static class Purchase93 {

        protected ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess100 purchaseAmountLess100;
        protected ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess400 purchaseAmountLess400;

        /**
         * Gets the value of the purchaseAmountLess100 property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess100 }
         *     
         */
        public ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess100 getPurchaseAmountLess100() {
            return purchaseAmountLess100;
        }

        /**
         * Sets the value of the purchaseAmountLess100 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess100 }
         *     
         */
        public void setPurchaseAmountLess100(ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess100 value) {
            this.purchaseAmountLess100 = value;
        }

        /**
         * Gets the value of the purchaseAmountLess400 property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess400 }
         *     
         */
        public ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess400 getPurchaseAmountLess400() {
            return purchaseAmountLess400;
        }

        /**
         * Sets the value of the purchaseAmountLess400 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess400 }
         *     
         */
        public void setPurchaseAmountLess400(ZfcsTenderPlanFinalPositionsType.Purchase93 .PurchaseAmountLess400 value) {
            this.purchaseAmountLess400 = value;
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
         *         &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
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
            "finances"
        })
        public static class PurchaseAmountLess100 {

            @XmlElement(required = true)
            protected ZfcsTenderPlanContextType finances;

            /**
             * Gets the value of the finances property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public ZfcsTenderPlanContextType getFinances() {
                return finances;
            }

            /**
             * Sets the value of the finances property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public void setFinances(ZfcsTenderPlanContextType value) {
                this.finances = value;
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
         *         &lt;element name="finances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan.ContextType"/>
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
            "finances"
        })
        public static class PurchaseAmountLess400 {

            @XmlElement(required = true)
            protected ZfcsTenderPlanContextType finances;

            /**
             * Gets the value of the finances property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public ZfcsTenderPlanContextType getFinances() {
                return finances;
            }

            /**
             * Sets the value of the finances property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlanContextType }
             *     
             */
            public void setFinances(ZfcsTenderPlanContextType value) {
                this.finances = value;
            }

        }

    }

}

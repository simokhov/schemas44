//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.ContractLifeCycleCaseRef;
import ru.gov.zakupki.oos.base._1.CurrencyRef;


/**
 * Тип: Условия контракта
 * 
 * <p>Java class for contractConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxPriceInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/base/1}currencyRef"/>
 *                   &lt;element name="financeSource" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;element name="interbudgetaryTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="standardContractNumber" type="{http://zakupki.gov.ru/oos/base/1}standardContractNumberType" minOccurs="0"/>
 *         &lt;element name="contractLifeCycleInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractLifeCycle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="contractLifeCycleCasesInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="contractLifeCycleCase" type="{http://zakupki.gov.ru/oos/base/1}contractLifeCycleCaseRef" maxOccurs="unbounded"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractConditionsType", propOrder = {
    "maxPriceInfo",
    "standardContractNumber",
    "contractLifeCycleInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.eptypes._1.NotificationEZKType.NotificationInfo.ContractConditionsInfo.class
})
public class ContractConditionsType {

    @XmlElement(required = true)
    protected ContractConditionsType.MaxPriceInfo maxPriceInfo;
    protected String standardContractNumber;
    protected ContractConditionsType.ContractLifeCycleInfo contractLifeCycleInfo;

    /**
     * Gets the value of the maxPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractConditionsType.MaxPriceInfo }
     *     
     */
    public ContractConditionsType.MaxPriceInfo getMaxPriceInfo() {
        return maxPriceInfo;
    }

    /**
     * Sets the value of the maxPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractConditionsType.MaxPriceInfo }
     *     
     */
    public void setMaxPriceInfo(ContractConditionsType.MaxPriceInfo value) {
        this.maxPriceInfo = value;
    }

    /**
     * Gets the value of the standardContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardContractNumber() {
        return standardContractNumber;
    }

    /**
     * Sets the value of the standardContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardContractNumber(String value) {
        this.standardContractNumber = value;
    }

    /**
     * Gets the value of the contractLifeCycleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractConditionsType.ContractLifeCycleInfo }
     *     
     */
    public ContractConditionsType.ContractLifeCycleInfo getContractLifeCycleInfo() {
        return contractLifeCycleInfo;
    }

    /**
     * Sets the value of the contractLifeCycleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractConditionsType.ContractLifeCycleInfo }
     *     
     */
    public void setContractLifeCycleInfo(ContractConditionsType.ContractLifeCycleInfo value) {
        this.contractLifeCycleInfo = value;
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
     *         &lt;element name="contractLifeCycle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="contractLifeCycleCasesInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="contractLifeCycleCase" type="{http://zakupki.gov.ru/oos/base/1}contractLifeCycleCaseRef" maxOccurs="unbounded"/>
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
        "contractLifeCycle",
        "contractLifeCycleCasesInfo"
    })
    public static class ContractLifeCycleInfo {

        protected boolean contractLifeCycle;
        @XmlElement(required = true)
        protected ContractConditionsType.ContractLifeCycleInfo.ContractLifeCycleCasesInfo contractLifeCycleCasesInfo;

        /**
         * Gets the value of the contractLifeCycle property.
         * 
         */
        public boolean isContractLifeCycle() {
            return contractLifeCycle;
        }

        /**
         * Sets the value of the contractLifeCycle property.
         * 
         */
        public void setContractLifeCycle(boolean value) {
            this.contractLifeCycle = value;
        }

        /**
         * Gets the value of the contractLifeCycleCasesInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContractConditionsType.ContractLifeCycleInfo.ContractLifeCycleCasesInfo }
         *     
         */
        public ContractConditionsType.ContractLifeCycleInfo.ContractLifeCycleCasesInfo getContractLifeCycleCasesInfo() {
            return contractLifeCycleCasesInfo;
        }

        /**
         * Sets the value of the contractLifeCycleCasesInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractConditionsType.ContractLifeCycleInfo.ContractLifeCycleCasesInfo }
         *     
         */
        public void setContractLifeCycleCasesInfo(ContractConditionsType.ContractLifeCycleInfo.ContractLifeCycleCasesInfo value) {
            this.contractLifeCycleCasesInfo = value;
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
         *         &lt;element name="contractLifeCycleCase" type="{http://zakupki.gov.ru/oos/base/1}contractLifeCycleCaseRef" maxOccurs="unbounded"/>
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
            "contractLifeCycleCase"
        })
        public static class ContractLifeCycleCasesInfo {

            @XmlElement(required = true)
            protected List<ContractLifeCycleCaseRef> contractLifeCycleCase;

            /**
             * Gets the value of the contractLifeCycleCase property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contractLifeCycleCase property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContractLifeCycleCase().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContractLifeCycleCaseRef }
             * 
             * 
             */
            public List<ContractLifeCycleCaseRef> getContractLifeCycleCase() {
                if (contractLifeCycleCase == null) {
                    contractLifeCycleCase = new ArrayList<ContractLifeCycleCaseRef>();
                }
                return this.contractLifeCycleCase;
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
     *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/base/1}currencyRef"/>
     *         &lt;element name="financeSource" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *         &lt;element name="interbudgetaryTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "maxPrice",
        "currency",
        "financeSource",
        "interbudgetaryTransfer"
    })
    public static class MaxPriceInfo {

        @XmlElement(required = true)
        protected String maxPrice;
        @XmlElement(required = true)
        protected CurrencyRef currency;
        @XmlElement(required = true)
        protected String financeSource;
        protected Boolean interbudgetaryTransfer;

        /**
         * Gets the value of the maxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxPrice() {
            return maxPrice;
        }

        /**
         * Sets the value of the maxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxPrice(String value) {
            this.maxPrice = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyRef }
         *     
         */
        public CurrencyRef getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyRef }
         *     
         */
        public void setCurrency(CurrencyRef value) {
            this.currency = value;
        }

        /**
         * Gets the value of the financeSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinanceSource() {
            return financeSource;
        }

        /**
         * Sets the value of the financeSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinanceSource(String value) {
            this.financeSource = value;
        }

        /**
         * Gets the value of the interbudgetaryTransfer property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInterbudgetaryTransfer() {
            return interbudgetaryTransfer;
        }

        /**
         * Sets the value of the interbudgetaryTransfer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInterbudgetaryTransfer(Boolean value) {
            this.interbudgetaryTransfer = value;
        }

    }

}

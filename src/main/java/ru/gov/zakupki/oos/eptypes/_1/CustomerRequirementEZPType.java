//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.OrganizationRef;
import ru.gov.zakupki.oos.common._1.BankSupportContractRequiredInfoType;


/**
 * Тип: Реквизиты находящиеся на уровне требований заказчиков для ЭЗП (запрос предложений в электронной форме)
 * 
 * <p>Java class for customerRequirementEZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerRequirementEZPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/base/1}organizationRef"/>
 *         &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/EPtypes/1}paymentInfoType" minOccurs="0"/>
 *         &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/EPtypes/1}paymentInfoType" minOccurs="0"/>
 *         &lt;element name="contractConditionsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="maxPriceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}maxPriceInfoType"/>
 *                   &lt;element name="maxPriceCurrency" type="{http://zakupki.gov.ru/oos/base/1}moneyType" minOccurs="0"/>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
 *                   &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}tendePlanEPInfoType" minOccurs="0"/>
 *                   &lt;element name="BOInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}BOInfoType" minOccurs="0"/>
 *                   &lt;element name="deliveryPlacesInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="deliveryPlaceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}kladrPlaceType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseObjectDescription" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="bankSupportContractRequiredInfo" type="{http://zakupki.gov.ru/oos/common/1}bankSupportContractRequiredInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerRequirementEZPType", propOrder = {
    "customer",
    "applicationGuarantee",
    "contractGuarantee",
    "contractConditionsInfo",
    "purchaseObjectDescription",
    "addInfo",
    "bankSupportContractRequiredInfo"
})
public class CustomerRequirementEZPType {

    @XmlElement(required = true)
    protected OrganizationRef customer;
    protected PaymentInfoType applicationGuarantee;
    protected PaymentInfoType contractGuarantee;
    @XmlElement(required = true)
    protected CustomerRequirementEZPType.ContractConditionsInfo contractConditionsInfo;
    protected String purchaseObjectDescription;
    protected String addInfo;
    protected BankSupportContractRequiredInfoType bankSupportContractRequiredInfo;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRef }
     *     
     */
    public OrganizationRef getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRef }
     *     
     */
    public void setCustomer(OrganizationRef value) {
        this.customer = value;
    }

    /**
     * Gets the value of the applicationGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getApplicationGuarantee() {
        return applicationGuarantee;
    }

    /**
     * Sets the value of the applicationGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setApplicationGuarantee(PaymentInfoType value) {
        this.applicationGuarantee = value;
    }

    /**
     * Gets the value of the contractGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getContractGuarantee() {
        return contractGuarantee;
    }

    /**
     * Sets the value of the contractGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setContractGuarantee(PaymentInfoType value) {
        this.contractGuarantee = value;
    }

    /**
     * Gets the value of the contractConditionsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRequirementEZPType.ContractConditionsInfo }
     *     
     */
    public CustomerRequirementEZPType.ContractConditionsInfo getContractConditionsInfo() {
        return contractConditionsInfo;
    }

    /**
     * Sets the value of the contractConditionsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRequirementEZPType.ContractConditionsInfo }
     *     
     */
    public void setContractConditionsInfo(CustomerRequirementEZPType.ContractConditionsInfo value) {
        this.contractConditionsInfo = value;
    }

    /**
     * Gets the value of the purchaseObjectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseObjectDescription() {
        return purchaseObjectDescription;
    }

    /**
     * Sets the value of the purchaseObjectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseObjectDescription(String value) {
        this.purchaseObjectDescription = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the bankSupportContractRequiredInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankSupportContractRequiredInfoType }
     *     
     */
    public BankSupportContractRequiredInfoType getBankSupportContractRequiredInfo() {
        return bankSupportContractRequiredInfo;
    }

    /**
     * Sets the value of the bankSupportContractRequiredInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSupportContractRequiredInfoType }
     *     
     */
    public void setBankSupportContractRequiredInfo(BankSupportContractRequiredInfoType value) {
        this.bankSupportContractRequiredInfo = value;
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
     *         &lt;element name="maxPriceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}maxPriceInfoType"/>
     *         &lt;element name="maxPriceCurrency" type="{http://zakupki.gov.ru/oos/base/1}moneyType" minOccurs="0"/>
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
     *         &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}tendePlanEPInfoType" minOccurs="0"/>
     *         &lt;element name="BOInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}BOInfoType" minOccurs="0"/>
     *         &lt;element name="deliveryPlacesInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="deliveryPlaceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}kladrPlaceType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
        "maxPriceInfo",
        "maxPriceCurrency",
        "purchaseCode",
        "tenderPlanInfo",
        "boInfo",
        "deliveryPlacesInfo",
        "deliveryTerm"
    })
    public static class ContractConditionsInfo {

        @XmlElement(required = true)
        protected MaxPriceInfoType maxPriceInfo;
        protected String maxPriceCurrency;
        protected String purchaseCode;
        protected TendePlanEPInfoType tenderPlanInfo;
        @XmlElement(name = "BOInfo")
        protected BOInfoType boInfo;
        @XmlElement(required = true)
        protected CustomerRequirementEZPType.ContractConditionsInfo.DeliveryPlacesInfo deliveryPlacesInfo;
        @XmlElement(required = true)
        protected String deliveryTerm;

        /**
         * Gets the value of the maxPriceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MaxPriceInfoType }
         *     
         */
        public MaxPriceInfoType getMaxPriceInfo() {
            return maxPriceInfo;
        }

        /**
         * Sets the value of the maxPriceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxPriceInfoType }
         *     
         */
        public void setMaxPriceInfo(MaxPriceInfoType value) {
            this.maxPriceInfo = value;
        }

        /**
         * Gets the value of the maxPriceCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxPriceCurrency() {
            return maxPriceCurrency;
        }

        /**
         * Sets the value of the maxPriceCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxPriceCurrency(String value) {
            this.maxPriceCurrency = value;
        }

        /**
         * Gets the value of the purchaseCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseCode() {
            return purchaseCode;
        }

        /**
         * Sets the value of the purchaseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseCode(String value) {
            this.purchaseCode = value;
        }

        /**
         * Gets the value of the tenderPlanInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TendePlanEPInfoType }
         *     
         */
        public TendePlanEPInfoType getTenderPlanInfo() {
            return tenderPlanInfo;
        }

        /**
         * Sets the value of the tenderPlanInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TendePlanEPInfoType }
         *     
         */
        public void setTenderPlanInfo(TendePlanEPInfoType value) {
            this.tenderPlanInfo = value;
        }

        /**
         * Gets the value of the boInfo property.
         * 
         * @return
         *     possible object is
         *     {@link BOInfoType }
         *     
         */
        public BOInfoType getBOInfo() {
            return boInfo;
        }

        /**
         * Sets the value of the boInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BOInfoType }
         *     
         */
        public void setBOInfo(BOInfoType value) {
            this.boInfo = value;
        }

        /**
         * Gets the value of the deliveryPlacesInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerRequirementEZPType.ContractConditionsInfo.DeliveryPlacesInfo }
         *     
         */
        public CustomerRequirementEZPType.ContractConditionsInfo.DeliveryPlacesInfo getDeliveryPlacesInfo() {
            return deliveryPlacesInfo;
        }

        /**
         * Sets the value of the deliveryPlacesInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerRequirementEZPType.ContractConditionsInfo.DeliveryPlacesInfo }
         *     
         */
        public void setDeliveryPlacesInfo(CustomerRequirementEZPType.ContractConditionsInfo.DeliveryPlacesInfo value) {
            this.deliveryPlacesInfo = value;
        }

        /**
         * Gets the value of the deliveryTerm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliveryTerm() {
            return deliveryTerm;
        }

        /**
         * Sets the value of the deliveryTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliveryTerm(String value) {
            this.deliveryTerm = value;
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
         *         &lt;element name="deliveryPlaceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}kladrPlaceType" maxOccurs="unbounded"/>
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
            "deliveryPlaceInfo"
        })
        public static class DeliveryPlacesInfo {

            @XmlElement(required = true)
            protected List<KladrPlaceType> deliveryPlaceInfo;

            /**
             * Gets the value of the deliveryPlaceInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the deliveryPlaceInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDeliveryPlaceInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link KladrPlaceType }
             * 
             * 
             */
            public List<KladrPlaceType> getDeliveryPlaceInfo() {
                if (deliveryPlaceInfo == null) {
                    deliveryPlaceInfo = new ArrayList<KladrPlaceType>();
                }
                return this.deliveryPlaceInfo;
            }

        }

    }

}

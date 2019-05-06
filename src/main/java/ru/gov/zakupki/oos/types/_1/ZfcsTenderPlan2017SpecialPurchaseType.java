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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Особая позиция в плане-графике с 01.01.2017
 * 
 * <p>Java class for zfcs_tenderPlan2017SpecialPurchaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017SpecialPurchaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanSpecialPurchaseRef"/>
 *         &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *         &lt;element name="yearFinanceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType" minOccurs="0"/>
 *         &lt;element name="purchases">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchase" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionNumberType" minOccurs="0"/>
 *                             &lt;element name="extNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType" minOccurs="0"/>
 *                             &lt;element name="purchasePlanPositionInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchasePlanPositionRefType"/>
 *                             &lt;element name="KVRInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanKVRRefType" minOccurs="0"/>
 *                             &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
 *                             &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchaseNumberType"/>
 *                             &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                             &lt;element name="yearFinanceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType" minOccurs="0"/>
 *                             &lt;element name="positionModificationStatus" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionModificationStatusEnum" minOccurs="0"/>
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
 *         &lt;element name="drugsTypeDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="centralizedPurchasing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="authorityOrgInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="KBKsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017KBKsInfoType" minOccurs="0"/>
 *         &lt;element name="methodsFoundation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="methodFoundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017MethodPriceFoundationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="specialPurchaseModification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionChangeReasonRef"/>
 *                   &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionDecisionType"/>
 *                   &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="modificationNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="specialPurchaseModificationStatus" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionModificationStatusEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan2017SpecialPurchaseType", propOrder = {
    "type",
    "yearFinances",
    "yearFinanceInfo",
    "purchases",
    "drugsTypeDetails",
    "kbKsInfo",
    "methodsFoundation",
    "specialPurchaseModification",
    "specialPurchaseModificationStatus"
})
public class ZfcsTenderPlan2017SpecialPurchaseType {

    @XmlElement(required = true)
    protected ZfcsPurchasePlanSpecialPurchaseRef type;
    protected String yearFinances;
    protected ZfcsPurchasePlanFinanceResourcesType yearFinanceInfo;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017SpecialPurchaseType.Purchases purchases;
    protected ZfcsTenderPlan2017SpecialPurchaseType.DrugsTypeDetails drugsTypeDetails;
    @XmlElement(name = "KBKsInfo")
    protected ZfcsTenderPlan2017KBKsInfoType kbKsInfo;
    protected ZfcsTenderPlan2017SpecialPurchaseType.MethodsFoundation methodsFoundation;
    protected ZfcsTenderPlan2017SpecialPurchaseType.SpecialPurchaseModification specialPurchaseModification;
    @XmlSchemaType(name = "string")
    protected ZfcsPurchasePlanPositionModificationStatusEnum specialPurchaseModificationStatus;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanSpecialPurchaseRef }
     *     
     */
    public ZfcsPurchasePlanSpecialPurchaseRef getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanSpecialPurchaseRef }
     *     
     */
    public void setType(ZfcsPurchasePlanSpecialPurchaseRef value) {
        this.type = value;
    }

    /**
     * Gets the value of the yearFinances property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearFinances() {
        return yearFinances;
    }

    /**
     * Sets the value of the yearFinances property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearFinances(String value) {
        this.yearFinances = value;
    }

    /**
     * Gets the value of the yearFinanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public ZfcsPurchasePlanFinanceResourcesType getYearFinanceInfo() {
        return yearFinanceInfo;
    }

    /**
     * Sets the value of the yearFinanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public void setYearFinanceInfo(ZfcsPurchasePlanFinanceResourcesType value) {
        this.yearFinanceInfo = value;
    }

    /**
     * Gets the value of the purchases property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.Purchases }
     *     
     */
    public ZfcsTenderPlan2017SpecialPurchaseType.Purchases getPurchases() {
        return purchases;
    }

    /**
     * Sets the value of the purchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.Purchases }
     *     
     */
    public void setPurchases(ZfcsTenderPlan2017SpecialPurchaseType.Purchases value) {
        this.purchases = value;
    }

    /**
     * Gets the value of the drugsTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.DrugsTypeDetails }
     *     
     */
    public ZfcsTenderPlan2017SpecialPurchaseType.DrugsTypeDetails getDrugsTypeDetails() {
        return drugsTypeDetails;
    }

    /**
     * Sets the value of the drugsTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.DrugsTypeDetails }
     *     
     */
    public void setDrugsTypeDetails(ZfcsTenderPlan2017SpecialPurchaseType.DrugsTypeDetails value) {
        this.drugsTypeDetails = value;
    }

    /**
     * Gets the value of the kbKsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017KBKsInfoType }
     *     
     */
    public ZfcsTenderPlan2017KBKsInfoType getKBKsInfo() {
        return kbKsInfo;
    }

    /**
     * Sets the value of the kbKsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017KBKsInfoType }
     *     
     */
    public void setKBKsInfo(ZfcsTenderPlan2017KBKsInfoType value) {
        this.kbKsInfo = value;
    }

    /**
     * Gets the value of the methodsFoundation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.MethodsFoundation }
     *     
     */
    public ZfcsTenderPlan2017SpecialPurchaseType.MethodsFoundation getMethodsFoundation() {
        return methodsFoundation;
    }

    /**
     * Sets the value of the methodsFoundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.MethodsFoundation }
     *     
     */
    public void setMethodsFoundation(ZfcsTenderPlan2017SpecialPurchaseType.MethodsFoundation value) {
        this.methodsFoundation = value;
    }

    /**
     * Gets the value of the specialPurchaseModification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.SpecialPurchaseModification }
     *     
     */
    public ZfcsTenderPlan2017SpecialPurchaseType.SpecialPurchaseModification getSpecialPurchaseModification() {
        return specialPurchaseModification;
    }

    /**
     * Sets the value of the specialPurchaseModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017SpecialPurchaseType.SpecialPurchaseModification }
     *     
     */
    public void setSpecialPurchaseModification(ZfcsTenderPlan2017SpecialPurchaseType.SpecialPurchaseModification value) {
        this.specialPurchaseModification = value;
    }

    /**
     * Gets the value of the specialPurchaseModificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanPositionModificationStatusEnum }
     *     
     */
    public ZfcsPurchasePlanPositionModificationStatusEnum getSpecialPurchaseModificationStatus() {
        return specialPurchaseModificationStatus;
    }

    /**
     * Sets the value of the specialPurchaseModificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanPositionModificationStatusEnum }
     *     
     */
    public void setSpecialPurchaseModificationStatus(ZfcsPurchasePlanPositionModificationStatusEnum value) {
        this.specialPurchaseModificationStatus = value;
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
     *         &lt;element name="centralizedPurchasing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="authorityOrgInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
        "centralizedPurchasing",
        "authorityOrgInfo"
    })
    public static class DrugsTypeDetails {

        protected boolean centralizedPurchasing;
        @XmlElement(required = true)
        protected ZfcsOrganizationRef authorityOrgInfo;

        /**
         * Gets the value of the centralizedPurchasing property.
         * 
         */
        public boolean isCentralizedPurchasing() {
            return centralizedPurchasing;
        }

        /**
         * Sets the value of the centralizedPurchasing property.
         * 
         */
        public void setCentralizedPurchasing(boolean value) {
            this.centralizedPurchasing = value;
        }

        /**
         * Gets the value of the authorityOrgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getAuthorityOrgInfo() {
            return authorityOrgInfo;
        }

        /**
         * Sets the value of the authorityOrgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setAuthorityOrgInfo(ZfcsOrganizationRef value) {
            this.authorityOrgInfo = value;
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
     *         &lt;element name="methodFoundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017MethodPriceFoundationType" maxOccurs="unbounded"/>
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
        "methodFoundation"
    })
    public static class MethodsFoundation {

        @XmlElement(required = true)
        protected List<ZfcsTenderPlan2017MethodPriceFoundationType> methodFoundation;

        /**
         * Gets the value of the methodFoundation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the methodFoundation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethodFoundation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsTenderPlan2017MethodPriceFoundationType }
         * 
         * 
         */
        public List<ZfcsTenderPlan2017MethodPriceFoundationType> getMethodFoundation() {
            if (methodFoundation == null) {
                methodFoundation = new ArrayList<ZfcsTenderPlan2017MethodPriceFoundationType>();
            }
            return this.methodFoundation;
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
     *         &lt;element name="purchase" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionNumberType" minOccurs="0"/>
     *                   &lt;element name="extNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType" minOccurs="0"/>
     *                   &lt;element name="purchasePlanPositionInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchasePlanPositionRefType"/>
     *                   &lt;element name="KVRInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanKVRRefType" minOccurs="0"/>
     *                   &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
     *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchaseNumberType"/>
     *                   &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *                   &lt;element name="yearFinanceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType" minOccurs="0"/>
     *                   &lt;element name="positionModificationStatus" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionModificationStatusEnum" minOccurs="0"/>
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
        "purchase"
    })
    public static class Purchases {

        @XmlElement(required = true)
        protected List<ZfcsTenderPlan2017SpecialPurchaseType.Purchases.Purchase> purchase;

        /**
         * Gets the value of the purchase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsTenderPlan2017SpecialPurchaseType.Purchases.Purchase }
         * 
         * 
         */
        public List<ZfcsTenderPlan2017SpecialPurchaseType.Purchases.Purchase> getPurchase() {
            if (purchase == null) {
                purchase = new ArrayList<ZfcsTenderPlan2017SpecialPurchaseType.Purchases.Purchase>();
            }
            return this.purchase;
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
         *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionNumberType" minOccurs="0"/>
         *         &lt;element name="extNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType" minOccurs="0"/>
         *         &lt;element name="purchasePlanPositionInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchasePlanPositionRefType"/>
         *         &lt;element name="KVRInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanKVRRefType" minOccurs="0"/>
         *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
         *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchaseNumberType"/>
         *         &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
         *         &lt;element name="yearFinanceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType" minOccurs="0"/>
         *         &lt;element name="positionModificationStatus" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionModificationStatusEnum" minOccurs="0"/>
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
            "positionNumber",
            "extNumber",
            "purchasePlanPositionInfo",
            "kvrInfo",
            "ikz",
            "purchaseNumber",
            "yearFinances",
            "yearFinanceInfo",
            "positionModificationStatus"
        })
        public static class Purchase {

            protected String positionNumber;
            protected String extNumber;
            @XmlElement(required = true)
            protected ZfcsTenderPlan2017PurchasePlanPositionRefType purchasePlanPositionInfo;
            @XmlElement(name = "KVRInfo")
            protected ZfcsPurchasePlanKVRRefType kvrInfo;
            @XmlElement(name = "IKZ")
            protected String ikz;
            @XmlElement(required = true)
            protected String purchaseNumber;
            protected String yearFinances;
            protected ZfcsPurchasePlanFinanceResourcesType yearFinanceInfo;
            @XmlSchemaType(name = "string")
            protected ZfcsPurchasePlanPositionModificationStatusEnum positionModificationStatus;

            /**
             * Gets the value of the positionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPositionNumber() {
                return positionNumber;
            }

            /**
             * Sets the value of the positionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPositionNumber(String value) {
                this.positionNumber = value;
            }

            /**
             * Gets the value of the extNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtNumber() {
                return extNumber;
            }

            /**
             * Sets the value of the extNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtNumber(String value) {
                this.extNumber = value;
            }

            /**
             * Gets the value of the purchasePlanPositionInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlan2017PurchasePlanPositionRefType }
             *     
             */
            public ZfcsTenderPlan2017PurchasePlanPositionRefType getPurchasePlanPositionInfo() {
                return purchasePlanPositionInfo;
            }

            /**
             * Sets the value of the purchasePlanPositionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlan2017PurchasePlanPositionRefType }
             *     
             */
            public void setPurchasePlanPositionInfo(ZfcsTenderPlan2017PurchasePlanPositionRefType value) {
                this.purchasePlanPositionInfo = value;
            }

            /**
             * Gets the value of the kvrInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchasePlanKVRRefType }
             *     
             */
            public ZfcsPurchasePlanKVRRefType getKVRInfo() {
                return kvrInfo;
            }

            /**
             * Sets the value of the kvrInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchasePlanKVRRefType }
             *     
             */
            public void setKVRInfo(ZfcsPurchasePlanKVRRefType value) {
                this.kvrInfo = value;
            }

            /**
             * Gets the value of the ikz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIKZ() {
                return ikz;
            }

            /**
             * Sets the value of the ikz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIKZ(String value) {
                this.ikz = value;
            }

            /**
             * Gets the value of the purchaseNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseNumber() {
                return purchaseNumber;
            }

            /**
             * Sets the value of the purchaseNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseNumber(String value) {
                this.purchaseNumber = value;
            }

            /**
             * Gets the value of the yearFinances property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYearFinances() {
                return yearFinances;
            }

            /**
             * Sets the value of the yearFinances property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYearFinances(String value) {
                this.yearFinances = value;
            }

            /**
             * Gets the value of the yearFinanceInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchasePlanFinanceResourcesType }
             *     
             */
            public ZfcsPurchasePlanFinanceResourcesType getYearFinanceInfo() {
                return yearFinanceInfo;
            }

            /**
             * Sets the value of the yearFinanceInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchasePlanFinanceResourcesType }
             *     
             */
            public void setYearFinanceInfo(ZfcsPurchasePlanFinanceResourcesType value) {
                this.yearFinanceInfo = value;
            }

            /**
             * Gets the value of the positionModificationStatus property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchasePlanPositionModificationStatusEnum }
             *     
             */
            public ZfcsPurchasePlanPositionModificationStatusEnum getPositionModificationStatus() {
                return positionModificationStatus;
            }

            /**
             * Sets the value of the positionModificationStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchasePlanPositionModificationStatusEnum }
             *     
             */
            public void setPositionModificationStatus(ZfcsPurchasePlanPositionModificationStatusEnum value) {
                this.positionModificationStatus = value;
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
     *         &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionChangeReasonRef"/>
     *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionDecisionType"/>
     *         &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="modificationNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
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
        "changeReason",
        "decision",
        "description",
        "modificationNumber"
    })
    public static class SpecialPurchaseModification {

        @XmlElement(required = true)
        protected ZfcsTenderPlan2017PositionChangeReasonRef changeReason;
        @XmlElement(required = true)
        protected ZfcsTenderPlan2017PositionDecisionType decision;
        protected String description;
        protected Integer modificationNumber;

        /**
         * Gets the value of the changeReason property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017PositionChangeReasonRef }
         *     
         */
        public ZfcsTenderPlan2017PositionChangeReasonRef getChangeReason() {
            return changeReason;
        }

        /**
         * Sets the value of the changeReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017PositionChangeReasonRef }
         *     
         */
        public void setChangeReason(ZfcsTenderPlan2017PositionChangeReasonRef value) {
            this.changeReason = value;
        }

        /**
         * Gets the value of the decision property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017PositionDecisionType }
         *     
         */
        public ZfcsTenderPlan2017PositionDecisionType getDecision() {
            return decision;
        }

        /**
         * Sets the value of the decision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017PositionDecisionType }
         *     
         */
        public void setDecision(ZfcsTenderPlan2017PositionDecisionType value) {
            this.decision = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the modificationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getModificationNumber() {
            return modificationNumber;
        }

        /**
         * Sets the value of the modificationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setModificationNumber(Integer value) {
            this.modificationNumber = value;
        }

    }

}

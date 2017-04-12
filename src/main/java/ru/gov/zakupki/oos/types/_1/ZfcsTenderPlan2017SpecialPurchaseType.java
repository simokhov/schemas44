//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:03:02 PM MSK 
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
 *                             &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
 *                             &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchaseNumberType"/>
 *                             &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
    "purchases",
    "methodsFoundation"
})
public class ZfcsTenderPlan2017SpecialPurchaseType {

    @XmlElement(required = true)
    protected ZfcsPurchasePlanSpecialPurchaseRef type;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017SpecialPurchaseType.Purchases purchases;
    protected ZfcsTenderPlan2017SpecialPurchaseType.MethodsFoundation methodsFoundation;

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
     *                   &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
     *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchaseNumberType"/>
     *                   &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
         *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
         *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PurchaseNumberType"/>
         *         &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
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
            @XmlElement(required = true)
            protected String yearFinances;
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

}

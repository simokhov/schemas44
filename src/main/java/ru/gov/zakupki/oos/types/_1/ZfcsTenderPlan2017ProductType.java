//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Товар, работа, услуга в спецификации ТРУ в позиции плана-графика
 * 
 * <p>Java class for zfcs_tenderPlan2017ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OKPD2">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPD2Ref">
 *                   &lt;sequence>
 *                     &lt;element name="characteristics" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="characteristicsUsingTextForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017ManualKtruCharacteristicType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="addCharacteristics" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longText4000MinType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="KTRU">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRURef">
 *                   &lt;sequence>
 *                     &lt;element name="characteristics" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="characteristicsUsingReferenceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017RefKtruCharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="characteristicsUsingTextForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017ManualKtruCharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="addCharacteristicInfoReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="productName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="productOKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="quantityUndefined">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;sequence>
 *             &lt;element name="productsQuantityInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017NumberType"/>
 *             &lt;element name="productsAveragePrice" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *             &lt;element name="productsSumPaymentsInfo">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="total" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                       &lt;element name="currentYear" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                       &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                       &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                       &lt;element name="subsecYears" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan2017ProductType", propOrder = {
    "okpd2",
    "ktru",
    "productName",
    "productOKEI",
    "quantityUndefined",
    "productsQuantityInfo",
    "productsAveragePrice",
    "productsSumPaymentsInfo"
})
public class ZfcsTenderPlan2017ProductType {

    @XmlElement(name = "OKPD2")
    protected ZfcsTenderPlan2017ProductType.OKPD2 okpd2;
    @XmlElement(name = "KTRU")
    protected ZfcsTenderPlan2017ProductType.KTRU ktru;
    protected String productName;
    protected ZfcsOKEIRef productOKEI;
    protected ZfcsTenderPlan2017ProductType.QuantityUndefined quantityUndefined;
    protected ZfcsTenderPlan2017NumberType productsQuantityInfo;
    protected String productsAveragePrice;
    protected ZfcsTenderPlan2017ProductType.ProductsSumPaymentsInfo productsSumPaymentsInfo;

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017ProductType.OKPD2 }
     *     
     */
    public ZfcsTenderPlan2017ProductType.OKPD2 getOKPD2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017ProductType.OKPD2 }
     *     
     */
    public void setOKPD2(ZfcsTenderPlan2017ProductType.OKPD2 value) {
        this.okpd2 = value;
    }

    /**
     * Gets the value of the ktru property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017ProductType.KTRU }
     *     
     */
    public ZfcsTenderPlan2017ProductType.KTRU getKTRU() {
        return ktru;
    }

    /**
     * Sets the value of the ktru property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017ProductType.KTRU }
     *     
     */
    public void setKTRU(ZfcsTenderPlan2017ProductType.KTRU value) {
        this.ktru = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productOKEI property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public ZfcsOKEIRef getProductOKEI() {
        return productOKEI;
    }

    /**
     * Sets the value of the productOKEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public void setProductOKEI(ZfcsOKEIRef value) {
        this.productOKEI = value;
    }

    /**
     * Gets the value of the quantityUndefined property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017ProductType.QuantityUndefined }
     *     
     */
    public ZfcsTenderPlan2017ProductType.QuantityUndefined getQuantityUndefined() {
        return quantityUndefined;
    }

    /**
     * Sets the value of the quantityUndefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017ProductType.QuantityUndefined }
     *     
     */
    public void setQuantityUndefined(ZfcsTenderPlan2017ProductType.QuantityUndefined value) {
        this.quantityUndefined = value;
    }

    /**
     * Gets the value of the productsQuantityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017NumberType }
     *     
     */
    public ZfcsTenderPlan2017NumberType getProductsQuantityInfo() {
        return productsQuantityInfo;
    }

    /**
     * Sets the value of the productsQuantityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017NumberType }
     *     
     */
    public void setProductsQuantityInfo(ZfcsTenderPlan2017NumberType value) {
        this.productsQuantityInfo = value;
    }

    /**
     * Gets the value of the productsAveragePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductsAveragePrice() {
        return productsAveragePrice;
    }

    /**
     * Sets the value of the productsAveragePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductsAveragePrice(String value) {
        this.productsAveragePrice = value;
    }

    /**
     * Gets the value of the productsSumPaymentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017ProductType.ProductsSumPaymentsInfo }
     *     
     */
    public ZfcsTenderPlan2017ProductType.ProductsSumPaymentsInfo getProductsSumPaymentsInfo() {
        return productsSumPaymentsInfo;
    }

    /**
     * Sets the value of the productsSumPaymentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017ProductType.ProductsSumPaymentsInfo }
     *     
     */
    public void setProductsSumPaymentsInfo(ZfcsTenderPlan2017ProductType.ProductsSumPaymentsInfo value) {
        this.productsSumPaymentsInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRURef">
     *       &lt;sequence>
     *         &lt;element name="characteristics" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="characteristicsUsingReferenceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017RefKtruCharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="characteristicsUsingTextForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017ManualKtruCharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="addCharacteristicInfoReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "characteristics"
    })
    public static class KTRU
        extends ZfcsKTRURef
    {

        protected ZfcsTenderPlan2017ProductType.KTRU.Characteristics characteristics;

        /**
         * Gets the value of the characteristics property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017ProductType.KTRU.Characteristics }
         *     
         */
        public ZfcsTenderPlan2017ProductType.KTRU.Characteristics getCharacteristics() {
            return characteristics;
        }

        /**
         * Sets the value of the characteristics property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017ProductType.KTRU.Characteristics }
         *     
         */
        public void setCharacteristics(ZfcsTenderPlan2017ProductType.KTRU.Characteristics value) {
            this.characteristics = value;
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
         *         &lt;element name="characteristicsUsingReferenceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017RefKtruCharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="characteristicsUsingTextForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017ManualKtruCharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="addCharacteristicInfoReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "characteristicsUsingReferenceInfo",
            "characteristicsUsingTextForm",
            "addCharacteristicInfoReason"
        })
        public static class Characteristics {

            protected List<ZfcsTenderPlan2017RefKtruCharacteristicType> characteristicsUsingReferenceInfo;
            protected List<ZfcsTenderPlan2017ManualKtruCharacteristicType> characteristicsUsingTextForm;
            protected String addCharacteristicInfoReason;

            /**
             * Gets the value of the characteristicsUsingReferenceInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the characteristicsUsingReferenceInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCharacteristicsUsingReferenceInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsTenderPlan2017RefKtruCharacteristicType }
             * 
             * 
             */
            public List<ZfcsTenderPlan2017RefKtruCharacteristicType> getCharacteristicsUsingReferenceInfo() {
                if (characteristicsUsingReferenceInfo == null) {
                    characteristicsUsingReferenceInfo = new ArrayList<ZfcsTenderPlan2017RefKtruCharacteristicType>();
                }
                return this.characteristicsUsingReferenceInfo;
            }

            /**
             * Gets the value of the characteristicsUsingTextForm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the characteristicsUsingTextForm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCharacteristicsUsingTextForm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsTenderPlan2017ManualKtruCharacteristicType }
             * 
             * 
             */
            public List<ZfcsTenderPlan2017ManualKtruCharacteristicType> getCharacteristicsUsingTextForm() {
                if (characteristicsUsingTextForm == null) {
                    characteristicsUsingTextForm = new ArrayList<ZfcsTenderPlan2017ManualKtruCharacteristicType>();
                }
                return this.characteristicsUsingTextForm;
            }

            /**
             * Gets the value of the addCharacteristicInfoReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddCharacteristicInfoReason() {
                return addCharacteristicInfoReason;
            }

            /**
             * Sets the value of the addCharacteristicInfoReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddCharacteristicInfoReason(String value) {
                this.addCharacteristicInfoReason = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPD2Ref">
     *       &lt;sequence>
     *         &lt;element name="characteristics" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="characteristicsUsingTextForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017ManualKtruCharacteristicType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="addCharacteristics" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longText4000MinType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "characteristics",
        "addCharacteristics"
    })
    public static class OKPD2
        extends ZfcsOKPD2Ref
    {

        protected ZfcsTenderPlan2017ProductType.OKPD2 .Characteristics characteristics;
        protected String addCharacteristics;

        /**
         * Gets the value of the characteristics property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017ProductType.OKPD2 .Characteristics }
         *     
         */
        public ZfcsTenderPlan2017ProductType.OKPD2 .Characteristics getCharacteristics() {
            return characteristics;
        }

        /**
         * Sets the value of the characteristics property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017ProductType.OKPD2 .Characteristics }
         *     
         */
        public void setCharacteristics(ZfcsTenderPlan2017ProductType.OKPD2 .Characteristics value) {
            this.characteristics = value;
        }

        /**
         * Gets the value of the addCharacteristics property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddCharacteristics() {
            return addCharacteristics;
        }

        /**
         * Sets the value of the addCharacteristics property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddCharacteristics(String value) {
            this.addCharacteristics = value;
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
         *         &lt;element name="characteristicsUsingTextForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017ManualKtruCharacteristicType" maxOccurs="unbounded"/>
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
            "characteristicsUsingTextForm"
        })
        public static class Characteristics {

            @XmlElement(required = true)
            protected List<ZfcsTenderPlan2017ManualKtruCharacteristicType> characteristicsUsingTextForm;

            /**
             * Gets the value of the characteristicsUsingTextForm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the characteristicsUsingTextForm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCharacteristicsUsingTextForm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsTenderPlan2017ManualKtruCharacteristicType }
             * 
             * 
             */
            public List<ZfcsTenderPlan2017ManualKtruCharacteristicType> getCharacteristicsUsingTextForm() {
                if (characteristicsUsingTextForm == null) {
                    characteristicsUsingTextForm = new ArrayList<ZfcsTenderPlan2017ManualKtruCharacteristicType>();
                }
                return this.characteristicsUsingTextForm;
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
     *         &lt;element name="total" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *         &lt;element name="currentYear" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *         &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *         &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *         &lt;element name="subsecYears" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
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
        "total",
        "currentYear",
        "firstYear",
        "secondYear",
        "subsecYears"
    })
    public static class ProductsSumPaymentsInfo {

        protected String total;
        protected String currentYear;
        protected String firstYear;
        protected String secondYear;
        protected String subsecYears;

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotal(String value) {
            this.total = value;
        }

        /**
         * Gets the value of the currentYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentYear() {
            return currentYear;
        }

        /**
         * Sets the value of the currentYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentYear(String value) {
            this.currentYear = value;
        }

        /**
         * Gets the value of the firstYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstYear() {
            return firstYear;
        }

        /**
         * Sets the value of the firstYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstYear(String value) {
            this.firstYear = value;
        }

        /**
         * Gets the value of the secondYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondYear() {
            return secondYear;
        }

        /**
         * Sets the value of the secondYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondYear(String value) {
            this.secondYear = value;
        }

        /**
         * Gets the value of the subsecYears property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubsecYears() {
            return subsecYears;
        }

        /**
         * Sets the value of the subsecYears property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubsecYears(String value) {
            this.subsecYears = value;
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
     *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
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
        "price"
    })
    public static class QuantityUndefined {

        @XmlElement(required = true)
        protected String price;

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrice(String value) {
            this.price = value;
        }

    }

}

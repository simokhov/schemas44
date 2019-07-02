//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Информация об объекте закупки в сведениях о контракте
 * 
 * <p>Java class for zfcs_contract2015PurchaseObjectInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contract2015PurchaseObjectInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="externalSid" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
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
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
 *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *         &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="whitoutVATPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="whitoutVATPriceRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/base/1}quantity18p11Type" minOccurs="0"/>
 *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="sumRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="withoutVATSum" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *         &lt;element name="withoutVATSumRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *         &lt;element name="VATRate" type="{http://zakupki.gov.ru/oos/base/1}VATRate2019Enum" minOccurs="0"/>
 *         &lt;element name="VATSum" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *         &lt;element name="VATSumRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contract2015PurchaseObjectInfoType", propOrder = {
    "sid",
    "externalSid",
    "okpd",
    "okpd2",
    "ktru",
    "name",
    "okei",
    "price",
    "priceRUR",
    "whitoutVATPrice",
    "whitoutVATPriceRUR",
    "quantity",
    "sum",
    "sumRUR",
    "withoutVATSum",
    "withoutVATSumRUR",
    "vatRate",
    "vatSum",
    "vatSumRUR"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsContract2015Type.Products.Product.class
})
public class ZfcsContract2015PurchaseObjectInfoType {

    protected Long sid;
    protected String externalSid;
    @XmlElement(name = "OKPD")
    protected ZfcsOKPDRef okpd;
    @XmlElement(name = "OKPD2")
    protected ZfcsOKPDRef okpd2;
    @XmlElement(name = "KTRU")
    protected ZfcsContract2015PurchaseObjectInfoType.KTRU ktru;
    protected String name;
    @XmlElement(name = "OKEI")
    protected ZfcsContractOKEIType okei;
    @XmlElement(required = true)
    protected String price;
    protected String priceRUR;
    protected String whitoutVATPrice;
    protected String whitoutVATPriceRUR;
    protected BigDecimal quantity;
    protected String sum;
    protected String sumRUR;
    protected String withoutVATSum;
    protected String withoutVATSumRUR;
    @XmlElement(name = "VATRate")
    protected String vatRate;
    @XmlElement(name = "VATSum")
    protected String vatSum;
    @XmlElement(name = "VATSumRUR")
    protected String vatSumRUR;

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSid(Long value) {
        this.sid = value;
    }

    /**
     * Gets the value of the externalSid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSid() {
        return externalSid;
    }

    /**
     * Sets the value of the externalSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSid(String value) {
        this.externalSid = value;
    }

    /**
     * Gets the value of the okpd property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public ZfcsOKPDRef getOKPD() {
        return okpd;
    }

    /**
     * Sets the value of the okpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public void setOKPD(ZfcsOKPDRef value) {
        this.okpd = value;
    }

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public ZfcsOKPDRef getOKPD2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKPDRef }
     *     
     */
    public void setOKPD2(ZfcsOKPDRef value) {
        this.okpd2 = value;
    }

    /**
     * Gets the value of the ktru property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015PurchaseObjectInfoType.KTRU }
     *     
     */
    public ZfcsContract2015PurchaseObjectInfoType.KTRU getKTRU() {
        return ktru;
    }

    /**
     * Sets the value of the ktru property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015PurchaseObjectInfoType.KTRU }
     *     
     */
    public void setKTRU(ZfcsContract2015PurchaseObjectInfoType.KTRU value) {
        this.ktru = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the okei property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractOKEIType }
     *     
     */
    public ZfcsContractOKEIType getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractOKEIType }
     *     
     */
    public void setOKEI(ZfcsContractOKEIType value) {
        this.okei = value;
    }

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

    /**
     * Gets the value of the priceRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRUR() {
        return priceRUR;
    }

    /**
     * Sets the value of the priceRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRUR(String value) {
        this.priceRUR = value;
    }

    /**
     * Gets the value of the whitoutVATPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhitoutVATPrice() {
        return whitoutVATPrice;
    }

    /**
     * Sets the value of the whitoutVATPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhitoutVATPrice(String value) {
        this.whitoutVATPrice = value;
    }

    /**
     * Gets the value of the whitoutVATPriceRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhitoutVATPriceRUR() {
        return whitoutVATPriceRUR;
    }

    /**
     * Sets the value of the whitoutVATPriceRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhitoutVATPriceRUR(String value) {
        this.whitoutVATPriceRUR = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
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

    /**
     * Gets the value of the sumRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumRUR() {
        return sumRUR;
    }

    /**
     * Sets the value of the sumRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumRUR(String value) {
        this.sumRUR = value;
    }

    /**
     * Gets the value of the withoutVATSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithoutVATSum() {
        return withoutVATSum;
    }

    /**
     * Sets the value of the withoutVATSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithoutVATSum(String value) {
        this.withoutVATSum = value;
    }

    /**
     * Gets the value of the withoutVATSumRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithoutVATSumRUR() {
        return withoutVATSumRUR;
    }

    /**
     * Sets the value of the withoutVATSumRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithoutVATSumRUR(String value) {
        this.withoutVATSumRUR = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATRate(String value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the vatSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATSum() {
        return vatSum;
    }

    /**
     * Sets the value of the vatSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATSum(String value) {
        this.vatSum = value;
    }

    /**
     * Gets the value of the vatSumRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATSumRUR() {
        return vatSumRUR;
    }

    /**
     * Sets the value of the vatSumRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATSumRUR(String value) {
        this.vatSumRUR = value;
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

        protected ZfcsContract2015PurchaseObjectInfoType.KTRU.Characteristics characteristics;

        /**
         * Gets the value of the characteristics property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015PurchaseObjectInfoType.KTRU.Characteristics }
         *     
         */
        public ZfcsContract2015PurchaseObjectInfoType.KTRU.Characteristics getCharacteristics() {
            return characteristics;
        }

        /**
         * Sets the value of the characteristics property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015PurchaseObjectInfoType.KTRU.Characteristics }
         *     
         */
        public void setCharacteristics(ZfcsContract2015PurchaseObjectInfoType.KTRU.Characteristics value) {
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
            "characteristicsUsingTextForm"
        })
        public static class Characteristics {

            protected List<ZfcsTenderPlan2017RefKtruCharacteristicType> characteristicsUsingReferenceInfo;
            protected List<ZfcsTenderPlan2017ManualKtruCharacteristicType> characteristicsUsingTextForm;

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

        }

    }

}

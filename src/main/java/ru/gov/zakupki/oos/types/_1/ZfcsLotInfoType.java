//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о лоте ОК (для печатной формы)
 * 
 * <p>Java class for zfcs_lotInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_lotInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lotObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *         &lt;element name="isMaxPriceCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseIsMaxPriceCurrencyType" minOccurs="0"/>
 *         &lt;element name="spelledMaxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *         &lt;element name="spelledUnitPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="standardContractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractNumberType" minOccurs="0"/>
 *         &lt;element name="priceFormula" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="financeSource" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *           &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="customers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="preferenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="requirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="restrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="restriction" type="{http://zakupki.gov.ru/oos/types/1}zfcs_restrictionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseProlongation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="prolongationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="spelledInvalidAppCount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="spelledAppCount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="spelledValidAppCount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="BOInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseBOInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_lotInfoType", propOrder = {
    "lotObjectInfo",
    "currency",
    "maxPrice",
    "isMaxPriceCurrency",
    "spelledMaxPrice",
    "unitPrice",
    "spelledUnitPrice",
    "standardContractNumber",
    "priceFormula",
    "financeSource",
    "deliveryTerm",
    "deliveryPlace",
    "kladrPlaces",
    "customers",
    "preferenses",
    "requirements",
    "restrictions",
    "purchaseProlongation",
    "spelledInvalidAppCount",
    "spelledAppCount",
    "spelledValidAppCount",
    "boInfo"
})
public class ZfcsLotInfoType {

    protected String lotObjectInfo;
    protected ZfcsCurrencyRef currency;
    protected String maxPrice;
    protected ZfcsPurchaseIsMaxPriceCurrencyType isMaxPriceCurrency;
    protected String spelledMaxPrice;
    protected String unitPrice;
    protected String spelledUnitPrice;
    protected String standardContractNumber;
    protected String priceFormula;
    protected String financeSource;
    protected String deliveryTerm;
    protected String deliveryPlace;
    protected ZfcsKladrPlacesType kladrPlaces;
    protected ZfcsLotInfoType.Customers customers;
    protected ZfcsLotInfoType.Preferenses preferenses;
    protected ZfcsLotInfoType.Requirements requirements;
    protected ZfcsLotInfoType.Restrictions restrictions;
    protected ZfcsLotInfoType.PurchaseProlongation purchaseProlongation;
    protected String spelledInvalidAppCount;
    protected String spelledAppCount;
    protected String spelledValidAppCount;
    @XmlElement(name = "BOInfo")
    protected ZfcsPurchaseBOInfoType boInfo;

    /**
     * Gets the value of the lotObjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotObjectInfo() {
        return lotObjectInfo;
    }

    /**
     * Sets the value of the lotObjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotObjectInfo(String value) {
        this.lotObjectInfo = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public ZfcsCurrencyRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public void setCurrency(ZfcsCurrencyRef value) {
        this.currency = value;
    }

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
     * Gets the value of the isMaxPriceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseIsMaxPriceCurrencyType }
     *     
     */
    public ZfcsPurchaseIsMaxPriceCurrencyType getIsMaxPriceCurrency() {
        return isMaxPriceCurrency;
    }

    /**
     * Sets the value of the isMaxPriceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseIsMaxPriceCurrencyType }
     *     
     */
    public void setIsMaxPriceCurrency(ZfcsPurchaseIsMaxPriceCurrencyType value) {
        this.isMaxPriceCurrency = value;
    }

    /**
     * Gets the value of the spelledMaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpelledMaxPrice() {
        return spelledMaxPrice;
    }

    /**
     * Sets the value of the spelledMaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpelledMaxPrice(String value) {
        this.spelledMaxPrice = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the spelledUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpelledUnitPrice() {
        return spelledUnitPrice;
    }

    /**
     * Sets the value of the spelledUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpelledUnitPrice(String value) {
        this.spelledUnitPrice = value;
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
     * Gets the value of the priceFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceFormula() {
        return priceFormula;
    }

    /**
     * Sets the value of the priceFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceFormula(String value) {
        this.priceFormula = value;
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
     * Gets the value of the deliveryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    /**
     * Sets the value of the deliveryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPlace(String value) {
        this.deliveryPlace = value;
    }

    /**
     * Gets the value of the kladrPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKladrPlacesType }
     *     
     */
    public ZfcsKladrPlacesType getKladrPlaces() {
        return kladrPlaces;
    }

    /**
     * Sets the value of the kladrPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKladrPlacesType }
     *     
     */
    public void setKladrPlaces(ZfcsKladrPlacesType value) {
        this.kladrPlaces = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotInfoType.Customers }
     *     
     */
    public ZfcsLotInfoType.Customers getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotInfoType.Customers }
     *     
     */
    public void setCustomers(ZfcsLotInfoType.Customers value) {
        this.customers = value;
    }

    /**
     * Gets the value of the preferenses property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotInfoType.Preferenses }
     *     
     */
    public ZfcsLotInfoType.Preferenses getPreferenses() {
        return preferenses;
    }

    /**
     * Sets the value of the preferenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotInfoType.Preferenses }
     *     
     */
    public void setPreferenses(ZfcsLotInfoType.Preferenses value) {
        this.preferenses = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotInfoType.Requirements }
     *     
     */
    public ZfcsLotInfoType.Requirements getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotInfoType.Requirements }
     *     
     */
    public void setRequirements(ZfcsLotInfoType.Requirements value) {
        this.requirements = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotInfoType.Restrictions }
     *     
     */
    public ZfcsLotInfoType.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotInfoType.Restrictions }
     *     
     */
    public void setRestrictions(ZfcsLotInfoType.Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the purchaseProlongation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotInfoType.PurchaseProlongation }
     *     
     */
    public ZfcsLotInfoType.PurchaseProlongation getPurchaseProlongation() {
        return purchaseProlongation;
    }

    /**
     * Sets the value of the purchaseProlongation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotInfoType.PurchaseProlongation }
     *     
     */
    public void setPurchaseProlongation(ZfcsLotInfoType.PurchaseProlongation value) {
        this.purchaseProlongation = value;
    }

    /**
     * Gets the value of the spelledInvalidAppCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpelledInvalidAppCount() {
        return spelledInvalidAppCount;
    }

    /**
     * Sets the value of the spelledInvalidAppCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpelledInvalidAppCount(String value) {
        this.spelledInvalidAppCount = value;
    }

    /**
     * Gets the value of the spelledAppCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpelledAppCount() {
        return spelledAppCount;
    }

    /**
     * Sets the value of the spelledAppCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpelledAppCount(String value) {
        this.spelledAppCount = value;
    }

    /**
     * Gets the value of the spelledValidAppCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpelledValidAppCount() {
        return spelledValidAppCount;
    }

    /**
     * Sets the value of the spelledValidAppCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpelledValidAppCount(String value) {
        this.spelledValidAppCount = value;
    }

    /**
     * Gets the value of the boInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseBOInfoType }
     *     
     */
    public ZfcsPurchaseBOInfoType getBOInfo() {
        return boInfo;
    }

    /**
     * Sets the value of the boInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseBOInfoType }
     *     
     */
    public void setBOInfo(ZfcsPurchaseBOInfoType value) {
        this.boInfo = value;
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
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" maxOccurs="unbounded"/>
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
        "customer"
    })
    public static class Customers {

        @XmlElement(required = true)
        protected List<ZfcsOrganizationRef> customer;

        /**
         * Gets the value of the customer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsOrganizationRef }
         * 
         * 
         */
        public List<ZfcsOrganizationRef> getCustomer() {
            if (customer == null) {
                customer = new ArrayList<ZfcsOrganizationRef>();
            }
            return this.customer;
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
     *         &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
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
        "preferense"
    })
    public static class Preferenses {

        @XmlElement(required = true)
        protected List<ZfcsPreferenseType> preferense;

        /**
         * Gets the value of the preferense property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preferense property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreferense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPreferenseType }
         * 
         * 
         */
        public List<ZfcsPreferenseType> getPreferense() {
            if (preferense == null) {
                preferense = new ArrayList<ZfcsPreferenseType>();
            }
            return this.preferense;
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
     *         &lt;element name="prolongationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "prolongationNumber",
        "publishDate"
    })
    public static class PurchaseProlongation {

        @XmlElement(required = true)
        protected String prolongationNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;

        /**
         * Gets the value of the prolongationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProlongationNumber() {
            return prolongationNumber;
        }

        /**
         * Sets the value of the prolongationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProlongationNumber(String value) {
            this.prolongationNumber = value;
        }

        /**
         * Gets the value of the publishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishDate(XMLGregorianCalendar value) {
            this.publishDate = value;
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
     *         &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
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
        "requirement"
    })
    public static class Requirements {

        @XmlElement(required = true)
        protected List<ZfcsRequirementType> requirement;

        /**
         * Gets the value of the requirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsRequirementType }
         * 
         * 
         */
        public List<ZfcsRequirementType> getRequirement() {
            if (requirement == null) {
                requirement = new ArrayList<ZfcsRequirementType>();
            }
            return this.requirement;
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
     *         &lt;element name="restriction" type="{http://zakupki.gov.ru/oos/types/1}zfcs_restrictionType" maxOccurs="unbounded"/>
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
        "restriction"
    })
    public static class Restrictions {

        @XmlElement(required = true)
        protected List<ZfcsRestrictionType> restriction;

        /**
         * Gets the value of the restriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsRestrictionType }
         * 
         * 
         */
        public List<ZfcsRestrictionType> getRestriction() {
            if (restriction == null) {
                restriction = new ArrayList<ZfcsRestrictionType>();
            }
            return this.restriction;
        }

    }

}

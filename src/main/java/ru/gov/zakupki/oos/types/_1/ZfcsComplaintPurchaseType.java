//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
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
 * Тип: Сведения о закупке из жалобы по 44-ФЗ
 * 
 * <p>Java class for zfcs_complaintPurchaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintPurchaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *         &lt;element name="lots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
 *         &lt;element name="purchaseCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="purchasePlacingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_complaintPurchaseType", propOrder = {
    "purchaseNumber",
    "lots",
    "purchaseCode",
    "purchaseCodes",
    "purchaseName",
    "purchasePlacingDate",
    "placingWay"
})
public class ZfcsComplaintPurchaseType {

    @XmlElement(required = true)
    protected String purchaseNumber;
    @XmlElement(required = true)
    protected ZfcsComplaintPurchaseType.Lots lots;
    protected String purchaseCode;
    protected ZfcsComplaintPurchaseType.PurchaseCodes purchaseCodes;
    protected String purchaseName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchasePlacingDate;
    protected ZfcsPlacingWayType placingWay;

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
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintPurchaseType.Lots }
     *     
     */
    public ZfcsComplaintPurchaseType.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintPurchaseType.Lots }
     *     
     */
    public void setLots(ZfcsComplaintPurchaseType.Lots value) {
        this.lots = value;
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
     * Gets the value of the purchaseCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintPurchaseType.PurchaseCodes }
     *     
     */
    public ZfcsComplaintPurchaseType.PurchaseCodes getPurchaseCodes() {
        return purchaseCodes;
    }

    /**
     * Sets the value of the purchaseCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintPurchaseType.PurchaseCodes }
     *     
     */
    public void setPurchaseCodes(ZfcsComplaintPurchaseType.PurchaseCodes value) {
        this.purchaseCodes = value;
    }

    /**
     * Gets the value of the purchaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseName() {
        return purchaseName;
    }

    /**
     * Sets the value of the purchaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseName(String value) {
        this.purchaseName = value;
    }

    /**
     * Gets the value of the purchasePlacingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchasePlacingDate() {
        return purchasePlacingDate;
    }

    /**
     * Sets the value of the purchasePlacingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchasePlacingDate(XMLGregorianCalendar value) {
        this.purchasePlacingDate = value;
    }

    /**
     * Gets the value of the placingWay property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPlacingWayType }
     *     
     */
    public ZfcsPlacingWayType getPlacingWay() {
        return placingWay;
    }

    /**
     * Sets the value of the placingWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPlacingWayType }
     *     
     */
    public void setPlacingWay(ZfcsPlacingWayType value) {
        this.placingWay = value;
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
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "lotNumber",
        "info"
    })
    public static class Lots {

        @XmlElement(type = Integer.class)
        protected List<Integer> lotNumber;
        protected String info;

        /**
         * Gets the value of the lotNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lotNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLotNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getLotNumber() {
            if (lotNumber == null) {
                lotNumber = new ArrayList<Integer>();
            }
            return this.lotNumber;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" maxOccurs="unbounded"/>
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
        "purchaseCode"
    })
    public static class PurchaseCodes {

        @XmlElement(required = true)
        protected List<String> purchaseCode;

        /**
         * Gets the value of the purchaseCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchaseCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchaseCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPurchaseCode() {
            if (purchaseCode == null) {
                purchaseCode = new ArrayList<String>();
            }
            return this.purchaseCode;
        }

    }

}

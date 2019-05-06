//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о позиции плана закупок в ООКЗ 
 * 
 * <p>Java class for zfcs_publicDiscussionPurchasePlanAddInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionPurchasePlanAddInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchasePlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanNumberType"/>
 *         &lt;element name="purchasePlanPositionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonNumberType"/>
 *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
 *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
 *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType" minOccurs="0"/>
 *         &lt;element name="objectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="planContractMaxPrice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionPurchasePlanAddInfoType", propOrder = {
    "purchasePlanNumber",
    "purchasePlanPositionNumber",
    "purchaseCode",
    "placingWay",
    "year",
    "objectInfo",
    "planContractMaxPrice",
    "customer"
})
public class ZfcsPublicDiscussionPurchasePlanAddInfoType {

    @XmlElement(required = true)
    protected String purchasePlanNumber;
    @XmlElement(required = true)
    protected String purchasePlanPositionNumber;
    protected String purchaseCode;
    protected ZfcsPlacingWayType placingWay;
    protected Integer year;
    @XmlElement(required = true)
    protected String objectInfo;
    protected String planContractMaxPrice;
    protected ZfcsPurchaseOrganizationType customer;

    /**
     * Gets the value of the purchasePlanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlanNumber() {
        return purchasePlanNumber;
    }

    /**
     * Sets the value of the purchasePlanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlanNumber(String value) {
        this.purchasePlanNumber = value;
    }

    /**
     * Gets the value of the purchasePlanPositionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlanPositionNumber() {
        return purchasePlanPositionNumber;
    }

    /**
     * Sets the value of the purchasePlanPositionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlanPositionNumber(String value) {
        this.purchasePlanPositionNumber = value;
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
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    /**
     * Gets the value of the objectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectInfo() {
        return objectInfo;
    }

    /**
     * Sets the value of the objectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectInfo(String value) {
        this.objectInfo = value;
    }

    /**
     * Gets the value of the planContractMaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanContractMaxPrice() {
        return planContractMaxPrice;
    }

    /**
     * Sets the value of the planContractMaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanContractMaxPrice(String value) {
        this.planContractMaxPrice = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public ZfcsPurchaseOrganizationType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public void setCustomer(ZfcsPurchaseOrganizationType value) {
        this.customer = value;
    }

}

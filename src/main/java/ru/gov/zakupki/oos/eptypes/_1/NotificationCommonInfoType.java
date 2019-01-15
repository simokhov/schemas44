//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.Article15PartsType;
import ru.gov.zakupki.oos.base._1.ETPRef;
import ru.gov.zakupki.oos.base._1.PlacingWayRef;


/**
 * Тип: Общая информация о извещении
 * 
 * <p>Java class for notificationCommonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationCommonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumberType" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType" minOccurs="0"/>
 *         &lt;element name="directDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="plannedPublishDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="publishDTInEIS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/base/1}hrefType" minOccurs="0"/>
 *         &lt;element name="isBudgetUnionState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isGOZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/base/1}placingWayRef"/>
 *         &lt;element name="ETP" type="{http://zakupki.gov.ru/oos/base/1}ETPRef"/>
 *         &lt;element name="article15FeaturesInfo" type="{http://zakupki.gov.ru/oos/base/1}article15PartsType" minOccurs="0"/>
 *         &lt;element name="contractConclusionOnSt83Ch2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationCommonInfoType", propOrder = {
    "purchaseNumber",
    "docNumber",
    "directDT",
    "plannedPublishDate",
    "publishDTInEIS",
    "href",
    "isBudgetUnionState",
    "isGOZ",
    "purchaseObjectInfo",
    "placingWay",
    "etp",
    "article15FeaturesInfo",
    "contractConclusionOnSt83Ch2"
})
public class NotificationCommonInfoType {

    protected String purchaseNumber;
    protected String docNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar directDT;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedPublishDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDTInEIS;
    protected String href;
    protected Boolean isBudgetUnionState;
    protected Boolean isGOZ;
    @XmlElement(required = true)
    protected String purchaseObjectInfo;
    @XmlElement(required = true)
    protected PlacingWayRef placingWay;
    @XmlElement(name = "ETP", required = true)
    protected ETPRef etp;
    @XmlSchemaType(name = "string")
    protected Article15PartsType article15FeaturesInfo;
    protected Boolean contractConclusionOnSt83Ch2;

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
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the directDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDirectDT() {
        return directDT;
    }

    /**
     * Sets the value of the directDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDirectDT(XMLGregorianCalendar value) {
        this.directDT = value;
    }

    /**
     * Gets the value of the plannedPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedPublishDate() {
        return plannedPublishDate;
    }

    /**
     * Sets the value of the plannedPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedPublishDate(XMLGregorianCalendar value) {
        this.plannedPublishDate = value;
    }

    /**
     * Gets the value of the publishDTInEIS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDTInEIS() {
        return publishDTInEIS;
    }

    /**
     * Sets the value of the publishDTInEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDTInEIS(XMLGregorianCalendar value) {
        this.publishDTInEIS = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the isBudgetUnionState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBudgetUnionState() {
        return isBudgetUnionState;
    }

    /**
     * Sets the value of the isBudgetUnionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBudgetUnionState(Boolean value) {
        this.isBudgetUnionState = value;
    }

    /**
     * Gets the value of the isGOZ property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGOZ() {
        return isGOZ;
    }

    /**
     * Sets the value of the isGOZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGOZ(Boolean value) {
        this.isGOZ = value;
    }

    /**
     * Gets the value of the purchaseObjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseObjectInfo() {
        return purchaseObjectInfo;
    }

    /**
     * Sets the value of the purchaseObjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseObjectInfo(String value) {
        this.purchaseObjectInfo = value;
    }

    /**
     * Gets the value of the placingWay property.
     * 
     * @return
     *     possible object is
     *     {@link PlacingWayRef }
     *     
     */
    public PlacingWayRef getPlacingWay() {
        return placingWay;
    }

    /**
     * Sets the value of the placingWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacingWayRef }
     *     
     */
    public void setPlacingWay(PlacingWayRef value) {
        this.placingWay = value;
    }

    /**
     * Gets the value of the etp property.
     * 
     * @return
     *     possible object is
     *     {@link ETPRef }
     *     
     */
    public ETPRef getETP() {
        return etp;
    }

    /**
     * Sets the value of the etp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETPRef }
     *     
     */
    public void setETP(ETPRef value) {
        this.etp = value;
    }

    /**
     * Gets the value of the article15FeaturesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Article15PartsType }
     *     
     */
    public Article15PartsType getArticle15FeaturesInfo() {
        return article15FeaturesInfo;
    }

    /**
     * Sets the value of the article15FeaturesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article15PartsType }
     *     
     */
    public void setArticle15FeaturesInfo(Article15PartsType value) {
        this.article15FeaturesInfo = value;
    }

    /**
     * Gets the value of the contractConclusionOnSt83Ch2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractConclusionOnSt83Ch2() {
        return contractConclusionOnSt83Ch2;
    }

    /**
     * Sets the value of the contractConclusionOnSt83Ch2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractConclusionOnSt83Ch2(Boolean value) {
        this.contractConclusionOnSt83Ch2 = value;
    }

}

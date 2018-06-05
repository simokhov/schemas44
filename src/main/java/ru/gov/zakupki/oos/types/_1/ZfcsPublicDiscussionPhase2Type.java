//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Второй этап ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionPhase2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionPhase2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicDiscussionOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType"/>
 *         &lt;element name="purchaseInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="purchasePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
 *                   &lt;element name="objectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="contractMaxPrice" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="term">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="publicDiscussionPart5St15" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phase1" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPhase1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changeType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="changeTerm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="protocolPlacement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionProtocolType"/>
 *                 &lt;/choice>
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
@XmlType(name = "zfcs_publicDiscussionPhase2Type", propOrder = {
    "publicDiscussionOrg",
    "purchaseInfo",
    "term",
    "publicDiscussionPart5St15",
    "phase1",
    "changeType"
})
public class ZfcsPublicDiscussionPhase2Type {

    @XmlElement(required = true)
    protected ZfcsOrganizationInfoType publicDiscussionOrg;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionPhase2Type.PurchaseInfo purchaseInfo;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionPhase2Type.Term term;
    protected Boolean publicDiscussionPart5St15;
    protected List<ZfcsPublicDiscussionPhase1Type> phase1;
    protected ZfcsPublicDiscussionPhase2Type.ChangeType changeType;

    /**
     * Gets the value of the publicDiscussionOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getPublicDiscussionOrg() {
        return publicDiscussionOrg;
    }

    /**
     * Sets the value of the publicDiscussionOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setPublicDiscussionOrg(ZfcsOrganizationInfoType value) {
        this.publicDiscussionOrg = value;
    }

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase2Type.PurchaseInfo }
     *     
     */
    public ZfcsPublicDiscussionPhase2Type.PurchaseInfo getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase2Type.PurchaseInfo }
     *     
     */
    public void setPurchaseInfo(ZfcsPublicDiscussionPhase2Type.PurchaseInfo value) {
        this.purchaseInfo = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase2Type.Term }
     *     
     */
    public ZfcsPublicDiscussionPhase2Type.Term getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase2Type.Term }
     *     
     */
    public void setTerm(ZfcsPublicDiscussionPhase2Type.Term value) {
        this.term = value;
    }

    /**
     * Gets the value of the publicDiscussionPart5St15 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicDiscussionPart5St15() {
        return publicDiscussionPart5St15;
    }

    /**
     * Sets the value of the publicDiscussionPart5St15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicDiscussionPart5St15(Boolean value) {
        this.publicDiscussionPart5St15 = value;
    }

    /**
     * Gets the value of the phase1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phase1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhase1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsPublicDiscussionPhase1Type }
     * 
     * 
     */
    public List<ZfcsPublicDiscussionPhase1Type> getPhase1() {
        if (phase1 == null) {
            phase1 = new ArrayList<ZfcsPublicDiscussionPhase1Type>();
        }
        return this.phase1;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase2Type.ChangeType }
     *     
     */
    public ZfcsPublicDiscussionPhase2Type.ChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase2Type.ChangeType }
     *     
     */
    public void setChangeType(ZfcsPublicDiscussionPhase2Type.ChangeType value) {
        this.changeType = value;
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
     *       &lt;choice>
     *         &lt;element name="changeTerm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="protocolPlacement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionProtocolType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "changeTerm",
        "protocolPlacement"
    })
    public static class ChangeType {

        protected Boolean changeTerm;
        protected ZfcsPublicDiscussionProtocolType protocolPlacement;

        /**
         * Gets the value of the changeTerm property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChangeTerm() {
            return changeTerm;
        }

        /**
         * Sets the value of the changeTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeTerm(Boolean value) {
            this.changeTerm = value;
        }

        /**
         * Gets the value of the protocolPlacement property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPublicDiscussionProtocolType }
         *     
         */
        public ZfcsPublicDiscussionProtocolType getProtocolPlacement() {
            return protocolPlacement;
        }

        /**
         * Sets the value of the protocolPlacement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPublicDiscussionProtocolType }
         *     
         */
        public void setProtocolPlacement(ZfcsPublicDiscussionProtocolType value) {
            this.protocolPlacement = value;
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
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="purchasePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
     *         &lt;element name="objectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="contractMaxPrice" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "purchaseNumber",
        "lotNumber",
        "purchaseCode",
        "purchasePublishDate",
        "placingWay",
        "objectInfo",
        "contractMaxPrice",
        "customer"
    })
    public static class PurchaseInfo {

        @XmlElement(required = true)
        protected String purchaseNumber;
        @XmlElement(required = true)
        protected BigInteger lotNumber;
        protected List<String> purchaseCode;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar purchasePublishDate;
        protected ZfcsPlacingWayType placingWay;
        @XmlElement(required = true)
        protected String objectInfo;
        protected String contractMaxPrice;
        protected List<ZfcsPurchaseOrganizationType> customer;

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
         * Gets the value of the lotNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLotNumber() {
            return lotNumber;
        }

        /**
         * Sets the value of the lotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLotNumber(BigInteger value) {
            this.lotNumber = value;
        }

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

        /**
         * Gets the value of the purchasePublishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPurchasePublishDate() {
            return purchasePublishDate;
        }

        /**
         * Sets the value of the purchasePublishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPurchasePublishDate(XMLGregorianCalendar value) {
            this.purchasePublishDate = value;
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
         * Gets the value of the contractMaxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractMaxPrice() {
            return contractMaxPrice;
        }

        /**
         * Sets the value of the contractMaxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractMaxPrice(String value) {
            this.contractMaxPrice = value;
        }

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
         * {@link ZfcsPurchaseOrganizationType }
         * 
         * 
         */
        public List<ZfcsPurchaseOrganizationType> getCustomer() {
            if (customer == null) {
                customer = new ArrayList<ZfcsPurchaseOrganizationType>();
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
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "startDate",
        "endDate"
    })
    public static class Term {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

    }

}

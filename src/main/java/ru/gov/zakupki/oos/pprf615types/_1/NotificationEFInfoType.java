//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.ETPRef;
import ru.gov.zakupki.oos.base._1.PurchaseSubjectRef;


/**
 * Тип: Информация о закупке ЭА (электронный аукцион)
 * 
 * <p>Java class for notificationEFInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEFInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETPInfo" type="{http://zakupki.gov.ru/oos/base/1}ETPRef"/>
 *         &lt;element name="procedureInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="collectingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="biddingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractCondition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="maxPriceInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *                             &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/pprf615types/1}paymentInfoType"/>
 *                             &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/pprf615types/1}paymentInfoType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="kladrPlacesInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="kladrPlace" type="{http://zakupki.gov.ru/oos/pprf615types/1}kladrPlaceType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;element name="deliveryConditions" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseObjectsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseObjects615InfoType" minOccurs="0"/>
 *         &lt;element name="purchaseSubjectInfo" type="{http://zakupki.gov.ru/oos/base/1}purchaseSubjectRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationEFInfoType", propOrder = {
    "etpInfo",
    "procedureInfo",
    "contractCondition",
    "purchaseObjectsInfo",
    "purchaseSubjectInfo"
})
public class NotificationEFInfoType {

    @XmlElement(name = "ETPInfo", required = true)
    protected ETPRef etpInfo;
    @XmlElement(required = true)
    protected NotificationEFInfoType.ProcedureInfo procedureInfo;
    @XmlElement(required = true)
    protected NotificationEFInfoType.ContractCondition contractCondition;
    protected PurchaseObjects615InfoType purchaseObjectsInfo;
    @XmlElement(required = true)
    protected PurchaseSubjectRef purchaseSubjectInfo;

    /**
     * Gets the value of the etpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ETPRef }
     *     
     */
    public ETPRef getETPInfo() {
        return etpInfo;
    }

    /**
     * Sets the value of the etpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETPRef }
     *     
     */
    public void setETPInfo(ETPRef value) {
        this.etpInfo = value;
    }

    /**
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEFInfoType.ProcedureInfo }
     *     
     */
    public NotificationEFInfoType.ProcedureInfo getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEFInfoType.ProcedureInfo }
     *     
     */
    public void setProcedureInfo(NotificationEFInfoType.ProcedureInfo value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the contractCondition property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEFInfoType.ContractCondition }
     *     
     */
    public NotificationEFInfoType.ContractCondition getContractCondition() {
        return contractCondition;
    }

    /**
     * Sets the value of the contractCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEFInfoType.ContractCondition }
     *     
     */
    public void setContractCondition(NotificationEFInfoType.ContractCondition value) {
        this.contractCondition = value;
    }

    /**
     * Gets the value of the purchaseObjectsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseObjects615InfoType }
     *     
     */
    public PurchaseObjects615InfoType getPurchaseObjectsInfo() {
        return purchaseObjectsInfo;
    }

    /**
     * Sets the value of the purchaseObjectsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseObjects615InfoType }
     *     
     */
    public void setPurchaseObjectsInfo(PurchaseObjects615InfoType value) {
        this.purchaseObjectsInfo = value;
    }

    /**
     * Gets the value of the purchaseSubjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseSubjectRef }
     *     
     */
    public PurchaseSubjectRef getPurchaseSubjectInfo() {
        return purchaseSubjectInfo;
    }

    /**
     * Sets the value of the purchaseSubjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseSubjectRef }
     *     
     */
    public void setPurchaseSubjectInfo(PurchaseSubjectRef value) {
        this.purchaseSubjectInfo = value;
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
     *         &lt;element name="maxPriceInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
     *                   &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/pprf615types/1}paymentInfoType"/>
     *                   &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/pprf615types/1}paymentInfoType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="kladrPlacesInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="kladrPlace" type="{http://zakupki.gov.ru/oos/pprf615types/1}kladrPlaceType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *         &lt;element name="deliveryConditions" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
        "kladrPlacesInfo",
        "deliveryTerm",
        "deliveryConditions"
    })
    public static class ContractCondition {

        @XmlElement(required = true)
        protected NotificationEFInfoType.ContractCondition.MaxPriceInfo maxPriceInfo;
        @XmlElement(required = true)
        protected NotificationEFInfoType.ContractCondition.KladrPlacesInfo kladrPlacesInfo;
        @XmlElement(required = true)
        protected String deliveryTerm;
        @XmlElement(required = true)
        protected String deliveryConditions;

        /**
         * Gets the value of the maxPriceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEFInfoType.ContractCondition.MaxPriceInfo }
         *     
         */
        public NotificationEFInfoType.ContractCondition.MaxPriceInfo getMaxPriceInfo() {
            return maxPriceInfo;
        }

        /**
         * Sets the value of the maxPriceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEFInfoType.ContractCondition.MaxPriceInfo }
         *     
         */
        public void setMaxPriceInfo(NotificationEFInfoType.ContractCondition.MaxPriceInfo value) {
            this.maxPriceInfo = value;
        }

        /**
         * Gets the value of the kladrPlacesInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEFInfoType.ContractCondition.KladrPlacesInfo }
         *     
         */
        public NotificationEFInfoType.ContractCondition.KladrPlacesInfo getKladrPlacesInfo() {
            return kladrPlacesInfo;
        }

        /**
         * Sets the value of the kladrPlacesInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEFInfoType.ContractCondition.KladrPlacesInfo }
         *     
         */
        public void setKladrPlacesInfo(NotificationEFInfoType.ContractCondition.KladrPlacesInfo value) {
            this.kladrPlacesInfo = value;
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
         * Gets the value of the deliveryConditions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliveryConditions() {
            return deliveryConditions;
        }

        /**
         * Sets the value of the deliveryConditions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliveryConditions(String value) {
            this.deliveryConditions = value;
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
         *         &lt;element name="kladrPlace" type="{http://zakupki.gov.ru/oos/pprf615types/1}kladrPlaceType" maxOccurs="unbounded"/>
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
            "kladrPlace"
        })
        public static class KladrPlacesInfo {

            @XmlElement(required = true)
            protected List<KladrPlaceType> kladrPlace;

            /**
             * Gets the value of the kladrPlace property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kladrPlace property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKladrPlace().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link KladrPlaceType }
             * 
             * 
             */
            public List<KladrPlaceType> getKladrPlace() {
                if (kladrPlace == null) {
                    kladrPlace = new ArrayList<KladrPlaceType>();
                }
                return this.kladrPlace;
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
         *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
         *         &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/pprf615types/1}paymentInfoType"/>
         *         &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/pprf615types/1}paymentInfoType"/>
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
            "maxPrice",
            "applicationGuarantee",
            "contractGuarantee"
        })
        public static class MaxPriceInfo {

            @XmlElement(required = true)
            protected String maxPrice;
            @XmlElement(required = true)
            protected PaymentInfoType applicationGuarantee;
            @XmlElement(required = true)
            protected PaymentInfoType contractGuarantee;

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
     *         &lt;element name="collectingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="biddingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "collectingEndDate",
        "scoringDate",
        "biddingDate"
    })
    public static class ProcedureInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar collectingEndDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar scoringDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar biddingDate;

        /**
         * Gets the value of the collectingEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCollectingEndDate() {
            return collectingEndDate;
        }

        /**
         * Sets the value of the collectingEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCollectingEndDate(XMLGregorianCalendar value) {
            this.collectingEndDate = value;
        }

        /**
         * Gets the value of the scoringDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getScoringDate() {
            return scoringDate;
        }

        /**
         * Sets the value of the scoringDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setScoringDate(XMLGregorianCalendar value) {
            this.scoringDate = value;
        }

        /**
         * Gets the value of the biddingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBiddingDate() {
            return biddingDate;
        }

        /**
         * Sets the value of the biddingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBiddingDate(XMLGregorianCalendar value) {
            this.biddingDate = value;
        }

    }

}

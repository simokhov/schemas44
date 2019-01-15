//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
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
import ru.gov.zakupki.oos.base._1.AbandonedReasonRef;


/**
 * Тип: Информация о проведении электронного аукциона
 * 
 * <p>Java class for protocolEF2InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolEF2InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biddingInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="biddingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="biddingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="applications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/base/1}journalNumberType"/>
 *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="appParticipantInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseContractorInfoType"/>
 *                             &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/pprf615types/1}bidType"/>
 *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
 *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/base/1}abandonedReasonRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolEF2InfoType", propOrder = {
    "biddingInfo",
    "applications",
    "abandonedReason"
})
public class ProtocolEF2InfoType {

    @XmlElement(required = true)
    protected ProtocolEF2InfoType.BiddingInfo biddingInfo;
    protected ProtocolEF2InfoType.Applications applications;
    protected AbandonedReasonRef abandonedReason;

    /**
     * Gets the value of the biddingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEF2InfoType.BiddingInfo }
     *     
     */
    public ProtocolEF2InfoType.BiddingInfo getBiddingInfo() {
        return biddingInfo;
    }

    /**
     * Sets the value of the biddingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEF2InfoType.BiddingInfo }
     *     
     */
    public void setBiddingInfo(ProtocolEF2InfoType.BiddingInfo value) {
        this.biddingInfo = value;
    }

    /**
     * Gets the value of the applications property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEF2InfoType.Applications }
     *     
     */
    public ProtocolEF2InfoType.Applications getApplications() {
        return applications;
    }

    /**
     * Sets the value of the applications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEF2InfoType.Applications }
     *     
     */
    public void setApplications(ProtocolEF2InfoType.Applications value) {
        this.applications = value;
    }

    /**
     * Gets the value of the abandonedReason property.
     * 
     * @return
     *     possible object is
     *     {@link AbandonedReasonRef }
     *     
     */
    public AbandonedReasonRef getAbandonedReason() {
        return abandonedReason;
    }

    /**
     * Sets the value of the abandonedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbandonedReasonRef }
     *     
     */
    public void setAbandonedReason(AbandonedReasonRef value) {
        this.abandonedReason = value;
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
     *         &lt;element name="application" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/base/1}journalNumberType"/>
     *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="appParticipantInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseContractorInfoType"/>
     *                   &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/pprf615types/1}bidType"/>
     *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
        "application"
    })
    public static class Applications {

        @XmlElement(required = true)
        protected List<ProtocolEF2InfoType.Applications.Application> application;

        /**
         * Gets the value of the application property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the application property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProtocolEF2InfoType.Applications.Application }
         * 
         * 
         */
        public List<ProtocolEF2InfoType.Applications.Application> getApplication() {
            if (application == null) {
                application = new ArrayList<ProtocolEF2InfoType.Applications.Application>();
            }
            return this.application;
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
         *         &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/base/1}journalNumberType"/>
         *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="appParticipantInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseContractorInfoType"/>
         *         &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/pprf615types/1}bidType"/>
         *         &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
            "journalNumber",
            "appDate",
            "appParticipantInfo",
            "lastOffer",
            "appRating"
        })
        public static class Application {

            @XmlElement(required = true)
            protected String journalNumber;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar appDate;
            @XmlElement(required = true)
            protected PurchaseContractorInfoType appParticipantInfo;
            @XmlElement(required = true)
            protected BidType lastOffer;
            protected short appRating;

            /**
             * Gets the value of the journalNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJournalNumber() {
                return journalNumber;
            }

            /**
             * Sets the value of the journalNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJournalNumber(String value) {
                this.journalNumber = value;
            }

            /**
             * Gets the value of the appDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAppDate() {
                return appDate;
            }

            /**
             * Sets the value of the appDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAppDate(XMLGregorianCalendar value) {
                this.appDate = value;
            }

            /**
             * Gets the value of the appParticipantInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PurchaseContractorInfoType }
             *     
             */
            public PurchaseContractorInfoType getAppParticipantInfo() {
                return appParticipantInfo;
            }

            /**
             * Sets the value of the appParticipantInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PurchaseContractorInfoType }
             *     
             */
            public void setAppParticipantInfo(PurchaseContractorInfoType value) {
                this.appParticipantInfo = value;
            }

            /**
             * Gets the value of the lastOffer property.
             * 
             * @return
             *     possible object is
             *     {@link BidType }
             *     
             */
            public BidType getLastOffer() {
                return lastOffer;
            }

            /**
             * Sets the value of the lastOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BidType }
             *     
             */
            public void setLastOffer(BidType value) {
                this.lastOffer = value;
            }

            /**
             * Gets the value of the appRating property.
             * 
             */
            public short getAppRating() {
                return appRating;
            }

            /**
             * Sets the value of the appRating property.
             * 
             */
            public void setAppRating(short value) {
                this.appRating = value;
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
     *         &lt;element name="biddingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="biddingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
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
        "biddingStartDate",
        "biddingEndDate",
        "maxPrice"
    })
    public static class BiddingInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar biddingStartDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar biddingEndDate;
        @XmlElement(required = true)
        protected String maxPrice;

        /**
         * Gets the value of the biddingStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBiddingStartDate() {
            return biddingStartDate;
        }

        /**
         * Sets the value of the biddingStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBiddingStartDate(XMLGregorianCalendar value) {
            this.biddingStartDate = value;
        }

        /**
         * Gets the value of the biddingEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBiddingEndDate() {
            return biddingEndDate;
        }

        /**
         * Sets the value of the biddingEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBiddingEndDate(XMLGregorianCalendar value) {
            this.biddingEndDate = value;
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

    }

}

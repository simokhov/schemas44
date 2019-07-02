//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
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


/**
 * Протокол проведения электронного аукциона
 * 
 * <p>Java class for zfcs_protocolEF2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolEF2Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolEFNoCommissionType">
 *       &lt;sequence>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applications">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="application" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/base/1}journalNumberType"/>
 *                                       &lt;element name="priceOffers" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType" minOccurs="0"/>
 *                                                 &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
 *                                                 &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolEF2Type", propOrder = {
    "protocolLot",
    "abandonedReason"
})
public class ZfcsProtocolEF2Type
    extends ZfcsPurchaseProtocolEFNoCommissionType
{

    @XmlElement(required = true)
    protected ZfcsProtocolEF2Type.ProtocolLot protocolLot;
    protected ZfcsAbandonedReasonType abandonedReason;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF2Type.ProtocolLot }
     *     
     */
    public ZfcsProtocolEF2Type.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF2Type.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolEF2Type.ProtocolLot value) {
        this.protocolLot = value;
    }

    /**
     * Gets the value of the abandonedReason property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAbandonedReasonType }
     *     
     */
    public ZfcsAbandonedReasonType getAbandonedReason() {
        return abandonedReason;
    }

    /**
     * Sets the value of the abandonedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAbandonedReasonType }
     *     
     */
    public void setAbandonedReason(ZfcsAbandonedReasonType value) {
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
     *         &lt;element name="applications">
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
     *                             &lt;element name="priceOffers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType" minOccurs="0"/>
     *                                       &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
     *                                       &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
        "applications"
    })
    public static class ProtocolLot {

        @XmlElement(required = true)
        protected ZfcsProtocolEF2Type.ProtocolLot.Applications applications;

        /**
         * Gets the value of the applications property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications }
         *     
         */
        public ZfcsProtocolEF2Type.ProtocolLot.Applications getApplications() {
            return applications;
        }

        /**
         * Sets the value of the applications property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications }
         *     
         */
        public void setApplications(ZfcsProtocolEF2Type.ProtocolLot.Applications value) {
            this.applications = value;
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
         *                   &lt;element name="priceOffers" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType" minOccurs="0"/>
         *                             &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
         *                             &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
            protected List<ZfcsProtocolEF2Type.ProtocolLot.Applications.Application> application;

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
             * {@link ZfcsProtocolEF2Type.ProtocolLot.Applications.Application }
             * 
             * 
             */
            public List<ZfcsProtocolEF2Type.ProtocolLot.Applications.Application> getApplication() {
                if (application == null) {
                    application = new ArrayList<ZfcsProtocolEF2Type.ProtocolLot.Applications.Application>();
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
             *         &lt;element name="priceOffers" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType" minOccurs="0"/>
             *                   &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
             *                   &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
                "journalNumber",
                "priceOffers"
            })
            public static class Application {

                @XmlElement(required = true)
                protected String journalNumber;
                protected ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers priceOffers;

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
                 * Gets the value of the priceOffers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers }
                 *     
                 */
                public ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers getPriceOffers() {
                    return priceOffers;
                }

                /**
                 * Sets the value of the priceOffers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers }
                 *     
                 */
                public void setPriceOffers(ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers value) {
                    this.priceOffers = value;
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
                 *         &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType" minOccurs="0"/>
                 *         &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
                 *         &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
                    "firstOffer",
                    "lastOffer",
                    "offersQuantity"
                })
                public static class PriceOffers {

                    protected ZfcsBidType firstOffer;
                    @XmlElement(required = true)
                    protected ZfcsBidType lastOffer;
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger offersQuantity;

                    /**
                     * Gets the value of the firstOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public ZfcsBidType getFirstOffer() {
                        return firstOffer;
                    }

                    /**
                     * Sets the value of the firstOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public void setFirstOffer(ZfcsBidType value) {
                        this.firstOffer = value;
                    }

                    /**
                     * Gets the value of the lastOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public ZfcsBidType getLastOffer() {
                        return lastOffer;
                    }

                    /**
                     * Sets the value of the lastOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public void setLastOffer(ZfcsBidType value) {
                        this.lastOffer = value;
                    }

                    /**
                     * Gets the value of the offersQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOffersQuantity() {
                        return offersQuantity;
                    }

                    /**
                     * Sets the value of the offersQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOffersQuantity(BigInteger value) {
                        this.offersQuantity = value;
                    }

                }

            }

        }

    }

}

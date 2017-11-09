//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
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
 * Протокол рассмотрения единственной заявки на участие в электронном аукционе
 * 
 * <p>Java class for zfcs_protocolEFSingleAppType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolEFSingleAppType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolEFType">
 *       &lt;sequence>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="application">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
 *                             &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
 *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
 *                               &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;/choice>
 *                             &lt;element name="winnerPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                             &lt;element name="increaseWinnerInitialPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
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
@XmlType(name = "zfcs_protocolEFSingleAppType", propOrder = {
    "protocolLot",
    "abandonedReason"
})
public class ZfcsProtocolEFSingleAppType
    extends ZfcsPurchaseProtocolEFType
{

    @XmlElement(required = true)
    protected ZfcsProtocolEFSingleAppType.ProtocolLot protocolLot;
    protected ZfcsAbandonedReasonType abandonedReason;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEFSingleAppType.ProtocolLot }
     *     
     */
    public ZfcsProtocolEFSingleAppType.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEFSingleAppType.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolEFSingleAppType.ProtocolLot value) {
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
     *         &lt;element name="application">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
     *                   &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
     *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
     *                     &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;/choice>
     *                   &lt;element name="winnerPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                   &lt;element name="increaseWinnerInitialPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
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
        "application",
        "abandonedReason"
    })
    public static class ProtocolLot {

        @XmlElement(required = true)
        protected ZfcsProtocolEFSingleAppType.ProtocolLot.Application application;
        protected ZfcsAbandonedReasonType abandonedReason;

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolEFSingleAppType.ProtocolLot.Application }
         *     
         */
        public ZfcsProtocolEFSingleAppType.ProtocolLot.Application getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolEFSingleAppType.ProtocolLot.Application }
         *     
         */
        public void setApplication(ZfcsProtocolEFSingleAppType.ProtocolLot.Application value) {
            this.application = value;
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
         *         &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
         *         &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
         *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
         *           &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;/choice>
         *         &lt;element name="winnerPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *         &lt;element name="increaseWinnerInitialPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "appParticipant",
            "appDate",
            "admissionResults",
            "appRejectedReason",
            "admitted",
            "winnerPrice",
            "increaseWinnerInitialPrice"
        })
        public static class Application {

            @XmlElement(required = true)
            protected String journalNumber;
            @XmlElement(required = true)
            protected ZfcsParticipantType appParticipant;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar appDate;
            protected ZfcsAdmissionResults admissionResults;
            protected List<ZfcsAppRejectedReasonType> appRejectedReason;
            protected Boolean admitted;
            protected String winnerPrice;
            protected Boolean increaseWinnerInitialPrice;

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
             * Gets the value of the appParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsParticipantType }
             *     
             */
            public ZfcsParticipantType getAppParticipant() {
                return appParticipant;
            }

            /**
             * Sets the value of the appParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsParticipantType }
             *     
             */
            public void setAppParticipant(ZfcsParticipantType value) {
                this.appParticipant = value;
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
             * Gets the value of the admissionResults property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsAdmissionResults }
             *     
             */
            public ZfcsAdmissionResults getAdmissionResults() {
                return admissionResults;
            }

            /**
             * Sets the value of the admissionResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsAdmissionResults }
             *     
             */
            public void setAdmissionResults(ZfcsAdmissionResults value) {
                this.admissionResults = value;
            }

            /**
             * Gets the value of the appRejectedReason property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the appRejectedReason property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAppRejectedReason().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsAppRejectedReasonType }
             * 
             * 
             */
            public List<ZfcsAppRejectedReasonType> getAppRejectedReason() {
                if (appRejectedReason == null) {
                    appRejectedReason = new ArrayList<ZfcsAppRejectedReasonType>();
                }
                return this.appRejectedReason;
            }

            /**
             * Gets the value of the admitted property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAdmitted() {
                return admitted;
            }

            /**
             * Sets the value of the admitted property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAdmitted(Boolean value) {
                this.admitted = value;
            }

            /**
             * Gets the value of the winnerPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWinnerPrice() {
                return winnerPrice;
            }

            /**
             * Sets the value of the winnerPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWinnerPrice(String value) {
                this.winnerPrice = value;
            }

            /**
             * Gets the value of the increaseWinnerInitialPrice property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIncreaseWinnerInitialPrice() {
                return increaseWinnerInitialPrice;
            }

            /**
             * Sets the value of the increaseWinnerInitialPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIncreaseWinnerInitialPrice(Boolean value) {
                this.increaseWinnerInitialPrice = value;
            }

        }

    }

}

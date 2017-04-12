//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:53:38 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол рассмотрения заявки единственного участника электронного аукциона
 * 
 * <p>Java class for zfcs_protocolEFSinglePartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolEFSinglePartType">
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolEFSinglePartType", propOrder = {
    "protocolLot"
})
public class ZfcsProtocolEFSinglePartType
    extends ZfcsPurchaseProtocolEFType
{

    @XmlElement(required = true)
    protected ZfcsProtocolEFSinglePartType.ProtocolLot protocolLot;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEFSinglePartType.ProtocolLot }
     *     
     */
    public ZfcsProtocolEFSinglePartType.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEFSinglePartType.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolEFSinglePartType.ProtocolLot value) {
        this.protocolLot = value;
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
    public static class ProtocolLot {

        @XmlElement(required = true)
        protected ZfcsProtocolEFSinglePartType.ProtocolLot.Application application;

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolEFSinglePartType.ProtocolLot.Application }
         *     
         */
        public ZfcsProtocolEFSinglePartType.ProtocolLot.Application getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolEFSinglePartType.ProtocolLot.Application }
         *     
         */
        public void setApplication(ZfcsProtocolEFSinglePartType.ProtocolLot.Application value) {
            this.application = value;
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
            "admitted"
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
            @XmlElementRef(name = "admitted", namespace = "http://zakupki.gov.ru/oos/types/1", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> admitted;

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
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getAdmitted() {
                return admitted;
            }

            /**
             * Sets the value of the admitted property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setAdmitted(JAXBElement<Boolean> value) {
                this.admitted = value;
            }

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
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
 * Протокол рассмотрения заявок на участие в электронном аукционе
 * 
 * <p>Java class for zfcs_protocolEF1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolEF1Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolEFType">
 *       &lt;sequence>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applications" minOccurs="0">
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
 *                                       &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
 *                                       &lt;choice>
 *                                         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonNotIDType" maxOccurs="unbounded"/>
 *                                         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;element name="foreignCountryOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                   &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
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
@XmlType(name = "zfcs_protocolEF1Type", propOrder = {
    "protocolLot"
})
public class ZfcsProtocolEF1Type
    extends ZfcsPurchaseProtocolEFType
{

    @XmlElement(required = true)
    protected ZfcsProtocolEF1Type.ProtocolLot protocolLot;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF1Type.ProtocolLot }
     *     
     */
    public ZfcsProtocolEF1Type.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF1Type.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolEF1Type.ProtocolLot value) {
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
     *                             &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
     *                             &lt;choice>
     *                               &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonNotIDType" maxOccurs="unbounded"/>
     *                               &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;/choice>
     *                             &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                             &lt;element name="foreignCountryOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applications",
        "abandonedReason"
    })
    public static class ProtocolLot {

        protected ZfcsProtocolEF1Type.ProtocolLot.Applications applications;
        protected ZfcsAbandonedReasonType abandonedReason;

        /**
         * Gets the value of the applications property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolEF1Type.ProtocolLot.Applications }
         *     
         */
        public ZfcsProtocolEF1Type.ProtocolLot.Applications getApplications() {
            return applications;
        }

        /**
         * Sets the value of the applications property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolEF1Type.ProtocolLot.Applications }
         *     
         */
        public void setApplications(ZfcsProtocolEF1Type.ProtocolLot.Applications value) {
            this.applications = value;
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
         *         &lt;element name="application" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/base/1}journalNumberType"/>
         *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
         *                   &lt;choice>
         *                     &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonNotIDType" maxOccurs="unbounded"/>
         *                     &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;/choice>
         *                   &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                   &lt;element name="foreignCountryOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            protected List<ZfcsProtocolEF1Type.ProtocolLot.Applications.Application> application;

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
             * {@link ZfcsProtocolEF1Type.ProtocolLot.Applications.Application }
             * 
             * 
             */
            public List<ZfcsProtocolEF1Type.ProtocolLot.Applications.Application> getApplication() {
                if (application == null) {
                    application = new ArrayList<ZfcsProtocolEF1Type.ProtocolLot.Applications.Application>();
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
             *         &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
             *         &lt;choice>
             *           &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonNotIDType" maxOccurs="unbounded"/>
             *           &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;/choice>
             *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="foreignCountryOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "admissionResults",
                "appRejectedReason",
                "admitted",
                "commonInfo",
                "foreignCountryOrigin"
            })
            public static class Application {

                @XmlElement(required = true)
                protected String journalNumber;
                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar appDate;
                protected ZfcsAdmissionResults admissionResults;
                protected List<ZfcsAppRejectedReasonNotIDType> appRejectedReason;
                protected Boolean admitted;
                protected String commonInfo;
                protected Boolean foreignCountryOrigin;

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
                 * {@link ZfcsAppRejectedReasonNotIDType }
                 * 
                 * 
                 */
                public List<ZfcsAppRejectedReasonNotIDType> getAppRejectedReason() {
                    if (appRejectedReason == null) {
                        appRejectedReason = new ArrayList<ZfcsAppRejectedReasonNotIDType>();
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
                 * Gets the value of the commonInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCommonInfo() {
                    return commonInfo;
                }

                /**
                 * Sets the value of the commonInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCommonInfo(String value) {
                    this.commonInfo = value;
                }

                /**
                 * Gets the value of the foreignCountryOrigin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isForeignCountryOrigin() {
                    return foreignCountryOrigin;
                }

                /**
                 * Sets the value of the foreignCountryOrigin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setForeignCountryOrigin(Boolean value) {
                    this.foreignCountryOrigin = value;
                }

            }

        }

    }

}

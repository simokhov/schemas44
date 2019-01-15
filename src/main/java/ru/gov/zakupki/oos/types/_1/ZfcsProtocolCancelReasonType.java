//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.AuthorityType;


/**
 * Основание отмены протокола
 * 
 * <p>Java class for zfcs_protocolCancelReasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolCancelReasonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="courtDecision">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="courtName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                     &lt;element name="docName">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="1000"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     &lt;element name="docNumber">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="350"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="authorityPrescription">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="reestrPrescription">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/base/1}checkResultNumberType"/>
 *                                 &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/base/1}prescriptionNumberType" minOccurs="0"/>
 *                                 &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                 &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                 &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="externalPrescription">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                 &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/base/1}authorityType"/>
 *                                 &lt;element name="docName">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;maxLength value="1000"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                 &lt;element name="docNumber">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;maxLength value="100"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
@XmlType(name = "zfcs_protocolCancelReasonType", propOrder = {
    "courtDecision",
    "authorityPrescription"
})
public class ZfcsProtocolCancelReasonType {

    protected ZfcsProtocolCancelReasonType.CourtDecision courtDecision;
    protected ZfcsProtocolCancelReasonType.AuthorityPrescription authorityPrescription;

    /**
     * Gets the value of the courtDecision property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolCancelReasonType.CourtDecision }
     *     
     */
    public ZfcsProtocolCancelReasonType.CourtDecision getCourtDecision() {
        return courtDecision;
    }

    /**
     * Sets the value of the courtDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolCancelReasonType.CourtDecision }
     *     
     */
    public void setCourtDecision(ZfcsProtocolCancelReasonType.CourtDecision value) {
        this.courtDecision = value;
    }

    /**
     * Gets the value of the authorityPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolCancelReasonType.AuthorityPrescription }
     *     
     */
    public ZfcsProtocolCancelReasonType.AuthorityPrescription getAuthorityPrescription() {
        return authorityPrescription;
    }

    /**
     * Sets the value of the authorityPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolCancelReasonType.AuthorityPrescription }
     *     
     */
    public void setAuthorityPrescription(ZfcsProtocolCancelReasonType.AuthorityPrescription value) {
        this.authorityPrescription = value;
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
     *         &lt;choice>
     *           &lt;element name="reestrPrescription">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/base/1}checkResultNumberType"/>
     *                     &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/base/1}prescriptionNumberType" minOccurs="0"/>
     *                     &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                     &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                     &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="externalPrescription">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                     &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/base/1}authorityType"/>
     *                     &lt;element name="docName">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="1000"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                     &lt;element name="docNumber">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="100"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
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
        "reestrPrescription",
        "externalPrescription"
    })
    public static class AuthorityPrescription {

        protected ZfcsProtocolCancelReasonType.AuthorityPrescription.ReestrPrescription reestrPrescription;
        protected ZfcsProtocolCancelReasonType.AuthorityPrescription.ExternalPrescription externalPrescription;

        /**
         * Gets the value of the reestrPrescription property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolCancelReasonType.AuthorityPrescription.ReestrPrescription }
         *     
         */
        public ZfcsProtocolCancelReasonType.AuthorityPrescription.ReestrPrescription getReestrPrescription() {
            return reestrPrescription;
        }

        /**
         * Sets the value of the reestrPrescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolCancelReasonType.AuthorityPrescription.ReestrPrescription }
         *     
         */
        public void setReestrPrescription(ZfcsProtocolCancelReasonType.AuthorityPrescription.ReestrPrescription value) {
            this.reestrPrescription = value;
        }

        /**
         * Gets the value of the externalPrescription property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolCancelReasonType.AuthorityPrescription.ExternalPrescription }
         *     
         */
        public ZfcsProtocolCancelReasonType.AuthorityPrescription.ExternalPrescription getExternalPrescription() {
            return externalPrescription;
        }

        /**
         * Sets the value of the externalPrescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolCancelReasonType.AuthorityPrescription.ExternalPrescription }
         *     
         */
        public void setExternalPrescription(ZfcsProtocolCancelReasonType.AuthorityPrescription.ExternalPrescription value) {
            this.externalPrescription = value;
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
         *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/base/1}authorityType"/>
         *         &lt;element name="docName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="docNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "authorityName",
            "authorityType",
            "docName",
            "docDate",
            "docNumber"
        })
        public static class ExternalPrescription {

            @XmlElement(required = true)
            protected String authorityName;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected AuthorityType authorityType;
            @XmlElement(required = true)
            protected String docName;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar docDate;
            @XmlElement(required = true)
            protected String docNumber;

            /**
             * Gets the value of the authorityName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorityName() {
                return authorityName;
            }

            /**
             * Sets the value of the authorityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorityName(String value) {
                this.authorityName = value;
            }

            /**
             * Gets the value of the authorityType property.
             * 
             * @return
             *     possible object is
             *     {@link AuthorityType }
             *     
             */
            public AuthorityType getAuthorityType() {
                return authorityType;
            }

            /**
             * Sets the value of the authorityType property.
             * 
             * @param value
             *     allowed object is
             *     {@link AuthorityType }
             *     
             */
            public void setAuthorityType(AuthorityType value) {
                this.authorityType = value;
            }

            /**
             * Gets the value of the docName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocName() {
                return docName;
            }

            /**
             * Sets the value of the docName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocName(String value) {
                this.docName = value;
            }

            /**
             * Gets the value of the docDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDocDate() {
                return docDate;
            }

            /**
             * Sets the value of the docDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDocDate(XMLGregorianCalendar value) {
                this.docDate = value;
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
         *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/base/1}checkResultNumberType"/>
         *         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/base/1}prescriptionNumberType" minOccurs="0"/>
         *         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "checkResultNumber",
            "prescriptionNumber",
            "foundation",
            "authorityName",
            "docDate"
        })
        public static class ReestrPrescription {

            @XmlElement(required = true)
            protected String checkResultNumber;
            protected String prescriptionNumber;
            protected String foundation;
            protected String authorityName;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar docDate;

            /**
             * Gets the value of the checkResultNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckResultNumber() {
                return checkResultNumber;
            }

            /**
             * Sets the value of the checkResultNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckResultNumber(String value) {
                this.checkResultNumber = value;
            }

            /**
             * Gets the value of the prescriptionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescriptionNumber() {
                return prescriptionNumber;
            }

            /**
             * Sets the value of the prescriptionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescriptionNumber(String value) {
                this.prescriptionNumber = value;
            }

            /**
             * Gets the value of the foundation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFoundation() {
                return foundation;
            }

            /**
             * Sets the value of the foundation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFoundation(String value) {
                this.foundation = value;
            }

            /**
             * Gets the value of the authorityName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorityName() {
                return authorityName;
            }

            /**
             * Sets the value of the authorityName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorityName(String value) {
                this.authorityName = value;
            }

            /**
             * Gets the value of the docDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDocDate() {
                return docDate;
            }

            /**
             * Sets the value of the docDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDocDate(XMLGregorianCalendar value) {
                this.docDate = value;
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
     *         &lt;element name="courtName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="docName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="docNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="350"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "courtName",
        "docName",
        "docDate",
        "docNumber"
    })
    public static class CourtDecision {

        @XmlElement(required = true)
        protected String courtName;
        @XmlElement(required = true)
        protected String docName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar docDate;
        @XmlElement(required = true)
        protected String docNumber;

        /**
         * Gets the value of the courtName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourtName() {
            return courtName;
        }

        /**
         * Sets the value of the courtName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourtName(String value) {
            this.courtName = value;
        }

        /**
         * Gets the value of the docName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocName() {
            return docName;
        }

        /**
         * Sets the value of the docName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocName(String value) {
            this.docName = value;
        }

        /**
         * Gets the value of the docDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDocDate() {
            return docDate;
        }

        /**
         * Sets the value of the docDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDocDate(XMLGregorianCalendar value) {
            this.docDate = value;
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

    }

}

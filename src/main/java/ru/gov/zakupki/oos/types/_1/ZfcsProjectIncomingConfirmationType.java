//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат обработки для приема проектов бесшовной интеграции
 * 
 * <p>Java class for zfcs_projectIncomingConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_projectIncomingConfirmationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refPacketUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType"/>
 *         &lt;choice>
 *           &lt;element name="success">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="registrationInfo">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="loadId">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="30"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="documentUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="warnings" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="warning" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="violations">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="violation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="processing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_projectIncomingConfirmationType", propOrder = {
    "refPacketUid",
    "success",
    "violations",
    "processing"
})
public class ZfcsProjectIncomingConfirmationType {

    @XmlElement(required = true)
    protected String refPacketUid;
    protected ZfcsProjectIncomingConfirmationType.Success success;
    protected ZfcsProjectIncomingConfirmationType.Violations violations;
    @XmlElement(defaultValue = "true")
    protected Boolean processing;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the refPacketUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPacketUid() {
        return refPacketUid;
    }

    /**
     * Sets the value of the refPacketUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPacketUid(String value) {
        this.refPacketUid = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProjectIncomingConfirmationType.Success }
     *     
     */
    public ZfcsProjectIncomingConfirmationType.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProjectIncomingConfirmationType.Success }
     *     
     */
    public void setSuccess(ZfcsProjectIncomingConfirmationType.Success value) {
        this.success = value;
    }

    /**
     * Gets the value of the violations property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProjectIncomingConfirmationType.Violations }
     *     
     */
    public ZfcsProjectIncomingConfirmationType.Violations getViolations() {
        return violations;
    }

    /**
     * Sets the value of the violations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProjectIncomingConfirmationType.Violations }
     *     
     */
    public void setViolations(ZfcsProjectIncomingConfirmationType.Violations value) {
        this.violations = value;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessing(Boolean value) {
        this.processing = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *         &lt;element name="registrationInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="loadId">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="documentUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="warnings" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="warning" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
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
        "registrationInfo",
        "warnings"
    })
    public static class Success {

        @XmlElement(required = true)
        protected ZfcsProjectIncomingConfirmationType.Success.RegistrationInfo registrationInfo;
        protected ZfcsProjectIncomingConfirmationType.Success.Warnings warnings;

        /**
         * Gets the value of the registrationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProjectIncomingConfirmationType.Success.RegistrationInfo }
         *     
         */
        public ZfcsProjectIncomingConfirmationType.Success.RegistrationInfo getRegistrationInfo() {
            return registrationInfo;
        }

        /**
         * Sets the value of the registrationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProjectIncomingConfirmationType.Success.RegistrationInfo }
         *     
         */
        public void setRegistrationInfo(ZfcsProjectIncomingConfirmationType.Success.RegistrationInfo value) {
            this.registrationInfo = value;
        }

        /**
         * Gets the value of the warnings property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProjectIncomingConfirmationType.Success.Warnings }
         *     
         */
        public ZfcsProjectIncomingConfirmationType.Success.Warnings getWarnings() {
            return warnings;
        }

        /**
         * Sets the value of the warnings property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProjectIncomingConfirmationType.Success.Warnings }
         *     
         */
        public void setWarnings(ZfcsProjectIncomingConfirmationType.Success.Warnings value) {
            this.warnings = value;
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
         *         &lt;element name="loadId">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="documentUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
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
            "loadId",
            "documentUid"
        })
        public static class RegistrationInfo {

            @XmlElement(required = true)
            protected String loadId;
            protected String documentUid;

            /**
             * Gets the value of the loadId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoadId() {
                return loadId;
            }

            /**
             * Sets the value of the loadId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoadId(String value) {
                this.loadId = value;
            }

            /**
             * Gets the value of the documentUid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentUid() {
                return documentUid;
            }

            /**
             * Sets the value of the documentUid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentUid(String value) {
                this.documentUid = value;
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
         *         &lt;element name="warning" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
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
            "warning"
        })
        public static class Warnings {

            @XmlElement(required = true)
            protected List<ZfcsViolationType> warning;

            /**
             * Gets the value of the warning property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the warning property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWarning().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsViolationType }
             * 
             * 
             */
            public List<ZfcsViolationType> getWarning() {
                if (warning == null) {
                    warning = new ArrayList<ZfcsViolationType>();
                }
                return this.warning;
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
     *         &lt;element name="violation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
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
        "violation"
    })
    public static class Violations {

        @XmlElement(required = true)
        protected List<ZfcsViolationType> violation;

        /**
         * Gets the value of the violation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getViolation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsViolationType }
         * 
         * 
         */
        public List<ZfcsViolationType> getViolation() {
            if (violation == null) {
                violation = new ArrayList<ZfcsViolationType>();
            }
            return this.violation;
        }

    }

}

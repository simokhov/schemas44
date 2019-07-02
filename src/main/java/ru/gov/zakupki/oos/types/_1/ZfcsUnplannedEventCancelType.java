//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация об отмене проведения внепланового контрольного мероприятия
 * 
 * <p>Java class for zfcs_unplannedEventCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unplannedEventCancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="text" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="unplannedEventType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="unplannedCheck">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
 *                             &lt;element name="eventLink" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
 *                                       &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="unplannedRevision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="unplannedSurvey">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
 *                             &lt;element name="eventLink" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
 *                                       &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_unplannedEventCancelType", propOrder = {
    "checkNumber",
    "regNumber",
    "docNumber",
    "publishDate",
    "text",
    "unplannedEventType",
    "printForm",
    "extPrintForm",
    "attachments"
})
@XmlSeeAlso({
    ZfcsUnplannedEventCancelProjectType.class
})
public class ZfcsUnplannedEventCancelType {

    protected String checkNumber;
    protected String regNumber;
    protected String docNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected String text;
    protected ZfcsUnplannedEventCancelType.UnplannedEventType unplannedEventType;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(required = true)
    protected ZfcsControlRegistersAttachmentListType attachments;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
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
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the unplannedEventType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType }
     *     
     */
    public ZfcsUnplannedEventCancelType.UnplannedEventType getUnplannedEventType() {
        return unplannedEventType;
    }

    /**
     * Sets the value of the unplannedEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType }
     *     
     */
    public void setUnplannedEventType(ZfcsUnplannedEventCancelType.UnplannedEventType value) {
        this.unplannedEventType = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public ZfcsControlRegistersAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
        this.attachments = value;
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
     *       &lt;choice>
     *         &lt;element name="unplannedCheck">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
     *                   &lt;element name="eventLink" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
     *                             &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="unplannedRevision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="unplannedSurvey">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
     *                   &lt;element name="eventLink" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
     *                             &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "unplannedCheck",
        "unplannedRevision",
        "unplannedSurvey"
    })
    public static class UnplannedEventType {

        protected ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck unplannedCheck;
        protected Boolean unplannedRevision;
        protected ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey unplannedSurvey;

        /**
         * Gets the value of the unplannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck }
         *     
         */
        public ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck getUnplannedCheck() {
            return unplannedCheck;
        }

        /**
         * Sets the value of the unplannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck }
         *     
         */
        public void setUnplannedCheck(ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck value) {
            this.unplannedCheck = value;
        }

        /**
         * Gets the value of the unplannedRevision property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUnplannedRevision() {
            return unplannedRevision;
        }

        /**
         * Sets the value of the unplannedRevision property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUnplannedRevision(Boolean value) {
            this.unplannedRevision = value;
        }

        /**
         * Gets the value of the unplannedSurvey property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey }
         *     
         */
        public ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey getUnplannedSurvey() {
            return unplannedSurvey;
        }

        /**
         * Sets the value of the unplannedSurvey property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey }
         *     
         */
        public void setUnplannedSurvey(ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey value) {
            this.unplannedSurvey = value;
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
         *         &lt;element name="inspectionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_inspectionTypeType"/>
         *         &lt;element name="eventLink" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
         *                   &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
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
        @XmlType(name = "", propOrder = {
            "inspectionType",
            "eventLink"
        })
        public static class UnplannedCheck {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsInspectionTypeType inspectionType;
            protected ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck.EventLink eventLink;

            /**
             * Gets the value of the inspectionType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public ZfcsInspectionTypeType getInspectionType() {
                return inspectionType;
            }

            /**
             * Sets the value of the inspectionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsInspectionTypeType }
             *     
             */
            public void setInspectionType(ZfcsInspectionTypeType value) {
                this.inspectionType = value;
            }

            /**
             * Gets the value of the eventLink property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck.EventLink }
             *     
             */
            public ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck.EventLink getEventLink() {
                return eventLink;
            }

            /**
             * Sets the value of the eventLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck.EventLink }
             *     
             */
            public void setEventLink(ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedCheck.EventLink value) {
                this.eventLink = value;
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
             *         &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
             *         &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
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
                "parentEventPlanNumber",
                "parentUnplannedEventNumber"
            })
            public static class EventLink {

                protected String parentEventPlanNumber;
                protected String parentUnplannedEventNumber;

                /**
                 * Gets the value of the parentEventPlanNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParentEventPlanNumber() {
                    return parentEventPlanNumber;
                }

                /**
                 * Sets the value of the parentEventPlanNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParentEventPlanNumber(String value) {
                    this.parentEventPlanNumber = value;
                }

                /**
                 * Gets the value of the parentUnplannedEventNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParentUnplannedEventNumber() {
                    return parentUnplannedEventNumber;
                }

                /**
                 * Sets the value of the parentUnplannedEventNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParentUnplannedEventNumber(String value) {
                    this.parentUnplannedEventNumber = value;
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
         *         &lt;element name="surveyType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_surveyType" minOccurs="0"/>
         *         &lt;element name="eventLink" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
         *                   &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
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
        @XmlType(name = "", propOrder = {
            "surveyType",
            "eventLink"
        })
        public static class UnplannedSurvey {

            @XmlSchemaType(name = "string")
            protected ZfcsSurveyType surveyType;
            protected ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey.EventLink eventLink;

            /**
             * Gets the value of the surveyType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public ZfcsSurveyType getSurveyType() {
                return surveyType;
            }

            /**
             * Sets the value of the surveyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSurveyType }
             *     
             */
            public void setSurveyType(ZfcsSurveyType value) {
                this.surveyType = value;
            }

            /**
             * Gets the value of the eventLink property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey.EventLink }
             *     
             */
            public ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey.EventLink getEventLink() {
                return eventLink;
            }

            /**
             * Sets the value of the eventLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey.EventLink }
             *     
             */
            public void setEventLink(ZfcsUnplannedEventCancelType.UnplannedEventType.UnplannedSurvey.EventLink value) {
                this.eventLink = value;
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
             *         &lt;element name="parentEventPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
             *         &lt;element name="parentUnplannedEventNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType"/>
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
                "parentEventPlanNumber",
                "parentUnplannedEventNumber"
            })
            public static class EventLink {

                protected String parentEventPlanNumber;
                protected String parentUnplannedEventNumber;

                /**
                 * Gets the value of the parentEventPlanNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParentEventPlanNumber() {
                    return parentEventPlanNumber;
                }

                /**
                 * Sets the value of the parentEventPlanNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParentEventPlanNumber(String value) {
                    this.parentEventPlanNumber = value;
                }

                /**
                 * Gets the value of the parentUnplannedEventNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParentUnplannedEventNumber() {
                    return parentUnplannedEventNumber;
                }

                /**
                 * Sets the value of the parentUnplannedEventNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParentUnplannedEventNumber(String value) {
                    this.parentUnplannedEventNumber = value;
                }

            }

        }

    }

}

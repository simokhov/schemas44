//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:00 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация по внеплановому контрольному мероприятию
 * 
 * <p>Java class for zfcs_unplannedEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unplannedEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckCommonInfoType"/>
 *         &lt;element name="unplannedEventType">
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
 *                             &lt;element name="eventLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventEventLinkType" minOccurs="0"/>
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
 *                             &lt;element name="eventLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventEventLinkType" minOccurs="0"/>
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
 *         &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
 *         &lt;element name="inspector" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="inspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="receivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inspectionPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="checkedSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckSubjectPlanType" maxOccurs="unbounded"/>
 *         &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventBaseType"/>
 *         &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckCheckedObjectType"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_unplannedEventType", propOrder = {
    "commonInfo",
    "unplannedEventType",
    "period",
    "inspector",
    "inspectionDate",
    "receivingDate",
    "inspectionPlace",
    "checkedSubject",
    "base",
    "checkedObject",
    "printForm",
    "extPrintForm"
})
@XmlSeeAlso({
    ZfcsUnplannedEventProjectType.class
})
public class ZfcsUnplannedEventType {

    @XmlElement(required = true)
    protected ZfcsUnplannedCheckCommonInfoType commonInfo;
    @XmlElement(required = true)
    protected ZfcsUnplannedEventType.UnplannedEventType unplannedEventType;
    protected ZfcsPeriodType period;
    @XmlElement(required = true)
    protected ZfcsOrganizationRef inspector;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspectionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivingDate;
    protected String inspectionPlace;
    @XmlElement(required = true)
    protected List<ZfcsUnplannedCheckSubjectPlanType> checkedSubject;
    @XmlElement(required = true)
    protected ZfcsUnplannedEventBaseType base;
    @XmlElement(required = true)
    protected ZfcsUnplannedCheckCheckedObjectType checkedObject;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckCommonInfoType }
     *     
     */
    public ZfcsUnplannedCheckCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckCommonInfoType }
     *     
     */
    public void setCommonInfo(ZfcsUnplannedCheckCommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the unplannedEventType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedEventType.UnplannedEventType }
     *     
     */
    public ZfcsUnplannedEventType.UnplannedEventType getUnplannedEventType() {
        return unplannedEventType;
    }

    /**
     * Sets the value of the unplannedEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedEventType.UnplannedEventType }
     *     
     */
    public void setUnplannedEventType(ZfcsUnplannedEventType.UnplannedEventType value) {
        this.unplannedEventType = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPeriodType }
     *     
     */
    public ZfcsPeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPeriodType }
     *     
     */
    public void setPeriod(ZfcsPeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the inspector property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getInspector() {
        return inspector;
    }

    /**
     * Sets the value of the inspector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setInspector(ZfcsOrganizationRef value) {
        this.inspector = value;
    }

    /**
     * Gets the value of the inspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Sets the value of the inspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspectionDate(XMLGregorianCalendar value) {
        this.inspectionDate = value;
    }

    /**
     * Gets the value of the receivingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivingDate() {
        return receivingDate;
    }

    /**
     * Sets the value of the receivingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivingDate(XMLGregorianCalendar value) {
        this.receivingDate = value;
    }

    /**
     * Gets the value of the inspectionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionPlace() {
        return inspectionPlace;
    }

    /**
     * Sets the value of the inspectionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionPlace(String value) {
        this.inspectionPlace = value;
    }

    /**
     * Gets the value of the checkedSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsUnplannedCheckSubjectPlanType }
     * 
     * 
     */
    public List<ZfcsUnplannedCheckSubjectPlanType> getCheckedSubject() {
        if (checkedSubject == null) {
            checkedSubject = new ArrayList<ZfcsUnplannedCheckSubjectPlanType>();
        }
        return this.checkedSubject;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedEventBaseType }
     *     
     */
    public ZfcsUnplannedEventBaseType getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedEventBaseType }
     *     
     */
    public void setBase(ZfcsUnplannedEventBaseType value) {
        this.base = value;
    }

    /**
     * Gets the value of the checkedObject property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckCheckedObjectType }
     *     
     */
    public ZfcsUnplannedCheckCheckedObjectType getCheckedObject() {
        return checkedObject;
    }

    /**
     * Sets the value of the checkedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckCheckedObjectType }
     *     
     */
    public void setCheckedObject(ZfcsUnplannedCheckCheckedObjectType value) {
        this.checkedObject = value;
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
     *                   &lt;element name="eventLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventEventLinkType" minOccurs="0"/>
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
     *                   &lt;element name="eventLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventEventLinkType" minOccurs="0"/>
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

        protected ZfcsUnplannedEventType.UnplannedEventType.UnplannedCheck unplannedCheck;
        protected Boolean unplannedRevision;
        protected ZfcsUnplannedEventType.UnplannedEventType.UnplannedSurvey unplannedSurvey;

        /**
         * Gets the value of the unplannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedEventType.UnplannedEventType.UnplannedCheck }
         *     
         */
        public ZfcsUnplannedEventType.UnplannedEventType.UnplannedCheck getUnplannedCheck() {
            return unplannedCheck;
        }

        /**
         * Sets the value of the unplannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedEventType.UnplannedEventType.UnplannedCheck }
         *     
         */
        public void setUnplannedCheck(ZfcsUnplannedEventType.UnplannedEventType.UnplannedCheck value) {
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
         *     {@link ZfcsUnplannedEventType.UnplannedEventType.UnplannedSurvey }
         *     
         */
        public ZfcsUnplannedEventType.UnplannedEventType.UnplannedSurvey getUnplannedSurvey() {
            return unplannedSurvey;
        }

        /**
         * Sets the value of the unplannedSurvey property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedEventType.UnplannedEventType.UnplannedSurvey }
         *     
         */
        public void setUnplannedSurvey(ZfcsUnplannedEventType.UnplannedEventType.UnplannedSurvey value) {
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
         *         &lt;element name="eventLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventEventLinkType" minOccurs="0"/>
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
            protected ZfcsUnplannedEventEventLinkType eventLink;

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
             *     {@link ZfcsUnplannedEventEventLinkType }
             *     
             */
            public ZfcsUnplannedEventEventLinkType getEventLink() {
                return eventLink;
            }

            /**
             * Sets the value of the eventLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedEventEventLinkType }
             *     
             */
            public void setEventLink(ZfcsUnplannedEventEventLinkType value) {
                this.eventLink = value;
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
         *         &lt;element name="eventLink" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedEventEventLinkType" minOccurs="0"/>
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
            protected ZfcsUnplannedEventEventLinkType eventLink;

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
             *     {@link ZfcsUnplannedEventEventLinkType }
             *     
             */
            public ZfcsUnplannedEventEventLinkType getEventLink() {
                return eventLink;
            }

            /**
             * Sets the value of the eventLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsUnplannedEventEventLinkType }
             *     
             */
            public void setEventLink(ZfcsUnplannedEventEventLinkType value) {
                this.eventLink = value;
            }

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
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
 * Тип: Информация о жалобе в результате контроля
 * 
 * <p>Java class for zfcs_checkResultComplaintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultComplaintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *         &lt;element name="unplannedCheck" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="checkSubjects" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="subjectComplaint">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="subjectComplaintGroup">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                             &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *         &lt;element name="complaintResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResult.complaintResultType"/>
 *         &lt;element name="complaintResultInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="checkResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResult.checkResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkResultComplaintType", propOrder = {
    "complaintNumber",
    "regNumber",
    "unplannedCheck",
    "publishDate",
    "checkSubjects",
    "checkedObject",
    "decision",
    "prescription",
    "complaintResult",
    "complaintResultInfo",
    "checkResult"
})
public class ZfcsCheckResultComplaintType {

    protected String complaintNumber;
    protected String regNumber;
    protected ZfcsCheckResultComplaintType.UnplannedCheck unplannedCheck;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected List<ZfcsCheckResultComplaintType.CheckSubjects> checkSubjects;
    protected List<ZfcsComplaintObjectType> checkedObject;
    @XmlElement(required = true)
    protected ZfcsCheckResultDecisionType decision;
    protected ZfcsCheckResultPrescriptionType prescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsCheckResultComplaintResultType complaintResult;
    protected String complaintResultInfo;
    @XmlSchemaType(name = "string")
    protected ZfcsCheckResultCheckResultType checkResult;

    /**
     * Gets the value of the complaintNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintNumber() {
        return complaintNumber;
    }

    /**
     * Sets the value of the complaintNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintNumber(String value) {
        this.complaintNumber = value;
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
     * Gets the value of the unplannedCheck property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultComplaintType.UnplannedCheck }
     *     
     */
    public ZfcsCheckResultComplaintType.UnplannedCheck getUnplannedCheck() {
        return unplannedCheck;
    }

    /**
     * Sets the value of the unplannedCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultComplaintType.UnplannedCheck }
     *     
     */
    public void setUnplannedCheck(ZfcsCheckResultComplaintType.UnplannedCheck value) {
        this.unplannedCheck = value;
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
     * Gets the value of the checkSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsCheckResultComplaintType.CheckSubjects }
     * 
     * 
     */
    public List<ZfcsCheckResultComplaintType.CheckSubjects> getCheckSubjects() {
        if (checkSubjects == null) {
            checkSubjects = new ArrayList<ZfcsCheckResultComplaintType.CheckSubjects>();
        }
        return this.checkSubjects;
    }

    /**
     * Gets the value of the checkedObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsComplaintObjectType }
     * 
     * 
     */
    public List<ZfcsComplaintObjectType> getCheckedObject() {
        if (checkedObject == null) {
            checkedObject = new ArrayList<ZfcsComplaintObjectType>();
        }
        return this.checkedObject;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultDecisionType }
     *     
     */
    public ZfcsCheckResultDecisionType getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultDecisionType }
     *     
     */
    public void setDecision(ZfcsCheckResultDecisionType value) {
        this.decision = value;
    }

    /**
     * Gets the value of the prescription property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultPrescriptionType }
     *     
     */
    public ZfcsCheckResultPrescriptionType getPrescription() {
        return prescription;
    }

    /**
     * Sets the value of the prescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultPrescriptionType }
     *     
     */
    public void setPrescription(ZfcsCheckResultPrescriptionType value) {
        this.prescription = value;
    }

    /**
     * Gets the value of the complaintResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultComplaintResultType }
     *     
     */
    public ZfcsCheckResultComplaintResultType getComplaintResult() {
        return complaintResult;
    }

    /**
     * Sets the value of the complaintResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultComplaintResultType }
     *     
     */
    public void setComplaintResult(ZfcsCheckResultComplaintResultType value) {
        this.complaintResult = value;
    }

    /**
     * Gets the value of the complaintResultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintResultInfo() {
        return complaintResultInfo;
    }

    /**
     * Sets the value of the complaintResultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintResultInfo(String value) {
        this.complaintResultInfo = value;
    }

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultCheckResultType }
     *     
     */
    public ZfcsCheckResultCheckResultType getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultCheckResultType }
     *     
     */
    public void setCheckResult(ZfcsCheckResultCheckResultType value) {
        this.checkResult = value;
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
     *         &lt;element name="subjectComplaint">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="subjectComplaintGroup">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                   &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *                 &lt;/choice>
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
        "subjectComplaint",
        "subjectComplaintGroup"
    })
    public static class CheckSubjects {

        protected ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaint subjectComplaint;
        protected ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaintGroup subjectComplaintGroup;

        /**
         * Gets the value of the subjectComplaint property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaint }
         *     
         */
        public ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaint getSubjectComplaint() {
            return subjectComplaint;
        }

        /**
         * Sets the value of the subjectComplaint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaint }
         *     
         */
        public void setSubjectComplaint(ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaint value) {
            this.subjectComplaint = value;
        }

        /**
         * Gets the value of the subjectComplaintGroup property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaintGroup }
         *     
         */
        public ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaintGroup getSubjectComplaintGroup() {
            return subjectComplaintGroup;
        }

        /**
         * Sets the value of the subjectComplaintGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaintGroup }
         *     
         */
        public void setSubjectComplaintGroup(ZfcsCheckResultComplaintType.CheckSubjects.SubjectComplaintGroup value) {
            this.subjectComplaintGroup = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SubjectComplaint
            extends ZfcsComplaintSubjectType
        {


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
         *         &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *         &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
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
            "epFailure",
            "epFailureNew"
        })
        public static class SubjectComplaintGroup {

            @XmlElement(name = "EP_failure")
            protected ZfcsOrganizationRef epFailure;
            @XmlElement(name = "EP_failureNew")
            protected ZfcsOrganizationControlRegistersRef epFailureNew;

            /**
             * Gets the value of the epFailure property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public ZfcsOrganizationRef getEPFailure() {
                return epFailure;
            }

            /**
             * Sets the value of the epFailure property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public void setEPFailure(ZfcsOrganizationRef value) {
                this.epFailure = value;
            }

            /**
             * Gets the value of the epFailureNew property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOrganizationControlRegistersRef }
             *     
             */
            public ZfcsOrganizationControlRegistersRef getEPFailureNew() {
                return epFailureNew;
            }

            /**
             * Sets the value of the epFailureNew property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOrganizationControlRegistersRef }
             *     
             */
            public void setEPFailureNew(ZfcsOrganizationControlRegistersRef value) {
                this.epFailureNew = value;
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
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
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
        "regNumber",
        "info",
        "period"
    })
    public static class UnplannedCheck {

        protected String regNumber;
        protected String info;
        protected ZfcsPeriodType period;

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
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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

    }

}

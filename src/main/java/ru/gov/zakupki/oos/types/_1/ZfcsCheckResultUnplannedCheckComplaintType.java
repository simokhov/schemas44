//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Информация о внеплановой проверке (рассмотрении жалобы) в результате контроля
 * 
 * <p>Java class for zfcs_checkResultUnplannedCheckComplaintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultUnplannedCheckComplaintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *         &lt;element name="unplannedCheckNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType" minOccurs="0"/>
 *         &lt;element name="unplannedCheckRegNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *         &lt;element name="complaintPlacementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checkSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckSubjectPlanType" maxOccurs="unbounded"/>
 *         &lt;element name="checkedObject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *         &lt;element name="prescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *         &lt;element name="complaintResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResult.complaintResultType"/>
 *         &lt;element name="complaintResultInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="checkResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResult.checkResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkResultUnplannedCheckComplaintType", propOrder = {
    "complaintNumber",
    "regNumber",
    "unplannedCheckNumber",
    "unplannedCheckRegNumber",
    "complaintPlacementDate",
    "checkSubjects",
    "checkedObject",
    "info",
    "decision",
    "prescription",
    "complaintResult",
    "complaintResultInfo",
    "checkResult"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsEventResultType.Base.UnplannedCheckComplaint.class
})
public class ZfcsCheckResultUnplannedCheckComplaintType {

    protected String complaintNumber;
    protected String regNumber;
    protected String unplannedCheckNumber;
    protected String unplannedCheckRegNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar complaintPlacementDate;
    @XmlElement(required = true)
    protected List<ZfcsUnplannedCheckSubjectPlanType> checkSubjects;
    protected List<ZfcsComplaintObjectType> checkedObject;
    @XmlElement(required = true)
    protected String info;
    @XmlElement(required = true)
    protected ZfcsCheckResultDecisionType decision;
    protected ZfcsCheckResultPrescriptionType prescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsCheckResultComplaintResultType complaintResult;
    protected String complaintResultInfo;
    @XmlElement(required = true)
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
     * Gets the value of the unplannedCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnplannedCheckNumber() {
        return unplannedCheckNumber;
    }

    /**
     * Sets the value of the unplannedCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnplannedCheckNumber(String value) {
        this.unplannedCheckNumber = value;
    }

    /**
     * Gets the value of the unplannedCheckRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnplannedCheckRegNumber() {
        return unplannedCheckRegNumber;
    }

    /**
     * Sets the value of the unplannedCheckRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnplannedCheckRegNumber(String value) {
        this.unplannedCheckRegNumber = value;
    }

    /**
     * Gets the value of the complaintPlacementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getComplaintPlacementDate() {
        return complaintPlacementDate;
    }

    /**
     * Sets the value of the complaintPlacementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setComplaintPlacementDate(XMLGregorianCalendar value) {
        this.complaintPlacementDate = value;
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
     * {@link ZfcsUnplannedCheckSubjectPlanType }
     * 
     * 
     */
    public List<ZfcsUnplannedCheckSubjectPlanType> getCheckSubjects() {
        if (checkSubjects == null) {
            checkSubjects = new ArrayList<ZfcsUnplannedCheckSubjectPlanType>();
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

}

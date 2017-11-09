//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Общая информация по жалобе
 * 
 * <p>Java class for zfcs_complaintCommonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintCommonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="planDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="decisionPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="registrationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *         &lt;element name="considerationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="regType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaint.regType"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
 *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPhoneType" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintModificationType" minOccurs="0"/>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCommonInfoPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_complaintCommonInfoType", propOrder = {
    "complaintNumber",
    "regNumber",
    "docNumber",
    "versionNumber",
    "planDecisionDate",
    "decisionPlace",
    "registrationKO",
    "considerationKO",
    "regType",
    "regDate",
    "notice",
    "contactPhone",
    "modification",
    "printFormInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsComplaintType.CommonInfo.class
})
public class ZfcsComplaintCommonInfoType {

    @XmlElement(required = true)
    protected String complaintNumber;
    protected String regNumber;
    protected String docNumber;
    protected Integer versionNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planDecisionDate;
    protected String decisionPlace;
    protected ZfcsOrganizationRef registrationKO;
    @XmlElement(required = true)
    protected ZfcsOrganizationRef considerationKO;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsComplaintRegType regType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDate;
    protected ZfcsNoticeDetailsType notice;
    protected String contactPhone;
    protected ZfcsComplaintModificationType modification;
    protected ZfcsComplaintCommonInfoPrintFormType printFormInfo;

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
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the planDecisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanDecisionDate() {
        return planDecisionDate;
    }

    /**
     * Sets the value of the planDecisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanDecisionDate(XMLGregorianCalendar value) {
        this.planDecisionDate = value;
    }

    /**
     * Gets the value of the decisionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionPlace() {
        return decisionPlace;
    }

    /**
     * Sets the value of the decisionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionPlace(String value) {
        this.decisionPlace = value;
    }

    /**
     * Gets the value of the registrationKO property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getRegistrationKO() {
        return registrationKO;
    }

    /**
     * Sets the value of the registrationKO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setRegistrationKO(ZfcsOrganizationRef value) {
        this.registrationKO = value;
    }

    /**
     * Gets the value of the considerationKO property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getConsiderationKO() {
        return considerationKO;
    }

    /**
     * Sets the value of the considerationKO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setConsiderationKO(ZfcsOrganizationRef value) {
        this.considerationKO = value;
    }

    /**
     * Gets the value of the regType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintRegType }
     *     
     */
    public ZfcsComplaintRegType getRegType() {
        return regType;
    }

    /**
     * Sets the value of the regType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintRegType }
     *     
     */
    public void setRegType(ZfcsComplaintRegType value) {
        this.regType = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the notice property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNoticeDetailsType }
     *     
     */
    public ZfcsNoticeDetailsType getNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNoticeDetailsType }
     *     
     */
    public void setNotice(ZfcsNoticeDetailsType value) {
        this.notice = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintModificationType }
     *     
     */
    public ZfcsComplaintModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintModificationType }
     *     
     */
    public void setModification(ZfcsComplaintModificationType value) {
        this.modification = value;
    }

    /**
     * Gets the value of the printFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintCommonInfoPrintFormType }
     *     
     */
    public ZfcsComplaintCommonInfoPrintFormType getPrintFormInfo() {
        return printFormInfo;
    }

    /**
     * Sets the value of the printFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintCommonInfoPrintFormType }
     *     
     */
    public void setPrintFormInfo(ZfcsComplaintCommonInfoPrintFormType value) {
        this.printFormInfo = value;
    }

}

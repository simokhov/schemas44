//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.types._1.ZfcsAttachmentListType;
import ru.gov.zakupki.oos.types._1.ZfcsInvalidReportType;
import ru.gov.zakupki.oos.types._1.ZfcsOrganizationInfoWithOgrnType;
import ru.gov.zakupki.oos.types._1.ZfcsStageType;


/**
 * Отчет заказчика в неструктурированной форме и информация о его недействительности
 * 
 * <p>Java class for zfcs_customerReportUnstructuredType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportUnstructuredType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_revisionNumType" minOccurs="0"/>
 *         &lt;element name="reportId" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_reportIdType" minOccurs="0"/>
 *         &lt;element name="publishOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoWithOgrnType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoWithOgrnType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_customerReportTypeEnum" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
 *         &lt;element name="currentContractStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType" minOccurs="0"/>
 *         &lt;element name="reportingPeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="invalidReportInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_invalidReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportUnstructuredType", propOrder = {
    "docPublishDate",
    "versionNumber",
    "reportId",
    "publishOrg",
    "customer",
    "type",
    "attachments",
    "contractRegNum",
    "currentContractStage",
    "reportingPeriod",
    "modificationReason",
    "invalidReportInfo"
})
public class ZfcsCustomerReportUnstructuredType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    protected String versionNumber;
    protected String reportId;
    protected ZfcsOrganizationInfoWithOgrnType publishOrg;
    protected ZfcsOrganizationInfoWithOgrnType customer;
    protected String type;
    protected ZfcsAttachmentListType attachments;
    protected String contractRegNum;
    protected ZfcsStageType currentContractStage;
    protected ZfcsCustomerReportUnstructuredType.ReportingPeriod reportingPeriod;
    protected String modificationReason;
    protected ZfcsInvalidReportType invalidReportInfo;

    /**
     * Gets the value of the docPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPublishDate() {
        return docPublishDate;
    }

    /**
     * Sets the value of the docPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPublishDate(XMLGregorianCalendar value) {
        this.docPublishDate = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the publishOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public ZfcsOrganizationInfoWithOgrnType getPublishOrg() {
        return publishOrg;
    }

    /**
     * Sets the value of the publishOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public void setPublishOrg(ZfcsOrganizationInfoWithOgrnType value) {
        this.publishOrg = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public ZfcsOrganizationInfoWithOgrnType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public void setCustomer(ZfcsOrganizationInfoWithOgrnType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the contractRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRegNum() {
        return contractRegNum;
    }

    /**
     * Sets the value of the contractRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractRegNum(String value) {
        this.contractRegNum = value;
    }

    /**
     * Gets the value of the currentContractStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStageType }
     *     
     */
    public ZfcsStageType getCurrentContractStage() {
        return currentContractStage;
    }

    /**
     * Sets the value of the currentContractStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStageType }
     *     
     */
    public void setCurrentContractStage(ZfcsStageType value) {
        this.currentContractStage = value;
    }

    /**
     * Gets the value of the reportingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportUnstructuredType.ReportingPeriod }
     *     
     */
    public ZfcsCustomerReportUnstructuredType.ReportingPeriod getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportUnstructuredType.ReportingPeriod }
     *     
     */
    public void setReportingPeriod(ZfcsCustomerReportUnstructuredType.ReportingPeriod value) {
        this.reportingPeriod = value;
    }

    /**
     * Gets the value of the modificationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationReason() {
        return modificationReason;
    }

    /**
     * Sets the value of the modificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationReason(String value) {
        this.modificationReason = value;
    }

    /**
     * Gets the value of the invalidReportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInvalidReportType }
     *     
     */
    public ZfcsInvalidReportType getInvalidReportInfo() {
        return invalidReportInfo;
    }

    /**
     * Sets the value of the invalidReportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInvalidReportType }
     *     
     */
    public void setInvalidReportInfo(ZfcsInvalidReportType value) {
        this.invalidReportInfo = value;
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
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "startDate",
        "endDate"
    })
    public static class ReportingPeriod {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endDate;

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Отчет производителя товаров о соблюдении требований п.5 ч.1 ст. 111
 * 
 * <p>Java class for zfcs_manufacturerReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_manufacturerReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_manufacturerReportRegType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_manufacturerReportOrganizationType"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *         &lt;element name="repRegNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repRegNumber"/>
 *         &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="investmentAmount" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *         &lt;element name="supplerInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_manufacturerReportSupplerInfoType" minOccurs="0"/>
 *         &lt;element name="NPAInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_manufacturerReportNPAType" minOccurs="0"/>
 *         &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}zfcs_manufacturerReportProductsType"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="contractAttachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "zfcs_manufacturerReportType", propOrder = {
    "id",
    "regNum",
    "versionNumber",
    "responsibleOrg",
    "publishDate",
    "createDate",
    "year",
    "repRegNumber",
    "contractDate",
    "investmentAmount",
    "supplerInfo",
    "npaInfo",
    "products",
    "printForm",
    "extPrintForm",
    "contractAttachments",
    "attachments",
    "modification"
})
public class ZfcsManufacturerReportType {

    protected Long id;
    protected String regNum;
    protected Integer versionNumber;
    @XmlElement(required = true)
    protected ZfcsManufacturerReportOrganizationType responsibleOrg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected int year;
    @XmlElement(required = true)
    protected String repRegNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDate;
    @XmlElement(required = true)
    protected String investmentAmount;
    protected ZfcsManufacturerReportSupplerInfoType supplerInfo;
    @XmlElement(name = "NPAInfo")
    protected ZfcsManufacturerReportNPAType npaInfo;
    @XmlElement(required = true)
    protected ZfcsManufacturerReportProductsType products;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    protected ZfcsAttachmentListType contractAttachments;
    protected ZfcsAttachmentListType attachments;
    protected ZfcsManufacturerReportType.Modification modification;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
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
     * Gets the value of the responsibleOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsManufacturerReportOrganizationType }
     *     
     */
    public ZfcsManufacturerReportOrganizationType getResponsibleOrg() {
        return responsibleOrg;
    }

    /**
     * Sets the value of the responsibleOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsManufacturerReportOrganizationType }
     *     
     */
    public void setResponsibleOrg(ZfcsManufacturerReportOrganizationType value) {
        this.responsibleOrg = value;
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
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the repRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepRegNumber() {
        return repRegNumber;
    }

    /**
     * Sets the value of the repRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepRegNumber(String value) {
        this.repRegNumber = value;
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the investmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestmentAmount() {
        return investmentAmount;
    }

    /**
     * Sets the value of the investmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestmentAmount(String value) {
        this.investmentAmount = value;
    }

    /**
     * Gets the value of the supplerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsManufacturerReportSupplerInfoType }
     *     
     */
    public ZfcsManufacturerReportSupplerInfoType getSupplerInfo() {
        return supplerInfo;
    }

    /**
     * Sets the value of the supplerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsManufacturerReportSupplerInfoType }
     *     
     */
    public void setSupplerInfo(ZfcsManufacturerReportSupplerInfoType value) {
        this.supplerInfo = value;
    }

    /**
     * Gets the value of the npaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsManufacturerReportNPAType }
     *     
     */
    public ZfcsManufacturerReportNPAType getNPAInfo() {
        return npaInfo;
    }

    /**
     * Sets the value of the npaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsManufacturerReportNPAType }
     *     
     */
    public void setNPAInfo(ZfcsManufacturerReportNPAType value) {
        this.npaInfo = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsManufacturerReportProductsType }
     *     
     */
    public ZfcsManufacturerReportProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsManufacturerReportProductsType }
     *     
     */
    public void setProducts(ZfcsManufacturerReportProductsType value) {
        this.products = value;
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
     * Gets the value of the contractAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getContractAttachments() {
        return contractAttachments;
    }

    /**
     * Sets the value of the contractAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setContractAttachments(ZfcsAttachmentListType value) {
        this.contractAttachments = value;
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
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsManufacturerReportType.Modification }
     *     
     */
    public ZfcsManufacturerReportType.Modification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsManufacturerReportType.Modification }
     *     
     */
    public void setModification(ZfcsManufacturerReportType.Modification value) {
        this.modification = value;
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
     *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "changeDate"
    })
    public static class Modification {

        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar changeDate;

        /**
         * Gets the value of the changeDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getChangeDate() {
            return changeDate;
        }

        /**
         * Sets the value of the changeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setChangeDate(XMLGregorianCalendar value) {
            this.changeDate = value;
        }

    }

}

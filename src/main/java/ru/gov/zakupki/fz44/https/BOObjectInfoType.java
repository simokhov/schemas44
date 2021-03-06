//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.fz44.https;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Краткие сведения о документе БО
 * 
 * <p>Java class for BOObjectInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOObjectInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentUid" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/fz44/https}documentBOStatusType"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType"/>
 *         &lt;element name="budgetObligationNumber" type="{http://zakupki.gov.ru/oos/base/1}boNumberType" minOccurs="0"/>
 *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/base/1}yearType"/>
 *         &lt;element name="foundationDocumentKind" type="{http://zakupki.gov.ru/fz44/https}foundationDocumentKindType"/>
 *         &lt;element name="schemeVersion" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOObjectInfoType", propOrder = {
    "documentUid",
    "status",
    "createDate",
    "signDate",
    "registrationDate",
    "versionNumber",
    "budgetObligationNumber",
    "year",
    "foundationDocumentKind",
    "schemeVersion"
})
@XmlSeeAlso({
    ru.gov.zakupki.fz44.https.GetBOObjectInfoResponse.ObjectInfo.class
})
public class BOObjectInfoType {

    @XmlElement(required = true)
    protected String documentUid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DocumentBOStatusType status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    protected int versionNumber;
    protected String budgetObligationNumber;
    protected int year;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FoundationDocumentKindType foundationDocumentKind;
    @XmlElement(required = true)
    protected String schemeVersion;

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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentBOStatusType }
     *     
     */
    public DocumentBOStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentBOStatusType }
     *     
     */
    public void setStatus(DocumentBOStatusType value) {
        this.status = value;
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
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     */
    public int getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     */
    public void setVersionNumber(int value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the budgetObligationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetObligationNumber() {
        return budgetObligationNumber;
    }

    /**
     * Sets the value of the budgetObligationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetObligationNumber(String value) {
        this.budgetObligationNumber = value;
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
     * Gets the value of the foundationDocumentKind property.
     * 
     * @return
     *     possible object is
     *     {@link FoundationDocumentKindType }
     *     
     */
    public FoundationDocumentKindType getFoundationDocumentKind() {
        return foundationDocumentKind;
    }

    /**
     * Sets the value of the foundationDocumentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoundationDocumentKindType }
     *     
     */
    public void setFoundationDocumentKind(FoundationDocumentKindType value) {
        this.foundationDocumentKind = value;
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

}

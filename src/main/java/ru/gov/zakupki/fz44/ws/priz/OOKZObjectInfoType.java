//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Краткие сведения об опубликованном документе ООКЗ
 * 
 * <p>Java class for OOKZObjectInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OOKZObjectInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentUid" type="{http://zakupki.gov.ru/fz44/ws/priz}guidType"/>
 *         &lt;element name="documentKind" type="{http://zakupki.gov.ru/fz44/ws/priz}OOKZDocumentKindType"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/fz44/ws/priz}documentStatusType"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/fz44/ws/priz}shortNameType"/>
 *         &lt;element name="schemeVersion" type="{http://zakupki.gov.ru/fz44/ws/priz}schemeVersionType"/>
 *         &lt;element name="extPartnerType" type="{http://zakupki.gov.ru/fz44/ws/priz}extPartnerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OOKZObjectInfoType", propOrder = {
    "documentUid",
    "documentKind",
    "status",
    "publishDate",
    "versionNumber",
    "regNumber",
    "schemeVersion",
    "extPartnerType"
})
@XmlSeeAlso({
    ru.gov.zakupki.fz44.ws.priz.GetOOKZObjectInfoResponse.ObjectInfo.class
})
public class OOKZObjectInfoType {

    @XmlElement(required = true)
    protected String documentUid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OOKZDocumentKindType documentKind;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DocumentStatusType status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    protected int versionNumber;
    @XmlElement(required = true)
    protected String regNumber;
    @XmlElement(required = true)
    protected String schemeVersion;
    @XmlSchemaType(name = "string")
    protected ExtPartnerType extPartnerType;

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
     * Gets the value of the documentKind property.
     * 
     * @return
     *     possible object is
     *     {@link OOKZDocumentKindType }
     *     
     */
    public OOKZDocumentKindType getDocumentKind() {
        return documentKind;
    }

    /**
     * Sets the value of the documentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link OOKZDocumentKindType }
     *     
     */
    public void setDocumentKind(OOKZDocumentKindType value) {
        this.documentKind = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusType }
     *     
     */
    public DocumentStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusType }
     *     
     */
    public void setStatus(DocumentStatusType value) {
        this.status = value;
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
     * Gets the value of the extPartnerType property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPartnerType }
     *     
     */
    public ExtPartnerType getExtPartnerType() {
        return extPartnerType;
    }

    /**
     * Sets the value of the extPartnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPartnerType }
     *     
     */
    public void setExtPartnerType(ExtPartnerType value) {
        this.extPartnerType = value;
    }

}

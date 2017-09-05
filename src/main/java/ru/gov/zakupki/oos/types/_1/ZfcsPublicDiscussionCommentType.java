//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Комментарий ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionCommentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionCommentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="publicDiscussionPhase1Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *           &lt;element name="publicDiscussionPhase2Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *         &lt;/choice>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType" minOccurs="0"/>
 *         &lt;element name="docPremoderationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publicDiscussionFacet" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFacetRef" minOccurs="0"/>
 *         &lt;element name="author" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionAuthorType"/>
 *         &lt;element name="commentNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="comment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_publicDiscussionCommentType", propOrder = {
    "externalId",
    "id",
    "publicDiscussionPhase1Num",
    "publicDiscussionPhase2Num",
    "versionNumber",
    "docPremoderationDate",
    "publicDiscussionFacet",
    "author",
    "commentNumber",
    "comment",
    "attachments"
})
public class ZfcsPublicDiscussionCommentType {

    protected String externalId;
    protected Long id;
    protected String publicDiscussionPhase1Num;
    protected String publicDiscussionPhase2Num;
    protected String versionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPremoderationDate;
    protected ZfcsPublicDiscussionFacetRef publicDiscussionFacet;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionAuthorType author;
    @XmlElement(required = true)
    protected BigInteger commentNumber;
    @XmlElement(required = true)
    protected String comment;
    protected ZfcsAttachmentListType attachments;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

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
     * Gets the value of the publicDiscussionPhase1Num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicDiscussionPhase1Num() {
        return publicDiscussionPhase1Num;
    }

    /**
     * Sets the value of the publicDiscussionPhase1Num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDiscussionPhase1Num(String value) {
        this.publicDiscussionPhase1Num = value;
    }

    /**
     * Gets the value of the publicDiscussionPhase2Num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicDiscussionPhase2Num() {
        return publicDiscussionPhase2Num;
    }

    /**
     * Sets the value of the publicDiscussionPhase2Num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDiscussionPhase2Num(String value) {
        this.publicDiscussionPhase2Num = value;
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
     * Gets the value of the docPremoderationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPremoderationDate() {
        return docPremoderationDate;
    }

    /**
     * Sets the value of the docPremoderationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPremoderationDate(XMLGregorianCalendar value) {
        this.docPremoderationDate = value;
    }

    /**
     * Gets the value of the publicDiscussionFacet property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionFacetRef }
     *     
     */
    public ZfcsPublicDiscussionFacetRef getPublicDiscussionFacet() {
        return publicDiscussionFacet;
    }

    /**
     * Sets the value of the publicDiscussionFacet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionFacetRef }
     *     
     */
    public void setPublicDiscussionFacet(ZfcsPublicDiscussionFacetRef value) {
        this.publicDiscussionFacet = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionAuthorType }
     *     
     */
    public ZfcsPublicDiscussionAuthorType getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionAuthorType }
     *     
     */
    public void setAuthor(ZfcsPublicDiscussionAuthorType value) {
        this.author = value;
    }

    /**
     * Gets the value of the commentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCommentNumber() {
        return commentNumber;
    }

    /**
     * Sets the value of the commentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCommentNumber(BigInteger value) {
        this.commentNumber = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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

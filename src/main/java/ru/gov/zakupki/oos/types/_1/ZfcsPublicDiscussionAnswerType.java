//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
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
 * Ответ на комментарий ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionAnswerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionAnswerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="publicDiscussionPhase1Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *           &lt;element name="publicDiscussionPhase2Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *         &lt;/choice>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="publicDiscussionStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionStage"/>
 *         &lt;element name="objectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="commentNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="comment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="author" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionAuthorType"/>
 *         &lt;element name="docPremoderationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="answerNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="answer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="docAnswerPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_publicDiscussionAnswerType", propOrder = {
    "id",
    "externalId",
    "publicDiscussionPhase1Num",
    "publicDiscussionPhase2Num",
    "versionNumber",
    "docPublishDate",
    "publicDiscussionStage",
    "objectInfo",
    "commentNumber",
    "comment",
    "author",
    "docPremoderationDate",
    "answerNumber",
    "answer",
    "docAnswerPublishDate",
    "attachments",
    "extPrintForm"
})
public class ZfcsPublicDiscussionAnswerType {

    protected Long id;
    protected String externalId;
    protected String publicDiscussionPhase1Num;
    protected String publicDiscussionPhase2Num;
    protected String versionNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(required = true)
    protected String publicDiscussionStage;
    @XmlElement(required = true)
    protected String objectInfo;
    @XmlElement(required = true)
    protected BigInteger commentNumber;
    protected String comment;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionAuthorType author;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPremoderationDate;
    @XmlElement(required = true)
    protected BigInteger answerNumber;
    @XmlElement(required = true)
    protected String answer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docAnswerPublishDate;
    protected ZfcsAttachmentListType attachments;
    protected ZfcsExtPrintFormType extPrintForm;
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
     * Gets the value of the publicDiscussionStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicDiscussionStage() {
        return publicDiscussionStage;
    }

    /**
     * Sets the value of the publicDiscussionStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDiscussionStage(String value) {
        this.publicDiscussionStage = value;
    }

    /**
     * Gets the value of the objectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectInfo() {
        return objectInfo;
    }

    /**
     * Sets the value of the objectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectInfo(String value) {
        this.objectInfo = value;
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
     * Gets the value of the answerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnswerNumber() {
        return answerNumber;
    }

    /**
     * Sets the value of the answerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnswerNumber(BigInteger value) {
        this.answerNumber = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * Gets the value of the docAnswerPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocAnswerPublishDate() {
        return docAnswerPublishDate;
    }

    /**
     * Sets the value of the docAnswerPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocAnswerPublishDate(XMLGregorianCalendar value) {
        this.docAnswerPublishDate = value;
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

}

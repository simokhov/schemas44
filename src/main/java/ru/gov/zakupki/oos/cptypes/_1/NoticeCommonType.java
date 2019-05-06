//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.common._1.ExtPrintFormType;
import ru.gov.zakupki.oos.common._1.PrintFormType;


/**
 * Тип: Общий тип для уведомлений
 * 
 * <p>Java class for noticeCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="noticeCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="parentVersionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}contractProjNumType"/>
 *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}contractProjDocNumType" minOccurs="0"/>
 *                   &lt;element name="publishDTInETP" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="participantInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}participantType"/>
 *         &lt;element name="noticeText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/common/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/common/1}extPrintFormType"/>
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
@XmlType(name = "noticeCommonType", propOrder = {
    "id",
    "externalId",
    "parentVersionNumber",
    "commonInfo",
    "participantInfo",
    "noticeText",
    "printFormInfo",
    "extPrintFormInfo"
})
@XmlSeeAlso({
    NoticeEvasionType.class,
    NoticeDeviationType.class
})
public class NoticeCommonType {

    protected Long id;
    protected String externalId;
    protected int parentVersionNumber;
    @XmlElement(required = true)
    protected NoticeCommonType.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected ParticipantType participantInfo;
    @XmlElement(required = true)
    protected String noticeText;
    protected PrintFormType printFormInfo;
    @XmlElement(required = true)
    protected ExtPrintFormType extPrintFormInfo;
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
     * Gets the value of the parentVersionNumber property.
     * 
     */
    public int getParentVersionNumber() {
        return parentVersionNumber;
    }

    /**
     * Sets the value of the parentVersionNumber property.
     * 
     */
    public void setParentVersionNumber(int value) {
        this.parentVersionNumber = value;
    }

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeCommonType.CommonInfo }
     *     
     */
    public NoticeCommonType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeCommonType.CommonInfo }
     *     
     */
    public void setCommonInfo(NoticeCommonType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the participantInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantType }
     *     
     */
    public ParticipantType getParticipantInfo() {
        return participantInfo;
    }

    /**
     * Sets the value of the participantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantType }
     *     
     */
    public void setParticipantInfo(ParticipantType value) {
        this.participantInfo = value;
    }

    /**
     * Gets the value of the noticeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeText() {
        return noticeText;
    }

    /**
     * Sets the value of the noticeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeText(String value) {
        this.noticeText = value;
    }

    /**
     * Gets the value of the printFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrintFormType }
     *     
     */
    public PrintFormType getPrintFormInfo() {
        return printFormInfo;
    }

    /**
     * Sets the value of the printFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintFormType }
     *     
     */
    public void setPrintFormInfo(PrintFormType value) {
        this.printFormInfo = value;
    }

    /**
     * Gets the value of the extPrintFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPrintFormType }
     *     
     */
    public ExtPrintFormType getExtPrintFormInfo() {
        return extPrintFormInfo;
    }

    /**
     * Sets the value of the extPrintFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPrintFormType }
     *     
     */
    public void setExtPrintFormInfo(ExtPrintFormType value) {
        this.extPrintFormInfo = value;
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
     *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}contractProjNumType"/>
     *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}contractProjDocNumType" minOccurs="0"/>
     *         &lt;element name="publishDTInETP" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "number",
        "docNumber",
        "publishDTInETP"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        protected String number;
        protected String docNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDTInETP;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
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
         * Gets the value of the publishDTInETP property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishDTInETP() {
            return publishDTInETP;
        }

        /**
         * Sets the value of the publishDTInETP property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishDTInETP(XMLGregorianCalendar value) {
            this.publishDTInETP = value;
        }

    }

}

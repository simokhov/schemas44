//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:36 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о первом этапе обязательного общественного обсуждения крупной закупки (ООКЗ)
 * 
 * <p>Java class for zfcs_publicDiscussionLargePurchasePhase1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionLargePurchasePhase1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionCommonInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="publicDiscussionPhase1Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phase1" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPhase1Type"/>
 *         &lt;element name="attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attachment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
 *                           &lt;sequence>
 *                             &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_publicDiscussionLargePurchasePhase1Type", propOrder = {
    "commonInfo",
    "phase1",
    "attachments",
    "printForm",
    "extPrintForm"
})
public class ZfcsPublicDiscussionLargePurchasePhase1Type {

    @XmlElement(required = true)
    protected ZfcsPublicDiscussionLargePurchasePhase1Type.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionPhase1Type phase1;
    protected ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments attachments;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionLargePurchasePhase1Type.CommonInfo }
     *     
     */
    public ZfcsPublicDiscussionLargePurchasePhase1Type.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionLargePurchasePhase1Type.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsPublicDiscussionLargePurchasePhase1Type.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the phase1 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase1Type }
     *     
     */
    public ZfcsPublicDiscussionPhase1Type getPhase1() {
        return phase1;
    }

    /**
     * Sets the value of the phase1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase1Type }
     *     
     */
    public void setPhase1(ZfcsPublicDiscussionPhase1Type value) {
        this.phase1 = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments }
     *     
     */
    public ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments }
     *     
     */
    public void setAttachments(ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments value) {
        this.attachments = value;
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
     *         &lt;element name="attachment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
     *                 &lt;sequence>
     *                   &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "attachment"
    })
    public static class Attachments {

        @XmlElement(required = true)
        protected List<ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments.Attachment> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments.Attachment }
         * 
         * 
         */
        public List<ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<ZfcsPublicDiscussionLargePurchasePhase1Type.Attachments.Attachment>();
            }
            return this.attachment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
         *       &lt;sequence>
         *         &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "placingDate"
        })
        public static class Attachment
            extends ZfcsAttachmentType
        {

            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar placingDate;

            /**
             * Gets the value of the placingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPlacingDate() {
                return placingDate;
            }

            /**
             * Sets the value of the placingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPlacingDate(XMLGregorianCalendar value) {
                this.placingDate = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionCommonInfoType">
     *       &lt;sequence>
     *         &lt;element name="publicDiscussionPhase1Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publicDiscussionPhase1Num"
    })
    public static class CommonInfo
        extends ZfcsPublicDiscussionCommonInfoType
    {

        protected String publicDiscussionPhase1Num;

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

    }

}

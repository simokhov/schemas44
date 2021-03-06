//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
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
 * Анкета ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="publicDiscussionPhase1Num" type="{http://zakupki.gov.ru/oos/base/1}publicDiscussionNumType"/>
 *           &lt;element name="publicDiscussionPhase2Num" type="{http://zakupki.gov.ru/oos/base/1}publicDiscussionNumType"/>
 *         &lt;/choice>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="formNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFormNumberType"/>
 *         &lt;element name="author" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionAuthorType"/>
 *         &lt;element name="publicDiscussionFacets">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publicDiscussionFacet" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFacetRef">
 *                           &lt;sequence>
 *                             &lt;element name="publicDiscussionQuestion" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
 *                                     &lt;sequence>
 *                                       &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                                       &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlType(name = "zfcs_publicDiscussionFormType", propOrder = {
    "externalId",
    "id",
    "publicDiscussionPhase1Num",
    "publicDiscussionPhase2Num",
    "versionNumber",
    "docPublishDate",
    "formNumber",
    "author",
    "publicDiscussionFacets"
})
public class ZfcsPublicDiscussionFormType {

    protected String externalId;
    protected Long id;
    protected String publicDiscussionPhase1Num;
    protected String publicDiscussionPhase2Num;
    protected String versionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(required = true)
    protected String formNumber;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionAuthorType author;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionFormType.PublicDiscussionFacets publicDiscussionFacets;
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
     * Gets the value of the formNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNumber() {
        return formNumber;
    }

    /**
     * Sets the value of the formNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNumber(String value) {
        this.formNumber = value;
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
     * Gets the value of the publicDiscussionFacets property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets }
     *     
     */
    public ZfcsPublicDiscussionFormType.PublicDiscussionFacets getPublicDiscussionFacets() {
        return publicDiscussionFacets;
    }

    /**
     * Sets the value of the publicDiscussionFacets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets }
     *     
     */
    public void setPublicDiscussionFacets(ZfcsPublicDiscussionFormType.PublicDiscussionFacets value) {
        this.publicDiscussionFacets = value;
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
     *         &lt;element name="publicDiscussionFacet" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFacetRef">
     *                 &lt;sequence>
     *                   &lt;element name="publicDiscussionQuestion" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
     *                           &lt;sequence>
     *                             &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                             &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "publicDiscussionFacet"
    })
    public static class PublicDiscussionFacets {

        @XmlElement(required = true)
        protected List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet> publicDiscussionFacet;

        /**
         * Gets the value of the publicDiscussionFacet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publicDiscussionFacet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublicDiscussionFacet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet }
         * 
         * 
         */
        public List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet> getPublicDiscussionFacet() {
            if (publicDiscussionFacet == null) {
                publicDiscussionFacet = new ArrayList<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet>();
            }
            return this.publicDiscussionFacet;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFacetRef">
         *       &lt;sequence>
         *         &lt;element name="publicDiscussionQuestion" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
         *                 &lt;sequence>
         *                   &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *                   &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "publicDiscussionQuestion"
        })
        public static class PublicDiscussionFacet
            extends ZfcsPublicDiscussionFacetRef
        {

            @XmlElement(required = true)
            protected List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion> publicDiscussionQuestion;

            /**
             * Gets the value of the publicDiscussionQuestion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the publicDiscussionQuestion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPublicDiscussionQuestion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion }
             * 
             * 
             */
            public List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion> getPublicDiscussionQuestion() {
                if (publicDiscussionQuestion == null) {
                    publicDiscussionQuestion = new ArrayList<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion>();
                }
                return this.publicDiscussionQuestion;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
             *       &lt;sequence>
             *         &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
             *         &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
                "userAnswer",
                "userComment"
            })
            public static class PublicDiscussionQuestion
                extends ZfcsPublicDiscussionQuestionRef
            {

                @XmlElement(required = true)
                protected String userAnswer;
                protected String userComment;

                /**
                 * Gets the value of the userAnswer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUserAnswer() {
                    return userAnswer;
                }

                /**
                 * Sets the value of the userAnswer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUserAnswer(String value) {
                    this.userAnswer = value;
                }

                /**
                 * Gets the value of the userComment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUserComment() {
                    return userComment;
                }

                /**
                 * Sets the value of the userComment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUserComment(String value) {
                    this.userComment = value;
                }

            }

        }

    }

}

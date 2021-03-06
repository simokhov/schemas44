//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол о несоответствии проверяемой инофрмации по ПП РФ № 615
 * 
 * <p>Java class for contractDiscrepancyProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractDiscrepancyProtocolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/base/1}contractRegNum615Type"/>
 *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}contractDocRegNum615Type" minOccurs="0"/>
 *                   &lt;element name="docName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="discrepancyInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="authorityInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contractOrganizationInfoType"/>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}attachmentListType" minOccurs="0"/>
 *         &lt;element name="printFormFieldsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="customerInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contractOrganizationInfoType" minOccurs="0"/>
 *                             &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="docDirectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/base/1}contractNumber615Type" minOccurs="0"/>
 *                             &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *                             &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fullNameSigner" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
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
@XmlType(name = "contractDiscrepancyProtocolType", propOrder = {
    "id",
    "externalId",
    "versionNumber",
    "commonInfo",
    "authorityInfo",
    "attachmentsInfo",
    "printFormFieldsInfo"
})
public class ContractDiscrepancyProtocolType {

    protected Long id;
    protected String externalId;
    protected Integer versionNumber;
    @XmlElement(required = true)
    protected ContractDiscrepancyProtocolType.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected ContractOrganizationInfoType authorityInfo;
    protected AttachmentListType attachmentsInfo;
    protected ContractDiscrepancyProtocolType.PrintFormFieldsInfo printFormFieldsInfo;
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
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDiscrepancyProtocolType.CommonInfo }
     *     
     */
    public ContractDiscrepancyProtocolType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDiscrepancyProtocolType.CommonInfo }
     *     
     */
    public void setCommonInfo(ContractDiscrepancyProtocolType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the authorityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractOrganizationInfoType }
     *     
     */
    public ContractOrganizationInfoType getAuthorityInfo() {
        return authorityInfo;
    }

    /**
     * Sets the value of the authorityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractOrganizationInfoType }
     *     
     */
    public void setAuthorityInfo(ContractOrganizationInfoType value) {
        this.authorityInfo = value;
    }

    /**
     * Gets the value of the attachmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListType }
     *     
     */
    public AttachmentListType getAttachmentsInfo() {
        return attachmentsInfo;
    }

    /**
     * Sets the value of the attachmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListType }
     *     
     */
    public void setAttachmentsInfo(AttachmentListType value) {
        this.attachmentsInfo = value;
    }

    /**
     * Gets the value of the printFormFieldsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDiscrepancyProtocolType.PrintFormFieldsInfo }
     *     
     */
    public ContractDiscrepancyProtocolType.PrintFormFieldsInfo getPrintFormFieldsInfo() {
        return printFormFieldsInfo;
    }

    /**
     * Sets the value of the printFormFieldsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDiscrepancyProtocolType.PrintFormFieldsInfo }
     *     
     */
    public void setPrintFormFieldsInfo(ContractDiscrepancyProtocolType.PrintFormFieldsInfo value) {
        this.printFormFieldsInfo = value;
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
     *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/base/1}contractRegNum615Type"/>
     *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}contractDocRegNum615Type" minOccurs="0"/>
     *         &lt;element name="docName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="discrepancyInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
        "regNum",
        "docNumber",
        "docName",
        "docPublishDate",
        "discrepancyInfo"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        protected String regNum;
        protected String docNumber;
        @XmlElement(required = true)
        protected String docName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar docPublishDate;
        @XmlElement(required = true)
        protected String discrepancyInfo;

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
         * Gets the value of the docName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocName() {
            return docName;
        }

        /**
         * Sets the value of the docName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocName(String value) {
            this.docName = value;
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
         * Gets the value of the discrepancyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscrepancyInfo() {
            return discrepancyInfo;
        }

        /**
         * Sets the value of the discrepancyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscrepancyInfo(String value) {
            this.discrepancyInfo = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contractInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="customerInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contractOrganizationInfoType" minOccurs="0"/>
     *                   &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="docDirectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/base/1}contractNumber615Type" minOccurs="0"/>
     *                   &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
     *                   &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fullNameSigner" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
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
        "contractInfo",
        "fullNameSigner"
    })
    public static class PrintFormFieldsInfo {

        protected ContractDiscrepancyProtocolType.PrintFormFieldsInfo.ContractInfo contractInfo;
        protected String fullNameSigner;

        /**
         * Gets the value of the contractInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContractDiscrepancyProtocolType.PrintFormFieldsInfo.ContractInfo }
         *     
         */
        public ContractDiscrepancyProtocolType.PrintFormFieldsInfo.ContractInfo getContractInfo() {
            return contractInfo;
        }

        /**
         * Sets the value of the contractInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractDiscrepancyProtocolType.PrintFormFieldsInfo.ContractInfo }
         *     
         */
        public void setContractInfo(ContractDiscrepancyProtocolType.PrintFormFieldsInfo.ContractInfo value) {
            this.contractInfo = value;
        }

        /**
         * Gets the value of the fullNameSigner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullNameSigner() {
            return fullNameSigner;
        }

        /**
         * Sets the value of the fullNameSigner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullNameSigner(String value) {
            this.fullNameSigner = value;
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
         *         &lt;element name="customerInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contractOrganizationInfoType" minOccurs="0"/>
         *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="docDirectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/base/1}contractNumber615Type" minOccurs="0"/>
         *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
         *         &lt;element name="editionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "customerInfo",
            "signDate",
            "docDirectDate",
            "contractNumber",
            "versionNumber",
            "editionNumber"
        })
        public static class ContractInfo {

            protected ContractOrganizationInfoType customerInfo;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar signDate;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar docDirectDate;
            protected String contractNumber;
            protected Integer versionNumber;
            protected Integer editionNumber;

            /**
             * Gets the value of the customerInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ContractOrganizationInfoType }
             *     
             */
            public ContractOrganizationInfoType getCustomerInfo() {
                return customerInfo;
            }

            /**
             * Sets the value of the customerInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContractOrganizationInfoType }
             *     
             */
            public void setCustomerInfo(ContractOrganizationInfoType value) {
                this.customerInfo = value;
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
             * Gets the value of the docDirectDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDocDirectDate() {
                return docDirectDate;
            }

            /**
             * Sets the value of the docDirectDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDocDirectDate(XMLGregorianCalendar value) {
                this.docDirectDate = value;
            }

            /**
             * Gets the value of the contractNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractNumber() {
                return contractNumber;
            }

            /**
             * Sets the value of the contractNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractNumber(String value) {
                this.contractNumber = value;
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
             * Gets the value of the editionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEditionNumber() {
                return editionNumber;
            }

            /**
             * Sets the value of the editionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEditionNumber(Integer value) {
                this.editionNumber = value;
            }

        }

    }

}

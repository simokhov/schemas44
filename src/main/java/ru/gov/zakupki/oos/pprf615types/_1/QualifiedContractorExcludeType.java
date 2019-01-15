//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.ExclusionReason615Ref;
import ru.gov.zakupki.oos.base._1.OrganizationRef;


/**
 * Сведения об исключении квалифицированной подрядной организации из РКПО по ПП РФ № 615
 * 
 * <p>Java class for qualifiedContractorExcludeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualifiedContractorExcludeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}registryCommonInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}attachmentListType" minOccurs="0"/>
 *         &lt;element name="exclusionReasons">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="exclusionReason" type="{http://zakupki.gov.ru/oos/base/1}exclusionReason615Ref" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printFormFieldsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="keepingRegisterOrg" type="{http://zakupki.gov.ru/oos/base/1}organizationRef" minOccurs="0"/>
 *                   &lt;element name="contractorInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType"/>
 *                             &lt;choice>
 *                               &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                               &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
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
@XmlType(name = "qualifiedContractorExcludeType", propOrder = {
    "id",
    "externalId",
    "commonInfo",
    "printFormInfo",
    "extPrintFormInfo",
    "attachmentsInfo",
    "exclusionReasons",
    "printFormFieldsInfo"
})
public class QualifiedContractorExcludeType {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected QualifiedContractorExcludeType.CommonInfo commonInfo;
    protected PrintFormType printFormInfo;
    protected ExtPrintFormType extPrintFormInfo;
    protected AttachmentListType attachmentsInfo;
    @XmlElement(required = true)
    protected QualifiedContractorExcludeType.ExclusionReasons exclusionReasons;
    protected QualifiedContractorExcludeType.PrintFormFieldsInfo printFormFieldsInfo;
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
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedContractorExcludeType.CommonInfo }
     *     
     */
    public QualifiedContractorExcludeType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedContractorExcludeType.CommonInfo }
     *     
     */
    public void setCommonInfo(QualifiedContractorExcludeType.CommonInfo value) {
        this.commonInfo = value;
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
     * Gets the value of the exclusionReasons property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedContractorExcludeType.ExclusionReasons }
     *     
     */
    public QualifiedContractorExcludeType.ExclusionReasons getExclusionReasons() {
        return exclusionReasons;
    }

    /**
     * Sets the value of the exclusionReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedContractorExcludeType.ExclusionReasons }
     *     
     */
    public void setExclusionReasons(QualifiedContractorExcludeType.ExclusionReasons value) {
        this.exclusionReasons = value;
    }

    /**
     * Gets the value of the printFormFieldsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedContractorExcludeType.PrintFormFieldsInfo }
     *     
     */
    public QualifiedContractorExcludeType.PrintFormFieldsInfo getPrintFormFieldsInfo() {
        return printFormFieldsInfo;
    }

    /**
     * Sets the value of the printFormFieldsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedContractorExcludeType.PrintFormFieldsInfo }
     *     
     */
    public void setPrintFormFieldsInfo(QualifiedContractorExcludeType.PrintFormFieldsInfo value) {
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}registryCommonInfoType">
     *       &lt;sequence>
     *         &lt;element name="protocolNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "protocolNumber",
        "protocolSignDate"
    })
    public static class CommonInfo
        extends RegistryCommonInfoType
    {

        protected String protocolNumber;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar protocolSignDate;

        /**
         * Gets the value of the protocolNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolNumber() {
            return protocolNumber;
        }

        /**
         * Sets the value of the protocolNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolNumber(String value) {
            this.protocolNumber = value;
        }

        /**
         * Gets the value of the protocolSignDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProtocolSignDate() {
            return protocolSignDate;
        }

        /**
         * Sets the value of the protocolSignDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setProtocolSignDate(XMLGregorianCalendar value) {
            this.protocolSignDate = value;
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
     *         &lt;element name="exclusionReason" type="{http://zakupki.gov.ru/oos/base/1}exclusionReason615Ref" maxOccurs="unbounded"/>
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
        "exclusionReason"
    })
    public static class ExclusionReasons {

        @XmlElement(required = true)
        protected List<ExclusionReason615Ref> exclusionReason;

        /**
         * Gets the value of the exclusionReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exclusionReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExclusionReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExclusionReason615Ref }
         * 
         * 
         */
        public List<ExclusionReason615Ref> getExclusionReason() {
            if (exclusionReason == null) {
                exclusionReason = new ArrayList<ExclusionReason615Ref>();
            }
            return this.exclusionReason;
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
     *         &lt;element name="keepingRegisterOrg" type="{http://zakupki.gov.ru/oos/base/1}organizationRef" minOccurs="0"/>
     *         &lt;element name="contractorInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType"/>
     *                   &lt;choice>
     *                     &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *                     &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
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
        "keepingRegisterOrg",
        "contractorInfo"
    })
    public static class PrintFormFieldsInfo {

        protected OrganizationRef keepingRegisterOrg;
        protected QualifiedContractorExcludeType.PrintFormFieldsInfo.ContractorInfo contractorInfo;

        /**
         * Gets the value of the keepingRegisterOrg property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getKeepingRegisterOrg() {
            return keepingRegisterOrg;
        }

        /**
         * Sets the value of the keepingRegisterOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setKeepingRegisterOrg(OrganizationRef value) {
            this.keepingRegisterOrg = value;
        }

        /**
         * Gets the value of the contractorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedContractorExcludeType.PrintFormFieldsInfo.ContractorInfo }
         *     
         */
        public QualifiedContractorExcludeType.PrintFormFieldsInfo.ContractorInfo getContractorInfo() {
            return contractorInfo;
        }

        /**
         * Sets the value of the contractorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedContractorExcludeType.PrintFormFieldsInfo.ContractorInfo }
         *     
         */
        public void setContractorInfo(QualifiedContractorExcludeType.PrintFormFieldsInfo.ContractorInfo value) {
            this.contractorInfo = value;
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
         *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType"/>
         *         &lt;choice>
         *           &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
         *           &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType"/>
         *         &lt;/choice>
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
            "inn",
            "fullName",
            "nameInfo"
        })
        public static class ContractorInfo {

            @XmlElement(name = "INN", required = true)
            protected String inn;
            protected String fullName;
            protected PersonType nameInfo;

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINN(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the fullName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * Sets the value of the fullName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

            /**
             * Gets the value of the nameInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PersonType }
             *     
             */
            public PersonType getNameInfo() {
                return nameInfo;
            }

            /**
             * Sets the value of the nameInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonType }
             *     
             */
            public void setNameInfo(PersonType value) {
                this.nameInfo = value;
            }

        }

    }

}

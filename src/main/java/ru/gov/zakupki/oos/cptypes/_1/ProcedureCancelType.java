//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.CurrencyRef;
import ru.gov.zakupki.oos.base._1.OrganizationRef;
import ru.gov.zakupki.oos.base._1.PlacerRoleContractProjectEnum;
import ru.gov.zakupki.oos.common._1.ExtPrintFormType;
import ru.gov.zakupki.oos.common._1.PersonType;
import ru.gov.zakupki.oos.common._1.PrintFormType;


/**
 * Тип: Извещение об отмене процедуры заключения контракта
 * 
 * <p>Java class for procedureCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="procedureCancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}commonInfoType"/>
 *         &lt;element name="placerInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/base/1}organizationRef"/>
 *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/base/1}placerRoleContractProjectEnum"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancelInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}cancelType"/>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/common/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/common/1}extPrintFormType" minOccurs="0"/>
 *         &lt;element name="printFormFieldsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="contractProjectInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                             &lt;element name="participantInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice minOccurs="0">
 *                                       &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                                       &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="subject" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="currency" type="{http://zakupki.gov.ru/oos/base/1}currencyRef" minOccurs="0"/>
 *                             &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumberType" minOccurs="0"/>
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
@XmlType(name = "procedureCancelType", propOrder = {
    "id",
    "externalId",
    "commonInfo",
    "placerInfo",
    "cancelInfo",
    "printFormInfo",
    "extPrintFormInfo",
    "printFormFieldsInfo"
})
public class ProcedureCancelType {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected CommonInfoType commonInfo;
    @XmlElement(required = true)
    protected ProcedureCancelType.PlacerInfo placerInfo;
    @XmlElement(required = true)
    protected CancelType cancelInfo;
    protected PrintFormType printFormInfo;
    protected ExtPrintFormType extPrintFormInfo;
    protected ProcedureCancelType.PrintFormFieldsInfo printFormFieldsInfo;
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
     *     {@link CommonInfoType }
     *     
     */
    public CommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInfoType }
     *     
     */
    public void setCommonInfo(CommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the placerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCancelType.PlacerInfo }
     *     
     */
    public ProcedureCancelType.PlacerInfo getPlacerInfo() {
        return placerInfo;
    }

    /**
     * Sets the value of the placerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCancelType.PlacerInfo }
     *     
     */
    public void setPlacerInfo(ProcedureCancelType.PlacerInfo value) {
        this.placerInfo = value;
    }

    /**
     * Gets the value of the cancelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CancelType }
     *     
     */
    public CancelType getCancelInfo() {
        return cancelInfo;
    }

    /**
     * Sets the value of the cancelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelType }
     *     
     */
    public void setCancelInfo(CancelType value) {
        this.cancelInfo = value;
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
     * Gets the value of the printFormFieldsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCancelType.PrintFormFieldsInfo }
     *     
     */
    public ProcedureCancelType.PrintFormFieldsInfo getPrintFormFieldsInfo() {
        return printFormFieldsInfo;
    }

    /**
     * Sets the value of the printFormFieldsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCancelType.PrintFormFieldsInfo }
     *     
     */
    public void setPrintFormFieldsInfo(ProcedureCancelType.PrintFormFieldsInfo value) {
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
     *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/base/1}organizationRef"/>
     *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/base/1}placerRoleContractProjectEnum"/>
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
        "responsibleOrg",
        "responsibleRole"
    })
    public static class PlacerInfo {

        @XmlElement(required = true)
        protected OrganizationRef responsibleOrg;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected PlacerRoleContractProjectEnum responsibleRole;

        /**
         * Gets the value of the responsibleOrg property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getResponsibleOrg() {
            return responsibleOrg;
        }

        /**
         * Sets the value of the responsibleOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setResponsibleOrg(OrganizationRef value) {
            this.responsibleOrg = value;
        }

        /**
         * Gets the value of the responsibleRole property.
         * 
         * @return
         *     possible object is
         *     {@link PlacerRoleContractProjectEnum }
         *     
         */
        public PlacerRoleContractProjectEnum getResponsibleRole() {
            return responsibleRole;
        }

        /**
         * Sets the value of the responsibleRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlacerRoleContractProjectEnum }
         *     
         */
        public void setResponsibleRole(PlacerRoleContractProjectEnum value) {
            this.responsibleRole = value;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="contractProjectInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *                   &lt;element name="participantInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice minOccurs="0">
     *                             &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *                             &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="subject" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/base/1}currencyRef" minOccurs="0"/>
     *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumberType" minOccurs="0"/>
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
        "contractProjectInfo"
    })
    public static class PrintFormFieldsInfo {

        protected ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo contractProjectInfo;

        /**
         * Gets the value of the contractProjectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo }
         *     
         */
        public ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo getContractProjectInfo() {
            return contractProjectInfo;
        }

        /**
         * Sets the value of the contractProjectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo }
         *     
         */
        public void setContractProjectInfo(ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo value) {
            this.contractProjectInfo = value;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
         *         &lt;element name="participantInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice minOccurs="0">
         *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
         *                   &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="subject" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
         *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/base/1}currencyRef" minOccurs="0"/>
         *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumberType" minOccurs="0"/>
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
            "fullName",
            "participantInfo",
            "subject",
            "price",
            "currency",
            "purchaseNumber"
        })
        public static class ContractProjectInfo {

            protected String fullName;
            protected ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo.ParticipantInfo participantInfo;
            protected String subject;
            protected String price;
            protected CurrencyRef currency;
            protected String purchaseNumber;

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
             * Gets the value of the participantInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo.ParticipantInfo }
             *     
             */
            public ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo.ParticipantInfo getParticipantInfo() {
                return participantInfo;
            }

            /**
             * Sets the value of the participantInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo.ParticipantInfo }
             *     
             */
            public void setParticipantInfo(ProcedureCancelType.PrintFormFieldsInfo.ContractProjectInfo.ParticipantInfo value) {
                this.participantInfo = value;
            }

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrice(String value) {
                this.price = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyRef }
             *     
             */
            public CurrencyRef getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyRef }
             *     
             */
            public void setCurrency(CurrencyRef value) {
                this.currency = value;
            }

            /**
             * Gets the value of the purchaseNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseNumber() {
                return purchaseNumber;
            }

            /**
             * Sets the value of the purchaseNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseNumber(String value) {
                this.purchaseNumber = value;
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
             *       &lt;choice minOccurs="0">
             *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
             *         &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fullName",
                "nameInfo"
            })
            public static class ParticipantInfo {

                protected String fullName;
                protected PersonType nameInfo;

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

}
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
import ru.gov.zakupki.oos.base._1.ChangePriceFoundationRef;
import ru.gov.zakupki.oos.base._1.CurrencyRef;
import ru.gov.zakupki.oos.base._1.ETPRef;
import ru.gov.zakupki.oos.base._1.OrganizationRef;
import ru.gov.zakupki.oos.base._1.PlacerRoleContractProjectEnum;
import ru.gov.zakupki.oos.base._1.PlacingWayRef;
import ru.gov.zakupki.oos.common._1.OrganizationType;
import ru.gov.zakupki.oos.common._1.PrintFormType;


/**
 * Тип: Общий тип для проекта контракта
 * 
 * <p>Java class for contractProjectCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractProjectCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *         &lt;element name="foundationInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumberType"/>
 *                   &lt;element name="ETP" type="{http://zakupki.gov.ru/oos/base/1}ETPRef" minOccurs="0"/>
 *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/base/1}placingWayRef" minOccurs="0"/>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
 *                   &lt;element name="protocolInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}docNameType"/>
 *                             &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
 *                             &lt;element name="publishDTInEIS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="customerInfo" type="{http://zakupki.gov.ru/oos/common/1}organizationType" minOccurs="0"/>
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
 *         &lt;element name="participantInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}participantType"/>
 *         &lt;element name="isSecondParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contractInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subject" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;element name="concludeContractRight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="changePriceInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="changePrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *                             &lt;element name="changePriceFoundation" type="{http://zakupki.gov.ru/oos/base/1}changePriceFoundationRef"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/base/1}currencyRef" minOccurs="0"/>
 *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/common/1}printFormType" minOccurs="0"/>
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
@XmlType(name = "contractProjectCommonType", propOrder = {
    "id",
    "externalId",
    "versionNumber",
    "foundationInfo",
    "customerInfo",
    "placerInfo",
    "participantInfo",
    "isSecondParticipant",
    "contractInfo",
    "printFormInfo"
})
@XmlSeeAlso({
    ContractSignType.class,
    ContractProjectType.class,
    ContractProjectChangeType.class
})
public class ContractProjectCommonType {

    protected Long id;
    protected String externalId;
    protected Integer versionNumber;
    @XmlElement(required = true)
    protected ContractProjectCommonType.FoundationInfo foundationInfo;
    protected OrganizationType customerInfo;
    @XmlElement(required = true)
    protected ContractProjectCommonType.PlacerInfo placerInfo;
    @XmlElement(required = true)
    protected ParticipantType participantInfo;
    protected Boolean isSecondParticipant;
    @XmlElement(required = true)
    protected ContractProjectCommonType.ContractInfo contractInfo;
    protected PrintFormType printFormInfo;
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
     * Gets the value of the foundationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProjectCommonType.FoundationInfo }
     *     
     */
    public ContractProjectCommonType.FoundationInfo getFoundationInfo() {
        return foundationInfo;
    }

    /**
     * Sets the value of the foundationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProjectCommonType.FoundationInfo }
     *     
     */
    public void setFoundationInfo(ContractProjectCommonType.FoundationInfo value) {
        this.foundationInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setCustomerInfo(OrganizationType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the placerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProjectCommonType.PlacerInfo }
     *     
     */
    public ContractProjectCommonType.PlacerInfo getPlacerInfo() {
        return placerInfo;
    }

    /**
     * Sets the value of the placerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProjectCommonType.PlacerInfo }
     *     
     */
    public void setPlacerInfo(ContractProjectCommonType.PlacerInfo value) {
        this.placerInfo = value;
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
     * Gets the value of the isSecondParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecondParticipant() {
        return isSecondParticipant;
    }

    /**
     * Sets the value of the isSecondParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecondParticipant(Boolean value) {
        this.isSecondParticipant = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProjectCommonType.ContractInfo }
     *     
     */
    public ContractProjectCommonType.ContractInfo getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProjectCommonType.ContractInfo }
     *     
     */
    public void setContractInfo(ContractProjectCommonType.ContractInfo value) {
        this.contractInfo = value;
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
     *         &lt;element name="subject" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *         &lt;element name="concludeContractRight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="changePriceInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="changePrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
     *                   &lt;element name="changePriceFoundation" type="{http://zakupki.gov.ru/oos/base/1}changePriceFoundationRef"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/base/1}currencyRef" minOccurs="0"/>
     *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType" minOccurs="0"/>
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
        "subject",
        "concludeContractRight",
        "changePriceInfo",
        "price",
        "currency",
        "number"
    })
    public static class ContractInfo {

        @XmlElement(required = true)
        protected String subject;
        protected Boolean concludeContractRight;
        protected ContractProjectCommonType.ContractInfo.ChangePriceInfo changePriceInfo;
        protected String price;
        protected CurrencyRef currency;
        protected String number;

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
         * Gets the value of the concludeContractRight property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isConcludeContractRight() {
            return concludeContractRight;
        }

        /**
         * Sets the value of the concludeContractRight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setConcludeContractRight(Boolean value) {
            this.concludeContractRight = value;
        }

        /**
         * Gets the value of the changePriceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContractProjectCommonType.ContractInfo.ChangePriceInfo }
         *     
         */
        public ContractProjectCommonType.ContractInfo.ChangePriceInfo getChangePriceInfo() {
            return changePriceInfo;
        }

        /**
         * Sets the value of the changePriceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractProjectCommonType.ContractInfo.ChangePriceInfo }
         *     
         */
        public void setChangePriceInfo(ContractProjectCommonType.ContractInfo.ChangePriceInfo value) {
            this.changePriceInfo = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="changePrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
         *         &lt;element name="changePriceFoundation" type="{http://zakupki.gov.ru/oos/base/1}changePriceFoundationRef"/>
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
            "changePrice",
            "changePriceFoundation"
        })
        public static class ChangePriceInfo {

            @XmlElement(required = true)
            protected String changePrice;
            @XmlElement(required = true)
            protected ChangePriceFoundationRef changePriceFoundation;

            /**
             * Gets the value of the changePrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangePrice() {
                return changePrice;
            }

            /**
             * Sets the value of the changePrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangePrice(String value) {
                this.changePrice = value;
            }

            /**
             * Gets the value of the changePriceFoundation property.
             * 
             * @return
             *     possible object is
             *     {@link ChangePriceFoundationRef }
             *     
             */
            public ChangePriceFoundationRef getChangePriceFoundation() {
                return changePriceFoundation;
            }

            /**
             * Sets the value of the changePriceFoundation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChangePriceFoundationRef }
             *     
             */
            public void setChangePriceFoundation(ChangePriceFoundationRef value) {
                this.changePriceFoundation = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumberType"/>
     *         &lt;element name="ETP" type="{http://zakupki.gov.ru/oos/base/1}ETPRef" minOccurs="0"/>
     *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/base/1}placingWayRef" minOccurs="0"/>
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
     *         &lt;element name="protocolInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}docNameType"/>
     *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
     *                   &lt;element name="publishDTInEIS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "purchaseNumber",
        "etp",
        "placingWay",
        "purchaseCode",
        "protocolInfo"
    })
    public static class FoundationInfo {

        @XmlElement(required = true)
        protected String purchaseNumber;
        @XmlElement(name = "ETP")
        protected ETPRef etp;
        protected PlacingWayRef placingWay;
        protected String purchaseCode;
        protected ContractProjectCommonType.FoundationInfo.ProtocolInfo protocolInfo;

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
         * Gets the value of the etp property.
         * 
         * @return
         *     possible object is
         *     {@link ETPRef }
         *     
         */
        public ETPRef getETP() {
            return etp;
        }

        /**
         * Sets the value of the etp property.
         * 
         * @param value
         *     allowed object is
         *     {@link ETPRef }
         *     
         */
        public void setETP(ETPRef value) {
            this.etp = value;
        }

        /**
         * Gets the value of the placingWay property.
         * 
         * @return
         *     possible object is
         *     {@link PlacingWayRef }
         *     
         */
        public PlacingWayRef getPlacingWay() {
            return placingWay;
        }

        /**
         * Sets the value of the placingWay property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlacingWayRef }
         *     
         */
        public void setPlacingWay(PlacingWayRef value) {
            this.placingWay = value;
        }

        /**
         * Gets the value of the purchaseCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseCode() {
            return purchaseCode;
        }

        /**
         * Sets the value of the purchaseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseCode(String value) {
            this.purchaseCode = value;
        }

        /**
         * Gets the value of the protocolInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContractProjectCommonType.FoundationInfo.ProtocolInfo }
         *     
         */
        public ContractProjectCommonType.FoundationInfo.ProtocolInfo getProtocolInfo() {
            return protocolInfo;
        }

        /**
         * Sets the value of the protocolInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractProjectCommonType.FoundationInfo.ProtocolInfo }
         *     
         */
        public void setProtocolInfo(ContractProjectCommonType.FoundationInfo.ProtocolInfo value) {
            this.protocolInfo = value;
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
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}docNameType"/>
         *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
         *         &lt;element name="publishDTInEIS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "name",
            "number",
            "publishDTInEIS"
        })
        public static class ProtocolInfo {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String number;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar publishDTInEIS;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

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
             * Gets the value of the publishDTInEIS property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPublishDTInEIS() {
                return publishDTInEIS;
            }

            /**
             * Sets the value of the publishDTInEIS property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPublishDTInEIS(XMLGregorianCalendar value) {
                this.publishDTInEIS = value;
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

}

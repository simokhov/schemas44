//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:36 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация об аннулировании контракта с 01.01.2015
 * 
 * <p>Java class for zfcs_contractCancel2015Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractCancel2015Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documentBase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="currentContractStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.contractStageType" minOccurs="0"/>
 *         &lt;element name="contractPrintFormInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.Number2015Type" minOccurs="0"/>
 *                   &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="customer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef">
 *                           &lt;sequence>
 *                             &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                             &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
 *                             &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                             &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
 *                             &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType" minOccurs="0"/>
 *                             &lt;element name="customerCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="signName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionContract2015Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractCancel2015Type", propOrder = {
    "regNum",
    "cancelDate",
    "publishDate",
    "documentBase",
    "currentContractStage",
    "contractPrintFormInfo"
})
public class ZfcsContractCancel2015Type {

    @XmlElement(required = true)
    protected String regNum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected String documentBase;
    @XmlSchemaType(name = "string")
    protected ZfcsContractContractStageType currentContractStage;
    protected ZfcsContractCancel2015Type.ContractPrintFormInfo contractPrintFormInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

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
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
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
     * Gets the value of the documentBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentBase() {
        return documentBase;
    }

    /**
     * Sets the value of the documentBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentBase(String value) {
        this.documentBase = value;
    }

    /**
     * Gets the value of the currentContractStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public ZfcsContractContractStageType getCurrentContractStage() {
        return currentContractStage;
    }

    /**
     * Sets the value of the currentContractStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public void setCurrentContractStage(ZfcsContractContractStageType value) {
        this.currentContractStage = value;
    }

    /**
     * Gets the value of the contractPrintFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractCancel2015Type.ContractPrintFormInfo }
     *     
     */
    public ZfcsContractCancel2015Type.ContractPrintFormInfo getContractPrintFormInfo() {
        return contractPrintFormInfo;
    }

    /**
     * Sets the value of the contractPrintFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractCancel2015Type.ContractPrintFormInfo }
     *     
     */
    public void setContractPrintFormInfo(ZfcsContractCancel2015Type.ContractPrintFormInfo value) {
        this.contractPrintFormInfo = value;
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
     *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.Number2015Type" minOccurs="0"/>
     *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="customer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef">
     *                 &lt;sequence>
     *                   &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
     *                   &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *                   &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
     *                   &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType" minOccurs="0"/>
     *                   &lt;element name="customerCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="signName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "signDate",
        "customer",
        "signName"
    })
    public static class ContractPrintFormInfo {

        protected String number;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signDate;
        protected ZfcsContractCancel2015Type.ContractPrintFormInfo.Customer customer;
        protected String signName;

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
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractCancel2015Type.ContractPrintFormInfo.Customer }
         *     
         */
        public ZfcsContractCancel2015Type.ContractPrintFormInfo.Customer getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractCancel2015Type.ContractPrintFormInfo.Customer }
         *     
         */
        public void setCustomer(ZfcsContractCancel2015Type.ContractPrintFormInfo.Customer value) {
            this.customer = value;
        }

        /**
         * Gets the value of the signName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignName() {
            return signName;
        }

        /**
         * Sets the value of the signName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignName(String value) {
            this.signName = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef">
         *       &lt;sequence>
         *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
         *         &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
         *         &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}okopfType" minOccurs="0"/>
         *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType" minOccurs="0"/>
         *         &lt;element name="customerCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikuType" minOccurs="0"/>
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
            "shortName",
            "registrationDate",
            "inn",
            "kpp",
            "legalForm",
            "okpo",
            "customerCode"
        })
        public static class Customer
            extends ZfcsOrganizationRef
        {

            protected String shortName;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar registrationDate;
            protected String inn;
            protected String kpp;
            protected OkopfType legalForm;
            @XmlElement(name = "OKPO")
            protected String okpo;
            protected String customerCode;

            /**
             * Gets the value of the shortName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortName() {
                return shortName;
            }

            /**
             * Sets the value of the shortName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortName(String value) {
                this.shortName = value;
            }

            /**
             * Gets the value of the registrationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRegistrationDate() {
                return registrationDate;
            }

            /**
             * Sets the value of the registrationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRegistrationDate(XMLGregorianCalendar value) {
                this.registrationDate = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
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
            public void setInn(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKpp() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKpp(String value) {
                this.kpp = value;
            }

            /**
             * Gets the value of the legalForm property.
             * 
             * @return
             *     possible object is
             *     {@link OkopfType }
             *     
             */
            public OkopfType getLegalForm() {
                return legalForm;
            }

            /**
             * Sets the value of the legalForm property.
             * 
             * @param value
             *     allowed object is
             *     {@link OkopfType }
             *     
             */
            public void setLegalForm(OkopfType value) {
                this.legalForm = value;
            }

            /**
             * Gets the value of the okpo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOKPO() {
                return okpo;
            }

            /**
             * Sets the value of the okpo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOKPO(String value) {
                this.okpo = value;
            }

            /**
             * Gets the value of the customerCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerCode() {
                return customerCode;
            }

            /**
             * Sets the value of the customerCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerCode(String value) {
                this.customerCode = value;
            }

        }

    }

}

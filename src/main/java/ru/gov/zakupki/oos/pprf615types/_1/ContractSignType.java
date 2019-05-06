//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
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
 * Сведения о заключенном в электронной форме на ЭП договоре оказания услуг и (или) выполнения работ по капитальному ремонту общего имущества в многоквартирном доме по ПП РФ № 615
 * 
 * <p>Java class for contractSignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractSignType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumber615Type"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/base/1}contractNumber615Type" minOccurs="0"/>
 *                   &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customerInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contractOrganizationInfoType"/>
 *         &lt;element name="contractorInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contractorInfoType"/>
 *         &lt;element name="financesInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}extPrintFormType"/>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}attachmentListType" minOccurs="0"/>
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
@XmlType(name = "contractSignType", propOrder = {
    "commonInfo",
    "customerInfo",
    "contractorInfo",
    "financesInfo",
    "extPrintFormInfo",
    "attachmentsInfo"
})
public class ContractSignType {

    @XmlElement(required = true)
    protected ContractSignType.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected ContractOrganizationInfoType customerInfo;
    @XmlElement(required = true)
    protected ContractorInfoType contractorInfo;
    @XmlElement(required = true)
    protected ContractSignType.FinancesInfo financesInfo;
    @XmlElement(required = true)
    protected ExtPrintFormType extPrintFormInfo;
    protected AttachmentListType attachmentsInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSignType.CommonInfo }
     *     
     */
    public ContractSignType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSignType.CommonInfo }
     *     
     */
    public void setCommonInfo(ContractSignType.CommonInfo value) {
        this.commonInfo = value;
    }

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
     * Gets the value of the contractorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorInfoType }
     *     
     */
    public ContractorInfoType getContractorInfo() {
        return contractorInfo;
    }

    /**
     * Sets the value of the contractorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorInfoType }
     *     
     */
    public void setContractorInfo(ContractorInfoType value) {
        this.contractorInfo = value;
    }

    /**
     * Gets the value of the financesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSignType.FinancesInfo }
     *     
     */
    public ContractSignType.FinancesInfo getFinancesInfo() {
        return financesInfo;
    }

    /**
     * Sets the value of the financesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSignType.FinancesInfo }
     *     
     */
    public void setFinancesInfo(ContractSignType.FinancesInfo value) {
        this.financesInfo = value;
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
     *         &lt;element name="purchaseInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumber615Type"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/base/1}contractNumber615Type" minOccurs="0"/>
     *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "purchaseInfo",
        "contractNumber",
        "signDate"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        protected ContractSignType.CommonInfo.PurchaseInfo purchaseInfo;
        protected String contractNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signDate;

        /**
         * Gets the value of the purchaseInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContractSignType.CommonInfo.PurchaseInfo }
         *     
         */
        public ContractSignType.CommonInfo.PurchaseInfo getPurchaseInfo() {
            return purchaseInfo;
        }

        /**
         * Sets the value of the purchaseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractSignType.CommonInfo.PurchaseInfo }
         *     
         */
        public void setPurchaseInfo(ContractSignType.CommonInfo.PurchaseInfo value) {
            this.purchaseInfo = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumber615Type"/>
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
            "purchaseNumber"
        })
        public static class PurchaseInfo {

            @XmlElement(required = true)
            protected String purchaseNumber;

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
     *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
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
        "price"
    })
    public static class FinancesInfo {

        @XmlElement(required = true)
        protected String price;

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

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.control99._1;

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
 * Тип элемента: Ответ с данными ПФХД
 * 
 * <p>Java class for getFinancialActivityPlanResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFinancialActivityPlanResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;choice>
 *           &lt;element name="success">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                     &lt;element name="organization">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innOrganizationType"/>
 *                               &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType"/>
 *                               &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/base/1}consRegistryNumType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="requisiteElements">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="documentName">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="100"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                               &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="productPurchaseSums2001">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="main" type="{http://zakupki.gov.ru/oos/control99/1}productPurchaseSums2001YearType"/>
 *                               &lt;element name="detail" type="{http://zakupki.gov.ru/oos/control99/1}productPurchaseSums2001YearType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="violations">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="violation" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="violationsEIS">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="violationEIS" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
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
@XmlType(name = "getFinancialActivityPlanResponseType", propOrder = {
    "eventDate",
    "success",
    "violations",
    "violationsEIS"
})
public class GetFinancialActivityPlanResponseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    protected GetFinancialActivityPlanResponseType.Success success;
    protected GetFinancialActivityPlanResponseType.Violations violations;
    protected GetFinancialActivityPlanResponseType.ViolationsEIS violationsEIS;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link GetFinancialActivityPlanResponseType.Success }
     *     
     */
    public GetFinancialActivityPlanResponseType.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFinancialActivityPlanResponseType.Success }
     *     
     */
    public void setSuccess(GetFinancialActivityPlanResponseType.Success value) {
        this.success = value;
    }

    /**
     * Gets the value of the violations property.
     * 
     * @return
     *     possible object is
     *     {@link GetFinancialActivityPlanResponseType.Violations }
     *     
     */
    public GetFinancialActivityPlanResponseType.Violations getViolations() {
        return violations;
    }

    /**
     * Sets the value of the violations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFinancialActivityPlanResponseType.Violations }
     *     
     */
    public void setViolations(GetFinancialActivityPlanResponseType.Violations value) {
        this.violations = value;
    }

    /**
     * Gets the value of the violationsEIS property.
     * 
     * @return
     *     possible object is
     *     {@link GetFinancialActivityPlanResponseType.ViolationsEIS }
     *     
     */
    public GetFinancialActivityPlanResponseType.ViolationsEIS getViolationsEIS() {
        return violationsEIS;
    }

    /**
     * Sets the value of the violationsEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFinancialActivityPlanResponseType.ViolationsEIS }
     *     
     */
    public void setViolationsEIS(GetFinancialActivityPlanResponseType.ViolationsEIS value) {
        this.violationsEIS = value;
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
     *         &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *         &lt;element name="organization">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innOrganizationType"/>
     *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType"/>
     *                   &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/base/1}consRegistryNumType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="requisiteElements">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="documentName">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="productPurchaseSums2001">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="main" type="{http://zakupki.gov.ru/oos/control99/1}productPurchaseSums2001YearType"/>
     *                   &lt;element name="detail" type="{http://zakupki.gov.ru/oos/control99/1}productPurchaseSums2001YearType" maxOccurs="unbounded" minOccurs="0"/>
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
        "period",
        "organization",
        "requisiteElements",
        "productPurchaseSums2001"
    })
    public static class Success {

        protected int period;
        @XmlElement(required = true)
        protected GetFinancialActivityPlanResponseType.Success.Organization organization;
        @XmlElement(required = true)
        protected GetFinancialActivityPlanResponseType.Success.RequisiteElements requisiteElements;
        @XmlElement(required = true)
        protected GetFinancialActivityPlanResponseType.Success.ProductPurchaseSums2001 productPurchaseSums2001;

        /**
         * Gets the value of the period property.
         * 
         */
        public int getPeriod() {
            return period;
        }

        /**
         * Sets the value of the period property.
         * 
         */
        public void setPeriod(int value) {
            this.period = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link GetFinancialActivityPlanResponseType.Success.Organization }
         *     
         */
        public GetFinancialActivityPlanResponseType.Success.Organization getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetFinancialActivityPlanResponseType.Success.Organization }
         *     
         */
        public void setOrganization(GetFinancialActivityPlanResponseType.Success.Organization value) {
            this.organization = value;
        }

        /**
         * Gets the value of the requisiteElements property.
         * 
         * @return
         *     possible object is
         *     {@link GetFinancialActivityPlanResponseType.Success.RequisiteElements }
         *     
         */
        public GetFinancialActivityPlanResponseType.Success.RequisiteElements getRequisiteElements() {
            return requisiteElements;
        }

        /**
         * Sets the value of the requisiteElements property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetFinancialActivityPlanResponseType.Success.RequisiteElements }
         *     
         */
        public void setRequisiteElements(GetFinancialActivityPlanResponseType.Success.RequisiteElements value) {
            this.requisiteElements = value;
        }

        /**
         * Gets the value of the productPurchaseSums2001 property.
         * 
         * @return
         *     possible object is
         *     {@link GetFinancialActivityPlanResponseType.Success.ProductPurchaseSums2001 }
         *     
         */
        public GetFinancialActivityPlanResponseType.Success.ProductPurchaseSums2001 getProductPurchaseSums2001() {
            return productPurchaseSums2001;
        }

        /**
         * Sets the value of the productPurchaseSums2001 property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetFinancialActivityPlanResponseType.Success.ProductPurchaseSums2001 }
         *     
         */
        public void setProductPurchaseSums2001(GetFinancialActivityPlanResponseType.Success.ProductPurchaseSums2001 value) {
            this.productPurchaseSums2001 = value;
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
         *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innOrganizationType"/>
         *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType"/>
         *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/base/1}consRegistryNumType" minOccurs="0"/>
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
            "kpp",
            "consRegistryNum"
        })
        public static class Organization {

            @XmlElement(name = "INN", required = true)
            protected String inn;
            @XmlElement(name = "KPP", required = true)
            protected String kpp;
            protected String consRegistryNum;

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
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKPP() {
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
            public void setKPP(String value) {
                this.kpp = value;
            }

            /**
             * Gets the value of the consRegistryNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConsRegistryNum() {
                return consRegistryNum;
            }

            /**
             * Sets the value of the consRegistryNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConsRegistryNum(String value) {
                this.consRegistryNum = value;
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
         *         &lt;element name="main" type="{http://zakupki.gov.ru/oos/control99/1}productPurchaseSums2001YearType"/>
         *         &lt;element name="detail" type="{http://zakupki.gov.ru/oos/control99/1}productPurchaseSums2001YearType" maxOccurs="unbounded" minOccurs="0"/>
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
            "main",
            "detail"
        })
        public static class ProductPurchaseSums2001 {

            @XmlElement(required = true)
            protected ProductPurchaseSums2001YearType main;
            protected List<ProductPurchaseSums2001YearType> detail;

            /**
             * Gets the value of the main property.
             * 
             * @return
             *     possible object is
             *     {@link ProductPurchaseSums2001YearType }
             *     
             */
            public ProductPurchaseSums2001YearType getMain() {
                return main;
            }

            /**
             * Sets the value of the main property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProductPurchaseSums2001YearType }
             *     
             */
            public void setMain(ProductPurchaseSums2001YearType value) {
                this.main = value;
            }

            /**
             * Gets the value of the detail property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detail property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetail().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProductPurchaseSums2001YearType }
             * 
             * 
             */
            public List<ProductPurchaseSums2001YearType> getDetail() {
                if (detail == null) {
                    detail = new ArrayList<ProductPurchaseSums2001YearType>();
                }
                return this.detail;
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
         *         &lt;element name="documentName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "documentName",
            "publishDate",
            "version"
        })
        public static class RequisiteElements {

            @XmlElement(required = true)
            protected String documentName;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar publishDate;
            protected int version;

            /**
             * Gets the value of the documentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentName() {
                return documentName;
            }

            /**
             * Sets the value of the documentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentName(String value) {
                this.documentName = value;
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
             * Gets the value of the version property.
             * 
             */
            public int getVersion() {
                return version;
            }

            /**
             * Sets the value of the version property.
             * 
             */
            public void setVersion(int value) {
                this.version = value;
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
     *         &lt;element name="violation" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
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
        "violation"
    })
    public static class Violations {

        @XmlElement(required = true)
        protected List<TViolation> violation;

        /**
         * Gets the value of the violation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getViolation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TViolation }
         * 
         * 
         */
        public List<TViolation> getViolation() {
            if (violation == null) {
                violation = new ArrayList<TViolation>();
            }
            return this.violation;
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
     *         &lt;element name="violationEIS" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
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
        "violationEIS"
    })
    public static class ViolationsEIS {

        @XmlElement(required = true)
        protected List<TViolation> violationEIS;

        /**
         * Gets the value of the violationEIS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violationEIS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getViolationEIS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TViolation }
         * 
         * 
         */
        public List<TViolation> getViolationEIS() {
            if (violationEIS == null) {
                violationEIS = new ArrayList<TViolation>();
            }
            return this.violationEIS;
        }

    }

}

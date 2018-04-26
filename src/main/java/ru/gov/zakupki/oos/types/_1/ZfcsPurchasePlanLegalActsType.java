//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:50:10 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Реквизиты НПА, устанавливающий требования к отдельным видам товаров, работ, услуг в планах закупок
 * 
 * <p>Java class for zfcs_purchasePlanLegalActsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanLegalActsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="existInRegulationRules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="registryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesNumberType"/>
 *                   &lt;element name="actFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="actDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="actNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="paragraphs" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="missingInRegulationRules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="actDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="actNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="paragraphs" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchasePlanLegalActsType", propOrder = {
    "existInRegulationRules",
    "missingInRegulationRules"
})
public class ZfcsPurchasePlanLegalActsType {

    protected ZfcsPurchasePlanLegalActsType.ExistInRegulationRules existInRegulationRules;
    protected ZfcsPurchasePlanLegalActsType.MissingInRegulationRules missingInRegulationRules;

    /**
     * Gets the value of the existInRegulationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanLegalActsType.ExistInRegulationRules }
     *     
     */
    public ZfcsPurchasePlanLegalActsType.ExistInRegulationRules getExistInRegulationRules() {
        return existInRegulationRules;
    }

    /**
     * Sets the value of the existInRegulationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanLegalActsType.ExistInRegulationRules }
     *     
     */
    public void setExistInRegulationRules(ZfcsPurchasePlanLegalActsType.ExistInRegulationRules value) {
        this.existInRegulationRules = value;
    }

    /**
     * Gets the value of the missingInRegulationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanLegalActsType.MissingInRegulationRules }
     *     
     */
    public ZfcsPurchasePlanLegalActsType.MissingInRegulationRules getMissingInRegulationRules() {
        return missingInRegulationRules;
    }

    /**
     * Sets the value of the missingInRegulationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanLegalActsType.MissingInRegulationRules }
     *     
     */
    public void setMissingInRegulationRules(ZfcsPurchasePlanLegalActsType.MissingInRegulationRules value) {
        this.missingInRegulationRules = value;
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
     *         &lt;element name="registryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesNumberType"/>
     *         &lt;element name="actFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="actDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="actNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="paragraphs" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "registryNum",
        "actFullName",
        "actDate",
        "actNumber",
        "paragraphs"
    })
    public static class ExistInRegulationRules {

        @XmlElement(required = true)
        protected String registryNum;
        protected String actFullName;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar actDate;
        protected String actNumber;
        protected String paragraphs;

        /**
         * Gets the value of the registryNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistryNum() {
            return registryNum;
        }

        /**
         * Sets the value of the registryNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistryNum(String value) {
            this.registryNum = value;
        }

        /**
         * Gets the value of the actFullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActFullName() {
            return actFullName;
        }

        /**
         * Sets the value of the actFullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActFullName(String value) {
            this.actFullName = value;
        }

        /**
         * Gets the value of the actDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActDate() {
            return actDate;
        }

        /**
         * Sets the value of the actDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActDate(XMLGregorianCalendar value) {
            this.actDate = value;
        }

        /**
         * Gets the value of the actNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActNumber() {
            return actNumber;
        }

        /**
         * Sets the value of the actNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActNumber(String value) {
            this.actNumber = value;
        }

        /**
         * Gets the value of the paragraphs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParagraphs() {
            return paragraphs;
        }

        /**
         * Sets the value of the paragraphs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParagraphs(String value) {
            this.paragraphs = value;
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
     *         &lt;element name="actFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="actDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="actNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="paragraphs" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "actFullName",
        "actDate",
        "actNumber",
        "paragraphs"
    })
    public static class MissingInRegulationRules {

        @XmlElement(required = true)
        protected String actFullName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar actDate;
        @XmlElement(required = true)
        protected String actNumber;
        protected String paragraphs;

        /**
         * Gets the value of the actFullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActFullName() {
            return actFullName;
        }

        /**
         * Sets the value of the actFullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActFullName(String value) {
            this.actFullName = value;
        }

        /**
         * Gets the value of the actDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActDate() {
            return actDate;
        }

        /**
         * Sets the value of the actDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActDate(XMLGregorianCalendar value) {
            this.actDate = value;
        }

        /**
         * Gets the value of the actNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActNumber() {
            return actNumber;
        }

        /**
         * Sets the value of the actNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActNumber(String value) {
            this.actNumber = value;
        }

        /**
         * Gets the value of the paragraphs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParagraphs() {
            return paragraphs;
        }

        /**
         * Sets the value of the paragraphs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParagraphs(String value) {
            this.paragraphs = value;
        }

    }

}

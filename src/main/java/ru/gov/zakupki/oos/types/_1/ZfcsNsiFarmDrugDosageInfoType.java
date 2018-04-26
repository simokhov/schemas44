//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип:Дозировки для справочника "Лекарственные препараты"
 * 
 * <p>Java class for zfcs_nsiFarmDrugDosageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiFarmDrugDosageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dosageCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictCodeType"/>
 *         &lt;element name="dosageName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictNameType"/>
 *         &lt;element name="dosageGRLSValue" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictNameType"/>
 *         &lt;element name="dosageOKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef"/>
 *         &lt;element name="dosageValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="30"/>
 *               &lt;fractionDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dosageUser">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dosageUserOKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef"/>
 *                   &lt;element name="dosageUserName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictNameType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dosageFactors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dosageFactor" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dosageFactorCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictCodeType"/>
 *                             &lt;element name="dosageFactorValue">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="20"/>
 *                                   &lt;fractionDigits value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *         &lt;element name="dosageFactorRanges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dosageFactorRange" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dosageFactorRangeCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictCodeType"/>
 *                             &lt;element name="dosageFactorRangeMin">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="6"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dosageFactorRangeMax">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="6"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dosageFactorRangeStep">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="6"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiFarmDrugDosageInfoType", propOrder = {
    "dosageCode",
    "dosageName",
    "dosageGRLSValue",
    "dosageOKEI",
    "dosageValue",
    "dosageUser",
    "dosageFactors",
    "dosageFactorRanges"
})
public class ZfcsNsiFarmDrugDosageInfoType {

    @XmlElement(required = true)
    protected String dosageCode;
    @XmlElement(required = true)
    protected String dosageName;
    @XmlElement(required = true)
    protected String dosageGRLSValue;
    @XmlElement(required = true)
    protected ZfcsOKEIRef dosageOKEI;
    @XmlElement(required = true)
    protected BigDecimal dosageValue;
    @XmlElement(required = true)
    protected ZfcsNsiFarmDrugDosageInfoType.DosageUser dosageUser;
    protected ZfcsNsiFarmDrugDosageInfoType.DosageFactors dosageFactors;
    protected ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges dosageFactorRanges;

    /**
     * Gets the value of the dosageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosageCode() {
        return dosageCode;
    }

    /**
     * Sets the value of the dosageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosageCode(String value) {
        this.dosageCode = value;
    }

    /**
     * Gets the value of the dosageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosageName() {
        return dosageName;
    }

    /**
     * Sets the value of the dosageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosageName(String value) {
        this.dosageName = value;
    }

    /**
     * Gets the value of the dosageGRLSValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosageGRLSValue() {
        return dosageGRLSValue;
    }

    /**
     * Sets the value of the dosageGRLSValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosageGRLSValue(String value) {
        this.dosageGRLSValue = value;
    }

    /**
     * Gets the value of the dosageOKEI property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public ZfcsOKEIRef getDosageOKEI() {
        return dosageOKEI;
    }

    /**
     * Sets the value of the dosageOKEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public void setDosageOKEI(ZfcsOKEIRef value) {
        this.dosageOKEI = value;
    }

    /**
     * Gets the value of the dosageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDosageValue() {
        return dosageValue;
    }

    /**
     * Sets the value of the dosageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDosageValue(BigDecimal value) {
        this.dosageValue = value;
    }

    /**
     * Gets the value of the dosageUser property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiFarmDrugDosageInfoType.DosageUser }
     *     
     */
    public ZfcsNsiFarmDrugDosageInfoType.DosageUser getDosageUser() {
        return dosageUser;
    }

    /**
     * Sets the value of the dosageUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiFarmDrugDosageInfoType.DosageUser }
     *     
     */
    public void setDosageUser(ZfcsNsiFarmDrugDosageInfoType.DosageUser value) {
        this.dosageUser = value;
    }

    /**
     * Gets the value of the dosageFactors property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiFarmDrugDosageInfoType.DosageFactors }
     *     
     */
    public ZfcsNsiFarmDrugDosageInfoType.DosageFactors getDosageFactors() {
        return dosageFactors;
    }

    /**
     * Sets the value of the dosageFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiFarmDrugDosageInfoType.DosageFactors }
     *     
     */
    public void setDosageFactors(ZfcsNsiFarmDrugDosageInfoType.DosageFactors value) {
        this.dosageFactors = value;
    }

    /**
     * Gets the value of the dosageFactorRanges property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges }
     *     
     */
    public ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges getDosageFactorRanges() {
        return dosageFactorRanges;
    }

    /**
     * Sets the value of the dosageFactorRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges }
     *     
     */
    public void setDosageFactorRanges(ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges value) {
        this.dosageFactorRanges = value;
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
     *         &lt;element name="dosageFactorRange" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dosageFactorRangeCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictCodeType"/>
     *                   &lt;element name="dosageFactorRangeMin">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="6"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dosageFactorRangeMax">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="6"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dosageFactorRangeStep">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="6"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
        "dosageFactorRange"
    })
    public static class DosageFactorRanges {

        @XmlElement(required = true)
        protected List<ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges.DosageFactorRange> dosageFactorRange;

        /**
         * Gets the value of the dosageFactorRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dosageFactorRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDosageFactorRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges.DosageFactorRange }
         * 
         * 
         */
        public List<ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges.DosageFactorRange> getDosageFactorRange() {
            if (dosageFactorRange == null) {
                dosageFactorRange = new ArrayList<ZfcsNsiFarmDrugDosageInfoType.DosageFactorRanges.DosageFactorRange>();
            }
            return this.dosageFactorRange;
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
         *         &lt;element name="dosageFactorRangeCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictCodeType"/>
         *         &lt;element name="dosageFactorRangeMin">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="6"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dosageFactorRangeMax">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="6"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dosageFactorRangeStep">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="6"/>
         *               &lt;fractionDigits value="2"/>
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
            "dosageFactorRangeCode",
            "dosageFactorRangeMin",
            "dosageFactorRangeMax",
            "dosageFactorRangeStep"
        })
        public static class DosageFactorRange {

            @XmlElement(required = true)
            protected String dosageFactorRangeCode;
            @XmlElement(required = true)
            protected BigDecimal dosageFactorRangeMin;
            @XmlElement(required = true)
            protected BigDecimal dosageFactorRangeMax;
            @XmlElement(required = true)
            protected BigDecimal dosageFactorRangeStep;

            /**
             * Gets the value of the dosageFactorRangeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDosageFactorRangeCode() {
                return dosageFactorRangeCode;
            }

            /**
             * Sets the value of the dosageFactorRangeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDosageFactorRangeCode(String value) {
                this.dosageFactorRangeCode = value;
            }

            /**
             * Gets the value of the dosageFactorRangeMin property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDosageFactorRangeMin() {
                return dosageFactorRangeMin;
            }

            /**
             * Sets the value of the dosageFactorRangeMin property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDosageFactorRangeMin(BigDecimal value) {
                this.dosageFactorRangeMin = value;
            }

            /**
             * Gets the value of the dosageFactorRangeMax property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDosageFactorRangeMax() {
                return dosageFactorRangeMax;
            }

            /**
             * Sets the value of the dosageFactorRangeMax property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDosageFactorRangeMax(BigDecimal value) {
                this.dosageFactorRangeMax = value;
            }

            /**
             * Gets the value of the dosageFactorRangeStep property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDosageFactorRangeStep() {
                return dosageFactorRangeStep;
            }

            /**
             * Sets the value of the dosageFactorRangeStep property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDosageFactorRangeStep(BigDecimal value) {
                this.dosageFactorRangeStep = value;
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
     *         &lt;element name="dosageFactor" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dosageFactorCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictCodeType"/>
     *                   &lt;element name="dosageFactorValue">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="20"/>
     *                         &lt;fractionDigits value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
        "dosageFactor"
    })
    public static class DosageFactors {

        @XmlElement(required = true)
        protected List<ZfcsNsiFarmDrugDosageInfoType.DosageFactors.DosageFactor> dosageFactor;

        /**
         * Gets the value of the dosageFactor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dosageFactor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDosageFactor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiFarmDrugDosageInfoType.DosageFactors.DosageFactor }
         * 
         * 
         */
        public List<ZfcsNsiFarmDrugDosageInfoType.DosageFactors.DosageFactor> getDosageFactor() {
            if (dosageFactor == null) {
                dosageFactor = new ArrayList<ZfcsNsiFarmDrugDosageInfoType.DosageFactors.DosageFactor>();
            }
            return this.dosageFactor;
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
         *         &lt;element name="dosageFactorCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictCodeType"/>
         *         &lt;element name="dosageFactorValue">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="20"/>
         *               &lt;fractionDigits value="10"/>
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
            "dosageFactorCode",
            "dosageFactorValue"
        })
        public static class DosageFactor {

            @XmlElement(required = true)
            protected String dosageFactorCode;
            @XmlElement(required = true)
            protected BigDecimal dosageFactorValue;

            /**
             * Gets the value of the dosageFactorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDosageFactorCode() {
                return dosageFactorCode;
            }

            /**
             * Sets the value of the dosageFactorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDosageFactorCode(String value) {
                this.dosageFactorCode = value;
            }

            /**
             * Gets the value of the dosageFactorValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDosageFactorValue() {
                return dosageFactorValue;
            }

            /**
             * Sets the value of the dosageFactorValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDosageFactorValue(BigDecimal value) {
                this.dosageFactorValue = value;
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
     *         &lt;element name="dosageUserOKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef"/>
     *         &lt;element name="dosageUserName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictNameType"/>
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
        "dosageUserOKEI",
        "dosageUserName"
    })
    public static class DosageUser {

        @XmlElement(required = true)
        protected ZfcsOKEIRef dosageUserOKEI;
        @XmlElement(required = true)
        protected String dosageUserName;

        /**
         * Gets the value of the dosageUserOKEI property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKEIRef }
         *     
         */
        public ZfcsOKEIRef getDosageUserOKEI() {
            return dosageUserOKEI;
        }

        /**
         * Sets the value of the dosageUserOKEI property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKEIRef }
         *     
         */
        public void setDosageUserOKEI(ZfcsOKEIRef value) {
            this.dosageUserOKEI = value;
        }

        /**
         * Gets the value of the dosageUserName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDosageUserName() {
            return dosageUserName;
        }

        /**
         * Sets the value of the dosageUserName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDosageUserName(String value) {
            this.dosageUserName = value;
        }

    }

}

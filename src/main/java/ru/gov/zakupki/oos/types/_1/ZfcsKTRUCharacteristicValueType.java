//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.KtruCharacteristicValueFormatType;
import ru.gov.zakupki.oos.base._1.KtruMaxMathNotationType;
import ru.gov.zakupki.oos.base._1.KtruMinMathNotationType;


/**
 * Тип КТРУ: Значение характеристики позиции КТРУ
 * 
 * <p>Java class for zfcs_KTRUCharacteristicValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_KTRUCharacteristicValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="qualityDescription" type="{http://zakupki.gov.ru/oos/base/1}ktruDictNameType"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
 *           &lt;element name="valueFormat" type="{http://zakupki.gov.ru/oos/base/1}ktruCharacteristicValueFormatType" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;element name="rangeSet">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="valueRange">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="minMathNotation" type="{http://zakupki.gov.ru/oos/base/1}ktruMinMathNotationType" minOccurs="0"/>
 *                                   &lt;element name="min" minOccurs="0">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                         &lt;totalDigits value="10"/>
 *                                         &lt;fractionDigits value="4"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="maxMathNotation" type="{http://zakupki.gov.ru/oos/base/1}ktruMaxMathNotationType" minOccurs="0"/>
 *                                   &lt;element name="max" minOccurs="0">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                         &lt;totalDigits value="10"/>
 *                                         &lt;fractionDigits value="4"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="valueSet">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="concreteValue">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             &lt;totalDigits value="10"/>
 *                             &lt;fractionDigits value="4"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_KTRUCharacteristicValueType", propOrder = {
    "qualityDescription",
    "okei",
    "valueFormat",
    "rangeSet",
    "valueSet"
})
public class ZfcsKTRUCharacteristicValueType {

    protected String qualityDescription;
    @XmlElement(name = "OKEI")
    protected ZfcsOKEIRef okei;
    @XmlSchemaType(name = "string")
    protected KtruCharacteristicValueFormatType valueFormat;
    protected ZfcsKTRUCharacteristicValueType.RangeSet rangeSet;
    protected ZfcsKTRUCharacteristicValueType.ValueSet valueSet;

    /**
     * Gets the value of the qualityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityDescription() {
        return qualityDescription;
    }

    /**
     * Sets the value of the qualityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityDescription(String value) {
        this.qualityDescription = value;
    }

    /**
     * Gets the value of the okei property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public ZfcsOKEIRef getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKEIRef }
     *     
     */
    public void setOKEI(ZfcsOKEIRef value) {
        this.okei = value;
    }

    /**
     * Gets the value of the valueFormat property.
     * 
     * @return
     *     possible object is
     *     {@link KtruCharacteristicValueFormatType }
     *     
     */
    public KtruCharacteristicValueFormatType getValueFormat() {
        return valueFormat;
    }

    /**
     * Sets the value of the valueFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link KtruCharacteristicValueFormatType }
     *     
     */
    public void setValueFormat(KtruCharacteristicValueFormatType value) {
        this.valueFormat = value;
    }

    /**
     * Gets the value of the rangeSet property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKTRUCharacteristicValueType.RangeSet }
     *     
     */
    public ZfcsKTRUCharacteristicValueType.RangeSet getRangeSet() {
        return rangeSet;
    }

    /**
     * Sets the value of the rangeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKTRUCharacteristicValueType.RangeSet }
     *     
     */
    public void setRangeSet(ZfcsKTRUCharacteristicValueType.RangeSet value) {
        this.rangeSet = value;
    }

    /**
     * Gets the value of the valueSet property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKTRUCharacteristicValueType.ValueSet }
     *     
     */
    public ZfcsKTRUCharacteristicValueType.ValueSet getValueSet() {
        return valueSet;
    }

    /**
     * Sets the value of the valueSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKTRUCharacteristicValueType.ValueSet }
     *     
     */
    public void setValueSet(ZfcsKTRUCharacteristicValueType.ValueSet value) {
        this.valueSet = value;
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
     *         &lt;element name="valueRange">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="minMathNotation" type="{http://zakupki.gov.ru/oos/base/1}ktruMinMathNotationType" minOccurs="0"/>
     *                     &lt;element name="min" minOccurs="0">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           &lt;totalDigits value="10"/>
     *                           &lt;fractionDigits value="4"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="maxMathNotation" type="{http://zakupki.gov.ru/oos/base/1}ktruMaxMathNotationType" minOccurs="0"/>
     *                     &lt;element name="max" minOccurs="0">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           &lt;totalDigits value="10"/>
     *                           &lt;fractionDigits value="4"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
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
        "valueRange"
    })
    public static class RangeSet {

        @XmlElement(required = true)
        protected ZfcsKTRUCharacteristicValueType.RangeSet.ValueRange valueRange;

        /**
         * Gets the value of the valueRange property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsKTRUCharacteristicValueType.RangeSet.ValueRange }
         *     
         */
        public ZfcsKTRUCharacteristicValueType.RangeSet.ValueRange getValueRange() {
            return valueRange;
        }

        /**
         * Sets the value of the valueRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsKTRUCharacteristicValueType.RangeSet.ValueRange }
         *     
         */
        public void setValueRange(ZfcsKTRUCharacteristicValueType.RangeSet.ValueRange value) {
            this.valueRange = value;
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
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="minMathNotation" type="{http://zakupki.gov.ru/oos/base/1}ktruMinMathNotationType" minOccurs="0"/>
         *           &lt;element name="min" minOccurs="0">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                 &lt;totalDigits value="10"/>
         *                 &lt;fractionDigits value="4"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="maxMathNotation" type="{http://zakupki.gov.ru/oos/base/1}ktruMaxMathNotationType" minOccurs="0"/>
         *           &lt;element name="max" minOccurs="0">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                 &lt;totalDigits value="10"/>
         *                 &lt;fractionDigits value="4"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
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
            "minMathNotation",
            "min",
            "maxMathNotation",
            "max"
        })
        public static class ValueRange {

            @XmlSchemaType(name = "string")
            protected KtruMinMathNotationType minMathNotation;
            protected BigDecimal min;
            @XmlSchemaType(name = "string")
            protected KtruMaxMathNotationType maxMathNotation;
            protected BigDecimal max;

            /**
             * Gets the value of the minMathNotation property.
             * 
             * @return
             *     possible object is
             *     {@link KtruMinMathNotationType }
             *     
             */
            public KtruMinMathNotationType getMinMathNotation() {
                return minMathNotation;
            }

            /**
             * Sets the value of the minMathNotation property.
             * 
             * @param value
             *     allowed object is
             *     {@link KtruMinMathNotationType }
             *     
             */
            public void setMinMathNotation(KtruMinMathNotationType value) {
                this.minMathNotation = value;
            }

            /**
             * Gets the value of the min property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMin() {
                return min;
            }

            /**
             * Sets the value of the min property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMin(BigDecimal value) {
                this.min = value;
            }

            /**
             * Gets the value of the maxMathNotation property.
             * 
             * @return
             *     possible object is
             *     {@link KtruMaxMathNotationType }
             *     
             */
            public KtruMaxMathNotationType getMaxMathNotation() {
                return maxMathNotation;
            }

            /**
             * Sets the value of the maxMathNotation property.
             * 
             * @param value
             *     allowed object is
             *     {@link KtruMaxMathNotationType }
             *     
             */
            public void setMaxMathNotation(KtruMaxMathNotationType value) {
                this.maxMathNotation = value;
            }

            /**
             * Gets the value of the max property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMax() {
                return max;
            }

            /**
             * Sets the value of the max property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMax(BigDecimal value) {
                this.max = value;
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
     *         &lt;element name="concreteValue">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="10"/>
     *               &lt;fractionDigits value="4"/>
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
        "concreteValue"
    })
    public static class ValueSet {

        @XmlElement(required = true)
        protected BigDecimal concreteValue;

        /**
         * Gets the value of the concreteValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getConcreteValue() {
            return concreteValue;
        }

        /**
         * Sets the value of the concreteValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setConcreteValue(BigDecimal value) {
            this.concreteValue = value;
        }

    }

}

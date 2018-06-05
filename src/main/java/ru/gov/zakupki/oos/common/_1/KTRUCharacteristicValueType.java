//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.common._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.KtruMaxMathNotationType;
import ru.gov.zakupki.oos.base._1.KtruMinMathNotationType;
import ru.gov.zakupki.oos.base._1.OKEIRef;


/**
 * Тип КТРУ: Значение характеристики позиции КТРУ
 * 
 * <p>Java class for KTRUCharacteristicValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KTRUCharacteristicValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="qualityDescription" type="{http://zakupki.gov.ru/oos/base/1}ktruDictNameType"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/base/1}OKEIRef" minOccurs="0"/>
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
@XmlType(name = "KTRUCharacteristicValueType", propOrder = {
    "qualityDescription",
    "okei",
    "rangeSet",
    "valueSet"
})
public class KTRUCharacteristicValueType {

    protected String qualityDescription;
    @XmlElement(name = "OKEI")
    protected OKEIRef okei;
    protected KTRUCharacteristicValueType.RangeSet rangeSet;
    protected KTRUCharacteristicValueType.ValueSet valueSet;

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
     *     {@link OKEIRef }
     *     
     */
    public OKEIRef getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKEIRef }
     *     
     */
    public void setOKEI(OKEIRef value) {
        this.okei = value;
    }

    /**
     * Gets the value of the rangeSet property.
     * 
     * @return
     *     possible object is
     *     {@link KTRUCharacteristicValueType.RangeSet }
     *     
     */
    public KTRUCharacteristicValueType.RangeSet getRangeSet() {
        return rangeSet;
    }

    /**
     * Sets the value of the rangeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KTRUCharacteristicValueType.RangeSet }
     *     
     */
    public void setRangeSet(KTRUCharacteristicValueType.RangeSet value) {
        this.rangeSet = value;
    }

    /**
     * Gets the value of the valueSet property.
     * 
     * @return
     *     possible object is
     *     {@link KTRUCharacteristicValueType.ValueSet }
     *     
     */
    public KTRUCharacteristicValueType.ValueSet getValueSet() {
        return valueSet;
    }

    /**
     * Sets the value of the valueSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KTRUCharacteristicValueType.ValueSet }
     *     
     */
    public void setValueSet(KTRUCharacteristicValueType.ValueSet value) {
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
        protected KTRUCharacteristicValueType.RangeSet.ValueRange valueRange;

        /**
         * Gets the value of the valueRange property.
         * 
         * @return
         *     possible object is
         *     {@link KTRUCharacteristicValueType.RangeSet.ValueRange }
         *     
         */
        public KTRUCharacteristicValueType.RangeSet.ValueRange getValueRange() {
            return valueRange;
        }

        /**
         * Sets the value of the valueRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link KTRUCharacteristicValueType.RangeSet.ValueRange }
         *     
         */
        public void setValueRange(KTRUCharacteristicValueType.RangeSet.ValueRange value) {
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

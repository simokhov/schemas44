//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commonAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="maxPrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lifeTime">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="timeRanges">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="timeRange" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="minTime">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="guaranteeTime">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="includingExpences">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="minVolume">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="guaranteePrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mustExecuteContract">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "commonAttributesType", propOrder = {
    "maxPrice",
    "lifeTime",
    "timeRanges",
    "minTime",
    "guaranteeTime",
    "includingExpences",
    "minVolume",
    "guaranteePrice",
    "mustExecuteContract"
})
public class CommonAttributesType {

    protected CommonAttributesType.MaxPrice maxPrice;
    protected CommonAttributesType.LifeTime lifeTime;
    protected CommonAttributesType.TimeRanges timeRanges;
    protected CommonAttributesType.MinTime minTime;
    protected CommonAttributesType.GuaranteeTime guaranteeTime;
    protected CommonAttributesType.IncludingExpences includingExpences;
    protected CommonAttributesType.MinVolume minVolume;
    protected CommonAttributesType.GuaranteePrice guaranteePrice;
    protected CommonAttributesType.MustExecuteContract mustExecuteContract;

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.MaxPrice }
     *     
     */
    public CommonAttributesType.MaxPrice getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.MaxPrice }
     *     
     */
    public void setMaxPrice(CommonAttributesType.MaxPrice value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the lifeTime property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.LifeTime }
     *     
     */
    public CommonAttributesType.LifeTime getLifeTime() {
        return lifeTime;
    }

    /**
     * Sets the value of the lifeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.LifeTime }
     *     
     */
    public void setLifeTime(CommonAttributesType.LifeTime value) {
        this.lifeTime = value;
    }

    /**
     * Gets the value of the timeRanges property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.TimeRanges }
     *     
     */
    public CommonAttributesType.TimeRanges getTimeRanges() {
        return timeRanges;
    }

    /**
     * Sets the value of the timeRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.TimeRanges }
     *     
     */
    public void setTimeRanges(CommonAttributesType.TimeRanges value) {
        this.timeRanges = value;
    }

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.MinTime }
     *     
     */
    public CommonAttributesType.MinTime getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.MinTime }
     *     
     */
    public void setMinTime(CommonAttributesType.MinTime value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the guaranteeTime property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.GuaranteeTime }
     *     
     */
    public CommonAttributesType.GuaranteeTime getGuaranteeTime() {
        return guaranteeTime;
    }

    /**
     * Sets the value of the guaranteeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.GuaranteeTime }
     *     
     */
    public void setGuaranteeTime(CommonAttributesType.GuaranteeTime value) {
        this.guaranteeTime = value;
    }

    /**
     * Gets the value of the includingExpences property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.IncludingExpences }
     *     
     */
    public CommonAttributesType.IncludingExpences getIncludingExpences() {
        return includingExpences;
    }

    /**
     * Sets the value of the includingExpences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.IncludingExpences }
     *     
     */
    public void setIncludingExpences(CommonAttributesType.IncludingExpences value) {
        this.includingExpences = value;
    }

    /**
     * Gets the value of the minVolume property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.MinVolume }
     *     
     */
    public CommonAttributesType.MinVolume getMinVolume() {
        return minVolume;
    }

    /**
     * Sets the value of the minVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.MinVolume }
     *     
     */
    public void setMinVolume(CommonAttributesType.MinVolume value) {
        this.minVolume = value;
    }

    /**
     * Gets the value of the guaranteePrice property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.GuaranteePrice }
     *     
     */
    public CommonAttributesType.GuaranteePrice getGuaranteePrice() {
        return guaranteePrice;
    }

    /**
     * Sets the value of the guaranteePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.GuaranteePrice }
     *     
     */
    public void setGuaranteePrice(CommonAttributesType.GuaranteePrice value) {
        this.guaranteePrice = value;
    }

    /**
     * Gets the value of the mustExecuteContract property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttributesType.MustExecuteContract }
     *     
     */
    public CommonAttributesType.MustExecuteContract getMustExecuteContract() {
        return mustExecuteContract;
    }

    /**
     * Sets the value of the mustExecuteContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttributesType.MustExecuteContract }
     *     
     */
    public void setMustExecuteContract(CommonAttributesType.MustExecuteContract value) {
        this.mustExecuteContract = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
        "value"
    })
    public static class GuaranteePrice {

        protected double value;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
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
        "value",
        "timeUnit"
    })
    public static class GuaranteeTime {

        protected double value;
        @XmlSchemaType(name = "string")
        protected TimeUnitType timeUnit;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the timeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getTimeUnit() {
            return timeUnit;
        }

        /**
         * Sets the value of the timeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setTimeUnit(TimeUnitType value) {
            this.timeUnit = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "value"
    })
    public static class IncludingExpences {

        protected boolean value;

        /**
         * Gets the value of the value property.
         * 
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(boolean value) {
            this.value = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
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
        "value",
        "timeUnit"
    })
    public static class LifeTime {

        protected double value;
        @XmlSchemaType(name = "string")
        protected TimeUnitType timeUnit;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the timeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getTimeUnit() {
            return timeUnit;
        }

        /**
         * Sets the value of the timeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setTimeUnit(TimeUnitType value) {
            this.timeUnit = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
        "value"
    })
    public static class MaxPrice {

        protected double value;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
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
        "value",
        "timeUnit"
    })
    public static class MinTime {

        protected double value;
        @XmlSchemaType(name = "string")
        protected TimeUnitType timeUnit;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the timeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getTimeUnit() {
            return timeUnit;
        }

        /**
         * Sets the value of the timeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setTimeUnit(TimeUnitType value) {
            this.timeUnit = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
        "value"
    })
    public static class MinVolume {

        protected double value;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "value"
    })
    public static class MustExecuteContract {

        protected boolean value;

        /**
         * Gets the value of the value property.
         * 
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(boolean value) {
            this.value = value;
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
     *         &lt;element name="timeRange" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="timeUnit" type="{http://zakupki.gov.ru/oos/types/1}timeUnitType" minOccurs="0"/>
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
        "timeRange",
        "timeUnit"
    })
    public static class TimeRanges {

        protected List<CommonAttributesType.TimeRanges.TimeRange> timeRange;
        @XmlSchemaType(name = "string")
        protected TimeUnitType timeUnit;

        /**
         * Gets the value of the timeRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timeRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimeRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommonAttributesType.TimeRanges.TimeRange }
         * 
         * 
         */
        public List<CommonAttributesType.TimeRanges.TimeRange> getTimeRange() {
            if (timeRange == null) {
                timeRange = new ArrayList<CommonAttributesType.TimeRanges.TimeRange>();
            }
            return this.timeRange;
        }

        /**
         * Gets the value of the timeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getTimeUnit() {
            return timeUnit;
        }

        /**
         * Sets the value of the timeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setTimeUnit(TimeUnitType value) {
            this.timeUnit = value;
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
         *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
            "ordinalNumber",
            "from",
            "to"
        })
        public static class TimeRange {

            protected int ordinalNumber;
            protected double from;
            protected double to;

            /**
             * Gets the value of the ordinalNumber property.
             * 
             */
            public int getOrdinalNumber() {
                return ordinalNumber;
            }

            /**
             * Sets the value of the ordinalNumber property.
             * 
             */
            public void setOrdinalNumber(int value) {
                this.ordinalNumber = value;
            }

            /**
             * Gets the value of the from property.
             * 
             */
            public double getFrom() {
                return from;
            }

            /**
             * Sets the value of the from property.
             * 
             */
            public void setFrom(double value) {
                this.from = value;
            }

            /**
             * Gets the value of the to property.
             * 
             */
            public double getTo() {
                return to;
            }

            /**
             * Sets the value of the to property.
             * 
             */
            public void setTo(double value) {
                this.to = value;
            }

        }

    }

}

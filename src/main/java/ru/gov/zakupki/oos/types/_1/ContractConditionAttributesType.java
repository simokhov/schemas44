//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:53:38 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractConditionAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractConditionAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="maxPrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *                   &lt;element name="timeRange" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="minTime">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *                   &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "contractConditionAttributesType", propOrder = {
    "maxPrice",
    "timeRanges",
    "minTime",
    "minVolume",
    "mustExecuteContract"
})
public class ContractConditionAttributesType {

    protected ContractConditionAttributesType.MaxPrice maxPrice;
    protected ContractConditionAttributesType.TimeRanges timeRanges;
    protected ContractConditionAttributesType.MinTime minTime;
    protected ContractConditionAttributesType.MinVolume minVolume;
    protected ContractConditionAttributesType.MustExecuteContract mustExecuteContract;

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ContractConditionAttributesType.MaxPrice }
     *     
     */
    public ContractConditionAttributesType.MaxPrice getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractConditionAttributesType.MaxPrice }
     *     
     */
    public void setMaxPrice(ContractConditionAttributesType.MaxPrice value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the timeRanges property.
     * 
     * @return
     *     possible object is
     *     {@link ContractConditionAttributesType.TimeRanges }
     *     
     */
    public ContractConditionAttributesType.TimeRanges getTimeRanges() {
        return timeRanges;
    }

    /**
     * Sets the value of the timeRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractConditionAttributesType.TimeRanges }
     *     
     */
    public void setTimeRanges(ContractConditionAttributesType.TimeRanges value) {
        this.timeRanges = value;
    }

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link ContractConditionAttributesType.MinTime }
     *     
     */
    public ContractConditionAttributesType.MinTime getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractConditionAttributesType.MinTime }
     *     
     */
    public void setMinTime(ContractConditionAttributesType.MinTime value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the minVolume property.
     * 
     * @return
     *     possible object is
     *     {@link ContractConditionAttributesType.MinVolume }
     *     
     */
    public ContractConditionAttributesType.MinVolume getMinVolume() {
        return minVolume;
    }

    /**
     * Sets the value of the minVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractConditionAttributesType.MinVolume }
     *     
     */
    public void setMinVolume(ContractConditionAttributesType.MinVolume value) {
        this.minVolume = value;
    }

    /**
     * Gets the value of the mustExecuteContract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractConditionAttributesType.MustExecuteContract }
     *     
     */
    public ContractConditionAttributesType.MustExecuteContract getMustExecuteContract() {
        return mustExecuteContract;
    }

    /**
     * Sets the value of the mustExecuteContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractConditionAttributesType.MustExecuteContract }
     *     
     */
    public void setMustExecuteContract(ContractConditionAttributesType.MustExecuteContract value) {
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "noOffer"
    })
    public static class MaxPrice {

        protected Double value;
        protected boolean noOffer;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setValue(Double value) {
            this.value = value;
        }

        /**
         * Gets the value of the noOffer property.
         * 
         */
        public boolean isNoOffer() {
            return noOffer;
        }

        /**
         * Sets the value of the noOffer property.
         * 
         */
        public void setNoOffer(boolean value) {
            this.noOffer = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "noOffer"
    })
    public static class MinTime {

        protected Double value;
        protected boolean noOffer;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setValue(Double value) {
            this.value = value;
        }

        /**
         * Gets the value of the noOffer property.
         * 
         */
        public boolean isNoOffer() {
            return noOffer;
        }

        /**
         * Sets the value of the noOffer property.
         * 
         */
        public void setNoOffer(boolean value) {
            this.noOffer = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "noOffer"
    })
    public static class MinVolume {

        protected Double value;
        protected boolean noOffer;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setValue(Double value) {
            this.value = value;
        }

        /**
         * Gets the value of the noOffer property.
         * 
         */
        public boolean isNoOffer() {
            return noOffer;
        }

        /**
         * Sets the value of the noOffer property.
         * 
         */
        public void setNoOffer(boolean value) {
            this.noOffer = value;
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
     *         &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "noOffer"
    })
    public static class MustExecuteContract {

        protected boolean noOffer;

        /**
         * Gets the value of the noOffer property.
         * 
         */
        public boolean isNoOffer() {
            return noOffer;
        }

        /**
         * Sets the value of the noOffer property.
         * 
         */
        public void setNoOffer(boolean value) {
            this.noOffer = value;
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
     *         &lt;element name="timeRange" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "timeRange"
    })
    public static class TimeRanges {

        @XmlElement(required = true)
        protected List<ContractConditionAttributesType.TimeRanges.TimeRange> timeRange;

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
         * {@link ContractConditionAttributesType.TimeRanges.TimeRange }
         * 
         * 
         */
        public List<ContractConditionAttributesType.TimeRanges.TimeRange> getTimeRange() {
            if (timeRange == null) {
                timeRange = new ArrayList<ContractConditionAttributesType.TimeRanges.TimeRange>();
            }
            return this.timeRange;
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
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "value",
            "noOffer"
        })
        public static class TimeRange {

            protected int ordinalNumber;
            protected Double value;
            protected boolean noOffer;

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
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setValue(Double value) {
                this.value = value;
            }

            /**
             * Gets the value of the noOffer property.
             * 
             */
            public boolean isNoOffer() {
                return noOffer;
            }

            /**
             * Sets the value of the noOffer property.
             * 
             */
            public void setNoOffer(boolean value) {
                this.noOffer = value;
            }

        }

    }

}

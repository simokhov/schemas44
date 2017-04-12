//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:57:13 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requirementCompliances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requirementCompliances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requirementCompliance" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="availabilityType" type="{http://zakupki.gov.ru/oos/types/1}requirementCompliances.availabilityType"/>
 *                   &lt;element name="reason" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
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
@XmlType(name = "requirementCompliances", propOrder = {
    "requirementCompliance"
})
public class RequirementCompliances {

    @XmlElement(required = true)
    protected List<RequirementCompliances.RequirementCompliance> requirementCompliance;

    /**
     * Gets the value of the requirementCompliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirementCompliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirementCompliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequirementCompliances.RequirementCompliance }
     * 
     * 
     */
    public List<RequirementCompliances.RequirementCompliance> getRequirementCompliance() {
        if (requirementCompliance == null) {
            requirementCompliance = new ArrayList<RequirementCompliances.RequirementCompliance>();
        }
        return this.requirementCompliance;
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
     *         &lt;element name="availabilityType" type="{http://zakupki.gov.ru/oos/types/1}requirementCompliances.availabilityType"/>
     *         &lt;element name="reason" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
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
        "ordinalNumber",
        "availabilityType",
        "reason"
    })
    public static class RequirementCompliance {

        protected int ordinalNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected RequirementCompliancesAvailabilityType availabilityType;
        protected String reason;

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
         * Gets the value of the availabilityType property.
         * 
         * @return
         *     possible object is
         *     {@link RequirementCompliancesAvailabilityType }
         *     
         */
        public RequirementCompliancesAvailabilityType getAvailabilityType() {
            return availabilityType;
        }

        /**
         * Sets the value of the availabilityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequirementCompliancesAvailabilityType }
         *     
         */
        public void setAvailabilityType(RequirementCompliancesAvailabilityType value) {
            this.availabilityType = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

    }

}

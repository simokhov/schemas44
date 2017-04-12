//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:57:44 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Соответствие участника преимуществам, требованиям к участникам (согласно действующему извещению о закупке / изменению извещения)
 * 
 * <p>Java class for zfcs_applicationCorrespondence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_applicationCorrespondence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compatible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType"/>
 *           &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType"/>
 *         &lt;/choice>
 *         &lt;element name="overallValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
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
@XmlType(name = "zfcs_applicationCorrespondence", propOrder = {
    "compatible",
    "preferense",
    "requirement",
    "overallValue"
})
public class ZfcsApplicationCorrespondence {

    protected boolean compatible;
    protected ZfcsPreferenseType preferense;
    protected ZfcsRequirementType requirement;
    protected Double overallValue;

    /**
     * Gets the value of the compatible property.
     * 
     */
    public boolean isCompatible() {
        return compatible;
    }

    /**
     * Sets the value of the compatible property.
     * 
     */
    public void setCompatible(boolean value) {
        this.compatible = value;
    }

    /**
     * Gets the value of the preferense property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPreferenseType }
     *     
     */
    public ZfcsPreferenseType getPreferense() {
        return preferense;
    }

    /**
     * Sets the value of the preferense property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPreferenseType }
     *     
     */
    public void setPreferense(ZfcsPreferenseType value) {
        this.preferense = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRequirementType }
     *     
     */
    public ZfcsRequirementType getRequirement() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRequirementType }
     *     
     */
    public void setRequirement(ZfcsRequirementType value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the overallValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverallValue() {
        return overallValue;
    }

    /**
     * Sets the value of the overallValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverallValue(Double value) {
        this.overallValue = value;
    }

}

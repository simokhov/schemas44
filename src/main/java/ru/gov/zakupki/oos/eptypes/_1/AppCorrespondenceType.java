//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.PreferenseType;
import ru.gov.zakupki.oos.common._1.RequirementRestrictionType;


/**
 * Тип: Соответствие участника преимуществам, требованиям к участникам (согласно действующему извещению о закупке / изменению извещения)
 * 
 * <p>Java class for appCorrespondenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appCorrespondenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compatible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="preferenseInfo" type="{http://zakupki.gov.ru/oos/common/1}preferenseType"/>
 *           &lt;element name="requirementInfo" type="{http://zakupki.gov.ru/oos/common/1}requirementRestrictionType"/>
 *           &lt;element name="restrictionInfo" type="{http://zakupki.gov.ru/oos/common/1}requirementRestrictionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appCorrespondenceType", propOrder = {
    "compatible",
    "preferenseInfo",
    "requirementInfo",
    "restrictionInfo"
})
public class AppCorrespondenceType {

    protected boolean compatible;
    protected PreferenseType preferenseInfo;
    protected RequirementRestrictionType requirementInfo;
    protected RequirementRestrictionType restrictionInfo;

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
     * Gets the value of the preferenseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenseType }
     *     
     */
    public PreferenseType getPreferenseInfo() {
        return preferenseInfo;
    }

    /**
     * Sets the value of the preferenseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenseType }
     *     
     */
    public void setPreferenseInfo(PreferenseType value) {
        this.preferenseInfo = value;
    }

    /**
     * Gets the value of the requirementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementRestrictionType }
     *     
     */
    public RequirementRestrictionType getRequirementInfo() {
        return requirementInfo;
    }

    /**
     * Sets the value of the requirementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementRestrictionType }
     *     
     */
    public void setRequirementInfo(RequirementRestrictionType value) {
        this.requirementInfo = value;
    }

    /**
     * Gets the value of the restrictionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementRestrictionType }
     *     
     */
    public RequirementRestrictionType getRestrictionInfo() {
        return restrictionInfo;
    }

    /**
     * Sets the value of the restrictionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementRestrictionType }
     *     
     */
    public void setRestrictionInfo(RequirementRestrictionType value) {
        this.restrictionInfo = value;
    }

}

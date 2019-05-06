//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Критерий оценки заявок участников в рамках проведения запроса предложений в электронной форме
 * 
 * <p>Java class for criterionZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criterionZPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="costCriterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}costCriterionDocZPType"/>
 *         &lt;element name="qualitativeCriterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}qualitativeCriterionDocZPType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criterionZPType", propOrder = {
    "costCriterionInfo",
    "qualitativeCriterionInfo"
})
public class CriterionZPType {

    protected CostCriterionDocZPType costCriterionInfo;
    protected QualitativeCriterionDocZPType qualitativeCriterionInfo;

    /**
     * Gets the value of the costCriterionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CostCriterionDocZPType }
     *     
     */
    public CostCriterionDocZPType getCostCriterionInfo() {
        return costCriterionInfo;
    }

    /**
     * Sets the value of the costCriterionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostCriterionDocZPType }
     *     
     */
    public void setCostCriterionInfo(CostCriterionDocZPType value) {
        this.costCriterionInfo = value;
    }

    /**
     * Gets the value of the qualitativeCriterionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeCriterionDocZPType }
     *     
     */
    public QualitativeCriterionDocZPType getQualitativeCriterionInfo() {
        return qualitativeCriterionInfo;
    }

    /**
     * Sets the value of the qualitativeCriterionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeCriterionDocZPType }
     *     
     */
    public void setQualitativeCriterionInfo(QualitativeCriterionDocZPType value) {
        this.qualitativeCriterionInfo = value;
    }

}

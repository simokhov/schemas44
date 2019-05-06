//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Критерий оценки заявок участников в рамках проведения конкурсов в электронной форме
 * 
 * <p>Java class for criterionOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criterionOKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="costCriterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}costCriterionDocOKType"/>
 *         &lt;element name="qualitativeCriterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}qualitativeCriterionDocOKType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criterionOKType", propOrder = {
    "costCriterionInfo",
    "qualitativeCriterionInfo"
})
public class CriterionOKType {

    protected CostCriterionDocOKType costCriterionInfo;
    protected QualitativeCriterionDocOKType qualitativeCriterionInfo;

    /**
     * Gets the value of the costCriterionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CostCriterionDocOKType }
     *     
     */
    public CostCriterionDocOKType getCostCriterionInfo() {
        return costCriterionInfo;
    }

    /**
     * Sets the value of the costCriterionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostCriterionDocOKType }
     *     
     */
    public void setCostCriterionInfo(CostCriterionDocOKType value) {
        this.costCriterionInfo = value;
    }

    /**
     * Gets the value of the qualitativeCriterionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeCriterionDocOKType }
     *     
     */
    public QualitativeCriterionDocOKType getQualitativeCriterionInfo() {
        return qualitativeCriterionInfo;
    }

    /**
     * Sets the value of the qualitativeCriterionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeCriterionDocOKType }
     *     
     */
    public void setQualitativeCriterionInfo(QualitativeCriterionDocOKType value) {
        this.qualitativeCriterionInfo = value;
    }

}

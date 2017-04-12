//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:58:14 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for criterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsiEvalCriterion" type="{http://zakupki.gov.ru/oos/types/1}evalCriterion"/>
 *         &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="childrenCriteria" type="{http://zakupki.gov.ru/oos/types/1}childrenCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="evalValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2048"/>
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
@XmlType(name = "criterion", propOrder = {
    "nsiEvalCriterion",
    "criterionValue",
    "childrenCriteria",
    "evalValue"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Auto.class,
    ru.gov.zakupki.oos.types._1.ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Manual.class
})
public class Criterion {

    @XmlElement(required = true)
    protected EvalCriterion nsiEvalCriterion;
    protected Double criterionValue;
    protected List<ChildrenCriteriaType> childrenCriteria;
    protected String evalValue;

    /**
     * Gets the value of the nsiEvalCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link EvalCriterion }
     *     
     */
    public EvalCriterion getNsiEvalCriterion() {
        return nsiEvalCriterion;
    }

    /**
     * Sets the value of the nsiEvalCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvalCriterion }
     *     
     */
    public void setNsiEvalCriterion(EvalCriterion value) {
        this.nsiEvalCriterion = value;
    }

    /**
     * Gets the value of the criterionValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCriterionValue() {
        return criterionValue;
    }

    /**
     * Sets the value of the criterionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCriterionValue(Double value) {
        this.criterionValue = value;
    }

    /**
     * Gets the value of the childrenCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrenCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrenCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildrenCriteriaType }
     * 
     * 
     */
    public List<ChildrenCriteriaType> getChildrenCriteria() {
        if (childrenCriteria == null) {
            childrenCriteria = new ArrayList<ChildrenCriteriaType>();
        }
        return this.childrenCriteria;
    }

    /**
     * Gets the value of the evalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvalValue() {
        return evalValue;
    }

    /**
     * Sets the value of the evalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvalValue(String value) {
        this.evalValue = value;
    }

}

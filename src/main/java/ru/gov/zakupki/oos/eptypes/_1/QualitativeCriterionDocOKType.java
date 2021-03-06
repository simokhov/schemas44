//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.QualitativeCriterionCodeEnum;


/**
 * Тип: Нестоимостной критерий оценки в рамках проведения конкурсов в электронной форме
 * 
 * <p>Java class for qualitativeCriterionDocOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualitativeCriterionDocOKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/base/1}qualitativeCriterionCodeEnum"/>
 *         &lt;element name="valueInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}criterionValueType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="indicatorsInfo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="indicatorInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}indicatorDocOKType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="criterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}criterionsScoringDocOKType"/>
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
@XmlType(name = "qualitativeCriterionDocOKType", propOrder = {
    "code",
    "valueInfo",
    "addInfo",
    "indicatorsInfo",
    "criterionInfo"
})
public class QualitativeCriterionDocOKType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QualitativeCriterionCodeEnum code;
    @XmlElement(required = true)
    protected CriterionValueType valueInfo;
    protected String addInfo;
    protected QualitativeCriterionDocOKType.IndicatorsInfo indicatorsInfo;
    protected CriterionsScoringDocOKType criterionInfo;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeCriterionCodeEnum }
     *     
     */
    public QualitativeCriterionCodeEnum getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeCriterionCodeEnum }
     *     
     */
    public void setCode(QualitativeCriterionCodeEnum value) {
        this.code = value;
    }

    /**
     * Gets the value of the valueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionValueType }
     *     
     */
    public CriterionValueType getValueInfo() {
        return valueInfo;
    }

    /**
     * Sets the value of the valueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionValueType }
     *     
     */
    public void setValueInfo(CriterionValueType value) {
        this.valueInfo = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the indicatorsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeCriterionDocOKType.IndicatorsInfo }
     *     
     */
    public QualitativeCriterionDocOKType.IndicatorsInfo getIndicatorsInfo() {
        return indicatorsInfo;
    }

    /**
     * Sets the value of the indicatorsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeCriterionDocOKType.IndicatorsInfo }
     *     
     */
    public void setIndicatorsInfo(QualitativeCriterionDocOKType.IndicatorsInfo value) {
        this.indicatorsInfo = value;
    }

    /**
     * Gets the value of the criterionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionsScoringDocOKType }
     *     
     */
    public CriterionsScoringDocOKType getCriterionInfo() {
        return criterionInfo;
    }

    /**
     * Sets the value of the criterionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionsScoringDocOKType }
     *     
     */
    public void setCriterionInfo(CriterionsScoringDocOKType value) {
        this.criterionInfo = value;
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
     *         &lt;element name="indicatorInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}indicatorDocOKType" maxOccurs="unbounded"/>
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
        "indicatorInfo"
    })
    public static class IndicatorsInfo {

        @XmlElement(required = true)
        protected List<IndicatorDocOKType> indicatorInfo;

        /**
         * Gets the value of the indicatorInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indicatorInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndicatorInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndicatorDocOKType }
         * 
         * 
         */
        public List<IndicatorDocOKType> getIndicatorInfo() {
            if (indicatorInfo == null) {
                indicatorInfo = new ArrayList<IndicatorDocOKType>();
            }
            return this.indicatorInfo;
        }

    }

}

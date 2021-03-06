//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.QualitativeCriterionCodeEnum;


/**
 * Тип: Нестоимостной критерий оценки в протоколе в рамках проведения запроса предложений в электронной форме
 * 
 * <p>Java class for qualitativeCriterionProtocolZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualitativeCriterionProtocolZPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/base/1}qualitativeCriterionCodeEnum"/>
 *           &lt;element name="criterionTextFormInfo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="sId" type="{http://zakupki.gov.ru/oos/base/1}sIdType"/>
 *                     &lt;element name="externalSId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *                     &lt;element name="criterionName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="indicatorsInfo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="indicatorInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}indicatorProtocolZPType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="criterionScoringInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}criterionsScoringProtocolZPType"/>
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
@XmlType(name = "qualitativeCriterionProtocolZPType", propOrder = {
    "criterionCode",
    "criterionTextFormInfo",
    "value",
    "addInfo",
    "indicatorsInfo",
    "criterionScoringInfo"
})
public class QualitativeCriterionProtocolZPType {

    @XmlSchemaType(name = "string")
    protected QualitativeCriterionCodeEnum criterionCode;
    protected QualitativeCriterionProtocolZPType.CriterionTextFormInfo criterionTextFormInfo;
    @XmlElement(required = true)
    protected BigDecimal value;
    protected String addInfo;
    protected QualitativeCriterionProtocolZPType.IndicatorsInfo indicatorsInfo;
    protected CriterionsScoringProtocolZPType criterionScoringInfo;

    /**
     * Gets the value of the criterionCode property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeCriterionCodeEnum }
     *     
     */
    public QualitativeCriterionCodeEnum getCriterionCode() {
        return criterionCode;
    }

    /**
     * Sets the value of the criterionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeCriterionCodeEnum }
     *     
     */
    public void setCriterionCode(QualitativeCriterionCodeEnum value) {
        this.criterionCode = value;
    }

    /**
     * Gets the value of the criterionTextFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeCriterionProtocolZPType.CriterionTextFormInfo }
     *     
     */
    public QualitativeCriterionProtocolZPType.CriterionTextFormInfo getCriterionTextFormInfo() {
        return criterionTextFormInfo;
    }

    /**
     * Sets the value of the criterionTextFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeCriterionProtocolZPType.CriterionTextFormInfo }
     *     
     */
    public void setCriterionTextFormInfo(QualitativeCriterionProtocolZPType.CriterionTextFormInfo value) {
        this.criterionTextFormInfo = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
     *     {@link QualitativeCriterionProtocolZPType.IndicatorsInfo }
     *     
     */
    public QualitativeCriterionProtocolZPType.IndicatorsInfo getIndicatorsInfo() {
        return indicatorsInfo;
    }

    /**
     * Sets the value of the indicatorsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeCriterionProtocolZPType.IndicatorsInfo }
     *     
     */
    public void setIndicatorsInfo(QualitativeCriterionProtocolZPType.IndicatorsInfo value) {
        this.indicatorsInfo = value;
    }

    /**
     * Gets the value of the criterionScoringInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionsScoringProtocolZPType }
     *     
     */
    public CriterionsScoringProtocolZPType getCriterionScoringInfo() {
        return criterionScoringInfo;
    }

    /**
     * Sets the value of the criterionScoringInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionsScoringProtocolZPType }
     *     
     */
    public void setCriterionScoringInfo(CriterionsScoringProtocolZPType value) {
        this.criterionScoringInfo = value;
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
     *         &lt;element name="sId" type="{http://zakupki.gov.ru/oos/base/1}sIdType"/>
     *         &lt;element name="externalSId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
     *         &lt;element name="criterionName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
        "sId",
        "externalSId",
        "criterionName"
    })
    public static class CriterionTextFormInfo {

        protected long sId;
        protected String externalSId;
        @XmlElement(required = true)
        protected String criterionName;

        /**
         * Gets the value of the sId property.
         * 
         */
        public long getSId() {
            return sId;
        }

        /**
         * Sets the value of the sId property.
         * 
         */
        public void setSId(long value) {
            this.sId = value;
        }

        /**
         * Gets the value of the externalSId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalSId() {
            return externalSId;
        }

        /**
         * Sets the value of the externalSId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalSId(String value) {
            this.externalSId = value;
        }

        /**
         * Gets the value of the criterionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCriterionName() {
            return criterionName;
        }

        /**
         * Sets the value of the criterionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCriterionName(String value) {
            this.criterionName = value;
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
     *         &lt;element name="indicatorInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}indicatorProtocolZPType" maxOccurs="unbounded"/>
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
        protected List<IndicatorProtocolZPType> indicatorInfo;

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
         * {@link IndicatorProtocolZPType }
         * 
         * 
         */
        public List<IndicatorProtocolZPType> getIndicatorInfo() {
            if (indicatorInfo == null) {
                indicatorInfo = new ArrayList<IndicatorProtocolZPType>();
            }
            return this.indicatorInfo;
        }

    }

}

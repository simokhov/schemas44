//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.CostCriterionCodeEnum;


/**
 * Тип: Стоимостной критерий оценки в протоколе в рамках проведения запроса предложений в электронной форме
 * 
 * <p>Java class for costCriterionProtocolZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="costCriterionProtocolZPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/base/1}costCriterionCodeEnum"/>
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
 *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="offer" type="{http://zakupki.gov.ru/oos/base/1}moneyType"/>
 *         &lt;element name="offerText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "costCriterionProtocolZPType", propOrder = {
    "criterionCode",
    "criterionTextFormInfo",
    "value",
    "addInfo",
    "score",
    "normedScore",
    "offer",
    "offerText"
})
public class CostCriterionProtocolZPType {

    @XmlSchemaType(name = "string")
    protected CostCriterionCodeEnum criterionCode;
    protected CostCriterionProtocolZPType.CriterionTextFormInfo criterionTextFormInfo;
    @XmlElement(required = true)
    protected BigDecimal value;
    protected String addInfo;
    @XmlElement(required = true)
    protected BigDecimal score;
    @XmlElement(required = true)
    protected BigDecimal normedScore;
    @XmlElement(required = true)
    protected String offer;
    protected String offerText;

    /**
     * Gets the value of the criterionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CostCriterionCodeEnum }
     *     
     */
    public CostCriterionCodeEnum getCriterionCode() {
        return criterionCode;
    }

    /**
     * Sets the value of the criterionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostCriterionCodeEnum }
     *     
     */
    public void setCriterionCode(CostCriterionCodeEnum value) {
        this.criterionCode = value;
    }

    /**
     * Gets the value of the criterionTextFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CostCriterionProtocolZPType.CriterionTextFormInfo }
     *     
     */
    public CostCriterionProtocolZPType.CriterionTextFormInfo getCriterionTextFormInfo() {
        return criterionTextFormInfo;
    }

    /**
     * Sets the value of the criterionTextFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostCriterionProtocolZPType.CriterionTextFormInfo }
     *     
     */
    public void setCriterionTextFormInfo(CostCriterionProtocolZPType.CriterionTextFormInfo value) {
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
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScore(BigDecimal value) {
        this.score = value;
    }

    /**
     * Gets the value of the normedScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNormedScore() {
        return normedScore;
    }

    /**
     * Sets the value of the normedScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNormedScore(BigDecimal value) {
        this.normedScore = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffer(String value) {
        this.offer = value;
    }

    /**
     * Gets the value of the offerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferText() {
        return offerText;
    }

    /**
     * Sets the value of the offerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferText(String value) {
        this.offerText = value;
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

}

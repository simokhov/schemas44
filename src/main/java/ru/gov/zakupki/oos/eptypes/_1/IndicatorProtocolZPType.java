//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
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
import ru.gov.zakupki.oos.base._1.MeasurementOrderEnum;


/**
 * Тип: Показатель критерия оценки в протоколе в рамках проведения запроса предложений в электронной форме
 * 
 * <p>Java class for indicatorProtocolZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indicatorProtocolZPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sId" type="{http://zakupki.gov.ru/oos/base/1}sIdType"/>
 *         &lt;element name="externalSId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://zakupki.gov.ru/oos/base/1}indicatorValueType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/base/1}measurementOrderEnum"/>
 *           &lt;element name="otherOrder" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;/choice>
 *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="offer" type="{http://zakupki.gov.ru/oos/base/1}indicatorValueType"/>
 *         &lt;element name="offerText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="indicatorsScoringInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indicatorScoringInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}scoringType" maxOccurs="unbounded"/>
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
@XmlType(name = "indicatorProtocolZPType", propOrder = {
    "sId",
    "externalSId",
    "name",
    "value",
    "addInfo",
    "limit",
    "measurementOrder",
    "otherOrder",
    "score",
    "normedScore",
    "offer",
    "offerText",
    "indicatorsScoringInfo"
})
public class IndicatorProtocolZPType {

    protected long sId;
    protected String externalSId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigDecimal value;
    protected String addInfo;
    protected BigDecimal limit;
    @XmlSchemaType(name = "string")
    protected MeasurementOrderEnum measurementOrder;
    protected String otherOrder;
    @XmlElement(required = true)
    protected BigDecimal score;
    @XmlElement(required = true)
    protected BigDecimal normedScore;
    @XmlElement(required = true)
    protected BigDecimal offer;
    protected String offerText;
    @XmlElement(required = true)
    protected IndicatorProtocolZPType.IndicatorsScoringInfo indicatorsScoringInfo;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimit(BigDecimal value) {
        this.limit = value;
    }

    /**
     * Gets the value of the measurementOrder property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementOrderEnum }
     *     
     */
    public MeasurementOrderEnum getMeasurementOrder() {
        return measurementOrder;
    }

    /**
     * Sets the value of the measurementOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementOrderEnum }
     *     
     */
    public void setMeasurementOrder(MeasurementOrderEnum value) {
        this.measurementOrder = value;
    }

    /**
     * Gets the value of the otherOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOrder() {
        return otherOrder;
    }

    /**
     * Sets the value of the otherOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOrder(String value) {
        this.otherOrder = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffer(BigDecimal value) {
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
     * Gets the value of the indicatorsScoringInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorProtocolZPType.IndicatorsScoringInfo }
     *     
     */
    public IndicatorProtocolZPType.IndicatorsScoringInfo getIndicatorsScoringInfo() {
        return indicatorsScoringInfo;
    }

    /**
     * Sets the value of the indicatorsScoringInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorProtocolZPType.IndicatorsScoringInfo }
     *     
     */
    public void setIndicatorsScoringInfo(IndicatorProtocolZPType.IndicatorsScoringInfo value) {
        this.indicatorsScoringInfo = value;
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
     *         &lt;element name="indicatorScoringInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}scoringType" maxOccurs="unbounded"/>
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
        "indicatorScoringInfo"
    })
    public static class IndicatorsScoringInfo {

        @XmlElement(required = true)
        protected List<ScoringType> indicatorScoringInfo;

        /**
         * Gets the value of the indicatorScoringInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indicatorScoringInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndicatorScoringInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ScoringType }
         * 
         * 
         */
        public List<ScoringType> getIndicatorScoringInfo() {
            if (indicatorScoringInfo == null) {
                indicatorScoringInfo = new ArrayList<ScoringType>();
            }
            return this.indicatorScoringInfo;
        }

    }

}

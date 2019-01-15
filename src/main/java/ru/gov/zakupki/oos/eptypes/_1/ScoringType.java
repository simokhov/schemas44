//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.CommissionMemberType;


/**
 * Тип: Оценка члена комиссии
 * 
 * <p>Java class for scoringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scoringType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionMemberInfo" type="{http://zakupki.gov.ru/oos/common/1}commissionMemberType"/>
 *         &lt;element name="score" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="normedScore" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scoringType", propOrder = {
    "commissionMemberInfo",
    "score",
    "normedScore"
})
public class ScoringType {

    @XmlElement(required = true)
    protected CommissionMemberType commissionMemberInfo;
    @XmlElement(required = true)
    protected BigDecimal score;
    @XmlElement(required = true)
    protected BigDecimal normedScore;

    /**
     * Gets the value of the commissionMemberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionMemberType }
     *     
     */
    public CommissionMemberType getCommissionMemberInfo() {
        return commissionMemberInfo;
    }

    /**
     * Sets the value of the commissionMemberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionMemberType }
     *     
     */
    public void setCommissionMemberInfo(CommissionMemberType value) {
        this.commissionMemberInfo = value;
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

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.MeasurementOrderEnum;


/**
 * Тип: Критерий оценки без показателей в рамках проведения запроса предложений в электронной форме
 * 
 * <p>Java class for criterionsScoringDocZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criterionsScoringDocZPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limit" type="{http://zakupki.gov.ru/oos/base/1}indicatorValueType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/base/1}measurementOrderEnum"/>
 *           &lt;element name="otherOrder" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
@XmlType(name = "criterionsScoringDocZPType", propOrder = {
    "limit",
    "measurementOrder",
    "otherOrder"
})
public class CriterionsScoringDocZPType {

    protected BigDecimal limit;
    @XmlSchemaType(name = "string")
    protected MeasurementOrderEnum measurementOrder;
    protected String otherOrder;

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

}

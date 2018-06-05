//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.MeasurementOrderEnum;


/**
 * Тип: Критерий оценки без показателей в рамках проведения конкурсов в электронной форме
 * 
 * <p>Java class for criterionsScoringDocOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criterionsScoringDocOKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limit" type="{http://zakupki.gov.ru/oos/base/1}indicatorValueType" minOccurs="0"/>
 *         &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/base/1}measurementOrderEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criterionsScoringDocOKType", propOrder = {
    "limit",
    "measurementOrder"
})
public class CriterionsScoringDocOKType {

    protected BigDecimal limit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MeasurementOrderEnum measurementOrder;

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

}

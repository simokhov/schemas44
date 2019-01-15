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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.MeasurementOrderEnum;


/**
 * Тип: Показатель критерия оценки в рамках проведения конкурсов в электронной форме
 * 
 * <p>Java class for indicatorDocOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indicatorDocOKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sId" type="{http://zakupki.gov.ru/oos/base/1}sIdType" minOccurs="0"/>
 *         &lt;element name="externalSId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/base/1}valueType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
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
@XmlType(name = "indicatorDocOKType", propOrder = {
    "sId",
    "externalSId",
    "name",
    "value",
    "addInfo",
    "limit",
    "measurementOrder"
})
public class IndicatorDocOKType {

    protected Long sId;
    protected String externalSId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigDecimal value;
    protected String addInfo;
    protected BigDecimal limit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MeasurementOrderEnum measurementOrder;

    /**
     * Gets the value of the sId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSId() {
        return sId;
    }

    /**
     * Sets the value of the sId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSId(Long value) {
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

}

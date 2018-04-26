//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о плане-графике
 * 
 * <p>Java class for zfcs_tendePlanInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tendePlanInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="planNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanNumberType"/>
 *           &lt;choice>
 *             &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType"/>
 *             &lt;element name="purchase83st544" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="plan2017Number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017RegNumberType"/>
 *           &lt;choice>
 *             &lt;element name="position2017Number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionNumberType"/>
 *             &lt;element name="position2017ExtNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tendePlanInfoType", propOrder = {
    "planNumber",
    "positionNumber",
    "purchase83St544",
    "plan2017Number",
    "position2017Number",
    "position2017ExtNumber"
})
public class ZfcsTendePlanInfoType {

    protected String planNumber;
    protected String positionNumber;
    @XmlElement(name = "purchase83st544")
    protected Boolean purchase83St544;
    protected String plan2017Number;
    protected String position2017Number;
    protected String position2017ExtNumber;

    /**
     * Gets the value of the planNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Sets the value of the planNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNumber(String value) {
        this.planNumber = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the purchase83St544 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchase83St544() {
        return purchase83St544;
    }

    /**
     * Sets the value of the purchase83St544 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchase83St544(Boolean value) {
        this.purchase83St544 = value;
    }

    /**
     * Gets the value of the plan2017Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlan2017Number() {
        return plan2017Number;
    }

    /**
     * Sets the value of the plan2017Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlan2017Number(String value) {
        this.plan2017Number = value;
    }

    /**
     * Gets the value of the position2017Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition2017Number() {
        return position2017Number;
    }

    /**
     * Sets the value of the position2017Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition2017Number(String value) {
        this.position2017Number = value;
    }

    /**
     * Gets the value of the position2017ExtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition2017ExtNumber() {
        return position2017ExtNumber;
    }

    /**
     * Sets the value of the position2017ExtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition2017ExtNumber(String value) {
        this.position2017ExtNumber = value;
    }

}

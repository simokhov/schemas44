//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.control99._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип элемента: Запрос данных ПФХД
 * 
 * <p>Java class for financialActivityPlanRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialActivityPlanRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/control99/1}tOrganization"/>
 *         &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialActivityPlanRequestType", propOrder = {
    "organization",
    "period"
})
public class FinancialActivityPlanRequestType {

    @XmlElement(required = true)
    protected TOrganization organization;
    protected int period;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link TOrganization }
     *     
     */
    public TOrganization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrganization }
     *     
     */
    public void setOrganization(TOrganization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
    }

}
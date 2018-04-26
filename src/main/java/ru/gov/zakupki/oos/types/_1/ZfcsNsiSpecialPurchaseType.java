//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cправочник: Типы особых закупок для планов закупок и планов-графиков с 01.01.2017
 * 
 * <p>Java class for zfcs_nsiSpecialPurchaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiSpecialPurchaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchasePlanShortName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchasePlanFullName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tenderPlan2017ShortName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tenderPlan2017FullName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiSpecialPurchaseType", propOrder = {
    "id",
    "code",
    "purchasePlanShortName",
    "purchasePlanFullName",
    "tenderPlan2017ShortName",
    "tenderPlan2017FullName",
    "actual"
})
public class ZfcsNsiSpecialPurchaseType {

    protected long id;
    @XmlElement(required = true)
    protected String code;
    protected String purchasePlanShortName;
    protected String purchasePlanFullName;
    protected String tenderPlan2017ShortName;
    protected String tenderPlan2017FullName;
    protected boolean actual;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the purchasePlanShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlanShortName() {
        return purchasePlanShortName;
    }

    /**
     * Sets the value of the purchasePlanShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlanShortName(String value) {
        this.purchasePlanShortName = value;
    }

    /**
     * Gets the value of the purchasePlanFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlanFullName() {
        return purchasePlanFullName;
    }

    /**
     * Sets the value of the purchasePlanFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlanFullName(String value) {
        this.purchasePlanFullName = value;
    }

    /**
     * Gets the value of the tenderPlan2017ShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderPlan2017ShortName() {
        return tenderPlan2017ShortName;
    }

    /**
     * Sets the value of the tenderPlan2017ShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderPlan2017ShortName(String value) {
        this.tenderPlan2017ShortName = value;
    }

    /**
     * Gets the value of the tenderPlan2017FullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderPlan2017FullName() {
        return tenderPlan2017FullName;
    }

    /**
     * Sets the value of the tenderPlan2017FullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderPlan2017FullName(String value) {
        this.tenderPlan2017FullName = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     */
    public void setActual(boolean value) {
        this.actual = value;
    }

}

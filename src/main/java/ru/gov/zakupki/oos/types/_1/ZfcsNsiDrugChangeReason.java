//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Справочник: "Причины корректировки справочных данных о лекарственных препаратах"
 * 
 * <p>Java class for zfcs_nsiDrugChangeReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiDrugChangeReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/base/1}text10Type"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="mustSpecifyCommentOrRequestNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mustSpecifyDrugRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiDrugChangeReason", propOrder = {
    "code",
    "name",
    "mustSpecifyCommentOrRequestNumber",
    "mustSpecifyDrugRef",
    "isActual"
})
public class ZfcsNsiDrugChangeReason {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;
    protected boolean mustSpecifyCommentOrRequestNumber;
    protected boolean mustSpecifyDrugRef;
    protected boolean isActual;

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
     * Gets the value of the mustSpecifyCommentOrRequestNumber property.
     * 
     */
    public boolean isMustSpecifyCommentOrRequestNumber() {
        return mustSpecifyCommentOrRequestNumber;
    }

    /**
     * Sets the value of the mustSpecifyCommentOrRequestNumber property.
     * 
     */
    public void setMustSpecifyCommentOrRequestNumber(boolean value) {
        this.mustSpecifyCommentOrRequestNumber = value;
    }

    /**
     * Gets the value of the mustSpecifyDrugRef property.
     * 
     */
    public boolean isMustSpecifyDrugRef() {
        return mustSpecifyDrugRef;
    }

    /**
     * Sets the value of the mustSpecifyDrugRef property.
     * 
     */
    public void setMustSpecifyDrugRef(boolean value) {
        this.mustSpecifyDrugRef = value;
    }

    /**
     * Gets the value of the isActual property.
     * 
     */
    public boolean isIsActual() {
        return isActual;
    }

    /**
     * Sets the value of the isActual property.
     * 
     */
    public void setIsActual(boolean value) {
        this.isActual = value;
    }

}
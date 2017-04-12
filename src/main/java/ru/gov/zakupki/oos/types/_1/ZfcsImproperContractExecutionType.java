//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:00:50 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Ненадлежащее исполнение контракта
 * 
 * <p>Java class for zfcs_improperContractExecutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_improperContractExecutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameObligations" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="essenceViolation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="penaltyInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="penaltyDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="note" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_improperContractExecutionType", propOrder = {
    "nameObligations",
    "essenceViolation",
    "penaltyInfo",
    "penaltyDoc",
    "note"
})
public class ZfcsImproperContractExecutionType {

    protected String nameObligations;
    protected String essenceViolation;
    protected String penaltyInfo;
    protected String penaltyDoc;
    protected String note;

    /**
     * Gets the value of the nameObligations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameObligations() {
        return nameObligations;
    }

    /**
     * Sets the value of the nameObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameObligations(String value) {
        this.nameObligations = value;
    }

    /**
     * Gets the value of the essenceViolation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssenceViolation() {
        return essenceViolation;
    }

    /**
     * Sets the value of the essenceViolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssenceViolation(String value) {
        this.essenceViolation = value;
    }

    /**
     * Gets the value of the penaltyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyInfo() {
        return penaltyInfo;
    }

    /**
     * Sets the value of the penaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyInfo(String value) {
        this.penaltyInfo = value;
    }

    /**
     * Gets the value of the penaltyDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyDoc() {
        return penaltyDoc;
    }

    /**
     * Sets the value of the penaltyDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyDoc(String value) {
        this.penaltyDoc = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:58:14 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о процедуре закупки ОК (открытый конкурс)
 * 
 * <p>Java class for zfcs_purchaseProcedureOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProcedureOKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
 *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *         &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseProcedureOKType", propOrder = {
    "collecting",
    "opening",
    "scoring"
})
public class ZfcsPurchaseProcedureOKType {

    @XmlElement(required = true)
    protected ZfcsPurchaseProcedureCollectingType collecting;
    @XmlElement(required = true)
    protected ZfcsPurchaseProcedureOpeningType opening;
    @XmlElement(required = true)
    protected ZfcsPurchaseProcedureScoringType scoring;

    /**
     * Gets the value of the collecting property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureCollectingType }
     *     
     */
    public ZfcsPurchaseProcedureCollectingType getCollecting() {
        return collecting;
    }

    /**
     * Sets the value of the collecting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureCollectingType }
     *     
     */
    public void setCollecting(ZfcsPurchaseProcedureCollectingType value) {
        this.collecting = value;
    }

    /**
     * Gets the value of the opening property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOpeningType }
     *     
     */
    public ZfcsPurchaseProcedureOpeningType getOpening() {
        return opening;
    }

    /**
     * Sets the value of the opening property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOpeningType }
     *     
     */
    public void setOpening(ZfcsPurchaseProcedureOpeningType value) {
        this.opening = value;
    }

    /**
     * Gets the value of the scoring property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureScoringType }
     *     
     */
    public ZfcsPurchaseProcedureScoringType getScoring() {
        return scoring;
    }

    /**
     * Sets the value of the scoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureScoringType }
     *     
     */
    public void setScoring(ZfcsPurchaseProcedureScoringType value) {
        this.scoring = value;
    }

}

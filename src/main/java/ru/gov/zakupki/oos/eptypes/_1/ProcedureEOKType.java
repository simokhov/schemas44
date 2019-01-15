//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Информация о процедуре закупки ЭОК (открытый конкурс в электронной форме)
 * 
 * <p>Java class for procedureEOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="procedureEOKType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collectingInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}procedureCollectingType"/>
 *         &lt;element name="scoringInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}procedureScoringType">
 *                 &lt;sequence>
 *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procedureEOKType", propOrder = {
    "collectingInfo",
    "scoringInfo"
})
public class ProcedureEOKType {

    @XmlElement(required = true)
    protected ProcedureCollectingType collectingInfo;
    @XmlElement(required = true)
    protected ProcedureEOKType.ScoringInfo scoringInfo;

    /**
     * Gets the value of the collectingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCollectingType }
     *     
     */
    public ProcedureCollectingType getCollectingInfo() {
        return collectingInfo;
    }

    /**
     * Sets the value of the collectingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCollectingType }
     *     
     */
    public void setCollectingInfo(ProcedureCollectingType value) {
        this.collectingInfo = value;
    }

    /**
     * Gets the value of the scoringInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureEOKType.ScoringInfo }
     *     
     */
    public ProcedureEOKType.ScoringInfo getScoringInfo() {
        return scoringInfo;
    }

    /**
     * Sets the value of the scoringInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureEOKType.ScoringInfo }
     *     
     */
    public void setScoringInfo(ProcedureEOKType.ScoringInfo value) {
        this.scoringInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}procedureScoringType">
     *       &lt;sequence>
     *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addInfo"
    })
    public static class ScoringInfo
        extends ProcedureScoringType
    {

        protected String addInfo;

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

    }

}

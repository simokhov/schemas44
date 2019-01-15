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
 * Отказ от заключения контракта
 * 
 * <p>Java class for zfcs_refusalFact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_refusalFact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="voucherEntry" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_refusalFactFoundation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_refusalFact", propOrder = {
    "voucherEntry",
    "explanation",
    "foundation"
})
public class ZfcsRefusalFact {

    @XmlElement(required = true)
    protected String voucherEntry;
    protected String explanation;
    @XmlElement(required = true)
    protected ZfcsRefusalFactFoundation foundation;

    /**
     * Gets the value of the voucherEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherEntry() {
        return voucherEntry;
    }

    /**
     * Sets the value of the voucherEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherEntry(String value) {
        this.voucherEntry = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRefusalFactFoundation }
     *     
     */
    public ZfcsRefusalFactFoundation getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRefusalFactFoundation }
     *     
     */
    public void setFoundation(ZfcsRefusalFactFoundation value) {
        this.foundation = value;
    }

}

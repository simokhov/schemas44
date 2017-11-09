//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Оценка участником комиссии условия исполнения контракта. (условия исполнения контакта задаются для заявки)
 * 
 * <p>Java class for evaluationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evaluationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionMemberId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluationResult", propOrder = {
    "commissionMemberId",
    "evalResult"
})
public class EvaluationResult {

    protected long commissionMemberId;
    protected Double evalResult;

    /**
     * Gets the value of the commissionMemberId property.
     * 
     */
    public long getCommissionMemberId() {
        return commissionMemberId;
    }

    /**
     * Sets the value of the commissionMemberId property.
     * 
     */
    public void setCommissionMemberId(long value) {
        this.commissionMemberId = value;
    }

    /**
     * Gets the value of the evalResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEvalResult() {
        return evalResult;
    }

    /**
     * Sets the value of the evalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEvalResult(Double value) {
        this.evalResult = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.ProcessingProjectResultType;
import ru.gov.zakupki.oos.signincoming._1.ProcessingResultType;


/**
 * <p>Java class for resultResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="processingResult" type="{http://zakupki.gov.ru/oos/signIncoming/1}processingResultType"/>
 *         &lt;element name="processingProjectResult" type="{http://zakupki.gov.ru/oos/signIncoming/1}processingProjectResultType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultResponseType", propOrder = {
    "processingResult",
    "processingProjectResult"
})
public class ResultResponseType {

    protected ProcessingResultType processingResult;
    protected ProcessingProjectResultType processingProjectResult;

    /**
     * Gets the value of the processingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultType }
     *     
     */
    public ProcessingResultType getProcessingResult() {
        return processingResult;
    }

    /**
     * Sets the value of the processingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultType }
     *     
     */
    public void setProcessingResult(ProcessingResultType value) {
        this.processingResult = value;
    }

    /**
     * Gets the value of the processingProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingProjectResultType }
     *     
     */
    public ProcessingProjectResultType getProcessingProjectResult() {
        return processingProjectResult;
    }

    /**
     * Sets the value of the processingProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingProjectResultType }
     *     
     */
    public void setProcessingProjectResult(ProcessingProjectResultType value) {
        this.processingProjectResult = value;
    }

}

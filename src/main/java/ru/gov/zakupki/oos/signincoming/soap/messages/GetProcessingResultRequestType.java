//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.ProcessingResultRequest;


/**
 * <p>Java class for getProcessingResultRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProcessingResultRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processingResultRequest" type="{http://zakupki.gov.ru/oos/signIncoming/1}processingResultRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProcessingResultRequestType", propOrder = {
    "processingResultRequest"
})
public class GetProcessingResultRequestType {

    @XmlElement(required = true)
    protected ProcessingResultRequest processingResultRequest;

    /**
     * Gets the value of the processingResultRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultRequest }
     *     
     */
    public ProcessingResultRequest getProcessingResultRequest() {
        return processingResultRequest;
    }

    /**
     * Sets the value of the processingResultRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultRequest }
     *     
     */
    public void setProcessingResultRequest(ProcessingResultRequest value) {
        this.processingResultRequest = value;
    }

}

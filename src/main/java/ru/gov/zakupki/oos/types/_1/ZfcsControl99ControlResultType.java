//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Результат контроля в протоколе о несоответствии контролируемой информации контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99ControlResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99ControlResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="controIPassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="controlNotPassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99ControlResultType", propOrder = {
    "controIPassed",
    "controlNotPassed"
})
public class ZfcsControl99ControlResultType {

    protected Boolean controIPassed;
    protected Boolean controlNotPassed;

    /**
     * Gets the value of the controIPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControIPassed() {
        return controIPassed;
    }

    /**
     * Sets the value of the controIPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControIPassed(Boolean value) {
        this.controIPassed = value;
    }

    /**
     * Gets the value of the controlNotPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControlNotPassed() {
        return controlNotPassed;
    }

    /**
     * Sets the value of the controlNotPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControlNotPassed(Boolean value) {
        this.controlNotPassed = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Общие поля протокола о несоответствии контролируемой информации
 * 
 * <p>Java class for zfcs_control99ProtocolCommonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99ProtocolCommonInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_control99NoticeProtocolCommonInfoType">
 *       &lt;sequence>
 *         &lt;element name="controlResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlResultsIKZType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99ProtocolCommonInfoType", propOrder = {
    "controlResults"
})
public class ZfcsControl99ProtocolCommonInfoType
    extends ZfcsControl99NoticeProtocolCommonInfoType
{

    @XmlElement(required = true)
    protected ZfcsControl99ControlResultsIKZType controlResults;

    /**
     * Gets the value of the controlResults property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99ControlResultsIKZType }
     *     
     */
    public ZfcsControl99ControlResultsIKZType getControlResults() {
        return controlResults;
    }

    /**
     * Sets the value of the controlResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99ControlResultsIKZType }
     *     
     */
    public void setControlResults(ZfcsControl99ControlResultsIKZType value) {
        this.controlResults = value;
    }

}

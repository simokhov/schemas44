//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип для пакета данных:  Ответ на завершение сессии передачи файла
 * 
 * <p>Java class for finishResponsePacketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finishResponsePacketType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/filestore/ws/data}refPacketType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/filestore/ws/data}finishResponseType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finishResponsePacketType", propOrder = {
    "data"
})
public class FinishResponsePacketType
    extends RefPacketType
{

    @XmlElement(required = true)
    protected FinishResponseType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link FinishResponseType }
     *     
     */
    public FinishResponseType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinishResponseType }
     *     
     */
    public void setData(FinishResponseType value) {
        this.data = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип для пакета данных: Запрос инициации сессии передачи файла в файловое хранилище
 * 
 * <p>Java class for startRequestPacketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startRequestPacketType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/filestore/ws/data}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/filestore/ws/data}startRequestType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startRequestPacketType", propOrder = {
    "data"
})
public class StartRequestPacketType
    extends PacketType
{

    @XmlElement(required = true)
    protected StartRequestType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link StartRequestType }
     *     
     */
    public StartRequestType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartRequestType }
     *     
     */
    public void setData(StartRequestType value) {
        this.data = value;
    }

}

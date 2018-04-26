//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип для пакета данных: Запрос на передачу части файла
 * 
 * <p>Java class for chunkRequestPacketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chunkRequestPacketType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/filestore/ws/data}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/filestore/ws/data}chunkRequestType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chunkRequestPacketType", propOrder = {
    "data"
})
public class ChunkRequestPacketType
    extends PacketType
{

    @XmlElement(required = true)
    protected ChunkRequestType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ChunkRequestType }
     *     
     */
    public ChunkRequestType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChunkRequestType }
     *     
     */
    public void setData(ChunkRequestType value) {
        this.data = value;
    }

}

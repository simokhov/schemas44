//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsProtocolPOType;


/**
 * Пакет данных:Протокол предварительного отбора в ПО; внесение изменений
 * 
 * <p>Java class for protocolPO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolPO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolPOType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolPO", propOrder = {
    "data"
})
public class ProtocolPO
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsProtocolPOType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolPOType }
     *     
     */
    public ZfcsProtocolPOType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolPOType }
     *     
     */
    public void setData(ZfcsProtocolPOType value) {
        this.data = value;
    }

}

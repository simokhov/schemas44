//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsProtocolOK2WithControl99NoticeComplianceType;


/**
 * Пакет данных:Протокол рассмотрения и оценки заявок на участие в конкурсе в ОК с уведомлением о соответствии контролируемой информации по 99 статье
 * 
 * <p>Java class for protocolOK2WithControl99NoticeCompliance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolOK2WithControl99NoticeCompliance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolOK2WithControl99NoticeComplianceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolOK2WithControl99NoticeCompliance", propOrder = {
    "data"
})
public class ProtocolOK2WithControl99NoticeCompliance
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsProtocolOK2WithControl99NoticeComplianceType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOK2WithControl99NoticeComplianceType }
     *     
     */
    public ZfcsProtocolOK2WithControl99NoticeComplianceType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOK2WithControl99NoticeComplianceType }
     *     
     */
    public void setData(ZfcsProtocolOK2WithControl99NoticeComplianceType value) {
        this.data = value;
    }

}

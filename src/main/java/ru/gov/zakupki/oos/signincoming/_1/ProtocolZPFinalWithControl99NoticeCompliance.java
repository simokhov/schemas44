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
import ru.gov.zakupki.oos.types._1.ZfcsProtocolZPFinalWithControl99NoticeComplianceType;


/**
 * Пакет данных:Итоговый протокол в ЗП с уведомлением о соответствии контролируемой информации по 99 статье
 * 
 * <p>Java class for protocolZPFinalWithControl99NoticeCompliance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolZPFinalWithControl99NoticeCompliance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolZPFinalWithControl99NoticeComplianceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolZPFinalWithControl99NoticeCompliance", propOrder = {
    "data"
})
public class ProtocolZPFinalWithControl99NoticeCompliance
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsProtocolZPFinalWithControl99NoticeComplianceType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZPFinalWithControl99NoticeComplianceType }
     *     
     */
    public ZfcsProtocolZPFinalWithControl99NoticeComplianceType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZPFinalWithControl99NoticeComplianceType }
     *     
     */
    public void setData(ZfcsProtocolZPFinalWithControl99NoticeComplianceType value) {
        this.data = value;
    }

}

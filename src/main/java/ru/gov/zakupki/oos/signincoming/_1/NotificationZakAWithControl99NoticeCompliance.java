//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZakAWithControl99NoticeComplianceType;


/**
 * Пакет данных:
 * Извещение о проведении ЗакА (закрытый аукцион) с уведомлением о соответствии контролируемой информации по 99 статье
 * 
 * <p>Java class for notificationZakAWithControl99NoticeCompliance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationZakAWithControl99NoticeCompliance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationZakAWithControl99NoticeComplianceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationZakAWithControl99NoticeCompliance", propOrder = {
    "data"
})
public class NotificationZakAWithControl99NoticeCompliance
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsNotificationZakAWithControl99NoticeComplianceType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZakAWithControl99NoticeComplianceType }
     *     
     */
    public ZfcsNotificationZakAWithControl99NoticeComplianceType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZakAWithControl99NoticeComplianceType }
     *     
     */
    public void setData(ZfcsNotificationZakAWithControl99NoticeComplianceType value) {
        this.data = value;
    }

}

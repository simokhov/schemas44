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
import ru.gov.zakupki.oos.types._1.ZfcsNotification111WithControl99NoticeComplianceType;


/**
 * Пакет данных:
 * Извещение о проведении закупки способом определения поставщика (подрядчика, исполнителя), установленным Правительством Российской Федерации в соответствии со ст. 111 Федерального закона № 44-ФЗ  с уведомлением о соответствии контролируемой информации по 99 статье
 * 
 * <p>Java class for notification111WithControl99NoticeCompliance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notification111WithControl99NoticeCompliance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notification111WithControl99NoticeComplianceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notification111WithControl99NoticeCompliance", propOrder = {
    "data"
})
public class Notification111WithControl99NoticeCompliance
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsNotification111WithControl99NoticeComplianceType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotification111WithControl99NoticeComplianceType }
     *     
     */
    public ZfcsNotification111WithControl99NoticeComplianceType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotification111WithControl99NoticeComplianceType }
     *     
     */
    public void setData(ZfcsNotification111WithControl99NoticeComplianceType value) {
        this.data = value;
    }

}

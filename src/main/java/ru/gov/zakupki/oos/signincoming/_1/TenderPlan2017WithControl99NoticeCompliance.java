//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsTenderPlan2017WithControl99NoticeComplianceType;


/**
 * Пакет данных:
 * План-график с 01.01.2017 с уведомлением о соответствии контролируемой информации по 99 статье
 * 
 * <p>Java class for tenderPlan2017WithControl99NoticeCompliance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tenderPlan2017WithControl99NoticeCompliance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017WithControl99NoticeComplianceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tenderPlan2017WithControl99NoticeCompliance", propOrder = {
    "data"
})
public class TenderPlan2017WithControl99NoticeCompliance
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsTenderPlan2017WithControl99NoticeComplianceType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017WithControl99NoticeComplianceType }
     *     
     */
    public ZfcsTenderPlan2017WithControl99NoticeComplianceType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017WithControl99NoticeComplianceType }
     *     
     */
    public void setData(ZfcsTenderPlan2017WithControl99NoticeComplianceType value) {
        this.data = value;
    }

}

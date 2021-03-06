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
import ru.gov.zakupki.oos.types._1.ZfcsBankGuaranteeTerminationInvalidType;


/**
 * Пакет данных:
 * Сведения о недействительности информации о прекращении обязательств поставщика по банковской гарантии
 * 
 * <p>Java class for bankGuaranteeTerminationInvalid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankGuaranteeTerminationInvalid">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeTerminationInvalidType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankGuaranteeTerminationInvalid", propOrder = {
    "data"
})
public class BankGuaranteeTerminationInvalid
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsBankGuaranteeTerminationInvalidType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeTerminationInvalidType }
     *     
     */
    public ZfcsBankGuaranteeTerminationInvalidType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeTerminationInvalidType }
     *     
     */
    public void setData(ZfcsBankGuaranteeTerminationInvalidType value) {
        this.data = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsCustomerReportSingleContractorInvalidType;


/**
 * Пакет данных:
 * Информация о недействительности сведений отчета с обоснованием закупки у единственного поставщика (подрядчика, исполнителя)
 * 
 * <p>Java class for customerReportSingleContractorInvalid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerReportSingleContractorInvalid">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSingleContractorInvalidType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerReportSingleContractorInvalid", propOrder = {
    "data"
})
public class CustomerReportSingleContractorInvalid
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsCustomerReportSingleContractorInvalidType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSingleContractorInvalidType }
     *     
     */
    public ZfcsCustomerReportSingleContractorInvalidType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSingleContractorInvalidType }
     *     
     */
    public void setData(ZfcsCustomerReportSingleContractorInvalidType value) {
        this.data = value;
    }

}

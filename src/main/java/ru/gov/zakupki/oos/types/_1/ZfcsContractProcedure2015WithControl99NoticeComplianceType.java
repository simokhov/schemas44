//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация об исполнении (расторжении) контракта с 01.01.2015 с уведомлением о соответствии контролируемой информации по 99 статье
 * 
 * <p>Java class for zfcs_contractProcedure2015WithControl99NoticeComplianceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015WithControl99NoticeComplianceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedure2015Type">
 *       &lt;sequence>
 *         &lt;element name="control99NoticeCompliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99NoticeComplianceForRMISType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedure2015WithControl99NoticeComplianceType", propOrder = {
    "control99NoticeCompliance"
})
public class ZfcsContractProcedure2015WithControl99NoticeComplianceType
    extends ZfcsContractProcedure2015Type
{

    @XmlElement(required = true)
    protected ZfcsControl99NoticeComplianceForRMISType control99NoticeCompliance;

    /**
     * Gets the value of the control99NoticeCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99NoticeComplianceForRMISType }
     *     
     */
    public ZfcsControl99NoticeComplianceForRMISType getControl99NoticeCompliance() {
        return control99NoticeCompliance;
    }

    /**
     * Sets the value of the control99NoticeCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99NoticeComplianceForRMISType }
     *     
     */
    public void setControl99NoticeCompliance(ZfcsControl99NoticeComplianceForRMISType value) {
        this.control99NoticeCompliance = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:03:02 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о недействительности сведений отчета об исполнении контракта (результатах отдельного этапа исполнения контракта)
 * 
 * <p>Java class for zfcs_customerReportContractExecutionInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportContractExecutionInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportInvalidType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportContractExecutionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportContractExecutionInvalidType", propOrder = {
    "report"
})
public class ZfcsCustomerReportContractExecutionInvalidType
    extends ZfcsCustomerReportInvalidType
{

    protected ZfcsCustomerReportContractExecutionType report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType }
     *     
     */
    public ZfcsCustomerReportContractExecutionType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType }
     *     
     */
    public void setReport(ZfcsCustomerReportContractExecutionType value) {
        this.report = value;
    }

}

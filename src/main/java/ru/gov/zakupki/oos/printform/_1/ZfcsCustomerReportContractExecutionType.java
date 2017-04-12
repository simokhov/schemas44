//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:54:41 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsAttachmentListType;
import ru.gov.zakupki.oos.types._1.ZfcsStageType;


/**
 * Отчет об исполнении контракта (результатах отдельного этапа исполнения контракта)
 * 
 * <p>Java class for zfcs_customerReportContractExecutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportContractExecutionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/printform/1}zfcs_customerReportType">
 *       &lt;sequence>
 *         &lt;element name="contractRegNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *         &lt;element name="currentContractStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="otherAttachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportContractExecutionType", propOrder = {
    "contractRegNum",
    "currentContractStage",
    "otherAttachments"
})
public class ZfcsCustomerReportContractExecutionType
    extends ZfcsCustomerReportType
{

    @XmlElement(required = true)
    protected String contractRegNum;
    @XmlElement(required = true)
    protected ZfcsStageType currentContractStage;
    protected ZfcsAttachmentListType otherAttachments;

    /**
     * Gets the value of the contractRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRegNum() {
        return contractRegNum;
    }

    /**
     * Sets the value of the contractRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractRegNum(String value) {
        this.contractRegNum = value;
    }

    /**
     * Gets the value of the currentContractStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStageType }
     *     
     */
    public ZfcsStageType getCurrentContractStage() {
        return currentContractStage;
    }

    /**
     * Sets the value of the currentContractStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStageType }
     *     
     */
    public void setCurrentContractStage(ZfcsStageType value) {
        this.currentContractStage = value;
    }

    /**
     * Gets the value of the otherAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getOtherAttachments() {
        return otherAttachments;
    }

    /**
     * Sets the value of the otherAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setOtherAttachments(ZfcsAttachmentListType value) {
        this.otherAttachments = value;
    }

}

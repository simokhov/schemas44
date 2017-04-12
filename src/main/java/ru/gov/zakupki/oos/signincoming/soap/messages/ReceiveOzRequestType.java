//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:02:32 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportBigProjectMonitoring;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportBigProjectMonitoringInvalid;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportContractExecution;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportContractExecutionInvalid;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportSingleContractor;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportSingleContractorInvalid;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportSmallScaleBusiness;
import ru.gov.zakupki.oos.signincoming._1.CustomerReportSmallScaleBusinessInvalid;


/**
 * <p>Java class for receiveOzRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveOzRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="customerReportContractExecution" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportContractExecution"/>
 *         &lt;element name="customerReportContractExecutionInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportContractExecutionInvalid"/>
 *         &lt;element name="customerReportSingleContractor" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportSingleContractor"/>
 *         &lt;element name="customerReportSingleContractorInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportSingleContractorInvalid"/>
 *         &lt;element name="customerReportBigProjectMonitoring" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportBigProjectMonitoring"/>
 *         &lt;element name="customerReportBigProjectMonitoringInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportBigProjectMonitoringInvalid"/>
 *         &lt;element name="customerReportSmallScaleBusiness" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportSmallScaleBusiness"/>
 *         &lt;element name="customerReportSmallScaleBusinessInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}customerReportSmallScaleBusinessInvalid"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveOzRequestType", propOrder = {
    "customerReportContractExecution",
    "customerReportContractExecutionInvalid",
    "customerReportSingleContractor",
    "customerReportSingleContractorInvalid",
    "customerReportBigProjectMonitoring",
    "customerReportBigProjectMonitoringInvalid",
    "customerReportSmallScaleBusiness",
    "customerReportSmallScaleBusinessInvalid"
})
public class ReceiveOzRequestType {

    protected CustomerReportContractExecution customerReportContractExecution;
    protected CustomerReportContractExecutionInvalid customerReportContractExecutionInvalid;
    protected CustomerReportSingleContractor customerReportSingleContractor;
    protected CustomerReportSingleContractorInvalid customerReportSingleContractorInvalid;
    protected CustomerReportBigProjectMonitoring customerReportBigProjectMonitoring;
    protected CustomerReportBigProjectMonitoringInvalid customerReportBigProjectMonitoringInvalid;
    protected CustomerReportSmallScaleBusiness customerReportSmallScaleBusiness;
    protected CustomerReportSmallScaleBusinessInvalid customerReportSmallScaleBusinessInvalid;

    /**
     * Gets the value of the customerReportContractExecution property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportContractExecution }
     *     
     */
    public CustomerReportContractExecution getCustomerReportContractExecution() {
        return customerReportContractExecution;
    }

    /**
     * Sets the value of the customerReportContractExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportContractExecution }
     *     
     */
    public void setCustomerReportContractExecution(CustomerReportContractExecution value) {
        this.customerReportContractExecution = value;
    }

    /**
     * Gets the value of the customerReportContractExecutionInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportContractExecutionInvalid }
     *     
     */
    public CustomerReportContractExecutionInvalid getCustomerReportContractExecutionInvalid() {
        return customerReportContractExecutionInvalid;
    }

    /**
     * Sets the value of the customerReportContractExecutionInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportContractExecutionInvalid }
     *     
     */
    public void setCustomerReportContractExecutionInvalid(CustomerReportContractExecutionInvalid value) {
        this.customerReportContractExecutionInvalid = value;
    }

    /**
     * Gets the value of the customerReportSingleContractor property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportSingleContractor }
     *     
     */
    public CustomerReportSingleContractor getCustomerReportSingleContractor() {
        return customerReportSingleContractor;
    }

    /**
     * Sets the value of the customerReportSingleContractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportSingleContractor }
     *     
     */
    public void setCustomerReportSingleContractor(CustomerReportSingleContractor value) {
        this.customerReportSingleContractor = value;
    }

    /**
     * Gets the value of the customerReportSingleContractorInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportSingleContractorInvalid }
     *     
     */
    public CustomerReportSingleContractorInvalid getCustomerReportSingleContractorInvalid() {
        return customerReportSingleContractorInvalid;
    }

    /**
     * Sets the value of the customerReportSingleContractorInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportSingleContractorInvalid }
     *     
     */
    public void setCustomerReportSingleContractorInvalid(CustomerReportSingleContractorInvalid value) {
        this.customerReportSingleContractorInvalid = value;
    }

    /**
     * Gets the value of the customerReportBigProjectMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportBigProjectMonitoring }
     *     
     */
    public CustomerReportBigProjectMonitoring getCustomerReportBigProjectMonitoring() {
        return customerReportBigProjectMonitoring;
    }

    /**
     * Sets the value of the customerReportBigProjectMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportBigProjectMonitoring }
     *     
     */
    public void setCustomerReportBigProjectMonitoring(CustomerReportBigProjectMonitoring value) {
        this.customerReportBigProjectMonitoring = value;
    }

    /**
     * Gets the value of the customerReportBigProjectMonitoringInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportBigProjectMonitoringInvalid }
     *     
     */
    public CustomerReportBigProjectMonitoringInvalid getCustomerReportBigProjectMonitoringInvalid() {
        return customerReportBigProjectMonitoringInvalid;
    }

    /**
     * Sets the value of the customerReportBigProjectMonitoringInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportBigProjectMonitoringInvalid }
     *     
     */
    public void setCustomerReportBigProjectMonitoringInvalid(CustomerReportBigProjectMonitoringInvalid value) {
        this.customerReportBigProjectMonitoringInvalid = value;
    }

    /**
     * Gets the value of the customerReportSmallScaleBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportSmallScaleBusiness }
     *     
     */
    public CustomerReportSmallScaleBusiness getCustomerReportSmallScaleBusiness() {
        return customerReportSmallScaleBusiness;
    }

    /**
     * Sets the value of the customerReportSmallScaleBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportSmallScaleBusiness }
     *     
     */
    public void setCustomerReportSmallScaleBusiness(CustomerReportSmallScaleBusiness value) {
        this.customerReportSmallScaleBusiness = value;
    }

    /**
     * Gets the value of the customerReportSmallScaleBusinessInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReportSmallScaleBusinessInvalid }
     *     
     */
    public CustomerReportSmallScaleBusinessInvalid getCustomerReportSmallScaleBusinessInvalid() {
        return customerReportSmallScaleBusinessInvalid;
    }

    /**
     * Sets the value of the customerReportSmallScaleBusinessInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReportSmallScaleBusinessInvalid }
     *     
     */
    public void setCustomerReportSmallScaleBusinessInvalid(CustomerReportSmallScaleBusinessInvalid value) {
        this.customerReportSmallScaleBusinessInvalid = value;
    }

}

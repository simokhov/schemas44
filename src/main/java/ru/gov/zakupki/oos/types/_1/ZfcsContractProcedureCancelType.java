//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:57:13 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения об отмене информации об исполнении (расторжении) контракта
 * 
 * <p>Java class for zfcs_contractProcedureCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedureCancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelledProcedureId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currentContractStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.contractStageType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionContractType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedureCancelType", propOrder = {
    "cancelledProcedureId",
    "regNum",
    "cancelDate",
    "reason",
    "currentContractStage"
})
public class ZfcsContractProcedureCancelType {

    protected long cancelledProcedureId;
    @XmlElement(required = true)
    protected String regNum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsContractContractStageType currentContractStage;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the cancelledProcedureId property.
     * 
     */
    public long getCancelledProcedureId() {
        return cancelledProcedureId;
    }

    /**
     * Sets the value of the cancelledProcedureId property.
     * 
     */
    public void setCancelledProcedureId(long value) {
        this.cancelledProcedureId = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the currentContractStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public ZfcsContractContractStageType getCurrentContractStage() {
        return currentContractStage;
    }

    /**
     * Sets the value of the currentContractStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractContractStageType }
     *     
     */
    public void setCurrentContractStage(ZfcsContractContractStageType value) {
        this.currentContractStage = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
    }

}

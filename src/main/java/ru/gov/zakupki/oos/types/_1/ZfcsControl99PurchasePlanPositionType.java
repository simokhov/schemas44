//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:23:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Сведения о позиции плана закупок для контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99PurchasePlanPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99PurchasePlanPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonNumberType"/>
 *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType"/>
 *         &lt;element name="financeInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99PurchasePlanPositionType", propOrder = {
    "positionNumber",
    "ikz",
    "financeInfo"
})
public class ZfcsControl99PurchasePlanPositionType {

    @XmlElement(required = true)
    protected String positionNumber;
    @XmlElement(name = "IKZ", required = true)
    protected String ikz;
    @XmlElement(required = true)
    protected ZfcsPurchasePlanFinanceResourcesType financeInfo;

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the ikz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIKZ() {
        return ikz;
    }

    /**
     * Sets the value of the ikz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIKZ(String value) {
        this.ikz = value;
    }

    /**
     * Gets the value of the financeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public ZfcsPurchasePlanFinanceResourcesType getFinanceInfo() {
        return financeInfo;
    }

    /**
     * Sets the value of the financeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public void setFinanceInfo(ZfcsPurchasePlanFinanceResourcesType value) {
        this.financeInfo = value;
    }

}

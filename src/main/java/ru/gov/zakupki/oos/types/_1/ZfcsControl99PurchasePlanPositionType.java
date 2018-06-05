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
 *         &lt;element name="financeInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType">
 *                 &lt;sequence>
 *                   &lt;element name="KBKsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanKBKsInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchasesSubsecYearsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPurchasesSubsecYearsInfoType" minOccurs="0"/>
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
    "financeInfo",
    "purchasesSubsecYearsInfo"
})
public class ZfcsControl99PurchasePlanPositionType {

    @XmlElement(required = true)
    protected String positionNumber;
    @XmlElement(name = "IKZ", required = true)
    protected String ikz;
    @XmlElement(required = true)
    protected ZfcsControl99PurchasePlanPositionType.FinanceInfo financeInfo;
    protected ZfcsPurchasePlanPurchasesSubsecYearsInfoType purchasesSubsecYearsInfo;

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
     *     {@link ZfcsControl99PurchasePlanPositionType.FinanceInfo }
     *     
     */
    public ZfcsControl99PurchasePlanPositionType.FinanceInfo getFinanceInfo() {
        return financeInfo;
    }

    /**
     * Sets the value of the financeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99PurchasePlanPositionType.FinanceInfo }
     *     
     */
    public void setFinanceInfo(ZfcsControl99PurchasePlanPositionType.FinanceInfo value) {
        this.financeInfo = value;
    }

    /**
     * Gets the value of the purchasesSubsecYearsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanPurchasesSubsecYearsInfoType }
     *     
     */
    public ZfcsPurchasePlanPurchasesSubsecYearsInfoType getPurchasesSubsecYearsInfo() {
        return purchasesSubsecYearsInfo;
    }

    /**
     * Sets the value of the purchasesSubsecYearsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanPurchasesSubsecYearsInfoType }
     *     
     */
    public void setPurchasesSubsecYearsInfo(ZfcsPurchasePlanPurchasesSubsecYearsInfoType value) {
        this.purchasesSubsecYearsInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType">
     *       &lt;sequence>
     *         &lt;element name="KBKsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanKBKsInfoType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kbKsInfo"
    })
    public static class FinanceInfo
        extends ZfcsPurchasePlanFinanceResourcesType
    {

        @XmlElement(name = "KBKsInfo")
        protected ZfcsPurchasePlanKBKsInfoType kbKsInfo;

        /**
         * Gets the value of the kbKsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanKBKsInfoType }
         *     
         */
        public ZfcsPurchasePlanKBKsInfoType getKBKsInfo() {
            return kbKsInfo;
        }

        /**
         * Sets the value of the kbKsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanKBKsInfoType }
         *     
         */
        public void setKBKsInfo(ZfcsPurchasePlanKBKsInfoType value) {
            this.kbKsInfo = value;
        }

    }

}

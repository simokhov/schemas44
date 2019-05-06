//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Сведения о позиции плана-графика для контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99TenderPlan2017PositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99TenderPlan2017PositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionNumberType"/>
 *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType"/>
 *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *         &lt;element name="financeInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType">
 *                 &lt;sequence>
 *                   &lt;element name="KBKsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017KBKsInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="planPaymentsChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchasePlanPositionsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchasePlanPositionInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonNumberType" minOccurs="0"/>
 *                             &lt;element name="extNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType" minOccurs="0"/>
 *                             &lt;element name="purchasePlanIKZ" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType"/>
 *                             &lt;element name="financeInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99TenderPlan2017PositionType", propOrder = {
    "positionNumber",
    "ikz",
    "maxPrice",
    "financeInfo",
    "planPaymentsChange",
    "purchasePlanPositionsInfo"
})
public class ZfcsControl99TenderPlan2017PositionType {

    @XmlElement(required = true)
    protected String positionNumber;
    @XmlElement(name = "IKZ", required = true)
    protected String ikz;
    @XmlElement(required = true)
    protected String maxPrice;
    @XmlElement(required = true)
    protected ZfcsControl99TenderPlan2017PositionType.FinanceInfo financeInfo;
    protected Boolean planPaymentsChange;
    protected ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo purchasePlanPositionsInfo;

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
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrice(String value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the financeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99TenderPlan2017PositionType.FinanceInfo }
     *     
     */
    public ZfcsControl99TenderPlan2017PositionType.FinanceInfo getFinanceInfo() {
        return financeInfo;
    }

    /**
     * Sets the value of the financeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99TenderPlan2017PositionType.FinanceInfo }
     *     
     */
    public void setFinanceInfo(ZfcsControl99TenderPlan2017PositionType.FinanceInfo value) {
        this.financeInfo = value;
    }

    /**
     * Gets the value of the planPaymentsChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanPaymentsChange() {
        return planPaymentsChange;
    }

    /**
     * Sets the value of the planPaymentsChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanPaymentsChange(Boolean value) {
        this.planPaymentsChange = value;
    }

    /**
     * Gets the value of the purchasePlanPositionsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo }
     *     
     */
    public ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo getPurchasePlanPositionsInfo() {
        return purchasePlanPositionsInfo;
    }

    /**
     * Sets the value of the purchasePlanPositionsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo }
     *     
     */
    public void setPurchasePlanPositionsInfo(ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo value) {
        this.purchasePlanPositionsInfo = value;
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
     *         &lt;element name="KBKsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017KBKsInfoType" minOccurs="0"/>
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
        protected ZfcsTenderPlan2017KBKsInfoType kbKsInfo;

        /**
         * Gets the value of the kbKsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlan2017KBKsInfoType }
         *     
         */
        public ZfcsTenderPlan2017KBKsInfoType getKBKsInfo() {
            return kbKsInfo;
        }

        /**
         * Sets the value of the kbKsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlan2017KBKsInfoType }
         *     
         */
        public void setKBKsInfo(ZfcsTenderPlan2017KBKsInfoType value) {
            this.kbKsInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="purchasePlanPositionInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonNumberType" minOccurs="0"/>
     *                   &lt;element name="extNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType" minOccurs="0"/>
     *                   &lt;element name="purchasePlanIKZ" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType"/>
     *                   &lt;element name="financeInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "purchasePlanPositionInfo"
    })
    public static class PurchasePlanPositionsInfo {

        @XmlElement(required = true)
        protected List<ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo.PurchasePlanPositionInfo> purchasePlanPositionInfo;

        /**
         * Gets the value of the purchasePlanPositionInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchasePlanPositionInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchasePlanPositionInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo.PurchasePlanPositionInfo }
         * 
         * 
         */
        public List<ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo.PurchasePlanPositionInfo> getPurchasePlanPositionInfo() {
            if (purchasePlanPositionInfo == null) {
                purchasePlanPositionInfo = new ArrayList<ZfcsControl99TenderPlan2017PositionType.PurchasePlanPositionsInfo.PurchasePlanPositionInfo>();
            }
            return this.purchasePlanPositionInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonNumberType" minOccurs="0"/>
         *         &lt;element name="extNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType" minOccurs="0"/>
         *         &lt;element name="purchasePlanIKZ" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType"/>
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
        @XmlType(name = "", propOrder = {
            "positionNumber",
            "extNumber",
            "purchasePlanIKZ",
            "financeInfo"
        })
        public static class PurchasePlanPositionInfo {

            protected String positionNumber;
            protected String extNumber;
            @XmlElement(required = true)
            protected String purchasePlanIKZ;
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
             * Gets the value of the extNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtNumber() {
                return extNumber;
            }

            /**
             * Sets the value of the extNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtNumber(String value) {
                this.extNumber = value;
            }

            /**
             * Gets the value of the purchasePlanIKZ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchasePlanIKZ() {
                return purchasePlanIKZ;
            }

            /**
             * Sets the value of the purchasePlanIKZ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchasePlanIKZ(String value) {
                this.purchasePlanIKZ = value;
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

    }

}

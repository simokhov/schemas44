//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Итоговые показатели ПЗ по кодам бюджетной классификации
 * 
 * <p>Java class for zfcs_purchasePlanKBKsTotalsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanKBKsTotalsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KBKTotalsInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
 *                   &lt;element name="KBKTotalsYearsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
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
@XmlType(name = "zfcs_purchasePlanKBKsTotalsInfoType", propOrder = {
    "kbkTotalsInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsPurchasePlanType.OutcomeIndicators.KBKsTotalsInfo.class
})
public class ZfcsPurchasePlanKBKsTotalsInfoType {

    @XmlElement(name = "KBKTotalsInfo", required = true)
    protected List<ZfcsPurchasePlanKBKsTotalsInfoType.KBKTotalsInfo> kbkTotalsInfo;

    /**
     * Gets the value of the kbkTotalsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kbkTotalsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKBKTotalsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsPurchasePlanKBKsTotalsInfoType.KBKTotalsInfo }
     * 
     * 
     */
    public List<ZfcsPurchasePlanKBKsTotalsInfoType.KBKTotalsInfo> getKBKTotalsInfo() {
        if (kbkTotalsInfo == null) {
            kbkTotalsInfo = new ArrayList<ZfcsPurchasePlanKBKsTotalsInfoType.KBKTotalsInfo>();
        }
        return this.kbkTotalsInfo;
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
     *         &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbk2016Type"/>
     *         &lt;element name="KBKTotalsYearsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
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
        "kbk",
        "kbkTotalsYearsInfo"
    })
    public static class KBKTotalsInfo {

        @XmlElement(name = "KBK", required = true)
        protected String kbk;
        @XmlElement(name = "KBKTotalsYearsInfo", required = true)
        protected ZfcsPurchasePlanFinanceResourcesType kbkTotalsYearsInfo;

        /**
         * Gets the value of the kbk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKBK() {
            return kbk;
        }

        /**
         * Sets the value of the kbk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKBK(String value) {
            this.kbk = value;
        }

        /**
         * Gets the value of the kbkTotalsYearsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanFinanceResourcesType }
         *     
         */
        public ZfcsPurchasePlanFinanceResourcesType getKBKTotalsYearsInfo() {
            return kbkTotalsYearsInfo;
        }

        /**
         * Sets the value of the kbkTotalsYearsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanFinanceResourcesType }
         *     
         */
        public void setKBKTotalsYearsInfo(ZfcsPurchasePlanFinanceResourcesType value) {
            this.kbkTotalsYearsInfo = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Детализация по кодам бюджетной классификации
 * 
 * <p>Java class for zfcs_tenderPlan2017KBKsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017KBKsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KBKInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
 *                   &lt;element name="KBKYearsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
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
@XmlType(name = "zfcs_tenderPlan2017KBKsInfoType", propOrder = {
    "kbkInfo"
})
public class ZfcsTenderPlan2017KBKsInfoType {

    @XmlElement(name = "KBKInfo", required = true)
    protected List<ZfcsTenderPlan2017KBKsInfoType.KBKInfo> kbkInfo;

    /**
     * Gets the value of the kbkInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kbkInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKBKInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsTenderPlan2017KBKsInfoType.KBKInfo }
     * 
     * 
     */
    public List<ZfcsTenderPlan2017KBKsInfoType.KBKInfo> getKBKInfo() {
        if (kbkInfo == null) {
            kbkInfo = new ArrayList<ZfcsTenderPlan2017KBKsInfoType.KBKInfo>();
        }
        return this.kbkInfo;
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
     *         &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
     *         &lt;element name="KBKYearsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
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
        "kbkYearsInfo"
    })
    public static class KBKInfo {

        @XmlElement(name = "KBK", required = true)
        protected String kbk;
        @XmlElement(name = "KBKYearsInfo", required = true)
        protected ZfcsPurchasePlanFinanceResourcesType kbkYearsInfo;

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
         * Gets the value of the kbkYearsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanFinanceResourcesType }
         *     
         */
        public ZfcsPurchasePlanFinanceResourcesType getKBKYearsInfo() {
            return kbkYearsInfo;
        }

        /**
         * Sets the value of the kbkYearsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanFinanceResourcesType }
         *     
         */
        public void setKBKYearsInfo(ZfcsPurchasePlanFinanceResourcesType value) {
            this.kbkYearsInfo = value;
        }

    }

}

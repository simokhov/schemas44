//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.common._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.OKEIRef;


/**
 * Тип: Сведения о МНН, ТН, лекарственной форме и дозировке
 * 
 * <p>Java class for drugInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drugInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MNNInfo" type="{http://zakupki.gov.ru/oos/common/1}MNNInfoType"/>
 *         &lt;element name="tradeInfo" type="{http://zakupki.gov.ru/oos/common/1}tradeInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicamentalFormInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="medicamentalFormName" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dosageInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dosageGRLSValue" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
 *                   &lt;element name="dosageUserOKEI" type="{http://zakupki.gov.ru/oos/base/1}OKEIRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="packagingInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="packaging1Quantity" type="{http://zakupki.gov.ru/oos/base/1}drugPackaging1QuantityType"/>
 *                   &lt;element name="packaging2Quantity" type="{http://zakupki.gov.ru/oos/base/1}drugPackaging2QuantityType"/>
 *                   &lt;element name="sumaryPackagingQuantity" type="{http://zakupki.gov.ru/oos/base/1}drugSumaryPackagingQuantityType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="manualUserOKEI" type="{http://zakupki.gov.ru/oos/base/1}OKEIRef" minOccurs="0"/>
 *         &lt;element name="basicUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drugInfoType", propOrder = {
    "mnnInfo",
    "tradeInfo",
    "medicamentalFormInfo",
    "dosageInfo",
    "packagingInfo",
    "manualUserOKEI",
    "basicUnit"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.common._1.PurchaseDrugObjectsInfoType.DrugPurchaseObjectInfo.ObjectInfoUsingReferenceInfo.DrugsInfo.DrugInfo.class
})
public class DrugInfoType {

    @XmlElement(name = "MNNInfo", required = true)
    protected MNNInfoType mnnInfo;
    protected List<TradeInfoType> tradeInfo;
    protected DrugInfoType.MedicamentalFormInfo medicamentalFormInfo;
    protected DrugInfoType.DosageInfo dosageInfo;
    protected DrugInfoType.PackagingInfo packagingInfo;
    protected OKEIRef manualUserOKEI;
    protected Boolean basicUnit;

    /**
     * Gets the value of the mnnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MNNInfoType }
     *     
     */
    public MNNInfoType getMNNInfo() {
        return mnnInfo;
    }

    /**
     * Sets the value of the mnnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MNNInfoType }
     *     
     */
    public void setMNNInfo(MNNInfoType value) {
        this.mnnInfo = value;
    }

    /**
     * Gets the value of the tradeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeInfoType }
     * 
     * 
     */
    public List<TradeInfoType> getTradeInfo() {
        if (tradeInfo == null) {
            tradeInfo = new ArrayList<TradeInfoType>();
        }
        return this.tradeInfo;
    }

    /**
     * Gets the value of the medicamentalFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoType.MedicamentalFormInfo }
     *     
     */
    public DrugInfoType.MedicamentalFormInfo getMedicamentalFormInfo() {
        return medicamentalFormInfo;
    }

    /**
     * Sets the value of the medicamentalFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoType.MedicamentalFormInfo }
     *     
     */
    public void setMedicamentalFormInfo(DrugInfoType.MedicamentalFormInfo value) {
        this.medicamentalFormInfo = value;
    }

    /**
     * Gets the value of the dosageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoType.DosageInfo }
     *     
     */
    public DrugInfoType.DosageInfo getDosageInfo() {
        return dosageInfo;
    }

    /**
     * Sets the value of the dosageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoType.DosageInfo }
     *     
     */
    public void setDosageInfo(DrugInfoType.DosageInfo value) {
        this.dosageInfo = value;
    }

    /**
     * Gets the value of the packagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoType.PackagingInfo }
     *     
     */
    public DrugInfoType.PackagingInfo getPackagingInfo() {
        return packagingInfo;
    }

    /**
     * Sets the value of the packagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoType.PackagingInfo }
     *     
     */
    public void setPackagingInfo(DrugInfoType.PackagingInfo value) {
        this.packagingInfo = value;
    }

    /**
     * Gets the value of the manualUserOKEI property.
     * 
     * @return
     *     possible object is
     *     {@link OKEIRef }
     *     
     */
    public OKEIRef getManualUserOKEI() {
        return manualUserOKEI;
    }

    /**
     * Sets the value of the manualUserOKEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKEIRef }
     *     
     */
    public void setManualUserOKEI(OKEIRef value) {
        this.manualUserOKEI = value;
    }

    /**
     * Gets the value of the basicUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasicUnit() {
        return basicUnit;
    }

    /**
     * Sets the value of the basicUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasicUnit(Boolean value) {
        this.basicUnit = value;
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
     *         &lt;element name="dosageGRLSValue" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
     *         &lt;element name="dosageUserOKEI" type="{http://zakupki.gov.ru/oos/base/1}OKEIRef"/>
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
        "dosageGRLSValue",
        "dosageUserOKEI"
    })
    public static class DosageInfo {

        @XmlElement(required = true)
        protected String dosageGRLSValue;
        @XmlElement(required = true)
        protected OKEIRef dosageUserOKEI;

        /**
         * Gets the value of the dosageGRLSValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDosageGRLSValue() {
            return dosageGRLSValue;
        }

        /**
         * Sets the value of the dosageGRLSValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDosageGRLSValue(String value) {
            this.dosageGRLSValue = value;
        }

        /**
         * Gets the value of the dosageUserOKEI property.
         * 
         * @return
         *     possible object is
         *     {@link OKEIRef }
         *     
         */
        public OKEIRef getDosageUserOKEI() {
            return dosageUserOKEI;
        }

        /**
         * Sets the value of the dosageUserOKEI property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKEIRef }
         *     
         */
        public void setDosageUserOKEI(OKEIRef value) {
            this.dosageUserOKEI = value;
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
     *         &lt;element name="medicamentalFormName" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
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
        "medicamentalFormName"
    })
    public static class MedicamentalFormInfo {

        @XmlElement(required = true)
        protected String medicamentalFormName;

        /**
         * Gets the value of the medicamentalFormName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedicamentalFormName() {
            return medicamentalFormName;
        }

        /**
         * Sets the value of the medicamentalFormName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedicamentalFormName(String value) {
            this.medicamentalFormName = value;
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
     *         &lt;element name="packaging1Quantity" type="{http://zakupki.gov.ru/oos/base/1}drugPackaging1QuantityType"/>
     *         &lt;element name="packaging2Quantity" type="{http://zakupki.gov.ru/oos/base/1}drugPackaging2QuantityType"/>
     *         &lt;element name="sumaryPackagingQuantity" type="{http://zakupki.gov.ru/oos/base/1}drugSumaryPackagingQuantityType" minOccurs="0"/>
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
        "packaging1Quantity",
        "packaging2Quantity",
        "sumaryPackagingQuantity"
    })
    public static class PackagingInfo {

        @XmlElement(required = true)
        protected BigDecimal packaging1Quantity;
        protected int packaging2Quantity;
        protected BigDecimal sumaryPackagingQuantity;

        /**
         * Gets the value of the packaging1Quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPackaging1Quantity() {
            return packaging1Quantity;
        }

        /**
         * Sets the value of the packaging1Quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPackaging1Quantity(BigDecimal value) {
            this.packaging1Quantity = value;
        }

        /**
         * Gets the value of the packaging2Quantity property.
         * 
         */
        public int getPackaging2Quantity() {
            return packaging2Quantity;
        }

        /**
         * Sets the value of the packaging2Quantity property.
         * 
         */
        public void setPackaging2Quantity(int value) {
            this.packaging2Quantity = value;
        }

        /**
         * Gets the value of the sumaryPackagingQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSumaryPackagingQuantity() {
            return sumaryPackagingQuantity;
        }

        /**
         * Sets the value of the sumaryPackagingQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSumaryPackagingQuantity(BigDecimal value) {
            this.sumaryPackagingQuantity = value;
        }

    }

}

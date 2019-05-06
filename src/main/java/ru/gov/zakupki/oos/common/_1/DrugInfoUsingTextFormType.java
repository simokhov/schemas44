//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.common._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.OKEIRef;


/**
 * Тип: Сведения о МНН, ТН, лекарственной форме и дозировке в случае когда информация о лекарственных препаратах формируется в текстовой форме
 * 
 * <p>Java class for drugInfoUsingTextFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drugInfoUsingTextFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MNNInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MNNName" type="{http://zakupki.gov.ru/oos/base/1}drugName2000Type"/>
 *                   &lt;element name="drugChangeInfo" type="{http://zakupki.gov.ru/oos/common/1}drugChangeInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tradeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tradeName" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
 *                   &lt;element name="drugChangeInfo" type="{http://zakupki.gov.ru/oos/common/1}drugChangeInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="medicamentalFormInfo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="medicamentalFormName" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="dosageInfo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="dosageGRLSValue" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="packagingInfo" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="packaging1Quantity" type="{http://zakupki.gov.ru/oos/base/1}drugPackaging1QuantityType"/>
 *                     &lt;element name="packaging2Quantity" type="{http://zakupki.gov.ru/oos/base/1}drugPackaging2QuantityType"/>
 *                     &lt;element name="sumaryPackagingQuantity" type="{http://zakupki.gov.ru/oos/base/1}drugSumaryPackagingQuantityType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="manualUserOKEI" type="{http://zakupki.gov.ru/oos/base/1}OKEIRef"/>
 *           &lt;element name="drugChangeInfo" type="{http://zakupki.gov.ru/oos/common/1}drugChangeInfoType" minOccurs="0"/>
 *         &lt;/sequence>
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
@XmlType(name = "drugInfoUsingTextFormType", propOrder = {
    "mnnInfo",
    "tradeInfo",
    "medicamentalFormInfo",
    "dosageInfo",
    "packagingInfo",
    "manualUserOKEI",
    "drugChangeInfo",
    "basicUnit"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.common._1.PurchaseDrugObjectsInfoType.DrugPurchaseObjectInfo.ObjectInfoUsingTextForm.DrugsInfo.DrugInfo.class
})
public class DrugInfoUsingTextFormType {

    @XmlElement(name = "MNNInfo", required = true)
    protected DrugInfoUsingTextFormType.MNNInfo mnnInfo;
    protected DrugInfoUsingTextFormType.TradeInfo tradeInfo;
    @XmlElement(required = true)
    protected DrugInfoUsingTextFormType.MedicamentalFormInfo medicamentalFormInfo;
    @XmlElement(required = true)
    protected DrugInfoUsingTextFormType.DosageInfo dosageInfo;
    protected DrugInfoUsingTextFormType.PackagingInfo packagingInfo;
    @XmlElement(required = true)
    protected OKEIRef manualUserOKEI;
    protected DrugChangeInfoType drugChangeInfo;
    protected Boolean basicUnit;

    /**
     * Gets the value of the mnnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoUsingTextFormType.MNNInfo }
     *     
     */
    public DrugInfoUsingTextFormType.MNNInfo getMNNInfo() {
        return mnnInfo;
    }

    /**
     * Sets the value of the mnnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoUsingTextFormType.MNNInfo }
     *     
     */
    public void setMNNInfo(DrugInfoUsingTextFormType.MNNInfo value) {
        this.mnnInfo = value;
    }

    /**
     * Gets the value of the tradeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoUsingTextFormType.TradeInfo }
     *     
     */
    public DrugInfoUsingTextFormType.TradeInfo getTradeInfo() {
        return tradeInfo;
    }

    /**
     * Sets the value of the tradeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoUsingTextFormType.TradeInfo }
     *     
     */
    public void setTradeInfo(DrugInfoUsingTextFormType.TradeInfo value) {
        this.tradeInfo = value;
    }

    /**
     * Gets the value of the medicamentalFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoUsingTextFormType.MedicamentalFormInfo }
     *     
     */
    public DrugInfoUsingTextFormType.MedicamentalFormInfo getMedicamentalFormInfo() {
        return medicamentalFormInfo;
    }

    /**
     * Sets the value of the medicamentalFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoUsingTextFormType.MedicamentalFormInfo }
     *     
     */
    public void setMedicamentalFormInfo(DrugInfoUsingTextFormType.MedicamentalFormInfo value) {
        this.medicamentalFormInfo = value;
    }

    /**
     * Gets the value of the dosageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoUsingTextFormType.DosageInfo }
     *     
     */
    public DrugInfoUsingTextFormType.DosageInfo getDosageInfo() {
        return dosageInfo;
    }

    /**
     * Sets the value of the dosageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoUsingTextFormType.DosageInfo }
     *     
     */
    public void setDosageInfo(DrugInfoUsingTextFormType.DosageInfo value) {
        this.dosageInfo = value;
    }

    /**
     * Gets the value of the packagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInfoUsingTextFormType.PackagingInfo }
     *     
     */
    public DrugInfoUsingTextFormType.PackagingInfo getPackagingInfo() {
        return packagingInfo;
    }

    /**
     * Sets the value of the packagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInfoUsingTextFormType.PackagingInfo }
     *     
     */
    public void setPackagingInfo(DrugInfoUsingTextFormType.PackagingInfo value) {
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
     * Gets the value of the drugChangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DrugChangeInfoType }
     *     
     */
    public DrugChangeInfoType getDrugChangeInfo() {
        return drugChangeInfo;
    }

    /**
     * Sets the value of the drugChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugChangeInfoType }
     *     
     */
    public void setDrugChangeInfo(DrugChangeInfoType value) {
        this.drugChangeInfo = value;
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
        "dosageGRLSValue"
    })
    public static class DosageInfo {

        @XmlElement(required = true)
        protected String dosageGRLSValue;

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
     *         &lt;element name="MNNName" type="{http://zakupki.gov.ru/oos/base/1}drugName2000Type"/>
     *         &lt;element name="drugChangeInfo" type="{http://zakupki.gov.ru/oos/common/1}drugChangeInfoType" minOccurs="0"/>
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
        "mnnName",
        "drugChangeInfo"
    })
    public static class MNNInfo {

        @XmlElement(name = "MNNName", required = true)
        protected String mnnName;
        protected DrugChangeInfoType drugChangeInfo;

        /**
         * Gets the value of the mnnName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMNNName() {
            return mnnName;
        }

        /**
         * Sets the value of the mnnName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMNNName(String value) {
            this.mnnName = value;
        }

        /**
         * Gets the value of the drugChangeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DrugChangeInfoType }
         *     
         */
        public DrugChangeInfoType getDrugChangeInfo() {
            return drugChangeInfo;
        }

        /**
         * Sets the value of the drugChangeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DrugChangeInfoType }
         *     
         */
        public void setDrugChangeInfo(DrugChangeInfoType value) {
            this.drugChangeInfo = value;
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
     *         &lt;element name="tradeName" type="{http://zakupki.gov.ru/oos/base/1}drugNameType"/>
     *         &lt;element name="drugChangeInfo" type="{http://zakupki.gov.ru/oos/common/1}drugChangeInfoType" minOccurs="0"/>
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
        "tradeName",
        "drugChangeInfo"
    })
    public static class TradeInfo {

        @XmlElement(required = true)
        protected String tradeName;
        protected DrugChangeInfoType drugChangeInfo;

        /**
         * Gets the value of the tradeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeName() {
            return tradeName;
        }

        /**
         * Sets the value of the tradeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeName(String value) {
            this.tradeName = value;
        }

        /**
         * Gets the value of the drugChangeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DrugChangeInfoType }
         *     
         */
        public DrugChangeInfoType getDrugChangeInfo() {
            return drugChangeInfo;
        }

        /**
         * Sets the value of the drugChangeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DrugChangeInfoType }
         *     
         */
        public void setDrugChangeInfo(DrugChangeInfoType value) {
            this.drugChangeInfo = value;
        }

    }

}

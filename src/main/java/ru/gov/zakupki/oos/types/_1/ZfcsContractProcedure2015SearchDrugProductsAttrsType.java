//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Реквизиты предмета контракта-лекарственного препарата для поиска в исполнении контракта
 * 
 * <p>Java class for zfcs_contractProcedure2015SearchDrugProductsAttrsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015SearchDrugProductsAttrsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="drugInfoUsingReferenceInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positionTradeNameExternalCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictExternalCodeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="drugInfoUsingTextForm">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MNNName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
 *                   &lt;element name="tradeName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
 *                   &lt;element name="certificateNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dosageFormName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
 *                   &lt;element name="dosageValue">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="20"/>
 *                         &lt;fractionDigits value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="certificateKeeperName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
 *                   &lt;element name="manufacturerOKSMCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="manufacturerName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
 *                   &lt;element name="primaryPackagingName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
 *                   &lt;element name="packaging1Quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugPackaging1QuantityType"/>
 *                   &lt;element name="packaging2Quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugPackaging2QuantityType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedure2015SearchDrugProductsAttrsType", propOrder = {
    "drugInfoUsingReferenceInfo",
    "drugInfoUsingTextForm"
})
public class ZfcsContractProcedure2015SearchDrugProductsAttrsType {

    protected ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingReferenceInfo drugInfoUsingReferenceInfo;
    protected ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingTextForm drugInfoUsingTextForm;

    /**
     * Gets the value of the drugInfoUsingReferenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingReferenceInfo }
     *     
     */
    public ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingReferenceInfo getDrugInfoUsingReferenceInfo() {
        return drugInfoUsingReferenceInfo;
    }

    /**
     * Sets the value of the drugInfoUsingReferenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingReferenceInfo }
     *     
     */
    public void setDrugInfoUsingReferenceInfo(ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingReferenceInfo value) {
        this.drugInfoUsingReferenceInfo = value;
    }

    /**
     * Gets the value of the drugInfoUsingTextForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingTextForm }
     *     
     */
    public ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingTextForm getDrugInfoUsingTextForm() {
        return drugInfoUsingTextForm;
    }

    /**
     * Sets the value of the drugInfoUsingTextForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingTextForm }
     *     
     */
    public void setDrugInfoUsingTextForm(ZfcsContractProcedure2015SearchDrugProductsAttrsType.DrugInfoUsingTextForm value) {
        this.drugInfoUsingTextForm = value;
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
     *         &lt;element name="positionTradeNameExternalCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiFarmDrugDictExternalCodeType"/>
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
        "positionTradeNameExternalCode"
    })
    public static class DrugInfoUsingReferenceInfo {

        @XmlElement(required = true)
        protected String positionTradeNameExternalCode;

        /**
         * Gets the value of the positionTradeNameExternalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionTradeNameExternalCode() {
            return positionTradeNameExternalCode;
        }

        /**
         * Sets the value of the positionTradeNameExternalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionTradeNameExternalCode(String value) {
            this.positionTradeNameExternalCode = value;
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
     *         &lt;element name="MNNName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
     *         &lt;element name="tradeName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
     *         &lt;element name="certificateNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dosageFormName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
     *         &lt;element name="dosageValue">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="20"/>
     *               &lt;fractionDigits value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="certificateKeeperName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
     *         &lt;element name="manufacturerOKSMCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="manufacturerName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
     *         &lt;element name="primaryPackagingName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugDictNameType"/>
     *         &lt;element name="packaging1Quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugPackaging1QuantityType"/>
     *         &lt;element name="packaging2Quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015DrugPackaging2QuantityType"/>
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
        "tradeName",
        "certificateNumber",
        "dosageFormName",
        "dosageValue",
        "certificateKeeperName",
        "manufacturerOKSMCode",
        "manufacturerName",
        "primaryPackagingName",
        "packaging1Quantity",
        "packaging2Quantity"
    })
    public static class DrugInfoUsingTextForm {

        @XmlElement(name = "MNNName", required = true)
        protected String mnnName;
        @XmlElement(required = true)
        protected String tradeName;
        @XmlElement(required = true)
        protected String certificateNumber;
        @XmlElement(required = true)
        protected String dosageFormName;
        @XmlElement(required = true)
        protected BigDecimal dosageValue;
        @XmlElement(required = true)
        protected String certificateKeeperName;
        @XmlElement(required = true)
        protected String manufacturerOKSMCode;
        @XmlElement(required = true)
        protected String manufacturerName;
        @XmlElement(required = true)
        protected String primaryPackagingName;
        @XmlElement(required = true)
        protected BigDecimal packaging1Quantity;
        protected int packaging2Quantity;

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
         * Gets the value of the certificateNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateNumber() {
            return certificateNumber;
        }

        /**
         * Sets the value of the certificateNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateNumber(String value) {
            this.certificateNumber = value;
        }

        /**
         * Gets the value of the dosageFormName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDosageFormName() {
            return dosageFormName;
        }

        /**
         * Sets the value of the dosageFormName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDosageFormName(String value) {
            this.dosageFormName = value;
        }

        /**
         * Gets the value of the dosageValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDosageValue() {
            return dosageValue;
        }

        /**
         * Sets the value of the dosageValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDosageValue(BigDecimal value) {
            this.dosageValue = value;
        }

        /**
         * Gets the value of the certificateKeeperName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateKeeperName() {
            return certificateKeeperName;
        }

        /**
         * Sets the value of the certificateKeeperName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateKeeperName(String value) {
            this.certificateKeeperName = value;
        }

        /**
         * Gets the value of the manufacturerOKSMCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturerOKSMCode() {
            return manufacturerOKSMCode;
        }

        /**
         * Sets the value of the manufacturerOKSMCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturerOKSMCode(String value) {
            this.manufacturerOKSMCode = value;
        }

        /**
         * Gets the value of the manufacturerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturerName() {
            return manufacturerName;
        }

        /**
         * Sets the value of the manufacturerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturerName(String value) {
            this.manufacturerName = value;
        }

        /**
         * Gets the value of the primaryPackagingName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryPackagingName() {
            return primaryPackagingName;
        }

        /**
         * Sets the value of the primaryPackagingName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryPackagingName(String value) {
            this.primaryPackagingName = value;
        }

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

    }

}

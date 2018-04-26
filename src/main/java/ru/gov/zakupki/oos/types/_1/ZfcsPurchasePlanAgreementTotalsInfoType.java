//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Итоговый показатель по соглашениям о предоставлении субсидий
 * 
 * <p>Java class for zfcs_purchasePlanAgreementTotalsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanAgreementTotalsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreementTypeCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanAgreementTypeCodeEnum"/>
 *         &lt;element name="agreementInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="agreementNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="agreementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="agreementTotalsYearsInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchasePlanAgreementTotalsInfoType", propOrder = {
    "agreementTypeCode",
    "agreementInfo",
    "agreementTotalsYearsInfo"
})
public class ZfcsPurchasePlanAgreementTotalsInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPurchasePlanAgreementTypeCodeEnum agreementTypeCode;
    @XmlElement(required = true)
    protected ZfcsPurchasePlanAgreementTotalsInfoType.AgreementInfo agreementInfo;
    @XmlElement(required = true)
    protected ZfcsPurchasePlanFinanceResourcesType agreementTotalsYearsInfo;

    /**
     * Gets the value of the agreementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanAgreementTypeCodeEnum }
     *     
     */
    public ZfcsPurchasePlanAgreementTypeCodeEnum getAgreementTypeCode() {
        return agreementTypeCode;
    }

    /**
     * Sets the value of the agreementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanAgreementTypeCodeEnum }
     *     
     */
    public void setAgreementTypeCode(ZfcsPurchasePlanAgreementTypeCodeEnum value) {
        this.agreementTypeCode = value;
    }

    /**
     * Gets the value of the agreementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanAgreementTotalsInfoType.AgreementInfo }
     *     
     */
    public ZfcsPurchasePlanAgreementTotalsInfoType.AgreementInfo getAgreementInfo() {
        return agreementInfo;
    }

    /**
     * Sets the value of the agreementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanAgreementTotalsInfoType.AgreementInfo }
     *     
     */
    public void setAgreementInfo(ZfcsPurchasePlanAgreementTotalsInfoType.AgreementInfo value) {
        this.agreementInfo = value;
    }

    /**
     * Gets the value of the agreementTotalsYearsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public ZfcsPurchasePlanFinanceResourcesType getAgreementTotalsYearsInfo() {
        return agreementTotalsYearsInfo;
    }

    /**
     * Sets the value of the agreementTotalsYearsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public void setAgreementTotalsYearsInfo(ZfcsPurchasePlanFinanceResourcesType value) {
        this.agreementTotalsYearsInfo = value;
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
     *         &lt;element name="agreementNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="agreementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "agreementNumber",
        "agreementDate"
    })
    public static class AgreementInfo {

        @XmlElement(required = true)
        protected String agreementNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar agreementDate;

        /**
         * Gets the value of the agreementNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreementNumber() {
            return agreementNumber;
        }

        /**
         * Sets the value of the agreementNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgreementNumber(String value) {
            this.agreementNumber = value;
        }

        /**
         * Gets the value of the agreementDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAgreementDate() {
            return agreementDate;
        }

        /**
         * Sets the value of the agreementDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAgreementDate(XMLGregorianCalendar value) {
            this.agreementDate = value;
        }

    }

}
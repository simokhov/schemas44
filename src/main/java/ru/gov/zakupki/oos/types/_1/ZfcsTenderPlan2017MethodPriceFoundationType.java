//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Метод определения и обоснования НМЦК для позиции плана-графика с 01.01.2017
 * 
 * <p>Java class for zfcs_tenderPlan2017MethodPriceFoundationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017MethodPriceFoundationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="methodCh1St22Type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017FoundMethodsEnum"/>
 *           &lt;element name="methodNotCh1St22">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="name">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;minLength value="1"/>
 *                           &lt;maxLength value="256"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="inabilityFoundationText">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;minLength value="1"/>
 *                           &lt;maxLength value="6000"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="methodPriceFoundationText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="6000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "zfcs_tenderPlan2017MethodPriceFoundationType", propOrder = {
    "methodCh1St22Type",
    "methodNotCh1St22",
    "methodPriceFoundationText"
})
public class ZfcsTenderPlan2017MethodPriceFoundationType {

    @XmlSchemaType(name = "string")
    protected ZfcsTenderPlan2017FoundMethodsEnum methodCh1St22Type;
    protected ZfcsTenderPlan2017MethodPriceFoundationType.MethodNotCh1St22 methodNotCh1St22;
    @XmlElement(required = true)
    protected String methodPriceFoundationText;

    /**
     * Gets the value of the methodCh1St22Type property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017FoundMethodsEnum }
     *     
     */
    public ZfcsTenderPlan2017FoundMethodsEnum getMethodCh1St22Type() {
        return methodCh1St22Type;
    }

    /**
     * Sets the value of the methodCh1St22Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017FoundMethodsEnum }
     *     
     */
    public void setMethodCh1St22Type(ZfcsTenderPlan2017FoundMethodsEnum value) {
        this.methodCh1St22Type = value;
    }

    /**
     * Gets the value of the methodNotCh1St22 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017MethodPriceFoundationType.MethodNotCh1St22 }
     *     
     */
    public ZfcsTenderPlan2017MethodPriceFoundationType.MethodNotCh1St22 getMethodNotCh1St22() {
        return methodNotCh1St22;
    }

    /**
     * Sets the value of the methodNotCh1St22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017MethodPriceFoundationType.MethodNotCh1St22 }
     *     
     */
    public void setMethodNotCh1St22(ZfcsTenderPlan2017MethodPriceFoundationType.MethodNotCh1St22 value) {
        this.methodNotCh1St22 = value;
    }

    /**
     * Gets the value of the methodPriceFoundationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodPriceFoundationText() {
        return methodPriceFoundationText;
    }

    /**
     * Sets the value of the methodPriceFoundationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodPriceFoundationText(String value) {
        this.methodPriceFoundationText = value;
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
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="inabilityFoundationText">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="6000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "name",
        "inabilityFoundationText"
    })
    public static class MethodNotCh1St22 {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String inabilityFoundationText;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the inabilityFoundationText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInabilityFoundationText() {
            return inabilityFoundationText;
        }

        /**
         * Sets the value of the inabilityFoundationText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInabilityFoundationText(String value) {
            this.inabilityFoundationText = value;
        }

    }

}

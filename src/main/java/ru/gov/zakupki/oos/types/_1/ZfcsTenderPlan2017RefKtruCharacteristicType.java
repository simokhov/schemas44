//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Характеристика товаров, работ, услуг для ввода из справочника
 * 
 * <p>Java class for zfcs_tenderPlan2017RefKtruCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017RefKtruCharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUDictCodeType"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUDictNameType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUCharacteristicTypeType" minOccurs="0"/>
 *         &lt;element name="values">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUCharacteristicValueType" maxOccurs="unbounded"/>
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
@XmlType(name = "zfcs_tenderPlan2017RefKtruCharacteristicType", propOrder = {
    "code",
    "name",
    "type",
    "values"
})
public class ZfcsTenderPlan2017RefKtruCharacteristicType {

    @XmlElement(required = true)
    protected String code;
    protected String name;
    protected String type;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017RefKtruCharacteristicType.Values values;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017RefKtruCharacteristicType.Values }
     *     
     */
    public ZfcsTenderPlan2017RefKtruCharacteristicType.Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017RefKtruCharacteristicType.Values }
     *     
     */
    public void setValues(ZfcsTenderPlan2017RefKtruCharacteristicType.Values value) {
        this.values = value;
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
     *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUCharacteristicValueType" maxOccurs="unbounded"/>
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
        "value"
    })
    public static class Values {

        @XmlElement(required = true)
        protected List<ZfcsKTRUCharacteristicValueType> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsKTRUCharacteristicValueType }
         * 
         * 
         */
        public List<ZfcsKTRUCharacteristicValueType> getValue() {
            if (value == null) {
                value = new ArrayList<ZfcsKTRUCharacteristicValueType>();
            }
            return this.value;
        }

    }

}

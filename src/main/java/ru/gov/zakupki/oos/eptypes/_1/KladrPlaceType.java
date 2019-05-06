//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.OKSMRef;


/**
 * Тип: Место доставки ТРУ по КЛАДР
 * 
 * <p>Java class for kladrPlaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kladrPlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="kladr" type="{http://zakupki.gov.ru/oos/EPtypes/1}kladrType"/>
 *           &lt;element name="country" type="{http://zakupki.gov.ru/oos/base/1}OKSMRef"/>
 *         &lt;/choice>
 *         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="noKladrForRegionSettlement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="region" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="settlement" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
@XmlType(name = "kladrPlaceType", propOrder = {
    "kladr",
    "country",
    "deliveryPlace",
    "noKladrForRegionSettlement"
})
public class KladrPlaceType {

    protected KladrType kladr;
    protected OKSMRef country;
    @XmlElement(required = true)
    protected String deliveryPlace;
    protected KladrPlaceType.NoKladrForRegionSettlement noKladrForRegionSettlement;

    /**
     * Gets the value of the kladr property.
     * 
     * @return
     *     possible object is
     *     {@link KladrType }
     *     
     */
    public KladrType getKladr() {
        return kladr;
    }

    /**
     * Sets the value of the kladr property.
     * 
     * @param value
     *     allowed object is
     *     {@link KladrType }
     *     
     */
    public void setKladr(KladrType value) {
        this.kladr = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link OKSMRef }
     *     
     */
    public OKSMRef getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKSMRef }
     *     
     */
    public void setCountry(OKSMRef value) {
        this.country = value;
    }

    /**
     * Gets the value of the deliveryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    /**
     * Sets the value of the deliveryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPlace(String value) {
        this.deliveryPlace = value;
    }

    /**
     * Gets the value of the noKladrForRegionSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link KladrPlaceType.NoKladrForRegionSettlement }
     *     
     */
    public KladrPlaceType.NoKladrForRegionSettlement getNoKladrForRegionSettlement() {
        return noKladrForRegionSettlement;
    }

    /**
     * Sets the value of the noKladrForRegionSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link KladrPlaceType.NoKladrForRegionSettlement }
     *     
     */
    public void setNoKladrForRegionSettlement(KladrPlaceType.NoKladrForRegionSettlement value) {
        this.noKladrForRegionSettlement = value;
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
     *         &lt;element name="region" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="settlement" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *               &lt;minLength value="1"/>
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
        "region",
        "settlement"
    })
    public static class NoKladrForRegionSettlement {

        protected String region;
        protected String settlement;

        /**
         * Gets the value of the region property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Gets the value of the settlement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSettlement() {
            return settlement;
        }

        /**
         * Sets the value of the settlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSettlement(String value) {
            this.settlement = value;
        }

    }

}

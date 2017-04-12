//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:02:32 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Преимущества при осуществлении закупок (требования к участникам закупки)
 * 
 * <p>Java class for zfcs_nsiPurchasePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiPurchasePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="450"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prefsReqsShortNameType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenceTypeEnum"/>
 *         &lt;element name="prefEstimateApp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prefValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="placingWays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="7"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="useTenderPlans" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tenderPlanPurchaseGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
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
@XmlType(name = "zfcs_nsiPurchasePreferencesType", propOrder = {
    "id",
    "name",
    "shortName",
    "type",
    "prefEstimateApp",
    "prefValue",
    "placingWays",
    "actual",
    "useTenderPlans",
    "tenderPlanPurchaseGroups"
})
public class ZfcsNsiPurchasePreferencesType {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    protected String shortName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPreferenceTypeEnum type;
    protected boolean prefEstimateApp;
    protected Double prefValue;
    protected ZfcsNsiPurchasePreferencesType.PlacingWays placingWays;
    protected boolean actual;
    protected Boolean useTenderPlans;
    protected ZfcsNsiPurchasePreferencesType.TenderPlanPurchaseGroups tenderPlanPurchaseGroups;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPreferenceTypeEnum }
     *     
     */
    public ZfcsPreferenceTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPreferenceTypeEnum }
     *     
     */
    public void setType(ZfcsPreferenceTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the prefEstimateApp property.
     * 
     */
    public boolean isPrefEstimateApp() {
        return prefEstimateApp;
    }

    /**
     * Sets the value of the prefEstimateApp property.
     * 
     */
    public void setPrefEstimateApp(boolean value) {
        this.prefEstimateApp = value;
    }

    /**
     * Gets the value of the prefValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrefValue() {
        return prefValue;
    }

    /**
     * Sets the value of the prefValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrefValue(Double value) {
        this.prefValue = value;
    }

    /**
     * Gets the value of the placingWays property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiPurchasePreferencesType.PlacingWays }
     *     
     */
    public ZfcsNsiPurchasePreferencesType.PlacingWays getPlacingWays() {
        return placingWays;
    }

    /**
     * Sets the value of the placingWays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiPurchasePreferencesType.PlacingWays }
     *     
     */
    public void setPlacingWays(ZfcsNsiPurchasePreferencesType.PlacingWays value) {
        this.placingWays = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     */
    public void setActual(boolean value) {
        this.actual = value;
    }

    /**
     * Gets the value of the useTenderPlans property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTenderPlans() {
        return useTenderPlans;
    }

    /**
     * Sets the value of the useTenderPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTenderPlans(Boolean value) {
        this.useTenderPlans = value;
    }

    /**
     * Gets the value of the tenderPlanPurchaseGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiPurchasePreferencesType.TenderPlanPurchaseGroups }
     *     
     */
    public ZfcsNsiPurchasePreferencesType.TenderPlanPurchaseGroups getTenderPlanPurchaseGroups() {
        return tenderPlanPurchaseGroups;
    }

    /**
     * Sets the value of the tenderPlanPurchaseGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiPurchasePreferencesType.TenderPlanPurchaseGroups }
     *     
     */
    public void setTenderPlanPurchaseGroups(ZfcsNsiPurchasePreferencesType.TenderPlanPurchaseGroups value) {
        this.tenderPlanPurchaseGroups = value;
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
     *         &lt;element name="code" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="7"/>
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
        "code"
    })
    public static class PlacingWays {

        @XmlElement(required = true)
        protected List<String> code;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCode() {
            if (code == null) {
                code = new ArrayList<String>();
            }
            return this.code;
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
     *         &lt;element name="code" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
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
        "code"
    })
    public static class TenderPlanPurchaseGroups {

        @XmlElement(required = true)
        protected List<String> code;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCode() {
            if (code == null) {
                code = new ArrayList<String>();
            }
            return this.code;
        }

    }

}

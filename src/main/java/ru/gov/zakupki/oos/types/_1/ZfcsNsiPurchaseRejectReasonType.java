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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Справочник причин отказа в допуске заявок
 * 
 * <p>Java class for zfcs_nsiPurchaseRejectReasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiPurchaseRejectReasonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/base/1}rejectReasonCode" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/base/1}rejectReasonName"/>
 *         &lt;element name="placingWays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subsystemType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subsystemTypePurchaseRejectReasonEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiPurchaseRejectReasonType", propOrder = {
    "id",
    "code",
    "reason",
    "placingWays",
    "actual",
    "subsystemType"
})
public class ZfcsNsiPurchaseRejectReasonType {

    protected long id;
    protected String code;
    @XmlElement(required = true)
    protected String reason;
    protected ZfcsNsiPurchaseRejectReasonType.PlacingWays placingWays;
    protected boolean actual;
    @XmlSchemaType(name = "string")
    protected ZfcsSubsystemTypePurchaseRejectReasonEnum subsystemType;

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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the placingWays property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiPurchaseRejectReasonType.PlacingWays }
     *     
     */
    public ZfcsNsiPurchaseRejectReasonType.PlacingWays getPlacingWays() {
        return placingWays;
    }

    /**
     * Sets the value of the placingWays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiPurchaseRejectReasonType.PlacingWays }
     *     
     */
    public void setPlacingWays(ZfcsNsiPurchaseRejectReasonType.PlacingWays value) {
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
     * Gets the value of the subsystemType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSubsystemTypePurchaseRejectReasonEnum }
     *     
     */
    public ZfcsSubsystemTypePurchaseRejectReasonEnum getSubsystemType() {
        return subsystemType;
    }

    /**
     * Sets the value of the subsystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSubsystemTypePurchaseRejectReasonEnum }
     *     
     */
    public void setSubsystemType(ZfcsSubsystemTypePurchaseRejectReasonEnum value) {
        this.subsystemType = value;
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
     *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" maxOccurs="unbounded"/>
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
        "placingWay"
    })
    public static class PlacingWays {

        @XmlElement(required = true)
        protected List<ZfcsPlacingWayType> placingWay;

        /**
         * Gets the value of the placingWay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placingWay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlacingWay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPlacingWayType }
         * 
         * 
         */
        public List<ZfcsPlacingWayType> getPlacingWay() {
            if (placingWay == null) {
                placingWay = new ArrayList<ZfcsPlacingWayType>();
            }
            return this.placingWay;
        }

    }

}

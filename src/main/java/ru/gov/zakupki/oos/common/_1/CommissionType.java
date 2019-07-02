//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.common._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Комиссии по размещению заказа (определению поставщика)
 * 
 * <p>Java class for commissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="commissionMembers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commissionMember" type="{http://zakupki.gov.ru/oos/common/1}commissionMemberType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commissionType", propOrder = {
    "commissionName",
    "commissionMembers",
    "addInfo"
})
public class CommissionType {

    @XmlElement(required = true)
    protected String commissionName;
    @XmlElement(required = true)
    protected CommissionType.CommissionMembers commissionMembers;
    protected String addInfo;

    /**
     * Gets the value of the commissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionName() {
        return commissionName;
    }

    /**
     * Sets the value of the commissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionName(String value) {
        this.commissionName = value;
    }

    /**
     * Gets the value of the commissionMembers property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType.CommissionMembers }
     *     
     */
    public CommissionType.CommissionMembers getCommissionMembers() {
        return commissionMembers;
    }

    /**
     * Sets the value of the commissionMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType.CommissionMembers }
     *     
     */
    public void setCommissionMembers(CommissionType.CommissionMembers value) {
        this.commissionMembers = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
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
     *         &lt;element name="commissionMember" type="{http://zakupki.gov.ru/oos/common/1}commissionMemberType" maxOccurs="unbounded"/>
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
        "commissionMember"
    })
    public static class CommissionMembers {

        @XmlElement(required = true)
        protected List<CommissionMemberType> commissionMember;

        /**
         * Gets the value of the commissionMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commissionMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommissionMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommissionMemberType }
         * 
         * 
         */
        public List<CommissionMemberType> getCommissionMember() {
            if (commissionMember == null) {
                commissionMember = new ArrayList<CommissionMemberType>();
            }
            return this.commissionMember;
        }

    }

}

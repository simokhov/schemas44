//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:53:38 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Комиссии по размещению заказа
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
 *         &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="commissionName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionMembers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commissionMember" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="role" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="name">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="votes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="rightVote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="name" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "regNumber",
    "commissionName",
    "commissionMembers",
    "owner",
    "actual"
})
public class CommissionType {

    protected int regNumber;
    @XmlElement(required = true)
    protected String commissionName;
    protected CommissionType.CommissionMembers commissionMembers;
    @XmlElement(required = true)
    protected OrganizationRef owner;
    protected boolean actual;

    /**
     * Gets the value of the regNumber property.
     * 
     */
    public int getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     */
    public void setRegNumber(int value) {
        this.regNumber = value;
    }

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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRef }
     *     
     */
    public OrganizationRef getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRef }
     *     
     */
    public void setOwner(OrganizationRef value) {
        this.owner = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="commissionMember" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="role" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="name">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="votes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="rightVote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="name" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="256"/>
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
    @XmlType(name = "", propOrder = {
        "commissionMember"
    })
    public static class CommissionMembers {

        @XmlElement(required = true)
        protected List<CommissionType.CommissionMembers.CommissionMember> commissionMember;

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
         * {@link CommissionType.CommissionMembers.CommissionMember }
         * 
         * 
         */
        public List<CommissionType.CommissionMembers.CommissionMember> getCommissionMember() {
            if (commissionMember == null) {
                commissionMember = new ArrayList<CommissionType.CommissionMembers.CommissionMember>();
            }
            return this.commissionMember;
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
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="role" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="name">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="50"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="votes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="rightVote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="name" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="256"/>
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
            "id",
            "role",
            "name"
        })
        public static class CommissionMember {

            protected long id;
            protected List<CommissionType.CommissionMembers.CommissionMember.Role> role;
            protected String name;

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
             * Gets the value of the role property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the role property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRole().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CommissionType.CommissionMembers.CommissionMember.Role }
             * 
             * 
             */
            public List<CommissionType.CommissionMembers.CommissionMember.Role> getRole() {
                if (role == null) {
                    role = new ArrayList<CommissionType.CommissionMembers.CommissionMember.Role>();
                }
                return this.role;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="name">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="50"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="votes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="rightVote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "id",
                "name",
                "order",
                "votes",
                "rightVote"
            })
            public static class Role {

                protected long id;
                @XmlElement(required = true)
                protected String name;
                protected Integer order;
                protected Long votes;
                protected Boolean rightVote;

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
                 * Gets the value of the order property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOrder() {
                    return order;
                }

                /**
                 * Sets the value of the order property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrder(Integer value) {
                    this.order = value;
                }

                /**
                 * Gets the value of the votes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getVotes() {
                    return votes;
                }

                /**
                 * Sets the value of the votes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setVotes(Long value) {
                    this.votes = value;
                }

                /**
                 * Gets the value of the rightVote property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRightVote() {
                    return rightVote;
                }

                /**
                 * Sets the value of the rightVote property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRightVote(Boolean value) {
                    this.rightVote = value;
                }

            }

        }

    }

}

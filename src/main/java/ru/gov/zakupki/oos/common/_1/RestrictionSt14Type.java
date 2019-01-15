//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.common._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.NPASt14Ref;


/**
 * Тип: Сведения по запрету, ограничению участия, условию допуска
 * 
 * <p>Java class for restrictionSt14Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restrictionSt14Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restrictionSt14" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requirementsType">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requirementType" maxOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="AC"/>
 *                                             &lt;enumeration value="RA"/>
 *                                             &lt;enumeration value="BAN"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NPAInfo" type="{http://zakupki.gov.ru/oos/base/1}NPASt14Ref"/>
 *                   &lt;element name="exception" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="imposibilityBan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="imposibilityBanReason" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="note" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
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
@XmlType(name = "restrictionSt14Type", propOrder = {
    "restrictionSt14"
})
public class RestrictionSt14Type {

    @XmlElement(required = true)
    protected List<RestrictionSt14Type.RestrictionSt14> restrictionSt14;

    /**
     * Gets the value of the restrictionSt14 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionSt14 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictionSt14().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionSt14Type.RestrictionSt14 }
     * 
     * 
     */
    public List<RestrictionSt14Type.RestrictionSt14> getRestrictionSt14() {
        if (restrictionSt14 == null) {
            restrictionSt14 = new ArrayList<RestrictionSt14Type.RestrictionSt14>();
        }
        return this.restrictionSt14;
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
     *         &lt;element name="requirementsType">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requirementType" maxOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="AC"/>
     *                                   &lt;enumeration value="RA"/>
     *                                   &lt;enumeration value="BAN"/>
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
     *         &lt;element name="NPAInfo" type="{http://zakupki.gov.ru/oos/base/1}NPASt14Ref"/>
     *         &lt;element name="exception" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="imposibilityBan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="imposibilityBanReason" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="note" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
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
        "requirementsType",
        "npaInfo",
        "exception",
        "note"
    })
    public static class RestrictionSt14 {

        @XmlElement(required = true)
        protected RestrictionSt14Type.RestrictionSt14 .RequirementsType requirementsType;
        @XmlElement(name = "NPAInfo", required = true)
        protected NPASt14Ref npaInfo;
        protected RestrictionSt14Type.RestrictionSt14 .Exception exception;
        protected String note;

        /**
         * Gets the value of the requirementsType property.
         * 
         * @return
         *     possible object is
         *     {@link RestrictionSt14Type.RestrictionSt14 .RequirementsType }
         *     
         */
        public RestrictionSt14Type.RestrictionSt14 .RequirementsType getRequirementsType() {
            return requirementsType;
        }

        /**
         * Sets the value of the requirementsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link RestrictionSt14Type.RestrictionSt14 .RequirementsType }
         *     
         */
        public void setRequirementsType(RestrictionSt14Type.RestrictionSt14 .RequirementsType value) {
            this.requirementsType = value;
        }

        /**
         * Gets the value of the npaInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NPASt14Ref }
         *     
         */
        public NPASt14Ref getNPAInfo() {
            return npaInfo;
        }

        /**
         * Sets the value of the npaInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NPASt14Ref }
         *     
         */
        public void setNPAInfo(NPASt14Ref value) {
            this.npaInfo = value;
        }

        /**
         * Gets the value of the exception property.
         * 
         * @return
         *     possible object is
         *     {@link RestrictionSt14Type.RestrictionSt14 .Exception }
         *     
         */
        public RestrictionSt14Type.RestrictionSt14 .Exception getException() {
            return exception;
        }

        /**
         * Sets the value of the exception property.
         * 
         * @param value
         *     allowed object is
         *     {@link RestrictionSt14Type.RestrictionSt14 .Exception }
         *     
         */
        public void setException(RestrictionSt14Type.RestrictionSt14 .Exception value) {
            this.exception = value;
        }

        /**
         * Gets the value of the note property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNote() {
            return note;
        }

        /**
         * Sets the value of the note property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNote(String value) {
            this.note = value;
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
         *         &lt;element name="imposibilityBan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="imposibilityBanReason" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
            "imposibilityBan",
            "imposibilityBanReason"
        })
        public static class Exception {

            protected boolean imposibilityBan;
            @XmlElement(required = true)
            protected String imposibilityBanReason;

            /**
             * Gets the value of the imposibilityBan property.
             * 
             */
            public boolean isImposibilityBan() {
                return imposibilityBan;
            }

            /**
             * Sets the value of the imposibilityBan property.
             * 
             */
            public void setImposibilityBan(boolean value) {
                this.imposibilityBan = value;
            }

            /**
             * Gets the value of the imposibilityBanReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImposibilityBanReason() {
                return imposibilityBanReason;
            }

            /**
             * Sets the value of the imposibilityBanReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImposibilityBanReason(String value) {
                this.imposibilityBanReason = value;
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
         *         &lt;element name="requirementType" maxOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="AC"/>
         *                         &lt;enumeration value="RA"/>
         *                         &lt;enumeration value="BAN"/>
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
            "requirementType"
        })
        public static class RequirementsType {

            @XmlElement(required = true)
            protected List<RestrictionSt14Type.RestrictionSt14 .RequirementsType.RequirementType> requirementType;

            /**
             * Gets the value of the requirementType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the requirementType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRequirementType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RestrictionSt14Type.RestrictionSt14 .RequirementsType.RequirementType }
             * 
             * 
             */
            public List<RestrictionSt14Type.RestrictionSt14 .RequirementsType.RequirementType> getRequirementType() {
                if (requirementType == null) {
                    requirementType = new ArrayList<RestrictionSt14Type.RestrictionSt14 .RequirementsType.RequirementType>();
                }
                return this.requirementType;
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
             *         &lt;element name="type">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="AC"/>
             *               &lt;enumeration value="RA"/>
             *               &lt;enumeration value="BAN"/>
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
                "type"
            })
            public static class RequirementType {

                @XmlElement(required = true)
                protected String type;

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

            }

        }

    }

}
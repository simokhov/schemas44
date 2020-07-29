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
import ru.gov.zakupki.oos.base._1.PrefsReqsRef;


/**
 * Тип: Требование  (ограничение) к участникам (с дополнительными требованиями)
 * 
 * <p>Java class for requirementWithAddReqsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requirementWithAddReqsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preferenseRequirementInfo" type="{http://zakupki.gov.ru/oos/base/1}prefsReqsRef"/>
 *         &lt;element name="content" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
 *         &lt;element name="addRequirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addRequirement" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/base/1}prefsReqsShortNameType"/>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                             &lt;element name="content" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requirementWithAddReqsType", propOrder = {
    "preferenseRequirementInfo",
    "content",
    "addRequirements"
})
public class RequirementWithAddReqsType {

    @XmlElement(required = true)
    protected PrefsReqsRef preferenseRequirementInfo;
    protected String content;
    protected RequirementWithAddReqsType.AddRequirements addRequirements;

    /**
     * Gets the value of the preferenseRequirementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrefsReqsRef }
     *     
     */
    public PrefsReqsRef getPreferenseRequirementInfo() {
        return preferenseRequirementInfo;
    }

    /**
     * Sets the value of the preferenseRequirementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefsReqsRef }
     *     
     */
    public void setPreferenseRequirementInfo(PrefsReqsRef value) {
        this.preferenseRequirementInfo = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the addRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementWithAddReqsType.AddRequirements }
     *     
     */
    public RequirementWithAddReqsType.AddRequirements getAddRequirements() {
        return addRequirements;
    }

    /**
     * Sets the value of the addRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementWithAddReqsType.AddRequirements }
     *     
     */
    public void setAddRequirements(RequirementWithAddReqsType.AddRequirements value) {
        this.addRequirements = value;
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
     *         &lt;element name="addRequirement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/base/1}prefsReqsShortNameType"/>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *                   &lt;element name="content" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
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
        "addRequirement"
    })
    public static class AddRequirements {

        @XmlElement(required = true)
        protected List<RequirementWithAddReqsType.AddRequirements.AddRequirement> addRequirement;

        /**
         * Gets the value of the addRequirement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addRequirement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddRequirement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequirementWithAddReqsType.AddRequirements.AddRequirement }
         * 
         * 
         */
        public List<RequirementWithAddReqsType.AddRequirements.AddRequirement> getAddRequirement() {
            if (addRequirement == null) {
                addRequirement = new ArrayList<RequirementWithAddReqsType.AddRequirements.AddRequirement>();
            }
            return this.addRequirement;
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
         *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/base/1}prefsReqsShortNameType"/>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
         *         &lt;element name="content" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
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
            "shortName",
            "name",
            "content"
        })
        public static class AddRequirement {

            @XmlElement(required = true)
            protected String shortName;
            protected String name;
            protected String content;

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
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContent(String value) {
                this.content = value;
            }

        }

    }

}
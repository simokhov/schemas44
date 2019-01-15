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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.OKTMOPPORef;
import ru.gov.zakupki.oos.base._1.OrganizationRef;


/**
 * Сведения о лимитах бюджетных обязательств (ЛБО), загружаемых из региональных систем финансового учета
 * 
 * <p>Java class for zfcs_LBOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_LBOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
 *         &lt;element name="controlAuthorityInfo" type="{http://zakupki.gov.ru/oos/base/1}organizationRef"/>
 *         &lt;element name="customerLBOsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customerLBOInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="createDataDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="relevanceYear" type="{http://zakupki.gov.ru/oos/base/1}yearType"/>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                             &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                             &lt;element name="customerInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
 *                                     &lt;sequence>
 *                                       &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/base/1}OKTMOPPORef" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ownerInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
 *                                     &lt;sequence>
 *                                       &lt;element name="ownerRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanVersionOwnerRoleType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="KBKsInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KBKInfo" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
 *                                                 &lt;element name="finYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
 *                                                 &lt;element name="firstYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
 *                                                 &lt;element name="secondYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
 *                                                 &lt;element name="subsecYearsSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_LBOType", propOrder = {
    "id",
    "controlAuthorityInfo",
    "customerLBOsInfo"
})
public class ZfcsLBOType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected OrganizationRef controlAuthorityInfo;
    @XmlElement(required = true)
    protected ZfcsLBOType.CustomerLBOsInfo customerLBOsInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the controlAuthorityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRef }
     *     
     */
    public OrganizationRef getControlAuthorityInfo() {
        return controlAuthorityInfo;
    }

    /**
     * Sets the value of the controlAuthorityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRef }
     *     
     */
    public void setControlAuthorityInfo(OrganizationRef value) {
        this.controlAuthorityInfo = value;
    }

    /**
     * Gets the value of the customerLBOsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLBOType.CustomerLBOsInfo }
     *     
     */
    public ZfcsLBOType.CustomerLBOsInfo getCustomerLBOsInfo() {
        return customerLBOsInfo;
    }

    /**
     * Sets the value of the customerLBOsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLBOType.CustomerLBOsInfo }
     *     
     */
    public void setCustomerLBOsInfo(ZfcsLBOType.CustomerLBOsInfo value) {
        this.customerLBOsInfo = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *         &lt;element name="customerLBOInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="createDataDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="relevanceYear" type="{http://zakupki.gov.ru/oos/base/1}yearType"/>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *                   &lt;element name="customerInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
     *                           &lt;sequence>
     *                             &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/base/1}OKTMOPPORef" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ownerInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
     *                           &lt;sequence>
     *                             &lt;element name="ownerRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanVersionOwnerRoleType"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="KBKsInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="KBKInfo" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
     *                                       &lt;element name="finYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
     *                                       &lt;element name="firstYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
     *                                       &lt;element name="secondYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
     *                                       &lt;element name="subsecYearsSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type" minOccurs="0"/>
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
        "customerLBOInfo"
    })
    public static class CustomerLBOsInfo {

        @XmlElement(required = true)
        protected List<ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo> customerLBOInfo;

        /**
         * Gets the value of the customerLBOInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerLBOInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerLBOInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo }
         * 
         * 
         */
        public List<ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo> getCustomerLBOInfo() {
            if (customerLBOInfo == null) {
                customerLBOInfo = new ArrayList<ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo>();
            }
            return this.customerLBOInfo;
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
         *         &lt;element name="createDataDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="relevanceYear" type="{http://zakupki.gov.ru/oos/base/1}yearType"/>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
         *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
         *         &lt;element name="customerInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
         *                 &lt;sequence>
         *                   &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/base/1}OKTMOPPORef" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ownerInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
         *                 &lt;sequence>
         *                   &lt;element name="ownerRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanVersionOwnerRoleType"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="KBKsInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="KBKInfo" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
         *                             &lt;element name="finYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
         *                             &lt;element name="firstYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
         *                             &lt;element name="secondYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
         *                             &lt;element name="subsecYearsSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "createDataDT",
            "relevanceYear",
            "name",
            "number",
            "customerInfo",
            "ownerInfo",
            "kbKsInfo"
        })
        public static class CustomerLBOInfo {

            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar createDataDT;
            protected int relevanceYear;
            protected String name;
            protected String number;
            @XmlElement(required = true)
            protected ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.CustomerInfo customerInfo;
            @XmlElement(required = true)
            protected ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.OwnerInfo ownerInfo;
            @XmlElement(name = "KBKsInfo", required = true)
            protected ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo kbKsInfo;

            /**
             * Gets the value of the createDataDT property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreateDataDT() {
                return createDataDT;
            }

            /**
             * Sets the value of the createDataDT property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreateDataDT(XMLGregorianCalendar value) {
                this.createDataDT = value;
            }

            /**
             * Gets the value of the relevanceYear property.
             * 
             */
            public int getRelevanceYear() {
                return relevanceYear;
            }

            /**
             * Sets the value of the relevanceYear property.
             * 
             */
            public void setRelevanceYear(int value) {
                this.relevanceYear = value;
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
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the customerInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.CustomerInfo }
             *     
             */
            public ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.CustomerInfo getCustomerInfo() {
                return customerInfo;
            }

            /**
             * Sets the value of the customerInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.CustomerInfo }
             *     
             */
            public void setCustomerInfo(ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.CustomerInfo value) {
                this.customerInfo = value;
            }

            /**
             * Gets the value of the ownerInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.OwnerInfo }
             *     
             */
            public ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.OwnerInfo getOwnerInfo() {
                return ownerInfo;
            }

            /**
             * Sets the value of the ownerInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.OwnerInfo }
             *     
             */
            public void setOwnerInfo(ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.OwnerInfo value) {
                this.ownerInfo = value;
            }

            /**
             * Gets the value of the kbKsInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo }
             *     
             */
            public ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo getKBKsInfo() {
                return kbKsInfo;
            }

            /**
             * Sets the value of the kbKsInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo }
             *     
             */
            public void setKBKsInfo(ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo value) {
                this.kbKsInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
             *       &lt;sequence>
             *         &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/base/1}OKTMOPPORef" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "oktmoppo"
            })
            public static class CustomerInfo
                extends OrganizationRef
            {

                @XmlElement(name = "OKTMOPPO")
                protected OKTMOPPORef oktmoppo;

                /**
                 * Gets the value of the oktmoppo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OKTMOPPORef }
                 *     
                 */
                public OKTMOPPORef getOKTMOPPO() {
                    return oktmoppo;
                }

                /**
                 * Sets the value of the oktmoppo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OKTMOPPORef }
                 *     
                 */
                public void setOKTMOPPO(OKTMOPPORef value) {
                    this.oktmoppo = value;
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
             *         &lt;element name="KBKInfo" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
             *                   &lt;element name="finYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
             *                   &lt;element name="firstYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
             *                   &lt;element name="secondYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
             *                   &lt;element name="subsecYearsSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type" minOccurs="0"/>
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
                "kbkInfo"
            })
            public static class KBKsInfo {

                @XmlElement(name = "KBKInfo", required = true)
                protected List<ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo.KBKInfo> kbkInfo;

                /**
                 * Gets the value of the kbkInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the kbkInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getKBKInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo.KBKInfo }
                 * 
                 * 
                 */
                public List<ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo.KBKInfo> getKBKInfo() {
                    if (kbkInfo == null) {
                        kbkInfo = new ArrayList<ZfcsLBOType.CustomerLBOsInfo.CustomerLBOInfo.KBKsInfo.KBKInfo>();
                    }
                    return this.kbkInfo;
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
                 *         &lt;element name="KBK" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
                 *         &lt;element name="finYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
                 *         &lt;element name="firstYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
                 *         &lt;element name="secondYearSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type"/>
                 *         &lt;element name="subsecYearsSum" type="{http://zakupki.gov.ru/oos/base/1}moneyPosNegMaxLengthToPoint18Type" minOccurs="0"/>
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
                    "kbk",
                    "finYearSum",
                    "firstYearSum",
                    "secondYearSum",
                    "subsecYearsSum"
                })
                public static class KBKInfo {

                    @XmlElement(name = "KBK", required = true)
                    protected String kbk;
                    @XmlElement(required = true)
                    protected String finYearSum;
                    @XmlElement(required = true)
                    protected String firstYearSum;
                    @XmlElement(required = true)
                    protected String secondYearSum;
                    protected String subsecYearsSum;

                    /**
                     * Gets the value of the kbk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKBK() {
                        return kbk;
                    }

                    /**
                     * Sets the value of the kbk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKBK(String value) {
                        this.kbk = value;
                    }

                    /**
                     * Gets the value of the finYearSum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFinYearSum() {
                        return finYearSum;
                    }

                    /**
                     * Sets the value of the finYearSum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFinYearSum(String value) {
                        this.finYearSum = value;
                    }

                    /**
                     * Gets the value of the firstYearSum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFirstYearSum() {
                        return firstYearSum;
                    }

                    /**
                     * Sets the value of the firstYearSum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFirstYearSum(String value) {
                        this.firstYearSum = value;
                    }

                    /**
                     * Gets the value of the secondYearSum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSecondYearSum() {
                        return secondYearSum;
                    }

                    /**
                     * Sets the value of the secondYearSum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSecondYearSum(String value) {
                        this.secondYearSum = value;
                    }

                    /**
                     * Gets the value of the subsecYearsSum property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubsecYearsSum() {
                        return subsecYearsSum;
                    }

                    /**
                     * Sets the value of the subsecYearsSum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubsecYearsSum(String value) {
                        this.subsecYearsSum = value;
                    }

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
             *     &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
             *       &lt;sequence>
             *         &lt;element name="ownerRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanVersionOwnerRoleType"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ownerRole"
            })
            public static class OwnerInfo
                extends OrganizationRef
            {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected ZfcsPurchasePlanVersionOwnerRoleType ownerRole;

                /**
                 * Gets the value of the ownerRole property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPurchasePlanVersionOwnerRoleType }
                 *     
                 */
                public ZfcsPurchasePlanVersionOwnerRoleType getOwnerRole() {
                    return ownerRole;
                }

                /**
                 * Sets the value of the ownerRole property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPurchasePlanVersionOwnerRoleType }
                 *     
                 */
                public void setOwnerRole(ZfcsPurchasePlanVersionOwnerRoleType value) {
                    this.ownerRole = value;
                }

            }

        }

    }

}
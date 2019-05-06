//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
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
 * Справочник: Способы размещения заказа (определения поставщика)
 * 
 * <p>Java class for zfcs_nsiPlacingWayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiPlacingWayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placingWayId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/base/1}placingWayCodeType"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subsystemType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayTypeEnum"/>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="document" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType"/>
 *                             &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="compDocuments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="document" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType"/>
 *                             &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="usedInRPGInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="usedInRPG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="RPGJoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="RPGNot111" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isProcedure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isExclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiPlacingWayType", propOrder = {
    "placingWayId",
    "code",
    "name",
    "type",
    "subsystemType",
    "actual",
    "documents",
    "compDocuments",
    "usedInRPGInfo",
    "isProcedure",
    "isExclude"
})
public class ZfcsNsiPlacingWayType {

    protected long placingWayId;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPlacingWayTypeEnum subsystemType;
    protected boolean actual;
    protected ZfcsNsiPlacingWayType.Documents documents;
    protected ZfcsNsiPlacingWayType.CompDocuments compDocuments;
    protected ZfcsNsiPlacingWayType.UsedInRPGInfo usedInRPGInfo;
    protected Boolean isProcedure;
    protected Boolean isExclude;

    /**
     * Gets the value of the placingWayId property.
     * 
     */
    public long getPlacingWayId() {
        return placingWayId;
    }

    /**
     * Sets the value of the placingWayId property.
     * 
     */
    public void setPlacingWayId(long value) {
        this.placingWayId = value;
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
     * Gets the value of the subsystemType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPlacingWayTypeEnum }
     *     
     */
    public ZfcsPlacingWayTypeEnum getSubsystemType() {
        return subsystemType;
    }

    /**
     * Sets the value of the subsystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPlacingWayTypeEnum }
     *     
     */
    public void setSubsystemType(ZfcsPlacingWayTypeEnum value) {
        this.subsystemType = value;
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
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiPlacingWayType.Documents }
     *     
     */
    public ZfcsNsiPlacingWayType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiPlacingWayType.Documents }
     *     
     */
    public void setDocuments(ZfcsNsiPlacingWayType.Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the compDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiPlacingWayType.CompDocuments }
     *     
     */
    public ZfcsNsiPlacingWayType.CompDocuments getCompDocuments() {
        return compDocuments;
    }

    /**
     * Sets the value of the compDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiPlacingWayType.CompDocuments }
     *     
     */
    public void setCompDocuments(ZfcsNsiPlacingWayType.CompDocuments value) {
        this.compDocuments = value;
    }

    /**
     * Gets the value of the usedInRPGInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiPlacingWayType.UsedInRPGInfo }
     *     
     */
    public ZfcsNsiPlacingWayType.UsedInRPGInfo getUsedInRPGInfo() {
        return usedInRPGInfo;
    }

    /**
     * Sets the value of the usedInRPGInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiPlacingWayType.UsedInRPGInfo }
     *     
     */
    public void setUsedInRPGInfo(ZfcsNsiPlacingWayType.UsedInRPGInfo value) {
        this.usedInRPGInfo = value;
    }

    /**
     * Gets the value of the isProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProcedure() {
        return isProcedure;
    }

    /**
     * Sets the value of the isProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProcedure(Boolean value) {
        this.isProcedure = value;
    }

    /**
     * Gets the value of the isExclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExclude() {
        return isExclude;
    }

    /**
     * Sets the value of the isExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExclude(Boolean value) {
        this.isExclude = value;
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
     *         &lt;element name="document" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType"/>
     *                   &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "document"
    })
    public static class CompDocuments {

        @XmlElement(required = true)
        protected List<ZfcsNsiPlacingWayType.CompDocuments.Document> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPlacingWayType.CompDocuments.Document }
         * 
         * 
         */
        public List<ZfcsNsiPlacingWayType.CompDocuments.Document> getDocument() {
            if (document == null) {
                document = new ArrayList<ZfcsNsiPlacingWayType.CompDocuments.Document>();
            }
            return this.document;
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
         *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType"/>
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
        @XmlType(name = "", propOrder = {
            "code",
            "name",
            "actual"
        })
        public static class Document {

            @XmlElement(required = true)
            protected String code;
            @XmlElement(required = true)
            protected String name;
            protected boolean actual;

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
     *         &lt;element name="document" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType"/>
     *                   &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "document"
    })
    public static class Documents {

        @XmlElement(required = true)
        protected List<ZfcsNsiPlacingWayType.Documents.Document> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiPlacingWayType.Documents.Document }
         * 
         * 
         */
        public List<ZfcsNsiPlacingWayType.Documents.Document> getDocument() {
            if (document == null) {
                document = new ArrayList<ZfcsNsiPlacingWayType.Documents.Document>();
            }
            return this.document;
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
         *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocCodeType"/>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSingleCustomerReasonDocNameType"/>
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
        @XmlType(name = "", propOrder = {
            "code",
            "name",
            "actual"
        })
        public static class Document {

            @XmlElement(required = true)
            protected String code;
            @XmlElement(required = true)
            protected String name;
            protected boolean actual;

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
     *         &lt;element name="usedInRPG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="RPGJoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="RPGNot111" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "usedInRPG",
        "rpgJoint",
        "rpgNot111"
    })
    public static class UsedInRPGInfo {

        protected Boolean usedInRPG;
        @XmlElement(name = "RPGJoint")
        protected Boolean rpgJoint;
        @XmlElement(name = "RPGNot111")
        protected Boolean rpgNot111;

        /**
         * Gets the value of the usedInRPG property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUsedInRPG() {
            return usedInRPG;
        }

        /**
         * Sets the value of the usedInRPG property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUsedInRPG(Boolean value) {
            this.usedInRPG = value;
        }

        /**
         * Gets the value of the rpgJoint property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRPGJoint() {
            return rpgJoint;
        }

        /**
         * Sets the value of the rpgJoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRPGJoint(Boolean value) {
            this.rpgJoint = value;
        }

        /**
         * Gets the value of the rpgNot111 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRPGNot111() {
            return rpgNot111;
        }

        /**
         * Sets the value of the rpgNot111 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRPGNot111(Boolean value) {
            this.rpgNot111 = value;
        }

    }

}

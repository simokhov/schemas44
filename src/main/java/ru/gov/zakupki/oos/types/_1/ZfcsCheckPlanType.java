//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:49:49 AM MSK 
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


/**
 * План проверок
 * 
 * <p>Java class for zfcs_checkPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanNumberType"/>
 *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="startStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="endStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="checkList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkNumberType"/>
 *                             &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType"/>
 *                             &lt;element name="checkStartStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *                             &lt;element name="checkPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="base">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4000"/>
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
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkPlanType", propOrder = {
    "commonInfo",
    "startStage",
    "endStage",
    "checkList",
    "printForm"
})
public class ZfcsCheckPlanType {

    @XmlElement(required = true)
    protected ZfcsCheckPlanType.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected ZfcsStageType startStage;
    @XmlElement(required = true)
    protected ZfcsStageType endStage;
    @XmlElement(required = true)
    protected ZfcsCheckPlanType.CheckList checkList;
    protected ZfcsPrintFormType printForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckPlanType.CommonInfo }
     *     
     */
    public ZfcsCheckPlanType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckPlanType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsCheckPlanType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the startStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStageType }
     *     
     */
    public ZfcsStageType getStartStage() {
        return startStage;
    }

    /**
     * Sets the value of the startStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStageType }
     *     
     */
    public void setStartStage(ZfcsStageType value) {
        this.startStage = value;
    }

    /**
     * Gets the value of the endStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStageType }
     *     
     */
    public ZfcsStageType getEndStage() {
        return endStage;
    }

    /**
     * Sets the value of the endStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStageType }
     *     
     */
    public void setEndStage(ZfcsStageType value) {
        this.endStage = value;
    }

    /**
     * Gets the value of the checkList property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckPlanType.CheckList }
     *     
     */
    public ZfcsCheckPlanType.CheckList getCheckList() {
        return checkList;
    }

    /**
     * Sets the value of the checkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckPlanType.CheckList }
     *     
     */
    public void setCheckList(ZfcsCheckPlanType.CheckList value) {
        this.checkList = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
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
     *         &lt;element name="checkInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkNumberType"/>
     *                   &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType"/>
     *                   &lt;element name="checkStartStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
     *                   &lt;element name="checkPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="base">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4000"/>
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
        "checkInfo"
    })
    public static class CheckList {

        @XmlElement(required = true)
        protected List<ZfcsCheckPlanType.CheckList.CheckInfo> checkInfo;

        /**
         * Gets the value of the checkInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCheckPlanType.CheckList.CheckInfo }
         * 
         * 
         */
        public List<ZfcsCheckPlanType.CheckList.CheckInfo> getCheckInfo() {
            if (checkInfo == null) {
                checkInfo = new ArrayList<ZfcsCheckPlanType.CheckList.CheckInfo>();
            }
            return this.checkInfo;
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
         *         &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkNumberType"/>
         *         &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType"/>
         *         &lt;element name="checkStartStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
         *         &lt;element name="checkPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="base">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4000"/>
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
            "checkNumber",
            "checkSubject",
            "checkStartStage",
            "checkPublishDate",
            "base"
        })
        public static class CheckInfo {

            @XmlElement(required = true)
            protected String checkNumber;
            @XmlElement(required = true)
            protected ZfcsCheckSubjectPlanType checkSubject;
            @XmlElement(required = true)
            protected ZfcsStageType checkStartStage;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar checkPublishDate;
            @XmlElement(required = true)
            protected String base;

            /**
             * Gets the value of the checkNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckNumber() {
                return checkNumber;
            }

            /**
             * Sets the value of the checkNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckNumber(String value) {
                this.checkNumber = value;
            }

            /**
             * Gets the value of the checkSubject property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCheckSubjectPlanType }
             *     
             */
            public ZfcsCheckSubjectPlanType getCheckSubject() {
                return checkSubject;
            }

            /**
             * Sets the value of the checkSubject property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCheckSubjectPlanType }
             *     
             */
            public void setCheckSubject(ZfcsCheckSubjectPlanType value) {
                this.checkSubject = value;
            }

            /**
             * Gets the value of the checkStartStage property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsStageType }
             *     
             */
            public ZfcsStageType getCheckStartStage() {
                return checkStartStage;
            }

            /**
             * Sets the value of the checkStartStage property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsStageType }
             *     
             */
            public void setCheckStartStage(ZfcsStageType value) {
                this.checkStartStage = value;
            }

            /**
             * Gets the value of the checkPublishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCheckPublishDate() {
                return checkPublishDate;
            }

            /**
             * Sets the value of the checkPublishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCheckPublishDate(XMLGregorianCalendar value) {
                this.checkPublishDate = value;
            }

            /**
             * Gets the value of the base property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBase() {
                return base;
            }

            /**
             * Sets the value of the base property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBase(String value) {
                this.base = value;
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
     *         &lt;element name="checkPlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanNumberType"/>
     *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
        "checkPlanNumber",
        "versionNumber",
        "createDate",
        "confirmDate",
        "publishDate",
        "owner"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        protected String checkPlanNumber;
        protected int versionNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar confirmDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(required = true)
        protected ZfcsOrganizationRef owner;

        /**
         * Gets the value of the checkPlanNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckPlanNumber() {
            return checkPlanNumber;
        }

        /**
         * Sets the value of the checkPlanNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckPlanNumber(String value) {
            this.checkPlanNumber = value;
        }

        /**
         * Gets the value of the versionNumber property.
         * 
         */
        public int getVersionNumber() {
            return versionNumber;
        }

        /**
         * Sets the value of the versionNumber property.
         * 
         */
        public void setVersionNumber(int value) {
            this.versionNumber = value;
        }

        /**
         * Gets the value of the createDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDate() {
            return createDate;
        }

        /**
         * Sets the value of the createDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDate(XMLGregorianCalendar value) {
            this.createDate = value;
        }

        /**
         * Gets the value of the confirmDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getConfirmDate() {
            return confirmDate;
        }

        /**
         * Sets the value of the confirmDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setConfirmDate(XMLGregorianCalendar value) {
            this.confirmDate = value;
        }

        /**
         * Gets the value of the publishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishDate(XMLGregorianCalendar value) {
            this.publishDate = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOwner(ZfcsOrganizationRef value) {
            this.owner = value;
        }

    }

}

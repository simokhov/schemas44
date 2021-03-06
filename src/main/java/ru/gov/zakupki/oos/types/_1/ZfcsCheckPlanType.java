//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanCommonInfoType"/>
 *         &lt;element name="startStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="endStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="checkList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanCheckInfoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_checkPlanType", propOrder = {
    "commonInfo",
    "startStage",
    "endStage",
    "checkList",
    "printForm",
    "extPrintForm"
})
public class ZfcsCheckPlanType {

    @XmlElement(required = true)
    protected ZfcsCheckPlanCommonInfoType commonInfo;
    @XmlElement(required = true)
    protected ZfcsStageType startStage;
    @XmlElement(required = true)
    protected ZfcsStageType endStage;
    @XmlElement(required = true)
    protected ZfcsCheckPlanType.CheckList checkList;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckPlanCommonInfoType }
     *     
     */
    public ZfcsCheckPlanCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckPlanCommonInfoType }
     *     
     */
    public void setCommonInfo(ZfcsCheckPlanCommonInfoType value) {
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
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
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
     *         &lt;element name="checkInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkPlanCheckInfoType" maxOccurs="unbounded"/>
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
        protected List<ZfcsCheckPlanCheckInfoType> checkInfo;

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
         * {@link ZfcsCheckPlanCheckInfoType }
         * 
         * 
         */
        public List<ZfcsCheckPlanCheckInfoType> getCheckInfo() {
            if (checkInfo == null) {
                checkInfo = new ArrayList<ZfcsCheckPlanCheckInfoType>();
            }
            return this.checkInfo;
        }

    }

}

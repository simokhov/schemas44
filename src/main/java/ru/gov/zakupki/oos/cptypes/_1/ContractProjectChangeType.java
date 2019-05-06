//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.common._1.AttachmentListType;
import ru.gov.zakupki.oos.common._1.ExtPrintFormType;


/**
 * Тип: Доработанный проект контракта на основании размещенного поставщиком протокола разногласий
 * 
 * <p>Java class for contractProjectChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractProjectChangeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/CPtypes/1}contractProjectCommonType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/CPtypes/1}commonInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="docDirectDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="requirementsInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}contractRequirementDocType" minOccurs="0"/>
 *         &lt;element name="contractProjectFilesInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractProjectFileInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}contractProjectFileType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="changeInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="totallyAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="partlyAcceptedreasonDocInfo" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
 *                   &lt;element name="notAcceptedreasonDocInfo" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modificationInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}modificationType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/common/1}extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractProjectChangeType", propOrder = {
    "commonInfo",
    "requirementsInfo",
    "contractProjectFilesInfo",
    "changeInfo",
    "modificationInfo",
    "extPrintFormInfo"
})
public class ContractProjectChangeType
    extends ContractProjectCommonType
{

    @XmlElement(required = true)
    protected ContractProjectChangeType.CommonInfo commonInfo;
    protected ContractRequirementDocType requirementsInfo;
    @XmlElement(required = true)
    protected ContractProjectChangeType.ContractProjectFilesInfo contractProjectFilesInfo;
    @XmlElement(required = true)
    protected ContractProjectChangeType.ChangeInfo changeInfo;
    protected ModificationType modificationInfo;
    protected ExtPrintFormType extPrintFormInfo;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProjectChangeType.CommonInfo }
     *     
     */
    public ContractProjectChangeType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProjectChangeType.CommonInfo }
     *     
     */
    public void setCommonInfo(ContractProjectChangeType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the requirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRequirementDocType }
     *     
     */
    public ContractRequirementDocType getRequirementsInfo() {
        return requirementsInfo;
    }

    /**
     * Sets the value of the requirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRequirementDocType }
     *     
     */
    public void setRequirementsInfo(ContractRequirementDocType value) {
        this.requirementsInfo = value;
    }

    /**
     * Gets the value of the contractProjectFilesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProjectChangeType.ContractProjectFilesInfo }
     *     
     */
    public ContractProjectChangeType.ContractProjectFilesInfo getContractProjectFilesInfo() {
        return contractProjectFilesInfo;
    }

    /**
     * Sets the value of the contractProjectFilesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProjectChangeType.ContractProjectFilesInfo }
     *     
     */
    public void setContractProjectFilesInfo(ContractProjectChangeType.ContractProjectFilesInfo value) {
        this.contractProjectFilesInfo = value;
    }

    /**
     * Gets the value of the changeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProjectChangeType.ChangeInfo }
     *     
     */
    public ContractProjectChangeType.ChangeInfo getChangeInfo() {
        return changeInfo;
    }

    /**
     * Sets the value of the changeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProjectChangeType.ChangeInfo }
     *     
     */
    public void setChangeInfo(ContractProjectChangeType.ChangeInfo value) {
        this.changeInfo = value;
    }

    /**
     * Gets the value of the modificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationType }
     *     
     */
    public ModificationType getModificationInfo() {
        return modificationInfo;
    }

    /**
     * Sets the value of the modificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationType }
     *     
     */
    public void setModificationInfo(ModificationType value) {
        this.modificationInfo = value;
    }

    /**
     * Gets the value of the extPrintFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPrintFormType }
     *     
     */
    public ExtPrintFormType getExtPrintFormInfo() {
        return extPrintFormInfo;
    }

    /**
     * Sets the value of the extPrintFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPrintFormType }
     *     
     */
    public void setExtPrintFormInfo(ExtPrintFormType value) {
        this.extPrintFormInfo = value;
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
     *       &lt;choice>
     *         &lt;element name="totallyAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="partlyAcceptedreasonDocInfo" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
     *         &lt;element name="notAcceptedreasonDocInfo" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totallyAccepted",
        "partlyAcceptedreasonDocInfo",
        "notAcceptedreasonDocInfo"
    })
    public static class ChangeInfo {

        protected Boolean totallyAccepted;
        protected AttachmentListType partlyAcceptedreasonDocInfo;
        protected AttachmentListType notAcceptedreasonDocInfo;

        /**
         * Gets the value of the totallyAccepted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTotallyAccepted() {
            return totallyAccepted;
        }

        /**
         * Sets the value of the totallyAccepted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTotallyAccepted(Boolean value) {
            this.totallyAccepted = value;
        }

        /**
         * Gets the value of the partlyAcceptedreasonDocInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getPartlyAcceptedreasonDocInfo() {
            return partlyAcceptedreasonDocInfo;
        }

        /**
         * Sets the value of the partlyAcceptedreasonDocInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setPartlyAcceptedreasonDocInfo(AttachmentListType value) {
            this.partlyAcceptedreasonDocInfo = value;
        }

        /**
         * Gets the value of the notAcceptedreasonDocInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListType }
         *     
         */
        public AttachmentListType getNotAcceptedreasonDocInfo() {
            return notAcceptedreasonDocInfo;
        }

        /**
         * Sets the value of the notAcceptedreasonDocInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListType }
         *     
         */
        public void setNotAcceptedreasonDocInfo(AttachmentListType value) {
            this.notAcceptedreasonDocInfo = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/CPtypes/1}commonInfoType">
     *       &lt;sequence>
     *         &lt;element name="docDirectDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "docDirectDT"
    })
    public static class CommonInfo
        extends CommonInfoType
    {

        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar docDirectDT;

        /**
         * Gets the value of the docDirectDT property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDocDirectDT() {
            return docDirectDT;
        }

        /**
         * Sets the value of the docDirectDT property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDocDirectDT(XMLGregorianCalendar value) {
            this.docDirectDT = value;
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
     *         &lt;element name="contractProjectFileInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}contractProjectFileType" maxOccurs="unbounded"/>
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
        "contractProjectFileInfo"
    })
    public static class ContractProjectFilesInfo {

        @XmlElement(required = true)
        protected List<ContractProjectFileType> contractProjectFileInfo;

        /**
         * Gets the value of the contractProjectFileInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractProjectFileInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContractProjectFileInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractProjectFileType }
         * 
         * 
         */
        public List<ContractProjectFileType> getContractProjectFileInfo() {
            if (contractProjectFileInfo == null) {
                contractProjectFileInfo = new ArrayList<ContractProjectFileType>();
            }
            return this.contractProjectFileInfo;
        }

    }

}

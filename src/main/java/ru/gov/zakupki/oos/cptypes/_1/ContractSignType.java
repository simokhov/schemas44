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


/**
 * Тип: Подписанный контракт
 * 
 * <p>Java class for contractSignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractSignType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/CPtypes/1}contractProjectCommonType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/CPtypes/1}commonInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractProjectFilesInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractProjectFileInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}contractFileType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractSignType", propOrder = {
    "commonInfo",
    "contractProjectFilesInfo"
})
public class ContractSignType
    extends ContractProjectCommonType
{

    @XmlElement(required = true)
    protected ContractSignType.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected ContractSignType.ContractProjectFilesInfo contractProjectFilesInfo;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSignType.CommonInfo }
     *     
     */
    public ContractSignType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSignType.CommonInfo }
     *     
     */
    public void setCommonInfo(ContractSignType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the contractProjectFilesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSignType.ContractProjectFilesInfo }
     *     
     */
    public ContractSignType.ContractProjectFilesInfo getContractProjectFilesInfo() {
        return contractProjectFilesInfo;
    }

    /**
     * Sets the value of the contractProjectFilesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSignType.ContractProjectFilesInfo }
     *     
     */
    public void setContractProjectFilesInfo(ContractSignType.ContractProjectFilesInfo value) {
        this.contractProjectFilesInfo = value;
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
     *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "signDate"
    })
    public static class CommonInfo
        extends CommonInfoType
    {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signDate;

        /**
         * Gets the value of the signDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignDate() {
            return signDate;
        }

        /**
         * Sets the value of the signDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignDate(XMLGregorianCalendar value) {
            this.signDate = value;
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
     *         &lt;element name="contractProjectFileInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}contractFileType" maxOccurs="unbounded"/>
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
        protected List<ContractFileType> contractProjectFileInfo;

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
         * {@link ContractFileType }
         * 
         * 
         */
        public List<ContractFileType> getContractProjectFileInfo() {
            if (contractProjectFileInfo == null) {
                contractProjectFileInfo = new ArrayList<ContractFileType>();
            }
            return this.contractProjectFileInfo;
        }

    }

}

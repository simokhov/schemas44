//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:26:31 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Общая информация в реестровой записи РЕП
 * 
 * <p>Java class for zfcs_repCommonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_repCommonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placerOrgInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repPlacerOrgType"/>
 *         &lt;element name="contractInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repContractInfo"/>
 *         &lt;element name="contractTerminationInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repContractTerminationInfo" minOccurs="0"/>
 *         &lt;element name="contractChangeInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repContractChangeInfo" minOccurs="0"/>
 *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repSupplierInfo"/>
 *         &lt;element name="modificationInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repModificationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_repCommonInfo", propOrder = {
    "placerOrgInfo",
    "contractInfo",
    "contractTerminationInfo",
    "contractChangeInfo",
    "supplierInfo",
    "modificationInfo"
})
public class ZfcsRepCommonInfo {

    @XmlElement(required = true)
    protected ZfcsRepPlacerOrgType placerOrgInfo;
    @XmlElement(required = true)
    protected ZfcsRepContractInfo contractInfo;
    protected ZfcsRepContractTerminationInfo contractTerminationInfo;
    protected ZfcsRepContractChangeInfo contractChangeInfo;
    @XmlElement(required = true)
    protected ZfcsRepSupplierInfo supplierInfo;
    protected ZfcsRepModificationInfo modificationInfo;

    /**
     * Gets the value of the placerOrgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepPlacerOrgType }
     *     
     */
    public ZfcsRepPlacerOrgType getPlacerOrgInfo() {
        return placerOrgInfo;
    }

    /**
     * Sets the value of the placerOrgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepPlacerOrgType }
     *     
     */
    public void setPlacerOrgInfo(ZfcsRepPlacerOrgType value) {
        this.placerOrgInfo = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepContractInfo }
     *     
     */
    public ZfcsRepContractInfo getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepContractInfo }
     *     
     */
    public void setContractInfo(ZfcsRepContractInfo value) {
        this.contractInfo = value;
    }

    /**
     * Gets the value of the contractTerminationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepContractTerminationInfo }
     *     
     */
    public ZfcsRepContractTerminationInfo getContractTerminationInfo() {
        return contractTerminationInfo;
    }

    /**
     * Sets the value of the contractTerminationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepContractTerminationInfo }
     *     
     */
    public void setContractTerminationInfo(ZfcsRepContractTerminationInfo value) {
        this.contractTerminationInfo = value;
    }

    /**
     * Gets the value of the contractChangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepContractChangeInfo }
     *     
     */
    public ZfcsRepContractChangeInfo getContractChangeInfo() {
        return contractChangeInfo;
    }

    /**
     * Sets the value of the contractChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepContractChangeInfo }
     *     
     */
    public void setContractChangeInfo(ZfcsRepContractChangeInfo value) {
        this.contractChangeInfo = value;
    }

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepSupplierInfo }
     *     
     */
    public ZfcsRepSupplierInfo getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepSupplierInfo }
     *     
     */
    public void setSupplierInfo(ZfcsRepSupplierInfo value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the modificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepModificationInfo }
     *     
     */
    public ZfcsRepModificationInfo getModificationInfo() {
        return modificationInfo;
    }

    /**
     * Sets the value of the modificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepModificationInfo }
     *     
     */
    public void setModificationInfo(ZfcsRepModificationInfo value) {
        this.modificationInfo = value;
    }

}

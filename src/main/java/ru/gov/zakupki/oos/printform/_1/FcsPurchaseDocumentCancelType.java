//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.PlacingWayRef;
import ru.gov.zakupki.oos.types._1.ZfcsDocType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseDocumentCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsResponsibleRoleType;


/**
 *  fcsPurchaseDocumentCancel
 * 
 * <p>Java class for fcsPurchaseDocumentCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fcsPurchaseDocumentCancelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseDocumentCancelType">
 *       &lt;sequence>
 *         &lt;group ref="{http://zakupki.gov.ru/oos/printform/1}printFormProtocolFields" minOccurs="0"/>
 *         &lt;element name="docType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_docType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fcsPurchaseDocumentCancelType", propOrder = {
    "purchaseObjectInfo",
    "responsibleRole",
    "placingWay",
    "fullNameResponsible",
    "docType"
})
public class FcsPurchaseDocumentCancelType
    extends ZfcsPurchaseDocumentCancelType
{

    protected String purchaseObjectInfo;
    @XmlSchemaType(name = "string")
    protected ZfcsResponsibleRoleType responsibleRole;
    protected PlacingWayRef placingWay;
    protected String fullNameResponsible;
    protected ZfcsDocType docType;

    /**
     * Gets the value of the purchaseObjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseObjectInfo() {
        return purchaseObjectInfo;
    }

    /**
     * Sets the value of the purchaseObjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseObjectInfo(String value) {
        this.purchaseObjectInfo = value;
    }

    /**
     * Gets the value of the responsibleRole property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsResponsibleRoleType }
     *     
     */
    public ZfcsResponsibleRoleType getResponsibleRole() {
        return responsibleRole;
    }

    /**
     * Sets the value of the responsibleRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsResponsibleRoleType }
     *     
     */
    public void setResponsibleRole(ZfcsResponsibleRoleType value) {
        this.responsibleRole = value;
    }

    /**
     * Gets the value of the placingWay property.
     * 
     * @return
     *     possible object is
     *     {@link PlacingWayRef }
     *     
     */
    public PlacingWayRef getPlacingWay() {
        return placingWay;
    }

    /**
     * Sets the value of the placingWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacingWayRef }
     *     
     */
    public void setPlacingWay(PlacingWayRef value) {
        this.placingWay = value;
    }

    /**
     * Gets the value of the fullNameResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameResponsible() {
        return fullNameResponsible;
    }

    /**
     * Sets the value of the fullNameResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameResponsible(String value) {
        this.fullNameResponsible = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsDocType }
     *     
     */
    public ZfcsDocType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsDocType }
     *     
     */
    public void setDocType(ZfcsDocType value) {
        this.docType = value;
    }

}

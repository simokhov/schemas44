//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:57:44 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.types._1.ZfcsClarificationRequestType;
import ru.gov.zakupki.oos.types._1.ZfcsDocType;


/**
 *  fcsClarificationRequestInfo
 * 
 * <p>Java class for fcsClarificationRequestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fcsClarificationRequestInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_clarificationRequestType">
 *       &lt;sequence>
 *         &lt;group ref="{http://zakupki.gov.ru/oos/printform/1}printFormClarificationRequestFields"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fcsClarificationRequestInfoType", propOrder = {
    "purchaseObjectInfo",
    "placingWay",
    "fullNameResponsible",
    "fileNumber",
    "fileSize",
    "requestDate",
    "docType"
})
public class FcsClarificationRequestInfoType
    extends ZfcsClarificationRequestType
{

    protected String purchaseObjectInfo;
    protected ZfcsPlacingWayType placingWay;
    protected String fullNameResponsible;
    protected String fileNumber;
    protected String fileSize;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(required = true)
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
     * Gets the value of the placingWay property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPlacingWayType }
     *     
     */
    public ZfcsPlacingWayType getPlacingWay() {
        return placingWay;
    }

    /**
     * Sets the value of the placingWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPlacingWayType }
     *     
     */
    public void setPlacingWay(ZfcsPlacingWayType value) {
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
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSize(String value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
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

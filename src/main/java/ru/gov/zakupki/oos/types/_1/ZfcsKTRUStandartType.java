//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип КТРУ: Информация о техническом регламенте или стандарте
 * 
 * <p>Java class for zfcs_KTRUStandartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_KTRUStandartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docName" type="{http://zakupki.gov.ru/oos/base/1}ktruDictNameType"/>
 *         &lt;element name="docFileData" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_KTRUStandartType", propOrder = {
    "docName",
    "docFileData"
})
public class ZfcsKTRUStandartType {

    @XmlElement(required = true)
    protected String docName;
    protected List<ZfcsAttachmentType> docFileData;

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Gets the value of the docFileData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docFileData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocFileData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsAttachmentType }
     * 
     * 
     */
    public List<ZfcsAttachmentType> getDocFileData() {
        if (docFileData == null) {
            docFileData = new ArrayList<ZfcsAttachmentType>();
        }
        return this.docFileData;
    }

}

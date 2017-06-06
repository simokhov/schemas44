//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:26:31 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Сведения об объектах контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99ControlObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99ControlObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_control99DocumentObjectType">
 *       &lt;sequence>
 *         &lt;element name="controlDocumentsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="controlDocumentInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99DocumentObjectType" maxOccurs="unbounded"/>
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
@XmlType(name = "zfcs_control99ControlObjectType", propOrder = {
    "controlDocumentsInfo"
})
public class ZfcsControl99ControlObjectType
    extends ZfcsControl99DocumentObjectType
{

    protected ZfcsControl99ControlObjectType.ControlDocumentsInfo controlDocumentsInfo;

    /**
     * Gets the value of the controlDocumentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99ControlObjectType.ControlDocumentsInfo }
     *     
     */
    public ZfcsControl99ControlObjectType.ControlDocumentsInfo getControlDocumentsInfo() {
        return controlDocumentsInfo;
    }

    /**
     * Sets the value of the controlDocumentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99ControlObjectType.ControlDocumentsInfo }
     *     
     */
    public void setControlDocumentsInfo(ZfcsControl99ControlObjectType.ControlDocumentsInfo value) {
        this.controlDocumentsInfo = value;
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
     *         &lt;element name="controlDocumentInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99DocumentObjectType" maxOccurs="unbounded"/>
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
        "controlDocumentInfo"
    })
    public static class ControlDocumentsInfo {

        @XmlElement(required = true)
        protected List<ZfcsControl99DocumentObjectType> controlDocumentInfo;

        /**
         * Gets the value of the controlDocumentInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controlDocumentInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getControlDocumentInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsControl99DocumentObjectType }
         * 
         * 
         */
        public List<ZfcsControl99DocumentObjectType> getControlDocumentInfo() {
            if (controlDocumentInfo == null) {
                controlDocumentInfo = new ArrayList<ZfcsControl99DocumentObjectType>();
            }
            return this.controlDocumentInfo;
        }

    }

}

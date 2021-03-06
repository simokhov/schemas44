//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.fz44.https;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="errorsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorInfo" type="{http://zakupki.gov.ru/fz44/https}errorInfoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="objectsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objectInfo" type="{http://zakupki.gov.ru/fz44/https}RBGObjectInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "errorsInfo",
    "objectsInfo"
})
@XmlRootElement(name = "getRBGObjectListResponse")
public class GetRBGObjectListResponse {

    protected GetRBGObjectListResponse.ErrorsInfo errorsInfo;
    protected GetRBGObjectListResponse.ObjectsInfo objectsInfo;

    /**
     * Gets the value of the errorsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetRBGObjectListResponse.ErrorsInfo }
     *     
     */
    public GetRBGObjectListResponse.ErrorsInfo getErrorsInfo() {
        return errorsInfo;
    }

    /**
     * Sets the value of the errorsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRBGObjectListResponse.ErrorsInfo }
     *     
     */
    public void setErrorsInfo(GetRBGObjectListResponse.ErrorsInfo value) {
        this.errorsInfo = value;
    }

    /**
     * Gets the value of the objectsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetRBGObjectListResponse.ObjectsInfo }
     *     
     */
    public GetRBGObjectListResponse.ObjectsInfo getObjectsInfo() {
        return objectsInfo;
    }

    /**
     * Sets the value of the objectsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRBGObjectListResponse.ObjectsInfo }
     *     
     */
    public void setObjectsInfo(GetRBGObjectListResponse.ObjectsInfo value) {
        this.objectsInfo = value;
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
     *         &lt;element name="errorInfo" type="{http://zakupki.gov.ru/fz44/https}errorInfoType" maxOccurs="unbounded"/>
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
        "errorInfo"
    })
    public static class ErrorsInfo {

        @XmlElement(required = true)
        protected List<ErrorInfoType> errorInfo;

        /**
         * Gets the value of the errorInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorInfoType }
         * 
         * 
         */
        public List<ErrorInfoType> getErrorInfo() {
            if (errorInfo == null) {
                errorInfo = new ArrayList<ErrorInfoType>();
            }
            return this.errorInfo;
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
     *         &lt;element name="objectInfo" type="{http://zakupki.gov.ru/fz44/https}RBGObjectInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
        "objectInfo"
    })
    public static class ObjectsInfo {

        protected List<RBGObjectInfoType> objectInfo;

        /**
         * Gets the value of the objectInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObjectInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RBGObjectInfoType }
         * 
         * 
         */
        public List<RBGObjectInfoType> getObjectInfo() {
            if (objectInfo == null) {
                objectInfo = new ArrayList<RBGObjectInfoType>();
            }
            return this.objectInfo;
        }

    }

}

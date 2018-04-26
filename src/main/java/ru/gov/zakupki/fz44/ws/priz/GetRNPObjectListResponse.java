//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

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
 *         &lt;element name="errorInfo" type="{http://zakupki.gov.ru/fz44/ws/priz}errorInfoType"/>
 *         &lt;element name="objectList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objectInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/fz44/ws/priz}RNPObjectInfoType">
 *                           &lt;sequence>
 *                             &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "errorInfo",
    "objectList"
})
@XmlRootElement(name = "getRNPObjectListResponse")
public class GetRNPObjectListResponse {

    protected ErrorInfoType errorInfo;
    protected GetRNPObjectListResponse.ObjectList objectList;

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInfoType }
     *     
     */
    public ErrorInfoType getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInfoType }
     *     
     */
    public void setErrorInfo(ErrorInfoType value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the objectList property.
     * 
     * @return
     *     possible object is
     *     {@link GetRNPObjectListResponse.ObjectList }
     *     
     */
    public GetRNPObjectListResponse.ObjectList getObjectList() {
        return objectList;
    }

    /**
     * Sets the value of the objectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRNPObjectListResponse.ObjectList }
     *     
     */
    public void setObjectList(GetRNPObjectListResponse.ObjectList value) {
        this.objectList = value;
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
     *         &lt;element name="objectInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/fz44/ws/priz}RNPObjectInfoType">
     *                 &lt;sequence>
     *                   &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "objectInfo"
    })
    public static class ObjectList {

        protected List<GetRNPObjectListResponse.ObjectList.ObjectInfo> objectInfo;

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
         * {@link GetRNPObjectListResponse.ObjectList.ObjectInfo }
         * 
         * 
         */
        public List<GetRNPObjectListResponse.ObjectList.ObjectInfo> getObjectInfo() {
            if (objectInfo == null) {
                objectInfo = new ArrayList<GetRNPObjectListResponse.ObjectList.ObjectInfo>();
            }
            return this.objectInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/fz44/ws/priz}RNPObjectInfoType">
         *       &lt;sequence>
         *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
            "content"
        })
        public static class ObjectInfo
            extends RNPObjectInfoType
        {

            @XmlElement(required = true)
            protected byte[] content;

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setContent(byte[] value) {
                this.content = value;
            }

        }

    }

}

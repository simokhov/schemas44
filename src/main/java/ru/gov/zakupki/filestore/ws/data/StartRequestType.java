//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:26 AM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Запрос инициации сессии передачи файла в файловое хранилище
 * 
 * <p>Java class for startRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="owner">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="spzCode" type="{http://zakupki.gov.ru/filestore/ws/data}spzNumType"/>
 *                   &lt;element name="svrCode" type="{http://zakupki.gov.ru/filestore/ws/data}consRegistryNumType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fileInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/filestore/ws/data}fileNameType"/>
 *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "startRequestType", propOrder = {
    "owner",
    "fileInfo"
})
public class StartRequestType {

    @XmlElement(required = true)
    protected StartRequestType.Owner owner;
    @XmlElement(required = true)
    protected StartRequestType.FileInfo fileInfo;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link StartRequestType.Owner }
     *     
     */
    public StartRequestType.Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartRequestType.Owner }
     *     
     */
    public void setOwner(StartRequestType.Owner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the fileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StartRequestType.FileInfo }
     *     
     */
    public StartRequestType.FileInfo getFileInfo() {
        return fileInfo;
    }

    /**
     * Sets the value of the fileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartRequestType.FileInfo }
     *     
     */
    public void setFileInfo(StartRequestType.FileInfo value) {
        this.fileInfo = value;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/filestore/ws/data}fileNameType"/>
     *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
        "name",
        "size",
        "digest"
    })
    public static class FileInfo {

        @XmlElement(required = true)
        protected String name;
        protected int size;
        @XmlElement(required = true)
        protected byte[] digest;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the size property.
         * 
         */
        public int getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         */
        public void setSize(int value) {
            this.size = value;
        }

        /**
         * Gets the value of the digest property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getDigest() {
            return digest;
        }

        /**
         * Sets the value of the digest property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setDigest(byte[] value) {
            this.digest = value;
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
     *         &lt;element name="spzCode" type="{http://zakupki.gov.ru/filestore/ws/data}spzNumType"/>
     *         &lt;element name="svrCode" type="{http://zakupki.gov.ru/filestore/ws/data}consRegistryNumType" minOccurs="0"/>
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
        "spzCode",
        "svrCode"
    })
    public static class Owner {

        @XmlElement(required = true)
        protected String spzCode;
        protected String svrCode;

        /**
         * Gets the value of the spzCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpzCode() {
            return spzCode;
        }

        /**
         * Sets the value of the spzCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpzCode(String value) {
            this.spzCode = value;
        }

        /**
         * Gets the value of the svrCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSvrCode() {
            return svrCode;
        }

        /**
         * Sets the value of the svrCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSvrCode(String value) {
            this.svrCode = value;
        }

    }

}

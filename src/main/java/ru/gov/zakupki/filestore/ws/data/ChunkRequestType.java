//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Запрос на передачу части файла
 * 
 * <p>Java class for chunkRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chunkRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileContentId" type="{http://zakupki.gov.ru/filestore/ws/data}guidType"/>
 *         &lt;element name="range" type="{http://zakupki.gov.ru/filestore/ws/data}rangeType"/>
 *         &lt;element name="chunk" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chunkRequestType", propOrder = {
    "fileContentId",
    "range",
    "chunk"
})
public class ChunkRequestType {

    @XmlElement(required = true)
    protected String fileContentId;
    @XmlElement(required = true)
    protected RangeType range;
    @XmlElement(required = true)
    protected byte[] chunk;

    /**
     * Gets the value of the fileContentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileContentId() {
        return fileContentId;
    }

    /**
     * Sets the value of the fileContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileContentId(String value) {
        this.fileContentId = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link RangeType }
     *     
     */
    public RangeType getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeType }
     *     
     */
    public void setRange(RangeType value) {
        this.range = value;
    }

    /**
     * Gets the value of the chunk property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChunk() {
        return chunk;
    }

    /**
     * Sets the value of the chunk property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChunk(byte[] value) {
        this.chunk = value;
    }

}

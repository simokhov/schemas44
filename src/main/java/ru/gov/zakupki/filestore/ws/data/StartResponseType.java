//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Ответ на инициацию сессии передачи файла
 * 
 * <p>Java class for startResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="fileContentId" type="{http://zakupki.gov.ru/filestore/ws/data}guidType"/>
 *         &lt;element name="loadedFileContentId" type="{http://zakupki.gov.ru/filestore/ws/data}guidType"/>
 *         &lt;element name="error" type="{http://zakupki.gov.ru/filestore/ws/data}errorType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startResponseType", propOrder = {
    "fileContentId",
    "loadedFileContentId",
    "error"
})
public class StartResponseType {

    protected String fileContentId;
    protected String loadedFileContentId;
    protected ErrorType error;

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
     * Gets the value of the loadedFileContentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadedFileContentId() {
        return loadedFileContentId;
    }

    /**
     * Sets the value of the loadedFileContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadedFileContentId(String value) {
        this.loadedFileContentId = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

}

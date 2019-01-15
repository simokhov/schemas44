//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Перечень бизнес-контролей для выгрузки
 * 
 * <p>Java class for zfcs_nsiBusinessControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiBusinessControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GUID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subSystem" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBusinessControlSubSystemEnum"/>
 *         &lt;element name="document" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBusinessControlDocumentEnum"/>
 *         &lt;element name="action" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBusinessControlActionEnum"/>
 *         &lt;element name="level" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBusinessControlLevelEnum"/>
 *         &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiBusinessControlType", propOrder = {
    "guid",
    "code",
    "order",
    "name",
    "actual",
    "subSystem",
    "document",
    "action",
    "level",
    "description"
})
public class ZfcsNsiBusinessControlType {

    @XmlElement(name = "GUID", required = true)
    protected String guid;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(required = true)
    protected String name;
    protected boolean actual;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsNsiBusinessControlSubSystemEnum subSystem;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsNsiBusinessControlDocumentEnum document;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsNsiBusinessControlActionEnum action;
    @XmlElement(required = true)
    protected String level;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

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
     * Gets the value of the actual property.
     * 
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     */
    public void setActual(boolean value) {
        this.actual = value;
    }

    /**
     * Gets the value of the subSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiBusinessControlSubSystemEnum }
     *     
     */
    public ZfcsNsiBusinessControlSubSystemEnum getSubSystem() {
        return subSystem;
    }

    /**
     * Sets the value of the subSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiBusinessControlSubSystemEnum }
     *     
     */
    public void setSubSystem(ZfcsNsiBusinessControlSubSystemEnum value) {
        this.subSystem = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiBusinessControlDocumentEnum }
     *     
     */
    public ZfcsNsiBusinessControlDocumentEnum getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiBusinessControlDocumentEnum }
     *     
     */
    public void setDocument(ZfcsNsiBusinessControlDocumentEnum value) {
        this.document = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiBusinessControlActionEnum }
     *     
     */
    public ZfcsNsiBusinessControlActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiBusinessControlActionEnum }
     *     
     */
    public void setAction(ZfcsNsiBusinessControlActionEnum value) {
        this.action = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.AuthorityType;
import ru.gov.zakupki.oos.common._1.DocPropertyType;


/**
 * Тип: Предписание органа, уполномоченного на осуществление контроля, не содержащееся в реестре результатов контроля
 * 
 * <p>Java class for prescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/base/1}authorityType" minOccurs="0"/>
 *         &lt;element name="prescriptionProperty" type="{http://zakupki.gov.ru/oos/common/1}docPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionType", propOrder = {
    "authorityName",
    "authorityType",
    "prescriptionProperty"
})
public class PrescriptionType {

    @XmlElement(required = true)
    protected String authorityName;
    @XmlSchemaType(name = "string")
    protected AuthorityType authorityType;
    @XmlElement(required = true)
    protected DocPropertyType prescriptionProperty;

    /**
     * Gets the value of the authorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

    /**
     * Gets the value of the authorityType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityType }
     *     
     */
    public AuthorityType getAuthorityType() {
        return authorityType;
    }

    /**
     * Sets the value of the authorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityType }
     *     
     */
    public void setAuthorityType(AuthorityType value) {
        this.authorityType = value;
    }

    /**
     * Gets the value of the prescriptionProperty property.
     * 
     * @return
     *     possible object is
     *     {@link DocPropertyType }
     *     
     */
    public DocPropertyType getPrescriptionProperty() {
        return prescriptionProperty;
    }

    /**
     * Sets the value of the prescriptionProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPropertyType }
     *     
     */
    public void setPrescriptionProperty(DocPropertyType value) {
        this.prescriptionProperty = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:55:10 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о публичных слушаниях по лоту закупки
 * 
 * <p>Java class for zfcs_publicDiscussionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="number">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="8"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;/choice>
 *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPlaceEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionType", propOrder = {
    "number",
    "href",
    "place"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsNotificationEFType.Lot.PublicDiscussion.class,
    ru.gov.zakupki.oos.types._1.ZfcsNotificationEPType.Lot.PublicDiscussion.class
})
public class ZfcsPublicDiscussionType {

    protected String number;
    protected String href;
    @XmlSchemaType(name = "string")
    protected ZfcsPublicDiscussionPlaceEnum place;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPlaceEnum }
     *     
     */
    public ZfcsPublicDiscussionPlaceEnum getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPlaceEnum }
     *     
     */
    public void setPlace(ZfcsPublicDiscussionPlaceEnum value) {
        this.place = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:55:40 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об организации с указанием ОГРН
 * 
 * <p>Java class for zfcs_organizationInfoWithOgrnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_organizationInfoWithOgrnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType">
 *       &lt;sequence>
 *         &lt;element name="ogrn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_organizationInfoWithOgrnType", propOrder = {
    "ogrn"
})
public class ZfcsOrganizationInfoWithOgrnType
    extends ZfcsOrganizationInfoType
{

    protected String ogrn;

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

}

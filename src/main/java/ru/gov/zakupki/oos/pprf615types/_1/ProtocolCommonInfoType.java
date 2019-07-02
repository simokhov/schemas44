//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Общая информация о протоколе
 * 
 * <p>Java class for protocolCommonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolCommonInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseCommonInfoType">
 *       &lt;sequence>
 *         &lt;element name="docNumberExternal" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hrefExternal" type="{http://zakupki.gov.ru/oos/base/1}hrefType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolCommonInfoType", propOrder = {
    "docNumberExternal",
    "createDate",
    "signDate",
    "hrefExternal"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.pprf615types._1.ProtocolCancelType.CommonInfo.class
})
public class ProtocolCommonInfoType
    extends PurchaseCommonInfoType
{

    @XmlElement(required = true)
    protected String docNumberExternal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signDate;
    @XmlElement(required = true)
    protected String hrefExternal;

    /**
     * Gets the value of the docNumberExternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumberExternal() {
        return docNumberExternal;
    }

    /**
     * Sets the value of the docNumberExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumberExternal(String value) {
        this.docNumberExternal = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the hrefExternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrefExternal() {
        return hrefExternal;
    }

    /**
     * Sets the value of the hrefExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrefExternal(String value) {
        this.hrefExternal = value;
    }

}

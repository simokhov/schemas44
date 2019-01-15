//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Извещение о проведении ЭOKД (двухэтапный конкурс в электронной форме)  с конкурсной документацией;
 *  внесение изменений
 * 
 * <p>Java class for notificationEOKDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEOKDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}notificationEOKDPFType">
 *       &lt;sequence>
 *         &lt;element name="documentation" type="{http://zakupki.gov.ru/oos/EPtypes/1}documentationOKType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationEOKDType", propOrder = {
    "documentation"
})
public class NotificationEOKDType
    extends NotificationEOKDPFType
{

    @XmlElement(required = true)
    protected DocumentationOKType documentation;

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationOKType }
     *     
     */
    public DocumentationOKType getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationOKType }
     *     
     */
    public void setDocumentation(DocumentationOKType value) {
        this.documentation = value;
    }

}

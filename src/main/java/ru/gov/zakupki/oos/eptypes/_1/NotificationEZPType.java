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
 * Тип: Извещение о проведении ЭЗП (Запрос предложений в электронной форме) с конкурсной документацией;
 *  внесение изменений
 * 
 * <p>Java class for notificationEZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEZPType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}notificationEZPPFType">
 *       &lt;sequence>
 *         &lt;element name="documentation" type="{http://zakupki.gov.ru/oos/EPtypes/1}documentationZPType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationEZPType", propOrder = {
    "documentation"
})
public class NotificationEZPType
    extends NotificationEZPPFType
{

    @XmlElement(required = true)
    protected DocumentationZPType documentation;

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationZPType }
     *     
     */
    public DocumentationZPType getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationZPType }
     *     
     */
    public void setDocumentation(DocumentationZPType value) {
        this.documentation = value;
    }

}

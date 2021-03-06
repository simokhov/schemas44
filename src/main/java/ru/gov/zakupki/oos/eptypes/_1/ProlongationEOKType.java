//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Извещение о продлении срока подачи заявок на участие в ЭOK (открытый конкурс в электронной форме)
 * 
 * <p>Java class for prolongationEOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prolongationEOKType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}purchaseDocumentType">
 *       &lt;sequence>
 *         &lt;element name="prolongationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}prolongationInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prolongationEOKType", propOrder = {
    "prolongationInfo"
})
public class ProlongationEOKType
    extends PurchaseDocumentType
{

    @XmlElement(required = true)
    protected ProlongationInfoType prolongationInfo;

    /**
     * Gets the value of the prolongationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProlongationInfoType }
     *     
     */
    public ProlongationInfoType getProlongationInfo() {
        return prolongationInfo;
    }

    /**
     * Sets the value of the prolongationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProlongationInfoType }
     *     
     */
    public void setProlongationInfo(ProlongationInfoType value) {
        this.prolongationInfo = value;
    }

}

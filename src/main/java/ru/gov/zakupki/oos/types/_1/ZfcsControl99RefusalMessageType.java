//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сообщение об отказе в принятии на контроль по 99 статье
 * 
 * <p>Java class for zfcs_control99RefusalMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99RefusalMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ConfirmType">
 *       &lt;sequence>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="violations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="violation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="refusalReasonText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99RefusalMessageType", propOrder = {
    "createDate",
    "violations",
    "refusalReasonText"
})
public class ZfcsControl99RefusalMessageType
    extends ZfcsControl99ConfirmType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    protected ZfcsControl99RefusalMessageType.Violations violations;
    @XmlElement(required = true)
    protected String refusalReasonText;

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
     * Gets the value of the violations property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99RefusalMessageType.Violations }
     *     
     */
    public ZfcsControl99RefusalMessageType.Violations getViolations() {
        return violations;
    }

    /**
     * Sets the value of the violations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99RefusalMessageType.Violations }
     *     
     */
    public void setViolations(ZfcsControl99RefusalMessageType.Violations value) {
        this.violations = value;
    }

    /**
     * Gets the value of the refusalReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefusalReasonText() {
        return refusalReasonText;
    }

    /**
     * Sets the value of the refusalReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefusalReasonText(String value) {
        this.refusalReasonText = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="violation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "violation"
    })
    public static class Violations {

        @XmlElement(required = true)
        protected List<ZfcsViolationType> violation;

        /**
         * Gets the value of the violation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getViolation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsViolationType }
         * 
         * 
         */
        public List<ZfcsViolationType> getViolation() {
            if (violation == null) {
                violation = new ArrayList<ZfcsViolationType>();
            }
            return this.violation;
        }

    }

}

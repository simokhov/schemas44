//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.AbandonedReasonRef;


/**
 * Тип: Протокол рассмотрения заявки единственного участника ЭOK-ОУ (открытый конкурс с ограниченным участием  в электронной форме);
 *  внесение изменений
 * 
 * <p>Java class for protocolEOKOUSinglePartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolEOKOUSinglePartType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}protocolType">
 *       &lt;sequence>
 *         &lt;element name="protocolInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}singlePartType"/>
 *                   &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/base/1}abandonedReasonRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolEOKOUSinglePartType", propOrder = {
    "protocolInfo"
})
public class ProtocolEOKOUSinglePartType
    extends ProtocolType
{

    @XmlElement(required = true)
    protected ProtocolEOKOUSinglePartType.ProtocolInfo protocolInfo;

    /**
     * Gets the value of the protocolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEOKOUSinglePartType.ProtocolInfo }
     *     
     */
    public ProtocolEOKOUSinglePartType.ProtocolInfo getProtocolInfo() {
        return protocolInfo;
    }

    /**
     * Sets the value of the protocolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEOKOUSinglePartType.ProtocolInfo }
     *     
     */
    public void setProtocolInfo(ProtocolEOKOUSinglePartType.ProtocolInfo value) {
        this.protocolInfo = value;
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
     *         &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}singlePartType"/>
     *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/base/1}abandonedReasonRef"/>
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
        "applicationInfo",
        "abandonedReason"
    })
    public static class ProtocolInfo {

        @XmlElement(required = true)
        protected SinglePartType applicationInfo;
        @XmlElement(required = true)
        protected AbandonedReasonRef abandonedReason;

        /**
         * Gets the value of the applicationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SinglePartType }
         *     
         */
        public SinglePartType getApplicationInfo() {
            return applicationInfo;
        }

        /**
         * Sets the value of the applicationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SinglePartType }
         *     
         */
        public void setApplicationInfo(SinglePartType value) {
            this.applicationInfo = value;
        }

        /**
         * Gets the value of the abandonedReason property.
         * 
         * @return
         *     possible object is
         *     {@link AbandonedReasonRef }
         *     
         */
        public AbandonedReasonRef getAbandonedReason() {
            return abandonedReason;
        }

        /**
         * Sets the value of the abandonedReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbandonedReasonRef }
         *     
         */
        public void setAbandonedReason(AbandonedReasonRef value) {
            this.abandonedReason = value;
        }

    }

}

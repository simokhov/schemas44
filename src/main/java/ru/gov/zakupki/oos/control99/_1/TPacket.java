//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.control99._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Информационный пакет
 * 
 * <p>Java class for tPacket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPacket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="packetUid" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
 *                   &lt;element name="refPacketUid" type="{http://zakupki.gov.ru/oos/base/1}guidType" minOccurs="0"/>
 *                   &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPacket", propOrder = {
    "index"
})
@XmlSeeAlso({
    AsfkInformPlan.class,
    ConfirmSinc.class,
    GetPlanChangedListRequest.class,
    AsfkResLBO.class,
    FinancialActivityPlanRequest.class,
    GetPlanChangedListResponse.class,
    GetFinancialActivityPlanResponse.class,
    ConfirmASinc.class
})
public abstract class TPacket {

    @XmlElement(required = true)
    protected TPacket.Index index;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link TPacket.Index }
     *     
     */
    public TPacket.Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPacket.Index }
     *     
     */
    public void setIndex(TPacket.Index value) {
        this.index = value;
    }


    /**
     * Индексная карточка пакета данных
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="packetUid" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
     *         &lt;element name="refPacketUid" type="{http://zakupki.gov.ru/oos/base/1}guidType" minOccurs="0"/>
     *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "packetUid",
        "refPacketUid",
        "createDateTime"
    })
    public static class Index {

        @XmlElement(required = true)
        protected String packetUid;
        protected String refPacketUid;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDateTime;

        /**
         * Gets the value of the packetUid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPacketUid() {
            return packetUid;
        }

        /**
         * Sets the value of the packetUid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPacketUid(String value) {
            this.packetUid = value;
        }

        /**
         * Gets the value of the refPacketUid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefPacketUid() {
            return refPacketUid;
        }

        /**
         * Sets the value of the refPacketUid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefPacketUid(String value) {
            this.refPacketUid = value;
        }

        /**
         * Gets the value of the createDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDateTime() {
            return createDateTime;
        }

        /**
         * Sets the value of the createDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDateTime(XMLGregorianCalendar value) {
            this.createDateTime = value;
        }

    }

}

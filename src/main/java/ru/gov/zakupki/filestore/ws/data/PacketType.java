//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информационный пакет запроса
 * 
 * <p>Java class for packetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="packetUid" type="{http://zakupki.gov.ru/filestore/ws/data}guidType"/>
 *                   &lt;element name="subsystem" type="{http://zakupki.gov.ru/filestore/ws/data}subsystemType"/>
 *                   &lt;element name="sender">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="senderType" type="{http://zakupki.gov.ru/filestore/ws/data}partnerType"/>
 *                   &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="mode" type="{http://zakupki.gov.ru/filestore/ws/data}indexModeType"/>
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
@XmlType(name = "packetType", propOrder = {
    "index"
})
@XmlSeeAlso({
    BaseFaultPacketType.class,
    StartRequestPacketType.class,
    FinishRequestPacketType.class,
    ChunkRequestPacketType.class
})
public abstract class PacketType {

    @XmlElement(required = true)
    protected PacketType.Index index;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link PacketType.Index }
     *     
     */
    public PacketType.Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketType.Index }
     *     
     */
    public void setIndex(PacketType.Index value) {
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
     *         &lt;element name="packetUid" type="{http://zakupki.gov.ru/filestore/ws/data}guidType"/>
     *         &lt;element name="subsystem" type="{http://zakupki.gov.ru/filestore/ws/data}subsystemType"/>
     *         &lt;element name="sender">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="senderType" type="{http://zakupki.gov.ru/filestore/ws/data}partnerType"/>
     *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="mode" type="{http://zakupki.gov.ru/filestore/ws/data}indexModeType"/>
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
        "subsystem",
        "sender",
        "senderType",
        "createDateTime",
        "mode"
    })
    public static class Index {

        @XmlElement(required = true)
        protected String packetUid;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected SubsystemType subsystem;
        @XmlElement(required = true)
        protected String sender;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected PartnerType senderType;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDateTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected IndexModeType mode;

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
         * Gets the value of the subsystem property.
         * 
         * @return
         *     possible object is
         *     {@link SubsystemType }
         *     
         */
        public SubsystemType getSubsystem() {
            return subsystem;
        }

        /**
         * Sets the value of the subsystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubsystemType }
         *     
         */
        public void setSubsystem(SubsystemType value) {
            this.subsystem = value;
        }

        /**
         * Gets the value of the sender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSender() {
            return sender;
        }

        /**
         * Sets the value of the sender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSender(String value) {
            this.sender = value;
        }

        /**
         * Gets the value of the senderType property.
         * 
         * @return
         *     possible object is
         *     {@link PartnerType }
         *     
         */
        public PartnerType getSenderType() {
            return senderType;
        }

        /**
         * Sets the value of the senderType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartnerType }
         *     
         */
        public void setSenderType(PartnerType value) {
            this.senderType = value;
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

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link IndexModeType }
         *     
         */
        public IndexModeType getMode() {
            return mode;
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndexModeType }
         *     
         */
        public void setMode(IndexModeType value) {
            this.mode = value;
        }

    }

}

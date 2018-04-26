//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Позиции КТРУ
 * 
 * <p>Java class for zfcs_KTRUPositionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_KTRUPositionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUPositionType" maxOccurs="unbounded"/>
 *         &lt;element name="groupSignData" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUSignType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_KTRUPositionsType", propOrder = {
    "position",
    "groupSignData"
})
@XmlSeeAlso({
    ZfcsNsiKTRUType.class
})
public class ZfcsKTRUPositionsType {

    @XmlElement(required = true)
    protected List<ZfcsKTRUPositionType> position;
    protected ZfcsKTRUSignType groupSignData;

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsKTRUPositionType }
     * 
     * 
     */
    public List<ZfcsKTRUPositionType> getPosition() {
        if (position == null) {
            position = new ArrayList<ZfcsKTRUPositionType>();
        }
        return this.position;
    }

    /**
     * Gets the value of the groupSignData property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKTRUSignType }
     *     
     */
    public ZfcsKTRUSignType getGroupSignData() {
        return groupSignData;
    }

    /**
     * Sets the value of the groupSignData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKTRUSignType }
     *     
     */
    public void setGroupSignData(ZfcsKTRUSignType value) {
        this.groupSignData = value;
    }

}

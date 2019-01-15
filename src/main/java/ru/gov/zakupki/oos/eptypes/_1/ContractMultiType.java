//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Право заключения контракта с несколькими участниками закупки
 * 
 * <p>Java class for contractMultiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractMultiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="notProvided" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contractCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractMultiType", propOrder = {
    "notProvided",
    "contractCount"
})
public class ContractMultiType {

    protected Boolean notProvided;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger contractCount;

    /**
     * Gets the value of the notProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotProvided() {
        return notProvided;
    }

    /**
     * Sets the value of the notProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotProvided(Boolean value) {
        this.notProvided = value;
    }

    /**
     * Gets the value of the contractCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractCount() {
        return contractCount;
    }

    /**
     * Sets the value of the contractCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractCount(BigInteger value) {
        this.contractCount = value;
    }

}

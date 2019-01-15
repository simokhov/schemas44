//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.SignatureType;


/**
 * Тип: Файл контракта 
 * 
 * <p>Java class for contractFileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractFileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/CPtypes/1}fileType">
 *       &lt;sequence>
 *         &lt;element name="fileSize" type="{http://zakupki.gov.ru/oos/base/1}fileSizeType" minOccurs="0"/>
 *         &lt;element name="fileFingerPrint" type="{http://zakupki.gov.ru/oos/base/1}fileHashType" minOccurs="0"/>
 *         &lt;element name="customerSignature" type="{http://zakupki.gov.ru/oos/common/1}signatureType" minOccurs="0"/>
 *         &lt;element name="supplierSignature" type="{http://zakupki.gov.ru/oos/common/1}signatureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractFileType", propOrder = {
    "fileSize",
    "fileFingerPrint",
    "customerSignature",
    "supplierSignature"
})
public class ContractFileType
    extends FileType
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileSize;
    protected byte[] fileFingerPrint;
    protected SignatureType customerSignature;
    protected SignatureType supplierSignature;

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileFingerPrint property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileFingerPrint() {
        return fileFingerPrint;
    }

    /**
     * Sets the value of the fileFingerPrint property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileFingerPrint(byte[] value) {
        this.fileFingerPrint = value;
    }

    /**
     * Gets the value of the customerSignature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getCustomerSignature() {
        return customerSignature;
    }

    /**
     * Sets the value of the customerSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setCustomerSignature(SignatureType value) {
        this.customerSignature = value;
    }

    /**
     * Gets the value of the supplierSignature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSupplierSignature() {
        return supplierSignature;
    }

    /**
     * Sets the value of the supplierSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSupplierSignature(SignatureType value) {
        this.supplierSignature = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.Complaint;
import ru.gov.zakupki.oos.signincoming._1.ComplaintCancel;
import ru.gov.zakupki.oos.signincoming._1.ComplaintGroup;
import ru.gov.zakupki.oos.signincoming._1.ElectronicComplaint;


/**
 * <p>Java class for receiveRgRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRgRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="complaint" type="{http://zakupki.gov.ru/oos/signIncoming/1}complaint"/>
 *         &lt;element name="complaintCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}complaintCancel"/>
 *         &lt;element name="complaintGroup" type="{http://zakupki.gov.ru/oos/signIncoming/1}complaintGroup"/>
 *         &lt;element name="electronicComplaint" type="{http://zakupki.gov.ru/oos/signIncoming/1}electronicComplaint"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRgRequestType", propOrder = {
    "complaint",
    "complaintCancel",
    "complaintGroup",
    "electronicComplaint"
})
public class ReceiveRgRequestType {

    protected Complaint complaint;
    protected ComplaintCancel complaintCancel;
    protected ComplaintGroup complaintGroup;
    protected ElectronicComplaint electronicComplaint;

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link Complaint }
     *     
     */
    public Complaint getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Complaint }
     *     
     */
    public void setComplaint(Complaint value) {
        this.complaint = value;
    }

    /**
     * Gets the value of the complaintCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ComplaintCancel }
     *     
     */
    public ComplaintCancel getComplaintCancel() {
        return complaintCancel;
    }

    /**
     * Sets the value of the complaintCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplaintCancel }
     *     
     */
    public void setComplaintCancel(ComplaintCancel value) {
        this.complaintCancel = value;
    }

    /**
     * Gets the value of the complaintGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ComplaintGroup }
     *     
     */
    public ComplaintGroup getComplaintGroup() {
        return complaintGroup;
    }

    /**
     * Sets the value of the complaintGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplaintGroup }
     *     
     */
    public void setComplaintGroup(ComplaintGroup value) {
        this.complaintGroup = value;
    }

    /**
     * Gets the value of the electronicComplaint property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicComplaint }
     *     
     */
    public ElectronicComplaint getElectronicComplaint() {
        return electronicComplaint;
    }

    /**
     * Sets the value of the electronicComplaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicComplaint }
     *     
     */
    public void setElectronicComplaint(ElectronicComplaint value) {
        this.electronicComplaint = value;
    }

}

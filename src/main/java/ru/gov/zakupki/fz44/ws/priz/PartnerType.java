//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="partnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OOS"/>
 *     &lt;enumeration value="GIIS_EB"/>
 *     &lt;enumeration value="RMIS"/>
 *     &lt;enumeration value="OVK"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="FAS"/>
 *     &lt;enumeration value="SMEV3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "partnerType")
@XmlEnum
public enum PartnerType {

    OOS("OOS"),
    GIIS_EB("GIIS_EB"),
    RMIS("RMIS"),
    OVK("OVK"),
    OA("OA"),
    KO("KO"),
    FAS("FAS"),
    @XmlEnumValue("SMEV3")
    SMEV_3("SMEV3");
    private final String value;

    PartnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerType fromValue(String v) {
        for (PartnerType c: PartnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

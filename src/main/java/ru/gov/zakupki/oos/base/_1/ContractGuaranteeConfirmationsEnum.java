//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.base._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractGuaranteeConfirmationsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contractGuaranteeConfirmationsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="G1.5N"/>
 *     &lt;enumeration value="GNC"/>
 *     &lt;enumeration value="GPCh6St96"/>
 *     &lt;enumeration value="GACh6St96"/>
 *     &lt;enumeration value="G1.5NCh6St96"/>
 *     &lt;enumeration value="GPCh6St96I"/>
 *     &lt;enumeration value="PI3Y3C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contractGuaranteeConfirmationsEnum")
@XmlEnum
public enum ContractGuaranteeConfirmationsEnum {

    GN("GN"),
    GA("GA"),
    @XmlEnumValue("G1.5N")
    G_1_5_N("G1.5N"),
    GNC("GNC"),
    @XmlEnumValue("GPCh6St96")
    GP_CH_6_ST_96("GPCh6St96"),
    @XmlEnumValue("GACh6St96")
    GA_CH_6_ST_96("GACh6St96"),
    @XmlEnumValue("G1.5NCh6St96")
    G_1_5_N_CH_6_ST_96("G1.5NCh6St96"),
    @XmlEnumValue("GPCh6St96I")
    GP_CH_6_ST_96_I("GPCh6St96I"),
    @XmlEnumValue("PI3Y3C")
    PI_3_Y_3_C("PI3Y3C");
    private final String value;

    ContractGuaranteeConfirmationsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractGuaranteeConfirmationsEnum fromValue(String v) {
        for (ContractGuaranteeConfirmationsEnum c: ContractGuaranteeConfirmationsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_tenderPlan2017FoundMethodsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_tenderPlan2017FoundMethodsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="O871N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_tenderPlan2017FoundMethodsEnum")
@XmlEnum
public enum ZfcsTenderPlan2017FoundMethodsEnum {

    C("C"),
    R("R"),
    T("T"),
    D("D"),
    E("E"),
    @XmlEnumValue("O871N")
    O_871_N("O871N");
    private final String value;

    ZfcsTenderPlan2017FoundMethodsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsTenderPlan2017FoundMethodsEnum fromValue(String v) {
        for (ZfcsTenderPlan2017FoundMethodsEnum c: ZfcsTenderPlan2017FoundMethodsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_etpActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_etpActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="PR1"/>
 *     &lt;enumeration value="PR2"/>
 *     &lt;enumeration value="PR3"/>
 *     &lt;enumeration value="PR4"/>
 *     &lt;enumeration value="PR5"/>
 *     &lt;enumeration value="PR6"/>
 *     &lt;enumeration value="PR7"/>
 *     &lt;enumeration value="PR8"/>
 *     &lt;enumeration value="PR9"/>
 *     &lt;enumeration value="PR10"/>
 *     &lt;enumeration value="PR11"/>
 *     &lt;enumeration value="PR12"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_etpActionType")
@XmlEnum
public enum ZfcsEtpActionType {

    PRP("PRP"),
    @XmlEnumValue("PR1")
    PR_1("PR1"),
    @XmlEnumValue("PR2")
    PR_2("PR2"),
    @XmlEnumValue("PR3")
    PR_3("PR3"),
    @XmlEnumValue("PR4")
    PR_4("PR4"),
    @XmlEnumValue("PR5")
    PR_5("PR5"),
    @XmlEnumValue("PR6")
    PR_6("PR6"),
    @XmlEnumValue("PR7")
    PR_7("PR7"),
    @XmlEnumValue("PR8")
    PR_8("PR8"),
    @XmlEnumValue("PR9")
    PR_9("PR9"),
    @XmlEnumValue("PR10")
    PR_10("PR10"),
    @XmlEnumValue("PR11")
    PR_11("PR11"),
    @XmlEnumValue("PR12")
    PR_12("PR12");
    private final String value;

    ZfcsEtpActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsEtpActionType fromValue(String v) {
        for (ZfcsEtpActionType c: ZfcsEtpActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:23:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_improperIndicatorNameEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_improperIndicatorNameEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ненадлежащее исполнение и (или) неисполнение заказчиком обязательств, предусмотренных контрактом, за исключением нарушения сроков исполнения обязательств"/>
 *     &lt;enumeration value="Нарушение заказчиком сроков исполнения обязательств"/>
 *     &lt;enumeration value="Ненадлежащее исполнение и (или) неисполнение исполнителем обязательств, за исключением нарушений сроков исполнения обязательств, предусмотренных контрактом"/>
 *     &lt;enumeration value="Нарушение поставщиком (подрядчиком, исполнителем) сроков исполнения обязательств"/>
 *     &lt;enumeration value="Ненадлежащее исполнение обязательств банком, выдавшим исполнителю банковскую гарантию для целей обеспечения исполнения контракта"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_improperIndicatorNameEnum")
@XmlEnum
public enum ZfcsImproperIndicatorNameEnum {

    @XmlEnumValue("\u041d\u0435\u043d\u0430\u0434\u043b\u0435\u0436\u0430\u0449\u0435\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0438 (\u0438\u043b\u0438) \u043d\u0435\u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u043c \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432, \u043f\u0440\u0435\u0434\u0443\u0441\u043c\u043e\u0442\u0440\u0435\u043d\u043d\u044b\u0445 \u043a\u043e\u043d\u0442\u0440\u0430\u043a\u0442\u043e\u043c, \u0437\u0430 \u0438\u0441\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435\u043c \u043d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u044f \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432")
    НЕНАДЛЕЖАЩЕЕ_ИСПОЛНЕНИЕ_И_ИЛИ_НЕИСПОЛНЕНИЕ_ЗАКАЗЧИКОМ_ОБЯЗАТЕЛЬСТВ_ПРЕДУСМОТРЕННЫХ_КОНТРАКТОМ_ЗА_ИСКЛЮЧЕНИЕМ_НАРУШЕНИЯ_СРОКОВ_ИСПОЛНЕНИЯ_ОБЯЗАТЕЛЬСТВ("\u041d\u0435\u043d\u0430\u0434\u043b\u0435\u0436\u0430\u0449\u0435\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0438 (\u0438\u043b\u0438) \u043d\u0435\u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u043c \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432, \u043f\u0440\u0435\u0434\u0443\u0441\u043c\u043e\u0442\u0440\u0435\u043d\u043d\u044b\u0445 \u043a\u043e\u043d\u0442\u0440\u0430\u043a\u0442\u043e\u043c, \u0437\u0430 \u0438\u0441\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435\u043c \u043d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u044f \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432"),
    @XmlEnumValue("\u041d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0435 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u043c \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432")
    НАРУШЕНИЕ_ЗАКАЗЧИКОМ_СРОКОВ_ИСПОЛНЕНИЯ_ОБЯЗАТЕЛЬСТВ("\u041d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0435 \u0437\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u043e\u043c \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432"),
    @XmlEnumValue("\u041d\u0435\u043d\u0430\u0434\u043b\u0435\u0436\u0430\u0449\u0435\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0438 (\u0438\u043b\u0438) \u043d\u0435\u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0435\u043c \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432, \u0437\u0430 \u0438\u0441\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435\u043c \u043d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0439 \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432, \u043f\u0440\u0435\u0434\u0443\u0441\u043c\u043e\u0442\u0440\u0435\u043d\u043d\u044b\u0445 \u043a\u043e\u043d\u0442\u0440\u0430\u043a\u0442\u043e\u043c")
    НЕНАДЛЕЖАЩЕЕ_ИСПОЛНЕНИЕ_И_ИЛИ_НЕИСПОЛНЕНИЕ_ИСПОЛНИТЕЛЕМ_ОБЯЗАТЕЛЬСТВ_ЗА_ИСКЛЮЧЕНИЕМ_НАРУШЕНИЙ_СРОКОВ_ИСПОЛНЕНИЯ_ОБЯЗАТЕЛЬСТВ_ПРЕДУСМОТРЕННЫХ_КОНТРАКТОМ("\u041d\u0435\u043d\u0430\u0434\u043b\u0435\u0436\u0430\u0449\u0435\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0438 (\u0438\u043b\u0438) \u043d\u0435\u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0435\u043c \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432, \u0437\u0430 \u0438\u0441\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435\u043c \u043d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0439 \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432, \u043f\u0440\u0435\u0434\u0443\u0441\u043c\u043e\u0442\u0440\u0435\u043d\u043d\u044b\u0445 \u043a\u043e\u043d\u0442\u0440\u0430\u043a\u0442\u043e\u043c"),
    @XmlEnumValue("\u041d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0435 \u043f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a\u043e\u043c (\u043f\u043e\u0434\u0440\u044f\u0434\u0447\u0438\u043a\u043e\u043c, \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0435\u043c) \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432")
    НАРУШЕНИЕ_ПОСТАВЩИКОМ_ПОДРЯДЧИКОМ_ИСПОЛНИТЕЛЕМ_СРОКОВ_ИСПОЛНЕНИЯ_ОБЯЗАТЕЛЬСТВ("\u041d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0435 \u043f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a\u043e\u043c (\u043f\u043e\u0434\u0440\u044f\u0434\u0447\u0438\u043a\u043e\u043c, \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0435\u043c) \u0441\u0440\u043e\u043a\u043e\u0432 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432"),
    @XmlEnumValue("\u041d\u0435\u043d\u0430\u0434\u043b\u0435\u0436\u0430\u0449\u0435\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432 \u0431\u0430\u043d\u043a\u043e\u043c, \u0432\u044b\u0434\u0430\u0432\u0448\u0438\u043c \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044e \u0431\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0443\u044e \u0433\u0430\u0440\u0430\u043d\u0442\u0438\u044e \u0434\u043b\u044f \u0446\u0435\u043b\u0435\u0439 \u043e\u0431\u0435\u0441\u043f\u0435\u0447\u0435\u043d\u0438\u044f \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043a\u043e\u043d\u0442\u0440\u0430\u043a\u0442\u0430")
    НЕНАДЛЕЖАЩЕЕ_ИСПОЛНЕНИЕ_ОБЯЗАТЕЛЬСТВ_БАНКОМ_ВЫДАВШИМ_ИСПОЛНИТЕЛЮ_БАНКОВСКУЮ_ГАРАНТИЮ_ДЛЯ_ЦЕЛЕЙ_ОБЕСПЕЧЕНИЯ_ИСПОЛНЕНИЯ_КОНТРАКТА("\u041d\u0435\u043d\u0430\u0434\u043b\u0435\u0436\u0430\u0449\u0435\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432 \u0431\u0430\u043d\u043a\u043e\u043c, \u0432\u044b\u0434\u0430\u0432\u0448\u0438\u043c \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044e \u0431\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0443\u044e \u0433\u0430\u0440\u0430\u043d\u0442\u0438\u044e \u0434\u043b\u044f \u0446\u0435\u043b\u0435\u0439 \u043e\u0431\u0435\u0441\u043f\u0435\u0447\u0435\u043d\u0438\u044f \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u043a\u043e\u043d\u0442\u0440\u0430\u043a\u0442\u0430");
    private final String value;

    ZfcsImproperIndicatorNameEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsImproperIndicatorNameEnum fromValue(String v) {
        for (ZfcsImproperIndicatorNameEnum c: ZfcsImproperIndicatorNameEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

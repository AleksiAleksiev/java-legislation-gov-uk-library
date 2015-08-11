//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentMainTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentMainTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EnglandAct"/>
 *     &lt;enumeration value="GreatBritainAct"/>
 *     &lt;enumeration value="IrelandAct"/>
 *     &lt;enumeration value="NorthernIrelandAct"/>
 *     &lt;enumeration value="NorthernIrelandAssemblyMeasure"/>
 *     &lt;enumeration value="NorthernIrelandParliamentAct"/>
 *     &lt;enumeration value="NorthernIrelandOrderInCouncil"/>
 *     &lt;enumeration value="NorthernIrelandDraftOrderInCouncil"/>
 *     &lt;enumeration value="NorthernIrelandStatutoryRule"/>
 *     &lt;enumeration value="NorthernIrelandDraftStatutoryRule"/>
 *     &lt;enumeration value="ScottishAct"/>
 *     &lt;enumeration value="ScottishOldAct"/>
 *     &lt;enumeration value="ScottishStatutoryInstrument"/>
 *     &lt;enumeration value="ScottishDraftStatutoryInstrument"/>
 *     &lt;enumeration value="UnitedKingdomChurchInstrument"/>
 *     &lt;enumeration value="UnitedKingdomChurchMeasure"/>
 *     &lt;enumeration value="UnitedKingdomPrivateAct"/>
 *     &lt;enumeration value="UnitedKingdomPublicGeneralAct"/>
 *     &lt;enumeration value="UnitedKingdomLocalAct"/>
 *     &lt;enumeration value="UnitedKingdomMinisterialOrder"/>
 *     &lt;enumeration value="UnitedKingdomStatutoryInstrument"/>
 *     &lt;enumeration value="UnitedKingdomDraftStatutoryInstrument"/>
 *     &lt;enumeration value="WelshAssemblyMeasure"/>
 *     &lt;enumeration value="WelshNationalAssemblyAct"/>
 *     &lt;enumeration value="WelshStatutoryInstrument"/>
 *     &lt;enumeration value="WelshDraftStatutoryInstrument"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentMainTypeType")
@XmlEnum
public enum DocumentMainTypeType {

    @XmlEnumValue("EnglandAct")
    ENGLAND_ACT("EnglandAct"),
    @XmlEnumValue("GreatBritainAct")
    GREAT_BRITAIN_ACT("GreatBritainAct"),
    @XmlEnumValue("IrelandAct")
    IRELAND_ACT("IrelandAct"),
    @XmlEnumValue("NorthernIrelandAct")
    NORTHERN_IRELAND_ACT("NorthernIrelandAct"),
    @XmlEnumValue("NorthernIrelandAssemblyMeasure")
    NORTHERN_IRELAND_ASSEMBLY_MEASURE("NorthernIrelandAssemblyMeasure"),
    @XmlEnumValue("NorthernIrelandParliamentAct")
    NORTHERN_IRELAND_PARLIAMENT_ACT("NorthernIrelandParliamentAct"),
    @XmlEnumValue("NorthernIrelandOrderInCouncil")
    NORTHERN_IRELAND_ORDER_IN_COUNCIL("NorthernIrelandOrderInCouncil"),
    @XmlEnumValue("NorthernIrelandDraftOrderInCouncil")
    NORTHERN_IRELAND_DRAFT_ORDER_IN_COUNCIL("NorthernIrelandDraftOrderInCouncil"),
    @XmlEnumValue("NorthernIrelandStatutoryRule")
    NORTHERN_IRELAND_STATUTORY_RULE("NorthernIrelandStatutoryRule"),
    @XmlEnumValue("NorthernIrelandDraftStatutoryRule")
    NORTHERN_IRELAND_DRAFT_STATUTORY_RULE("NorthernIrelandDraftStatutoryRule"),
    @XmlEnumValue("ScottishAct")
    SCOTTISH_ACT("ScottishAct"),
    @XmlEnumValue("ScottishOldAct")
    SCOTTISH_OLD_ACT("ScottishOldAct"),
    @XmlEnumValue("ScottishStatutoryInstrument")
    SCOTTISH_STATUTORY_INSTRUMENT("ScottishStatutoryInstrument"),
    @XmlEnumValue("ScottishDraftStatutoryInstrument")
    SCOTTISH_DRAFT_STATUTORY_INSTRUMENT("ScottishDraftStatutoryInstrument"),
    @XmlEnumValue("UnitedKingdomChurchInstrument")
    UNITED_KINGDOM_CHURCH_INSTRUMENT("UnitedKingdomChurchInstrument"),
    @XmlEnumValue("UnitedKingdomChurchMeasure")
    UNITED_KINGDOM_CHURCH_MEASURE("UnitedKingdomChurchMeasure"),
    @XmlEnumValue("UnitedKingdomPrivateAct")
    UNITED_KINGDOM_PRIVATE_ACT("UnitedKingdomPrivateAct"),
    @XmlEnumValue("UnitedKingdomPublicGeneralAct")
    UNITED_KINGDOM_PUBLIC_GENERAL_ACT("UnitedKingdomPublicGeneralAct"),
    @XmlEnumValue("UnitedKingdomLocalAct")
    UNITED_KINGDOM_LOCAL_ACT("UnitedKingdomLocalAct"),
    @XmlEnumValue("UnitedKingdomMinisterialOrder")
    UNITED_KINGDOM_MINISTERIAL_ORDER("UnitedKingdomMinisterialOrder"),
    @XmlEnumValue("UnitedKingdomStatutoryInstrument")
    UNITED_KINGDOM_STATUTORY_INSTRUMENT("UnitedKingdomStatutoryInstrument"),
    @XmlEnumValue("UnitedKingdomDraftStatutoryInstrument")
    UNITED_KINGDOM_DRAFT_STATUTORY_INSTRUMENT("UnitedKingdomDraftStatutoryInstrument"),
    @XmlEnumValue("WelshAssemblyMeasure")
    WELSH_ASSEMBLY_MEASURE("WelshAssemblyMeasure"),
    @XmlEnumValue("WelshNationalAssemblyAct")
    WELSH_NATIONAL_ASSEMBLY_ACT("WelshNationalAssemblyAct"),
    @XmlEnumValue("WelshStatutoryInstrument")
    WELSH_STATUTORY_INSTRUMENT("WelshStatutoryInstrument"),
    @XmlEnumValue("WelshDraftStatutoryInstrument")
    WELSH_DRAFT_STATUTORY_INSTRUMENT("WelshDraftStatutoryInstrument");
    private final String value;

    DocumentMainTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentMainTypeType fromValue(String v) {
        for (DocumentMainTypeType c: DocumentMainTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

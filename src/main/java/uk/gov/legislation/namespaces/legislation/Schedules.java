//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.legislation;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Abstract" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Schedule" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Include" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}SignedSection" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Appendix" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}PelementIDattributes"/&gt;
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}CommonSubAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}FragmentAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "_abstract",
    "includes",
    "schedules",
    "signedSection",
    "appendixes"
})
@XmlRootElement(name = "Schedules")
public class Schedules {

    @XmlElement(name = "Title")
    protected InlineFullStructure title;
    @XmlElement(name = "Abstract")
    protected Abstract _abstract;
    @XmlElement(name = "Include")
    protected List<Include> includes;
    @XmlElement(name = "Schedule")
    protected List<Schedule> schedules;
    @XmlElement(name = "SignedSection")
    protected SignedSection signedSection;
    @XmlElement(name = "Appendix")
    protected List<Appendix> appendixes;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "shortId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shortId;
    @XmlAttribute(name = "DocumentURI")
    @XmlSchemaType(name = "anyURI")
    protected String documentURI;
    @XmlAttribute(name = "IdURI")
    @XmlSchemaType(name = "anyURI")
    protected String idURI;
    @XmlAttribute(name = "NotesURI")
    @XmlSchemaType(name = "anyURI")
    protected String notesURI;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "AltVersionRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> altVersionRefs;
    @XmlAttribute(name = "FragmentId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fragmentId;
    @XmlAttribute(name = "Version")
    protected BigInteger version;
    @XmlAttribute(name = "RestrictExtent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restrictExtent;
    @XmlAttribute(name = "RestrictStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar restrictStartDate;
    @XmlAttribute(name = "RestrictEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar restrictEndDate;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "ConfersPower")
    protected Boolean confersPower;
    @XmlAttribute(name = "BlanketAmendment")
    protected Boolean blanketAmendment;
    @XmlAttribute(name = "Concurrent")
    protected Boolean concurrent;
    @XmlAttribute(name = "Match")
    protected Boolean match;
    @XmlAttribute(name = "AltDates")
    @XmlSchemaType(name = "anySimpleType")
    protected String altDates;
    @XmlAttribute(name = "NumberOfProvisions")
    protected BigInteger numberOfProvisions;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link InlineFullStructure }
     *     
     */
    public InlineFullStructure getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineFullStructure }
     *     
     */
    public void setTitle(InlineFullStructure value) {
        this.title = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    public Abstract getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    public void setAbstract(Abstract value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the includes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * 
     * 
     */
    public List<Include> getIncludes() {
        if (includes == null) {
            includes = new ArrayList<>();
        }
        return this.includes;
    }

    /**
     * Gets the value of the schedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * 
     * 
     */
    public List<Schedule> getSchedules() {
        if (schedules == null) {
            schedules = new ArrayList<>();
        }
        return this.schedules;
    }

    /**
     * Gets the value of the signedSection property.
     * 
     * @return
     *     possible object is
     *     {@link SignedSection }
     *     
     */
    public SignedSection getSignedSection() {
        return signedSection;
    }

    /**
     * Sets the value of the signedSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedSection }
     *     
     */
    public void setSignedSection(SignedSection value) {
        this.signedSection = value;
    }

    /**
     * Gets the value of the appendixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appendix }
     * 
     * 
     */
    public List<Appendix> getAppendixes() {
        if (appendixes == null) {
            appendixes = new ArrayList<>();
        }
        return this.appendixes;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the shortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortId() {
        return shortId;
    }

    /**
     * Sets the value of the shortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortId(String value) {
        this.shortId = value;
    }

    /**
     * Gets the value of the documentURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentURI() {
        return documentURI;
    }

    /**
     * Sets the value of the documentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentURI(String value) {
        this.documentURI = value;
    }

    /**
     * Gets the value of the idURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdURI() {
        return idURI;
    }

    /**
     * Sets the value of the idURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdURI(String value) {
        this.idURI = value;
    }

    /**
     * Gets the value of the notesURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesURI() {
        return notesURI;
    }

    /**
     * Sets the value of the notesURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesURI(String value) {
        this.notesURI = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the altVersionRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altVersionRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltVersionRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAltVersionRefs() {
        if (altVersionRefs == null) {
            altVersionRefs = new ArrayList<>();
        }
        return this.altVersionRefs;
    }

    /**
     * Gets the value of the fragmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFragmentId() {
        return fragmentId;
    }

    /**
     * Sets the value of the fragmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFragmentId(String value) {
        this.fragmentId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the restrictExtent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictExtent() {
        return restrictExtent;
    }

    /**
     * Sets the value of the restrictExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictExtent(String value) {
        this.restrictExtent = value;
    }

    /**
     * Gets the value of the restrictStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRestrictStartDate() {
        return restrictStartDate;
    }

    /**
     * Sets the value of the restrictStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRestrictStartDate(XMLGregorianCalendar value) {
        this.restrictStartDate = value;
    }

    /**
     * Gets the value of the restrictEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRestrictEndDate() {
        return restrictEndDate;
    }

    /**
     * Sets the value of the restrictEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRestrictEndDate(XMLGregorianCalendar value) {
        this.restrictEndDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the confersPower property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConfersPower() {
        if (confersPower == null) {
            return false;
        } else {
            return confersPower;
        }
    }

    /**
     * Sets the value of the confersPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfersPower(Boolean value) {
        this.confersPower = value;
    }

    /**
     * Gets the value of the blanketAmendment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBlanketAmendment() {
        if (blanketAmendment == null) {
            return false;
        } else {
            return blanketAmendment;
        }
    }

    /**
     * Sets the value of the blanketAmendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlanketAmendment(Boolean value) {
        this.blanketAmendment = value;
    }

    /**
     * Gets the value of the concurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConcurrent() {
        if (concurrent == null) {
            return false;
        } else {
            return concurrent;
        }
    }

    /**
     * Sets the value of the concurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcurrent(Boolean value) {
        this.concurrent = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMatch() {
        if (match == null) {
            return true;
        } else {
            return match;
        }
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatch(Boolean value) {
        this.match = value;
    }

    /**
     * Gets the value of the altDates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltDates() {
        return altDates;
    }

    /**
     * Sets the value of the altDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltDates(String value) {
        this.altDates = value;
    }

    /**
     * Gets the value of the numberOfProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfProvisions() {
        return numberOfProvisions;
    }

    /**
     * Sets the value of the numberOfProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfProvisions(BigInteger value) {
        this.numberOfProvisions = value;
    }

}

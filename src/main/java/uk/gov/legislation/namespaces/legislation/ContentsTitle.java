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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.legislation.gov.uk/namespaces/legislation}InlineFullStructure"&gt;
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}ContentsAttributes"/&gt;
 *       &lt;attribute name="Generated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ContentsTitle")
public class ContentsTitle
    extends InlineFullStructure
{

    @XmlAttribute(name = "Generated")
    protected Boolean generated;
    @XmlAttribute(name = "ContentRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String contentRef;
    @XmlAttribute(name = "DocumentURI")
    @XmlSchemaType(name = "anyURI")
    protected String documentURI;
    @XmlAttribute(name = "IdURI")
    @XmlSchemaType(name = "anyURI")
    protected String idURI;
    @XmlAttribute(name = "MatchText")
    protected Boolean matchText;
    @XmlAttribute(name = "MatchExtent")
    protected Boolean matchExtent;
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
     * Gets the value of the generated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerated() {
        return generated;
    }

    /**
     * Sets the value of the generated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerated(Boolean value) {
        this.generated = value;
    }

    /**
     * Gets the value of the contentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentRef() {
        return contentRef;
    }

    /**
     * Sets the value of the contentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentRef(String value) {
        this.contentRef = value;
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
     * Gets the value of the matchText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMatchText() {
        if (matchText == null) {
            return false;
        } else {
            return matchText;
        }
    }

    /**
     * Sets the value of the matchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchText(Boolean value) {
        this.matchText = value;
    }

    /**
     * Gets the value of the matchExtent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMatchExtent() {
        if (matchExtent == null) {
            return false;
        } else {
            return matchExtent;
        }
    }

    /**
     * Sets the value of the matchExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchExtent(Boolean value) {
        this.matchExtent = value;
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

    @Override
    public String toString() {
        return super.toString();
    }
}

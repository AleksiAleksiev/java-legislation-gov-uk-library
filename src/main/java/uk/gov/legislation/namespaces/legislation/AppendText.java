//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._1998.math.mathml.Math;
import uk.co.tso.assets.namespace.error.ErrorType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.legislation.gov.uk/namespaces/legislation}InlineFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}CommonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "AppendText")
public class AppendText {

    @XmlElementRefs({
        @XmlElementRef(name = "Addition", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExternalLink", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = ExternalLink.class, required = false),
        @XmlElementRef(name = "Proviso", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Proviso.class, required = false),
        @XmlElementRef(name = "InlineAmendment", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = InlineAmendment.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = Math.class, required = false),
        @XmlElementRef(name = "CommentaryRef", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = CommentaryRef.class, required = false),
        @XmlElementRef(name = "MarginNoteRef", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = MarginNoteRef.class, required = false),
        @XmlElementRef(name = "Acronym", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Acronym.class, required = false),
        @XmlElementRef(name = "InternalLink", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = InternalLink.class, required = false),
        @XmlElementRef(name = "CitationListRef", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = CitationListRef.class, required = false),
        @XmlElementRef(name = "Abbreviation", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Abbreviation.class, required = false),
        @XmlElementRef(name = "Strong", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Strong.class, required = false),
        @XmlElementRef(name = "Warning", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Inferior", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Term", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Term.class, required = false),
        @XmlElementRef(name = "Emphasis", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Emphasis.class, required = false),
        @XmlElementRef(name = "InlineExtract", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = InlineExtract.class, required = false),
        @XmlElementRef(name = "Image", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Image.class, required = false),
        @XmlElementRef(name = "Error", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Span", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Character", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Character.class, required = false),
        @XmlElementRef(name = "Citation", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Citation.class, required = false),
        @XmlElementRef(name = "CitationSubRef", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = CitationSubRef.class, required = false),
        @XmlElementRef(name = "Underline", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SmallCaps", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = SmallCaps.class, required = false),
        @XmlElementRef(name = "Superior", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FootnoteRef", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = FootnoteRef.class, required = false),
        @XmlElementRef(name = "Repeal", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Repeal.class, required = false),
        @XmlElementRef(name = "Substitution", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Definition", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Definition.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
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

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ChangeType }{@code >}
     * {@link ExternalLink }
     * {@link String }
     * {@link Proviso }
     * {@link InlineAmendment }
     * {@link Math }
     * {@link CommentaryRef }
     * {@link MarginNoteRef }
     * {@link Acronym }
     * {@link InternalLink }
     * {@link CitationListRef }
     * {@link Abbreviation }
     * {@link Strong }
     * {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * {@link JAXBElement }{@code <}{@link InlineStructure }{@code >}
     * {@link Term }
     * {@link Emphasis }
     * {@link InlineExtract }
     * {@link Image }
     * {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * {@link JAXBElement }{@code <}{@link InlineStructure }{@code >}
     * {@link Character }
     * {@link Citation }
     * {@link CitationSubRef }
     * {@link SmallCaps }
     * {@link JAXBElement }{@code <}{@link InlineStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InlineStructure }{@code >}
     * {@link FootnoteRef }
     * {@link Repeal }
     * {@link JAXBElement }{@code <}{@link ChangeType }{@code >}
     * {@link Definition }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
            altVersionRefs = new ArrayList<Object>();
        }
        return this.altVersionRefs;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.legislation;

import uk.co.tso.assets.namespace.error.ErrorType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;group ref="{http://www.tso.co.uk/assets/namespace/error}Errors" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Pnumber"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}P7para"/&gt;
 *           &lt;group ref="{http://www.legislation.gov.uk/namespaces/legislation}BlockSection"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}PelementIDattributes"/&gt;
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}CommonSubAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorsAndWarningsAndPnumbers"
})
@XmlRootElement(name = "P7")
public class P7 {

    @XmlElementRefs({
        @XmlElementRef(name = "Tabular", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Tabular.class),
        @XmlElementRef(name = "Figure", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Figure.class),
        @XmlElementRef(name = "KeyList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = KeyList.class),
        @XmlElementRef(name = "DecoratedGroup", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = DecoratedGroup.class),
        @XmlElementRef(name = "Formula", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Formula.class),
        @XmlElementRef(name = "UnorderedList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = UnorderedList.class),
        @XmlElementRef(name = "Error", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class),
        @XmlElementRef(name = "P7para", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = P7Para.class),
        @XmlElementRef(name = "OrderedList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = OrderedList.class),
        @XmlElementRef(name = "Warning", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class),
        @XmlElementRef(name = "Pnumber", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Pnumber.class),
        @XmlElementRef(name = "Form", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Form.class)
    })
    protected List<Object> errorsAndWarningsAndPnumbers;
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

    /**
     * Gets the value of the errorsAndWarningsAndPnumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorsAndWarningsAndPnumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorsAndWarningsAndPnumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tabular }
     * {@link DecoratedGroup }
     * {@link KeyList }
     * {@link Figure }
     * {@link Formula }
     * {@link UnorderedList }
     * {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * {@link P7Para }
     * {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * {@link OrderedList }
     * {@link Pnumber }
     * {@link Form }
     * 
     * 
     */
    public List<Object> getErrorsAndWarningsAndPnumbers() {
        if (errorsAndWarningsAndPnumbers == null) {
            errorsAndWarningsAndPnumbers = new ArrayList<>();
        }
        return this.errorsAndWarningsAndPnumbers;
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

}

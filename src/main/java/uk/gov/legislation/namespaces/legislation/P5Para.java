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
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;group ref="{http://www.legislation.gov.uk/namespaces/legislation}InlineModel"/&gt;
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}P6"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}CommonAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textsAndBlockTextsAndOrderedLists"
})
@XmlRootElement(name = "P5para")
public class P5Para {

    @XmlElementRefs({
        @XmlElementRef(name = "AppendText", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = AppendText.class, required = false),
        @XmlElementRef(name = "Tabular", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Tabular.class, required = false),
        @XmlElementRef(name = "KeyList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = KeyList.class, required = false),
        @XmlElementRef(name = "Figure", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Figure.class, required = false),
        @XmlElementRef(name = "Formula", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Formula.class, required = false),
        @XmlElementRef(name = "P6", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = P6 .class, required = false),
        @XmlElementRef(name = "Error", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Form", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Form.class, required = false),
        @XmlElementRef(name = "BlockAmendment", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = BlockAmendment.class, required = false),
        @XmlElementRef(name = "BlockExtract", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = BlockExtract.class, required = false),
        @XmlElementRef(name = "Text", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Text.class, required = false),
        @XmlElementRef(name = "UnorderedList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = UnorderedList.class, required = false),
        @XmlElementRef(name = "Warning", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrderedList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = OrderedList.class, required = false),
        @XmlElementRef(name = "BlockText", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = BlockText.class, required = false)
    })
    protected List<Object> textsAndBlockTextsAndOrderedLists;
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
     * Gets the value of the textsAndBlockTextsAndOrderedLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textsAndBlockTextsAndOrderedLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextsAndBlockTextsAndOrderedLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendText }
     * {@link Tabular }
     * {@link KeyList }
     * {@link Figure }
     * {@link Formula }
     * {@link P6 }
     * {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * {@link Form }
     * {@link BlockAmendment }
     * {@link BlockExtract }
     * {@link Text }
     * {@link UnorderedList }
     * {@link OrderedList }
     * {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * {@link BlockText }
     * 
     * 
     */
    public List<Object> getTextsAndBlockTextsAndOrderedLists() {
        if (textsAndBlockTextsAndOrderedLists == null) {
            textsAndBlockTextsAndOrderedLists = new ArrayList<>();
        }
        return this.textsAndBlockTextsAndOrderedLists;
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
            altVersionRefs = new ArrayList<>();
        }
        return this.altVersionRefs;
    }

}

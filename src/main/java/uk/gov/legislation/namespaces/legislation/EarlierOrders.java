//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.legislation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Title" minOccurs="0"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Comment" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;group ref="{http://www.legislation.gov.uk/namespaces/legislation}BlockBasic"/>
 *           &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}P1"/>
 *           &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}P1group"/>
 *         &lt;/choice>
 *       &lt;/sequence>
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
    "title",
    "comment",
    "psAndOrderedListsAndUnorderedLists"
})
@XmlRootElement(name = "EarlierOrders")
public class EarlierOrders {

    @XmlElement(name = "Title")
    protected InlineFullStructure title;
    @XmlElement(name = "Comment")
    protected Comment comment;
    @XmlElements({
        @XmlElement(name = "P", type = P.class),
        @XmlElement(name = "OrderedList", type = OrderedList.class),
        @XmlElement(name = "UnorderedList", type = UnorderedList.class),
        @XmlElement(name = "DecoratedGroup", type = DecoratedGroup.class),
        @XmlElement(name = "KeyList", type = KeyList.class),
        @XmlElement(name = "Figure", type = Figure.class),
        @XmlElement(name = "Tabular", type = Tabular.class),
        @XmlElement(name = "Form", type = Form.class),
        @XmlElement(name = "Formula", type = Formula.class),
        @XmlElement(name = "P1", type = P1 .class),
        @XmlElement(name = "P1group", type = P1Group.class)
    })
    protected List<Object> psAndOrderedListsAndUnorderedLists;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the psAndOrderedListsAndUnorderedLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psAndOrderedListsAndUnorderedLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSAndOrderedListsAndUnorderedLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link OrderedList }
     * {@link UnorderedList }
     * {@link DecoratedGroup }
     * {@link KeyList }
     * {@link Figure }
     * {@link Tabular }
     * {@link Form }
     * {@link Formula }
     * {@link P1 }
     * {@link P1Group }
     * 
     * 
     */
    public List<Object> getPSAndOrderedListsAndUnorderedLists() {
        if (psAndOrderedListsAndUnorderedLists == null) {
            psAndOrderedListsAndUnorderedLists = new ArrayList<Object>();
        }
        return this.psAndOrderedListsAndUnorderedLists;
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

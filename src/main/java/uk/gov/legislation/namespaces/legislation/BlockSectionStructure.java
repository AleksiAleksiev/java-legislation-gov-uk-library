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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.co.tso.assets.namespace.error.ErrorType;


/**
 * A type that defines standard paragraph level block elements with sections
 * 
 * <p>Java class for BlockSectionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockSectionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.legislation.gov.uk/namespaces/legislation}BlockSection" maxOccurs="unbounded"/>
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}CommonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockSectionStructure", propOrder = {
    "orderedListsAndUnorderedListsAndDecoratedGroups"
})
public class BlockSectionStructure {

    @XmlElementRefs({
        @XmlElementRef(name = "Tabular", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Tabular.class, required = false),
        @XmlElementRef(name = "Figure", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Figure.class, required = false),
        @XmlElementRef(name = "KeyList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = KeyList.class, required = false),
        @XmlElementRef(name = "DecoratedGroup", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = DecoratedGroup.class, required = false),
        @XmlElementRef(name = "Formula", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Formula.class, required = false),
        @XmlElementRef(name = "UnorderedList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = UnorderedList.class, required = false),
        @XmlElementRef(name = "Error", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Warning", namespace = "http://www.tso.co.uk/assets/namespace/error", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrderedList", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = OrderedList.class, required = false),
        @XmlElementRef(name = "Form", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Form.class, required = false)
    })
    protected List<Object> orderedListsAndUnorderedListsAndDecoratedGroups;
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
     * Gets the value of the orderedListsAndUnorderedListsAndDecoratedGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderedListsAndUnorderedListsAndDecoratedGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderedListsAndUnorderedListsAndDecoratedGroups().add(newItem);
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
     * {@link OrderedList }
     * {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * {@link Form }
     * 
     * 
     */
    public List<Object> getOrderedListsAndUnorderedListsAndDecoratedGroups() {
        if (orderedListsAndUnorderedListsAndDecoratedGroups == null) {
            orderedListsAndUnorderedListsAndDecoratedGroups = new ArrayList<Object>();
        }
        return this.orderedListsAndUnorderedListsAndDecoratedGroups;
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

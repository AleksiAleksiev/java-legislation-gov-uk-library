//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package org.w3._2005.atom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.w3.org/2005/Atom}author"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}category"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}contributor"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}generator"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}icon"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}id"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}logo"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}rights"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}subtitle"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}title"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}updated"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2005/Atom}atomCommonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorsAndCategoriesAndContributors"
})
@XmlRootElement(name = "source")
public class Source {

    @XmlElementRefs({
        @XmlElementRef(name = "title", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "updated", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "icon", namespace = "http://www.w3.org/2005/Atom", type = Icon.class, required = false),
        @XmlElementRef(name = "author", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "generator", namespace = "http://www.w3.org/2005/Atom", type = Generator.class, required = false),
        @XmlElementRef(name = "contributor", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://www.w3.org/2005/Atom", type = Link.class, required = false),
        @XmlElementRef(name = "logo", namespace = "http://www.w3.org/2005/Atom", type = Logo.class, required = false),
        @XmlElementRef(name = "subtitle", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rights", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "category", namespace = "http://www.w3.org/2005/Atom", type = Category.class, required = false),
        @XmlElementRef(name = "id", namespace = "http://www.w3.org/2005/Atom", type = Id.class, required = false)
    })
    protected List<Object> authorsAndCategoriesAndContributors;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the authorsAndCategoriesAndContributors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorsAndCategoriesAndContributors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorsAndCategoriesAndContributors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AtomTextConstruct }{@code >}
     * {@link JAXBElement }{@code <}{@link AtomPersonConstruct }{@code >}
     * {@link Icon }
     * {@link JAXBElement }{@code <}{@link AtomDateConstruct }{@code >}
     * {@link Generator }
     * {@link JAXBElement }{@code <}{@link AtomPersonConstruct }{@code >}
     * {@link Link }
     * {@link Logo }
     * {@link JAXBElement }{@code <}{@link AtomTextConstruct }{@code >}
     * {@link JAXBElement }{@code <}{@link AtomTextConstruct }{@code >}
     * {@link Category }
     * {@link Id }
     * 
     * 
     */
    public List<Object> getAuthorsAndCategoriesAndContributors() {
        if (authorsAndCategoriesAndContributors == null) {
            authorsAndCategoriesAndContributors = new ArrayList<Object>();
        }
        return this.authorsAndCategoriesAndContributors;
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

}

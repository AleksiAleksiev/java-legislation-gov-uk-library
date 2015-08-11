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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Addition"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Repeal"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Substitution"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}CommentaryRef"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Acronym"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Abbreviation"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Citation"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.legislation.gov.uk/namespaces/legislation}CommonAttributes"/>
 *       &lt;attribute name="ChangeId" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="CommentaryRef" type="{http://www.legislation.gov.uk/namespaces/legislation}CommentaryId" />
 *       &lt;attribute name="Prospective" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Proposed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Mark">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Start"/>
 *             &lt;enumeration value="End"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeType", propOrder = {
    "content"
})
@XmlSeeAlso({
    Repeal.class
})
public class ChangeType {

    @XmlElementRefs({
        @XmlElementRef(name = "Addition", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Citation", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Citation.class, required = false),
        @XmlElementRef(name = "Abbreviation", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Abbreviation.class, required = false),
        @XmlElementRef(name = "CommentaryRef", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = CommentaryRef.class, required = false),
        @XmlElementRef(name = "Repeal", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Repeal.class, required = false),
        @XmlElementRef(name = "Acronym", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Acronym.class, required = false),
        @XmlElementRef(name = "Substitution", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "ChangeId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String changeId;
    @XmlAttribute(name = "CommentaryRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String commentaryRef;
    @XmlAttribute(name = "Prospective")
    protected Boolean prospective;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "Mark")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mark;
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
     * {@link String }
     * {@link Citation }
     * {@link Abbreviation }
     * {@link CommentaryRef }
     * {@link Repeal }
     * {@link JAXBElement }{@code <}{@link ChangeType }{@code >}
     * {@link Acronym }
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
     * Gets the value of the changeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * Sets the value of the changeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeId(String value) {
        this.changeId = value;
    }

    /**
     * Gets the value of the commentaryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaryRef() {
        return commentaryRef;
    }

    /**
     * Sets the value of the commentaryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaryRef(String value) {
        this.commentaryRef = value;
    }

    /**
     * Gets the value of the prospective property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProspective() {
        if (prospective == null) {
            return false;
        } else {
            return prospective;
        }
    }

    /**
     * Sets the value of the prospective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProspective(Boolean value) {
        this.prospective = value;
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
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
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

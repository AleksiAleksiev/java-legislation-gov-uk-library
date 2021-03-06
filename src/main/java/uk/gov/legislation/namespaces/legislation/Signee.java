//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.legislation;

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
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}LSseal" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence maxOccurs="unbounded"&gt;
 *             &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}PersonName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}JobTitle" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Department" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Address" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}DateSigned" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element ref="{http://www.legislation.gov.uk/namespaces/legislation}Image"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
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
    "lSseal",
    "image",
    "personNamesAndJobTitlesAndDepartments"
})
@XmlRootElement(name = "Signee")
public class Signee {

    @XmlElement(name = "LSseal")
    protected LSseal lSseal;
    @XmlElement(name = "Image")
    protected Image image;
    @XmlElementRefs({
        @XmlElementRef(name = "Address", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = Address.class, required = false),
        @XmlElementRef(name = "PersonName", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DateSigned", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = DateSigned.class, required = false),
        @XmlElementRef(name = "JobTitle", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Department", namespace = "http://www.legislation.gov.uk/namespaces/legislation", type = JAXBElement.class, required = false)
    })
    protected List<Object> personNamesAndJobTitlesAndDepartments;
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
     * Gets the value of the lSseal property.
     * 
     * @return
     *     possible object is
     *     {@link LSseal }
     *     
     */
    public LSseal getLSseal() {
        return lSseal;
    }

    /**
     * Sets the value of the lSseal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LSseal }
     *     
     */
    public void setLSseal(LSseal value) {
        this.lSseal = value;
    }

    /**
     * Allows for a graphic of a signature to be included
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the personNamesAndJobTitlesAndDepartments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNamesAndJobTitlesAndDepartments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNamesAndJobTitlesAndDepartments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link JAXBElement }{@code <}{@link InlineStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InlineStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InlineStructure }{@code >}
     * {@link DateSigned }
     * 
     * 
     */
    public List<Object> getPersonNamesAndJobTitlesAndDepartments() {
        if (personNamesAndJobTitlesAndDepartments == null) {
            personNamesAndJobTitlesAndDepartments = new ArrayList<>();
        }
        return this.personNamesAndJobTitlesAndDepartments;
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

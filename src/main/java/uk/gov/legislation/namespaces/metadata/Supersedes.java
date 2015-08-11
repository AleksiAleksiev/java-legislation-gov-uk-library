//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.metadata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.purl.dc.elements._1.AbstractAny;


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
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/metadata}DocumentMainType"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/metadata}Year"/>
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/metadata}ISBN"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
    "documentMainType",
    "year",
    "isbn"
})
@XmlRootElement(name = "Supersedes")
public class Supersedes {

    @XmlElementRef(name = "title", namespace = "http://purl.org/dc/elements/1.1/", type = JAXBElement.class)
    protected JAXBElement<AbstractAny> title;
    @XmlElement(name = "DocumentMainType", required = true)
    protected DocumentMainType documentMainType;
    @XmlElement(name = "Year", required = true)
    protected Year year;
    @XmlElement(name = "ISBN", required = true)
    protected ISBN isbn;
    @XmlAttribute(name = "URI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     *     
     */
    public JAXBElement<AbstractAny> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     *     
     */
    public void setTitle(JAXBElement<AbstractAny> value) {
        this.title = value;
    }

    /**
     * Gets the value of the documentMainType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMainType }
     *     
     */
    public DocumentMainType getDocumentMainType() {
        return documentMainType;
    }

    /**
     * Sets the value of the documentMainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMainType }
     *     
     */
    public void setDocumentMainType(DocumentMainType value) {
        this.documentMainType = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setYear(Year value) {
        this.year = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link ISBN }
     *     
     */
    public ISBN getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISBN }
     *     
     */
    public void setISBN(ISBN value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}

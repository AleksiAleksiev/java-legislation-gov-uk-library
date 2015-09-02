//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package org.purl.dc.elements._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 *     		This complexType is included as a convenience for schema authors who need to define a root
 *     		or container element for all of the DC elements.
 *     	
 * 
 * <p>Java class for elementContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elementContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://purl.org/dc/elements/1.1/}elementsGroup"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementContainer", propOrder = {
    "anies"
})
public class ElementContainer {

    @XmlElementRef(name = "any", namespace = "http://purl.org/dc/elements/1.1/", type = JAXBElement.class, required = false)
    protected List<JAXBElement<AbstractAny>> anies;

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAny }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractAny>> getAnies() {
        if (anies == null) {
            anies = new ArrayList<>();
        }
        return this.anies;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package org.w3._1999.xhtml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._1999.xhtml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Div_QNAME = new QName("http://www.w3.org/1999/xhtml", "div");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._1999.xhtml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tfoot }
     * 
     */
    public Tfoot createTfoot() {
        return new Tfoot();
    }

    /**
     * Create an instance of {@link Tfoot.Tr }
     * 
     */
    public Tfoot.Tr createTfootTr() {
        return new Tfoot.Tr();
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public Table createTable() {
        return new Table();
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public Caption createCaption() {
        return new Caption();
    }

    /**
     * Create an instance of {@link Col }
     * 
     */
    public Col createCol() {
        return new Col();
    }

    /**
     * Create an instance of {@link Colgroup }
     * 
     */
    public Colgroup createColgroup() {
        return new Colgroup();
    }

    /**
     * Create an instance of {@link Thead }
     * 
     */
    public Thead createThead() {
        return new Thead();
    }

    /**
     * Create an instance of {@link org.w3._1999.xhtml.Tr }
     * 
     */
    public org.w3._1999.xhtml.Tr createTr() {
        return new org.w3._1999.xhtml.Tr();
    }

    /**
     * Create an instance of {@link org.w3._1999.xhtml.Td }
     * 
     */
    public org.w3._1999.xhtml.Td createTd() {
        return new org.w3._1999.xhtml.Td();
    }

    /**
     * Create an instance of {@link Th }
     * 
     */
    public Th createTh() {
        return new Th();
    }

    /**
     * Create an instance of {@link Tbody }
     * 
     */
    public Tbody createTbody() {
        return new Tbody();
    }

    /**
     * Create an instance of {@link AtomXHTMLTextConstruct }
     * 
     */
    public AtomXHTMLTextConstruct createAtomXHTMLTextConstruct() {
        return new AtomXHTMLTextConstruct();
    }

    /**
     * Create an instance of {@link Tfoot.Tr.Td }
     * 
     */
    public Tfoot.Tr.Td createTfootTrTd() {
        return new Tfoot.Tr.Td();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomXHTMLTextConstruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "div", substitutionHeadNamespace = "http://www.w3.org/2005/Atom", substitutionHeadName = "atomXHTMLTextConstruct")
    public JAXBElement<AtomXHTMLTextConstruct> createDiv(AtomXHTMLTextConstruct value) {
        return new JAXBElement<AtomXHTMLTextConstruct>(_Div_QNAME, AtomXHTMLTextConstruct.class, null, value);
    }

}

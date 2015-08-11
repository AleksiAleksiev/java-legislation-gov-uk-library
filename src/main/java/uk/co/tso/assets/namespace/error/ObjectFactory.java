//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.co.tso.assets.namespace.error;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.tso.assets.namespace.error package. 
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

    private final static QName _Error_QNAME = new QName("http://www.tso.co.uk/assets/namespace/error", "Error");
    private final static QName _FatalError_QNAME = new QName("http://www.tso.co.uk/assets/namespace/error", "FatalError");
    private final static QName _Warning_QNAME = new QName("http://www.tso.co.uk/assets/namespace/error", "Warning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.tso.assets.namespace.error
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tso.co.uk/assets/namespace/error", name = "Error")
    public JAXBElement<ErrorType> createError(ErrorType value) {
        return new JAXBElement<ErrorType>(_Error_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tso.co.uk/assets/namespace/error", name = "FatalError")
    public JAXBElement<ErrorType> createFatalError(ErrorType value) {
        return new JAXBElement<ErrorType>(_FatalError_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tso.co.uk/assets/namespace/error", name = "Warning")
    public JAXBElement<ErrorType> createWarning(ErrorType value) {
        return new JAXBElement<ErrorType>(_Warning_QNAME, ErrorType.class, null, value);
    }

}

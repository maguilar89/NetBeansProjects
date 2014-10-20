
package taller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the taller package. 
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

    private final static QName _Hello_QNAME = new QName("http://Taller/", "hello");
    private final static QName _ConvertirDolarAPeso_QNAME = new QName("http://Taller/", "ConvertirDolarAPeso");
    private final static QName _HelloResponse_QNAME = new QName("http://Taller/", "helloResponse");
    private final static QName _ConvertiPesoADolarResponse_QNAME = new QName("http://Taller/", "ConvertiPesoADolarResponse");
    private final static QName _ConvertirDolarAPesoResponse_QNAME = new QName("http://Taller/", "ConvertirDolarAPesoResponse");
    private final static QName _ConvertiPesoADolar_QNAME = new QName("http://Taller/", "ConvertiPesoADolar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: taller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ConvertirDolarAPeso }
     * 
     */
    public ConvertirDolarAPeso createConvertirDolarAPeso() {
        return new ConvertirDolarAPeso();
    }

    /**
     * Create an instance of {@link ConvertirDolarAPesoResponse }
     * 
     */
    public ConvertirDolarAPesoResponse createConvertirDolarAPesoResponse() {
        return new ConvertirDolarAPesoResponse();
    }

    /**
     * Create an instance of {@link ConvertiPesoADolarResponse }
     * 
     */
    public ConvertiPesoADolarResponse createConvertiPesoADolarResponse() {
        return new ConvertiPesoADolarResponse();
    }

    /**
     * Create an instance of {@link ConvertiPesoADolar }
     * 
     */
    public ConvertiPesoADolar createConvertiPesoADolar() {
        return new ConvertiPesoADolar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Taller/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirDolarAPeso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Taller/", name = "ConvertirDolarAPeso")
    public JAXBElement<ConvertirDolarAPeso> createConvertirDolarAPeso(ConvertirDolarAPeso value) {
        return new JAXBElement<ConvertirDolarAPeso>(_ConvertirDolarAPeso_QNAME, ConvertirDolarAPeso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Taller/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertiPesoADolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Taller/", name = "ConvertiPesoADolarResponse")
    public JAXBElement<ConvertiPesoADolarResponse> createConvertiPesoADolarResponse(ConvertiPesoADolarResponse value) {
        return new JAXBElement<ConvertiPesoADolarResponse>(_ConvertiPesoADolarResponse_QNAME, ConvertiPesoADolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirDolarAPesoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Taller/", name = "ConvertirDolarAPesoResponse")
    public JAXBElement<ConvertirDolarAPesoResponse> createConvertirDolarAPesoResponse(ConvertirDolarAPesoResponse value) {
        return new JAXBElement<ConvertirDolarAPesoResponse>(_ConvertirDolarAPesoResponse_QNAME, ConvertirDolarAPesoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertiPesoADolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Taller/", name = "ConvertiPesoADolar")
    public JAXBElement<ConvertiPesoADolar> createConvertiPesoADolar(ConvertiPesoADolar value) {
        return new JAXBElement<ConvertiPesoADolar>(_ConvertiPesoADolar_QNAME, ConvertiPesoADolar.class, null, value);
    }

}

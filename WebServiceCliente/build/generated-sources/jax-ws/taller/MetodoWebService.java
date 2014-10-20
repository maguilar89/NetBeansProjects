
package taller;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "metodoWebService", targetNamespace = "http://Taller/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MetodoWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Taller/", className = "taller.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Taller/", className = "taller.HelloResponse")
    @Action(input = "http://Taller/metodoWebService/helloRequest", output = "http://Taller/metodoWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param peso
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConvertiPesoADolar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConvertiPesoADolar", targetNamespace = "http://Taller/", className = "taller.ConvertiPesoADolar")
    @ResponseWrapper(localName = "ConvertiPesoADolarResponse", targetNamespace = "http://Taller/", className = "taller.ConvertiPesoADolarResponse")
    @Action(input = "http://Taller/metodoWebService/ConvertiPesoADolarRequest", output = "http://Taller/metodoWebService/ConvertiPesoADolarResponse")
    public double convertiPesoADolar(
        @WebParam(name = "peso", targetNamespace = "")
        double peso);

    /**
     * 
     * @param dolar
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConvertirDolarAPeso")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConvertirDolarAPeso", targetNamespace = "http://Taller/", className = "taller.ConvertirDolarAPeso")
    @ResponseWrapper(localName = "ConvertirDolarAPesoResponse", targetNamespace = "http://Taller/", className = "taller.ConvertirDolarAPesoResponse")
    @Action(input = "http://Taller/metodoWebService/ConvertirDolarAPesoRequest", output = "http://Taller/metodoWebService/ConvertirDolarAPesoResponse")
    public double convertirDolarAPeso(
        @WebParam(name = "dolar", targetNamespace = "")
        double dolar);

}

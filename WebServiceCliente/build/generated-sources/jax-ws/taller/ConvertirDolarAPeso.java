
package taller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConvertirDolarAPeso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConvertirDolarAPeso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dolar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertirDolarAPeso", propOrder = {
    "dolar"
})
public class ConvertirDolarAPeso {

    protected double dolar;

    /**
     * Obtiene el valor de la propiedad dolar.
     * 
     */
    public double getDolar() {
        return dolar;
    }

    /**
     * Define el valor de la propiedad dolar.
     * 
     */
    public void setDolar(double value) {
        this.dolar = value;
    }

}

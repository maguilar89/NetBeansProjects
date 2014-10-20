/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Taller;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author Desarrolador1
 */
@WebService(serviceName = "metodoWebService")
public class metodoWebService {

     
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "ConvertiPesoADolar")
    public double ConvertiPesoADolar(@WebParam(name = "peso")double peso){
        double resultado = peso * 1800;
        
        return resultado; 
    }
    
    @WebMethod(operationName = "ConvertirDolarAPeso")
    public double ConvertirDolarAPeso(@WebParam(name = "dolar")double dolar){
    double resultado = dolar / 1800;

    return resultado;
    }
    
    
            
}

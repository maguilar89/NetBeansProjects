<%-- 
    Document   : index
    Created on : 24-sep-2014, 12:48:56
    Author     : Desarrolador1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONVERTIDOR DE MONEDAS (DOLAR-PESO)</title>
    </head>
    <body>
        <h1>Valor en peso</h1>
        <form action="index.jsp" method="POST">
            <input type="text" name="cajaValor" value="" />
            <input type="submit" value="calcular" />
        </form>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                taller.MetodoWebService_Service service = new taller.MetodoWebService_Service();
                taller.MetodoWebService port = service.getMetodoWebServicePort();
                // TODO initialize WS operation arguments here
                double peso = Double.valueOf(request.getParameter("cajaValor"));
                if (peso >= 0) {
                    double result = port.convertiPesoADolar(peso);
                    out.println("El resultado en dolar  = " + result);
                } else {

                    out.println("Error!!");
                }

            // TODO process result here
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>


    </body>
</html>

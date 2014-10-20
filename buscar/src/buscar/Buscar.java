/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscar;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//^([a-zA-Z])+([_])?([a-zA-Z0-9]{0,14})$
//^\\s*declare\\s+(?!(Entero|Real|Cadena|Fecha|Logico|declare))
//(([a-zA-Z0-9&$#])+|[a-zA-Z0-9&$#]+\\s*(,\\s*(?!(Entero|Real|Cadena|Fecha|Logico|declare))
//[a-zA-Z0-9&$#]+)*)\\s+(Entero|Real|Cadena|Fecha|Logico);$

/**
 *
 * @author Desarrolador1
 */
public class Buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println( buscarPalabra(" aguilar , dskjhkjsahjkdsa", "manuel"));
        // System.out.println(validarExpresioRegular("\\s*[declare]"));
        System.out.println(ProbarToken(",", "manuelaguilar heeerra, heerre, herreraldkhlkshlkfhsd,herrera,  herrera"));
    }
    
    public static Map<String, String> ProbarToken(String separ, String texto) {
        Integer i = 0;
        StringTokenizer st = new StringTokenizer(separ);
        Map<String, String> datos = new HashMap<String, String>();
        String almacenar = " ";
        
        while (st.hasMoreTokens()) {
            i++;
            almacenar = st.nextToken();
            datos.put(String.valueOf(i), almacenar);
        }
        
        return datos;
    }

    //"manuelaguilar heeerra, heerre, herreraldkhlkshlkfhsd,herrera,  herrera"
    public static boolean validarExpresioRegular(String palabra) {
        boolean sw = false;
        Pattern p = Pattern.compile("[declarsad]");
        Matcher m = p.matcher(palabra);

        /* if (palabra.matches("\\\\s*declare\\\\s+(?!(Entero|Real|Cadena|Fecha|Logico|declare))(([a-zA-Z0-9&$#])+|[a-zA-Z0-9&$#]+\\\\s*(,\\\\s*(?!(Entero|Real|Cadena|Fecha|Logico|declare))[a-zA-Z0-9&$#]+)*)\\\\s+(Entero|Real|Cadena|Fecha|Logico)")) {
         sw = true;
         }*/
        // m.matcher("\\\\s*declare\\\\s+(?!(Entero|Real|Cadena|Fecha|Logico|declare))(([a-zA-Z0-9&$#])+|[a-zA-Z0-9&$#]+\\\\s*(,\\\\s*(?!(Entero|Real|Cadena|Fecha|Logico|declare))[a-zA-Z0-9&$#]+)*)\\\\s+(Entero|Real|Cadena|Fecha|Logico)");
        if (m.find()) {
            sw = true;
            System.out.println("Cumple..!!");
        }
        
        return sw;
    }
    
    public static boolean buscarPalabra(String texto, String palabra) {
        Integer valor = 0;
        boolean r = false;
        StringTokenizer st = new StringTokenizer(texto, System.getProperty("line.separator"));
        Map cont = new HashMap();
        //s1=false;
        //s2=true;
        while (st.hasMoreTokens()) {
            String tokens = st.nextToken();
            Pattern before = null;
            before = Pattern.compile(palabra, Pattern.CASE_INSENSITIVE);
            Matcher mat = before.matcher(tokens);
            if (mat.find()) {
                int c = (cont.get(mat.group()) != null ? Integer.parseInt((String) cont.get(mat.group())) : 0);
                c++;
                cont.put(mat.group(), c + "");
            }
            StringTokenizer st2 = new StringTokenizer(tokens, " ");
            while (st2.hasMoreElements()) {
                String tokens2 = st2.nextToken();
                if (tokens2.equals(palabra)) {
                    int c = (cont.get(tokens2) != null ? Integer.parseInt((String) cont.get(tokens2)) : 0);
                    c++;
                    cont.put(tokens2, c + "");
                }
            }
        }
        
        if (!cont.isEmpty()) {
            r = true;
        }
        
        return r;
    }
    
}

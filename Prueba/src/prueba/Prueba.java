/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Desarrolador1
 */
//  w  ww . j ava  2  s  . co m
public class Prueba {
    
    Personal p = new Personal();
   
    public static void main(String[] args) {
        int valor=6;
        String palabra ="manuel aguilar herrera. esto es una ";
        System.out.println(buscarPalabra("manuel", "", true, true));
        
        System.out.println(valor > 6 ? "manuel" : "aguilar");
        
    }

    public static  Map buscarPalabra(String texto, String palabra, boolean s1, boolean s2) {
        StringTokenizer st = new StringTokenizer(texto, System.getProperty("line.separator"));
        Map cont = new HashMap();
        s1=false;
        s2=true;
        while (st.hasMoreTokens()) {
            String tokens = st.nextToken();
            Pattern before = null;
            if (!s2) {
                if (s1) {
                    before = Pattern.compile(palabra, Pattern.CASE_INSENSITIVE);
                } else {
                    before = Pattern.compile(palabra);
                }
                Matcher mat = before.matcher(tokens);
                if (mat.find()) {
                    int c = (cont.get(mat.group()) != null ? Integer.parseInt((String) cont.get(mat.group())) : 0);
                    c++;
                    cont.put(mat.group(), c + "");
                }
            } else {
                StringTokenizer st2 = new StringTokenizer(tokens, " ");
                while (st2.hasMoreElements()) {
                    String tokens2 = st2.nextToken();
                    if (s1) {
                        if (tokens2.toLowerCase().equals(palabra.toLowerCase())) {
                            int c = (cont.get(tokens2) != null ? Integer.parseInt((String) cont.get(tokens2)) : 0);
                            c++;
                            cont.put(tokens2, c + "");
                        }
                    }else{
                        if (tokens2.equals(palabra)) {
                            int c = (cont.get(tokens2) != null ? Integer.parseInt((String) cont.get(tokens2)) : 0);
                            c++;
                            cont.put(tokens2, c + "");
                            System.out.println("contenido>>>"+cont);
                        }
                    }
                }
            }

        }
        return cont;
    }

}

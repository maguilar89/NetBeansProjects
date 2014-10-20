/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado_simple;

import java.util.Arrays;
/**
 *
 * @author Desarrolador1
 */
public final  class Cifrar {
    
    public static String encriptar(String palabra) {
        String pal = "";
        if (false) {
            System.out.println("Error intente con otro número menor");
        } else {

            String [] arreglo1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            char[] arreglo2 = {'_', ';', ':', '!', '¡', '¿', '?', '*', '+', '^', 'ñ', '[', '{', '-', '.', ',', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1'};
            String[] arreglo = {"_", ";", ":", "!", "¡", "¿", "?", "*", "+", "^", "ñ", "[", "{", "-", ".", ",", "0", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
                    
            char[] vector_defecto3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            int[] pos_palabra = new int[palabra.length()];
            
            for (int i = 0; i <= vector_defecto3.length - 1; i++) {
                for (int j = 0; j < palabra.length(); j++) {
                    char r = palabra.charAt(j);
                    if (vector_defecto3[i] == r) {
                        pos_palabra[j] = i;
                    }
                }
            }
            String[] palabra_codificada = new String[pos_palabra.length];

            for (int i = 0; i < arreglo2.length - 1; i++) {
                for (int j = 0; j < pos_palabra.length; j++) {
                    palabra_codificada[j] = arreglo[pos_palabra[j]];
                }
            }
            
            for (int i = 0; i <= palabra_codificada.length - 1; i++) {
                pal = pal + palabra_codificada[i];

            }
            System.out.println("viejo>>>>" + Arrays.toString(arreglo1) + "\t");
            System.out.println("arreglo2>>"+Arrays.toString(arreglo2));
            System.out.println("palabra normal>>" + palabra);
            System.out.println("palabra codificada>>>>" + pal);
        }
        return pal;
    }
    
    public static String desEncriptar(String palabra) {
        String pal = "";
        if (false) {
            System.out.println("Error intente con otro número menor");
        } else {

            String [] arreglo1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            char[] arreglo2 = {'_', ';', ':', '!', '¡', '¿', '?', '*', '+', '^', 'ñ', '[', '{', '-', '.', ',', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1'};
            String[] arreglo = {"_", ";", ":", "!", "¡", "¿", "?", "*", "+", "^", "ñ", "[", "{", "-", ".", ",", "0", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
                    
            char[] vector_defecto3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            int[] pos_palabra = new int[palabra.length()];
            
            for (int i = 0; i <= arreglo2.length - 1; i++) {
                for (int j = 0; j < palabra.length(); j++) {
                    char r = palabra.charAt(j);
                    if (arreglo2[i] == r) {
                        pos_palabra[j] = i;
                    }
                }
            }
            String[] palabra_codificada = new String[pos_palabra.length];

            for (int i = 0; i < vector_defecto3.length - 1; i++) {
                for (int j = 0; j < pos_palabra.length; j++) {
                    palabra_codificada[j] = arreglo1[pos_palabra[j]];
                }
            }
            
            for (int i = 0; i <= palabra_codificada.length - 1; i++) {
                pal = pal + palabra_codificada[i];

            }
            System.out.println("viejo>>>>" + Arrays.toString(arreglo1) + "\t");
            System.out.println("arreglo2>>"+Arrays.toString(arreglo2));
            System.out.println("palabra normal>>" + palabra);
            System.out.println("palabra codificada>>>>" + pal);
        }
        return pal;
    }
    
    
    
}

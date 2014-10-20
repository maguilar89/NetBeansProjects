
package cifrado_cesar;

import java.util.Arrays;

/**
 *
 * @author Manuel Aguilar Herrera
 */
public final class Codificar {

    public static String encriptar(String palabra, int n) {
        String pal = "";
        if (false) {
            System.out.println("Error intente con otro número menor");
        } else {

            String[] vector_defecto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            char[] vector_defecto3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            String[] vector_nuevo = new String[vector_defecto.length];
            String[] vector_rest = new String[n];
            int[] pos_palabra = new int[palabra.length()];
            for (int i = n; i <= vector_defecto.length; i++) {
                for (int j = 0; j < vector_defecto.length - n; j++, i++) {
                    vector_nuevo[j] = vector_defecto[i];
                }
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= vector_rest.length - 1; j++, i++) {
                    vector_rest[j] = vector_defecto[i];
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = vector_defecto.length - 1; i >= 0; j--, i--) {
                    vector_nuevo[j] = vector_rest[i];
                }
            }

            for (int i = 0; i <= vector_defecto3.length - 1; i++) {
                for (int j = 0; j < palabra.length(); j++) {
                    //System.out.println("letras>>"+palabra.length());
                    char r = palabra.charAt(j);
                    if (vector_defecto3[i] == r) {
                        pos_palabra[j] = i;
                    }
                }
            }
            String[] palabra_codificada = new String[pos_palabra.length];

            for (int i = 0; i < vector_nuevo.length - 1; i++) {
                for (int j = 0; j < pos_palabra.length; j++) {
                    palabra_codificada[j] = vector_nuevo[pos_palabra[j]];
                }
            }
            
            for (int i = 0; i <= palabra_codificada.length - 1; i++) {
                pal = pal + palabra_codificada[i];

            }
            System.out.println("viejo>>>>" + Arrays.toString(vector_defecto) + "\t");
            System.out.println("nuevo>>>>" + Arrays.toString(vector_nuevo));
            System.out.println("restante>>>>" + Arrays.toString(vector_rest));
            System.out.println("palabra normal>>" + palabra);
            System.out.println("palabra codificada>>>>" + pal);
        }
        return pal;
    }
    
    public static String desEncriptar(String palabra, int n) {
        String pal = "";
        if (false) {
            System.out.println("Error intente con otro número menor");
        } else {

            String[] vector_defecto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            char[] vector_defecto_char = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            String[] vector_nuevo = new String[vector_defecto.length];
            String[] vector_rest = new String[n];
            char[] vector_nuevo_char = new char[vector_defecto.length];
            int[] pos_palabra = new int[palabra.length()];
            for (int i = n; i <= vector_defecto.length; i++) {
                for (int j = 0; j < vector_defecto.length - n; j++, i++) {
                    vector_nuevo[j] = vector_defecto[i];
                    vector_nuevo_char[j] = vector_defecto_char[i];
                }
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= vector_rest.length - 1; j++, i++) {
                    vector_rest[j] = vector_defecto[i];
                    
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = vector_defecto.length - 1; i >= 0; j--, i--) {
                    vector_nuevo[j] = vector_rest[i];
                }
            }

            for (int i = 0; i <= vector_nuevo_char.length - 1; i++) {
                for (int j = 0; j < palabra.length(); j++) {
                    char r = palabra.charAt(j);
                    if (vector_nuevo_char[i] == r) {
                        pos_palabra[j] = i;
                        System.out.println(pos_palabra[j]);
                    }
                }
            }
            String[] palabra_codificada = new String[pos_palabra.length];

            for (int i = 0; i < vector_defecto.length - 1; i++) {
                for (int j = 0; j < pos_palabra.length; j++) {
                    palabra_codificada[j] = vector_defecto[pos_palabra[j]];
                    
                }
                
            }
            
            for (int i = 0; i <= palabra_codificada.length - 1; i++) {
                pal = pal + palabra_codificada[i];
            }
            
            System.out.println("viejo>>>>" + Arrays.toString(vector_defecto) + "\t");
            System.out.println("nuevo>>>>" + Arrays.toString(vector_nuevo));
            System.out.println("restante>>>>" + Arrays.toString(vector_rest));
            System.out.println("palabra normal>>" + palabra);
            System.out.println("palabra codificada>>>>" + pal);
        }
        return pal;
    }
}
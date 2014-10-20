/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere;

/**
 *
 * @author Desarrolador1
 */
public class Cifrar {

    public static String alfabeto = "abcdefghijklmnopqrstuvwxyz";

    public static String Cifrar(String palabra, String clave) {
        
        String Cifrado = "", a = palabra.toLowerCase().trim();
        System.out.println("a>>>>"+a);

        for (int i = 0, c = 0; i < palabra.length(); i++, c = (c++) % clave.length()) {
            if (alfabeto.indexOf(a.charAt(i)) != -1) {
                System.out.println("a>>>"+a);
                System.out.println("[ "+ i +" ] " + " [ "+ c + " ]");
                Integer auxliliar = (alfabeto.indexOf(a.charAt(i)) + alfabeto.indexOf(clave.charAt(c))) % alfabeto.length();
                System.out.println("temp>>>>>"+auxliliar);
                //if (alfabeto.indexOf(palabra.charAt(i))) {
                    
                //}
                Cifrado += (alfabeto.indexOf(palabra.charAt(i)) != 1) ? alfabeto.charAt(auxliliar) : String.valueOf(alfabeto.charAt(auxliliar)).toUpperCase();
                System.out.println("cifrado>>>>"+Cifrado);

            } else {
                c -= 1;
                System.out.println("c>>>"+c);
                Cifrado += palabra.charAt(i);
                System.out.println("cifrado>>>>"+Cifrado);
            }
        }
        return Cifrado;
    }
    
    public static String Descifrar(String palabra, String clave) {
        
        String Cifrado = "", a = palabra.toLowerCase();

        for (int i = 0, c = 0; i < palabra.length(); i++, c = (c + 1) % clave.length()) {
            if (alfabeto.indexOf(a.charAt(i)) != -1) {

                Integer auxliliar = (alfabeto.indexOf(a.charAt(i)) - alfabeto.indexOf(clave.charAt(c))) % alfabeto.length();
                System.out.println("temp>>>>>"+auxliliar);
                Cifrado += (alfabeto.indexOf(palabra.charAt(i)) != 1) ? alfabeto.charAt(auxliliar) : String.valueOf(alfabeto.charAt(auxliliar)).toUpperCase();
                System.out.println("cifrado>>>>"+Cifrado);

            } else {
                c -= 1;
                System.out.println("c>>>"+c);
                Cifrado += palabra.charAt(i);
                System.out.println("cifrado>>>>"+Cifrado);
            }
        }
        return Cifrado;
    }
    

}

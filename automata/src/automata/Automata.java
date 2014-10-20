/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

import javax.swing.JFrame;
import vistas.jfprincipal;

/**
 *
 * @author Desarrolador1
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jfprincipal = new jfprincipal();
        jfprincipal.setTitle("MAQUINA DE BEBIDAS");
        jfprincipal.setVisible(true);
        jfprincipal.setLocation(500, 200);
        System.out.println("posicion>>>>>"+jfprincipal.getLocation());jfprincipal.getLocation();
        
    }
    
}

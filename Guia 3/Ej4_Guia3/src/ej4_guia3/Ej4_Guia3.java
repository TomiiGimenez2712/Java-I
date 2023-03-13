/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_guia3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ej4_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        
        String palabra;
        String letra;
        System.out.println("Ingrese una palabra que inicie con (a/A)");
        palabra= leer.next();
        letra= palabra.substring(0, 1);
   
        
        if (letra.equals("a") || letra.equals("A")){
            System.out.println("CORRECTO.!");}
        else{
            System.out.println("INCORRECTO.!");
        }
    
    }
}

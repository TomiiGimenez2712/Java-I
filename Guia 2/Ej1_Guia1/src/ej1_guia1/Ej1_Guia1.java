/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_guia1;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class Ej1_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner Leer = new Scanner(System.in);
        int N1;
        int N2;
        System.out.println("Ingrese número 1"); 
        N1 = Leer.nextInt();
        System.out.println("Ingrese número 2"); 
        N2 = Leer.nextInt();
        int suma = N1 + N2;
        System.out.println("El resultado es: " + suma);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_guia1;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class Ej4_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       double gc;       
       System.out.println("Ingrese el valor de los °C: ");
       gc = Leer.nextDouble();
       double gf = 32 + (9 * gc / 5);
       System.out.println("El equivalente a °F es: " + gf);
       
    }
    
}

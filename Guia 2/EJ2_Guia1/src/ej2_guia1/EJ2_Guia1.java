/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_guia1;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class EJ2_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       System.out.println("Ingrese un nombre: ");
       String Nombre = Leer.next();
       System.out.println("El nombre ingresado es: " + Nombre);
    }
    
}

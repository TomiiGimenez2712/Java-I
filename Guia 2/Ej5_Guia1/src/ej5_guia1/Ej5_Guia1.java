/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_guia1;

import java.util.Scanner;

/**
 *
 * @author Osvaldo
 */
public class Ej5_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       int num;       
       System.out.println("Ingrese un numero entero ");
       num = Leer.nextInt();
       int doble = num * 2;
       int triple = num * 3;
       System.out.println("La RAIZ del nro es: " + Math.sqrt(num));
       System.out.println("El DOBLE del nro es: " + doble + " El TRIPLE del nro es: " + triple); 
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_guia3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ej2_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Leer = new Scanner(System.in);
         
         String contra;
         
         System.out.println("Ingrese la contraseña");
         contra= Leer.next();
         
         if (contra.equals("eureka")){
             System.out.println("CORRECTO.!");
         }
         else{
            System.out.println("INCORRECTO.!");
                     
         }
         
         
        // TODO code application logic here
    }
    
}

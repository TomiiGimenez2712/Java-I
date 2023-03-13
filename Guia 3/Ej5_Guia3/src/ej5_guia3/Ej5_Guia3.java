/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_guia3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ej5_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        int limite=32;
        int num;
        int total=0;
        
        do{
        System.out.println("Ingrese un numero");
        num= leer.nextInt();
        total=total+num;
        
        }while (total<32);
       
        
                
    }
    
}

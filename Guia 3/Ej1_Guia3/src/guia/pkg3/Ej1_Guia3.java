/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        int num;    
     
  
        System.out.println("Ingrese un numero");
        num = Leer.nextInt();
        
        if (((num % 2)==0)){
            System.out.println("Es Par");
        } else {
            System.out.println("Es impar");
            
        }
        
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3_guia3.correcto;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ej3_Guia3Correcto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner leer = new Scanner(System.in);
        
        String frase;
        int largo;
        
      
        System.out.println("Ingrse una frase de no mas de 8 caracteres");
        frase=leer.next();
        largo= frase.length();
    if(largo<=8){
        System.out.println("CORRECTO.!");
    }
    else{
        System.out.println("INCORRECTO.!");
    }
    }

    }
   
    

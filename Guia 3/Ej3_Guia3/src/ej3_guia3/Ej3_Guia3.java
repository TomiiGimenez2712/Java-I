/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3_guia3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ej3_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        int largo;
        
        do{
        System.out.println("Ingrse una frase de no mas de 8 caracteres");
        frase=leer.next();
        largo= frase.length();
        } while (largo>=8);
        System.out.println("CORRECTO.!");
        // TODO code application logic here
    }

    }
    

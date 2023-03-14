/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7_guia3;

import java.util.Scanner;

/**
 *
 * @author Silvana
 */
public class Ej7_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
     
        int correctas=0, incorrectas=0;
        String cod;
        
        do{
            System.out.println("Ingrese un codigo");
            cod=leer.next();
            if(cod.equals("&&&&&")){
                break;
            }
            else if(cod.length()==5 || cod.substring(0,1).equals("X")|| cod.substring(4,5).equals("O")){
                ++correctas;
            }
            else{
                ++incorrectas;
            }
                
        }while(!cod.equals("&&&&&"));
        
        System.out.println("Correctas: " + correctas + " Incorrectas: "+ incorrectas);
        
        
        
    }
    
}

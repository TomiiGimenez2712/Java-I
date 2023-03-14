/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6_guia3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ej6_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
     boolean bandera;
     int n1;
     int n2;
     int option;
     double result;
     String salir;
     
     bandera= false;
     do{
         System.out.println("Ingrese 2 numeros positivos");
         n1= leer.nextInt();
         n2= leer.nextInt();
     }while(n1>0 && n2>0);
     
     do{
         System.out.println("MENU");
         System.out.println("1.Sumar");
           System.out.println("2.Restar");
         System.out.println("3.Multiplicar");
         System.out.println("4.Dividir");
         System.out.println("5.Salir");
         System.out.println("Elija opción");
         option= leer.nextInt();
         if(option==1){
             result= n1+n2;
             System.out.println("La suma de los numeros es: "+result);
             
         }
          if(option==2){
              result= n1-n2;
          System.out.println("La resta de los numeros es: "+ result);
          }
           if(option==3){
               result= n1*n2;
           System.out.println("La multiplicaciónn de los numeros es: "+ result);
           }
            if(option==4){
                result= n1/n2;
            System.out.println("La división de los numeros es: "+ result);
            }
            if(option==5){
            System.out.println("Seguro que quiere salir? S/N");
            salir= leer.next();
             if(salir.equals("S") || salir.equals("s")){
                  bandera=true;
              }
  }
     }while(bandera==false);
     
     
     
     
        
        
    }
    
}

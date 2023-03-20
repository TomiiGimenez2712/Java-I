
package ej5_guia5;
import java.util.Scanner;


public class Ej5_Guia5 {


   public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    int[][] matriz =new int[3][3];
    int[][] traspuesta =new int[3][3];
    int i, j;
    boolean bandera= true;
    
    //---------------------LLENAR MATRICES------------------------
    
      for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++){
              matriz[i][j] = (int) (Math.random() * 10);
          }
      }
          
        for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++){
              traspuesta[i][j] = (matriz[j][i])*-1;
          
          }
        }
        //--------------------COMPROBACIÓN--------------------
        for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++){
              
                if(traspuesta[i][j] != (matriz[j][i])*-1){
                    bandera=false;
                }
            }
        }
          
          //-------------------IMPRIMIR--------------------
          
          
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
              System.out.print("|"+ matriz[i][j]+"|");
            } 
              System.out.println("");      
        }
            System.out.println("");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
              System.out.print("|"+ traspuesta[i][j]+"|");
            }
              System.out.println("");      
        }
        
        
        if(bandera==true){
            System.out.println("La Matriz es antisimétrica");
        }
        else{
            System.out.println("La Matriz NO es antisimétrica");
        }
        
    

    }

}
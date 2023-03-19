
package ej4_guia5;
import java.util.Scanner;


public class Ej4_Guia5 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    int[][] matriz =new int[4][4];
    int[][] traspuesta =new int[4][4];
    int i, j;
    
      for (i = 0; i < 4; i++) {
          for (j = 0; j < 4; j++){
              matriz[i][j] = (int) (Math.random() * 10);
          }
          
        for (i = 0; i < 4; i++) {
          for (j = 0; j < 4; j++){
              traspuesta[i][j] = matriz[j][i];
          
          }
          
          
          //-------------------Impresion--------------
          
          
          for (i = 0; i < 4; i++) {
          for (j = 0; j < 4; j++){
              System.out.print(matriz[i][j]);
          }
              System.out.println("");      
        }
            System.out.println("");
          for (i = 0; i < 4; i++) {
          for (j = 0; j < 4; j++){
              System.out.print(traspuesta[i][j]);
          }
              System.out.println("");      
        }
    

    }

}
    }
}

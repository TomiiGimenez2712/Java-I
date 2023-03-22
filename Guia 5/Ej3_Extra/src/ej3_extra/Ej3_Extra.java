
package ej3_extra;
import java.util.Scanner;


public class Ej3_Extra {


 public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int tamaño= leer.nextInt();
        int[][] matriz= new int [tamaño][tamaño];
        int[] vector= new int[(tamaño*tamaño)];
        
        
        
        
        //----------------relleno matriz----------------
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                
                matriz[i][j]= (int)(Math.random()*100);

            }
  
        }
        
        rellenar(matriz, vector, tamaño);
        imprimir(vector, tamaño, matriz);
   
    }
 
            //---------------------relleno vector----------------------
         public static void rellenar( int[][] matriz, int[] vector, int tamaño){
             int cont=0;
             
             for (int i = 0; i < tamaño; i++) {
                 for (int j = 0; j < tamaño; j++) {
                    vector[cont]=matriz[i][j];
                    cont++;
    
                    }
             }      
         
         }
         
         //----------------------Imrpimo todo ------------------------
         public static void imprimir(int[] vector, int tamaño, int[] [] matriz){
        
             for (int i = 0; i < tamaño; i++) {
                 for (int j = 0; j < tamaño; j++) {
                     System.out.print("|"+matriz[i][j]+"|");

                 }
                 System.out.println("");
                 
             }
             System.out.println("");
             
             
             
             for (int i = 0; i < tamaño*tamaño; i++) {
                    System.out.print("|"+vector[i]+"|");
          
              }
             System.out.println("");
         }
}






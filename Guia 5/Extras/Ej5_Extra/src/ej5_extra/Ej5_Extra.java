
package ej5_extra;

import java.util.Scanner;

public class Ej5_Extra {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas");
        int n=leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int m= leer.nextInt();
        
        int [][] matriz = new int [n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]= (int) (Math.random()*10);
                System.out.print("|"+matriz[i][j]+"|");
   
                
            }
            System.out.println("");
            
        }
        
    }

}

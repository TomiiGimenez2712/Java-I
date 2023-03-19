
package ej1_guia5;
import java.util.Scanner;


public class Ej1_Guia5 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    //declaro y creo un vector
        int[] vector = new int[100];

        //recorro la fila 
         for (int i = 0; i < vector.length; i++){
            vector[i] = i+1;

        }

        // Muestro el vector
        for (int i = vector.length-1; i>= 0; i--) {
            System.out.print("[" + vector[i] + "]");
            
            
          /*
       for (int elemento : vector)                    //forma mejorada
            System.out.print("[" + elemento + "]");
        */
        }
        System.out.println("");
        //.

    }

}

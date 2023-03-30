
package ej2_extra;
import java.util.Scanner;


public class Ej2_Extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese la dimension de los vectores");
        int vec = leer.nextInt();
        int[] vector1 = new int[vec];
        int[] vector2 = new int[vec];

        //---------------CARGA-----------
        for (int i = 0; i < vec; i++) {

            vector1[i] = (int) (Math.random() * 3);
            vector2[i] = (int) (Math.random() * 3);
            //vector1[i] = vector2[i] ;   

        }
        //-------------COMPROBAR----------
        for (int i = 0; i < vec; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Son distintos en la posicion " + i);
                break; 
            }
           

        }

    }

}

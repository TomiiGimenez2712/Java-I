
package ej1_extra;
import java.util.Scanner;


public class Ej1_Extra {


    public static void main(String[] args) {
 
    Scanner leer = new Scanner(System.in) ;
        System.out.println("Ingresar dimension del verctor");
        int n = leer.nextInt() ;
        int[] vector = new int [n] ;
        int suma = 0 ;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt() ;
            vector [i]= num ;
            suma = suma + num ;
            
            
            
        }
        System.out.println("La suma es " + suma );

    }

}

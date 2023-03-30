
package ej7_extra;
import ej7_extra.entidades.Rectangulo;
import java.util.Scanner;


public class Ej7_Extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    Rectangulo rectangulo1= new Rectangulo(4, 6);
    
        System.out.println("El area del rectangulo es: "+rectangulo1.calcular_area());

    }

}

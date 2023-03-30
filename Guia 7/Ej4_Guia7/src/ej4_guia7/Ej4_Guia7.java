
package ej4_guia7;
import ej4_guia7.entidades.Rectangulo;
import java.util.Scanner;


public class Ej4_Guia7 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    Rectangulo r1= new Rectangulo();
    
    
    r1.crearRectangulo();
    double sup= r1.calcSuperficie();
    double per= r1.calcPerimetro();
    
        System.out.println("El perimetro del rectangulo es: "+ per);
        System.out.println("La superficie del rectangulo es: "+ sup);
        
   r1.dibujar();


    }

}

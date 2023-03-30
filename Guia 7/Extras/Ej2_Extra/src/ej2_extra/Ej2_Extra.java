
package ej2_extra;
import ej2_extra.entidades.Coordenada;
import java.util.Scanner;


public class Ej2_Extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    Coordenada c1= new Coordenada();
    
    c1.crearPuntos();
    
 
    
        System.out.println("Distancia entre puntos: " + c1.calcularDistancia());
    
    
    
    
    }

}


package ej4_extra;
import ej4_extra.entidades.Cocina;
import java.util.Scanner;


public class Ej4_Extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    Cocina c1= new Cocina();
    
    
    c1.guardar();
    c1.buscar();
    c1.mostrar();

    }

}


package ej2_guia7;
import ej2_guia7.entidades.Circunferencia;
import java.util.Scanner;


public class Ej2_Guia7 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    Circunferencia c1= new Circunferencia();
    
    c1.crearCircunferencia();
    double area= c1.area();
    double perimetro= c1.perimetro();
    
    
    
        System.out.println("area: "+ area+" perimetro: "+ perimetro);

    }

}

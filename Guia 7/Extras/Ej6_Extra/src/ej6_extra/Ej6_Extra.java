
package ej6_extra;
import ej6_extra.entidades.Empleado;
import java.util.Scanner;


public class Ej6_Extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);

    
       Empleado e1= new Empleado("Pedro",25, 100);
       
       e1.calcular_aumento();
    }

}

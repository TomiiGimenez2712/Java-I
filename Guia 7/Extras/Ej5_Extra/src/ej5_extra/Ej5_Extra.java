
package ej5_extra;
import ej5_extra.entidades.Cuenta;
import java.util.Scanner;


public class Ej5_Extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    Cuenta n1= new Cuenta((int)(Math.random()*100000), "Sebastian");
    
    n1.retirar_dinero();
    
    
    

    }

}

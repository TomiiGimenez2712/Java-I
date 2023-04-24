
package ej4_guia9;
import ej4_guia9.servicios.FechaService;
import java.util.Date;
import java.util.Scanner;


public class Ej4_Guia9 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    FechaService sv= new FechaService();
    
        Date nacimiento= sv.fechaNacimiento();
        Date fecha= sv.fechaActual();
        
        System.out.println("Edad: " + sv.edad(nacimiento, fecha));
    
    }

}

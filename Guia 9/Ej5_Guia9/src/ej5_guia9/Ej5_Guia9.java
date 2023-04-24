
package ej5_guia9;
import ej5_guia9.entidades.Persona;
import ej5_guia9.servicios.PersonaServicios;
import java.util.Scanner;


public class Ej5_Guia9 {

    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    PersonaServicios ps= new PersonaServicios();
    
    Persona p1= ps.crearPersona();
    ps.calcularEdad(p1);
    System.out.println("Ingrese una edad");
    ps.menorQue(leer.nextInt(), p1);
    ps.mostrarPersona(p1);

    }

}

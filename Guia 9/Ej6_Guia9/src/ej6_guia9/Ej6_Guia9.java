
package ej6_guia9;
import ej6_guia9.entidades.Curso;
import ej6_guia9.servicios.CursoServicios;
import java.util.Scanner;


public class Ej6_Guia9 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);

    
    CursoServicios cs= new CursoServicios();
    
    Curso c1= cs.crearCurso();
 
    System.out.println("Ganancias: " + cs.calcularGananciaSemanal(c1));
    cs.mostrar(c1);
    
    
    
    
    
    
    }

}

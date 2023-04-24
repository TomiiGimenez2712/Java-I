
package ej1_guia9;
import ej1_guia9.servicios.CadenaServicio;
import java.util.Scanner;


public class Ej1_Guia9 {


    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        
 
    Scanner leer= new Scanner(System.in);
    cs.cargarFrase();
        System.out.println("*****MENU*****");
        System.out.println("a. Mostrar vocales");
        System.out.println("b. Invertir frase");
        System.out.println("c. Veces repetido");
        System.out.println("d. Comparar longitud");
        System.out.println("e. Unir Frases");
        System.out.println("f. Reemplazar letra");
        System.out.println("g. Contiene letra");
        System.out.println("h. Salir");
        String opcion= leer.next();
        
        
        switch(opcion){
                case "a":
                    cs.mostrarVocales();
                break;
                case "b":
                    cs.invertirFrase();
                break;
                case "c":
                    cs.vecesRepetido();
                break;
                case "d":
                    cs.compararLongitud();
                break;
                case "e":
                    cs.unirFrases();
                break;
                case "f":
                    cs.reemplazar();
                break;
                case "g":
                    cs.contiene();
                break;
                case "h":
                break;
                default: System.out.println("opcion invalida");
        }
    
    
    
    
    
    
    
    
    
    }
    
    

}

package ejercicio2e;

import java.util.Scanner;
import service.AhorcadoServicio;

/**
 *
 * @author valen
 */
public class Ejercicio2E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio as = new AhorcadoServicio();
        String salida = "a";
        do {
            System.out.println("1 - Iniciar Juego");
            System.out.println("2 - Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    as.juego();
                    break;
                case 2:
                    System.out.println("¿Seguro que quiere salir? (S/N)");
                    salida = leer.next();
                    if (salida.equalsIgnoreCase("s")) {
                        System.out.println("Adios");
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida");

            }
        } while (!salida.equalsIgnoreCase("s") );
    }
}

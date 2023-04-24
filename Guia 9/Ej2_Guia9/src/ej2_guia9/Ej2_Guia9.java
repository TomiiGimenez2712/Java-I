
package ej2_guia9;
import ej2_guia9.servicios.ParDeNumerosService;
import java.util.Scanner;


public class Ej2_Guia9 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    int opcion;
    
    ParDeNumerosService ns= new ParDeNumerosService();
    
    ns.crearNumeros();
    
        System.out.println("*****MENU*****");
        System.out.println("1. Mostrar valores");
        System.out.println("2. Devolver mayor");
        System.out.println("3. Calcular potencia");
        System.out.println("4. Calcular Raiz y Valor absoluto");
        System.out.println("5. Salir");
        do {
           opcion=leer.nextInt();
        } while (opcion<0 && opcion>5);
        
        
        switch(opcion){
            case 1:
                ns.mostrarValores();
                break;
            case 2:
                ns.devolverMayor();
                break;
            case 3:
                ns.calcularPotencia();
                break;
            case 4:
                ns.calculaRaiz();
                break;
            case 5:
                break;                    
        }

    
    }

}

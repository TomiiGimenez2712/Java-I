
package ej3_guia9;
import ej3_guia9.servicios.ArregloService;
import java.util.Scanner;


public class Ej3_Guia9 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        ArregloService sv = new ArregloService();
        
        double [] A = new double [50];
        double [] B = new double [20];
        
        sv.inicializarA(A);
        sv.inicializarA(B);
        
        System.out.print("A: ");
        sv.mostrar(A);
        System.out.print("B: ");
        sv.mostrar(B);
        
        sv.ordenar(A);
        sv.ordenar(B);
        
        System.out.print("A Ordenado: ");
        sv.mostrar(A);
        System.out.print("B Ordenado: ");
        sv.mostrar(B);
        
        sv.inicializarB(A, B);
        System.out.print("B Modificado: ");
        sv.mostrar(B);
    }

    

}



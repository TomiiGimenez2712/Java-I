package ej1_guia7;

import ej1_guia7.entidades.Libro;
import java.util.Scanner;

public class Ej1_Guia7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

       

        int ISBN;
        String titulo;
        String autor;
        int NPaginas;
        

        System.out.println("Ingrese ISBN");
        ISBN= leer.nextInt();
        System.out.println("Ingrese titulo");
        titulo= leer.next();
        System.out.println("Ingrese autor");
        autor= leer.next();
        System.out.println("Ingrese el numero de paginas");
        NPaginas= leer.nextInt();
        
        Libro l1 = new Libro(ISBN, titulo, autor, NPaginas);
        
        
        System.out.println(l1.toString());
        
        

}

}

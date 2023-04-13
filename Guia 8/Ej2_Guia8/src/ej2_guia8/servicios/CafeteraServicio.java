
package ej2_guia8.servicios;

import ej2_guia8.entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    Scanner leer= new Scanner(System.in);
    Cafetera c1= new Cafetera(0);
    String h;
    
    public void llenarCafetera(){
        
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("Se lleno Cafetera");
        System.out.println("\nIngrese cualquier caracter para continuar");
        h=leer.next();
    }
    
    public void servirTaza(){
        System.out.println("De cuantos ml es la taza?");
        int taza=leer.nextInt();
        
        if(c1.getCantidadActual()<=taza){
            System.out.println("La taza no se llenó, se le cargó: "+ c1.getCantidadActual()+"ml");
            c1.setCantidadActual(0);
        }
        else{
            
            c1.setCantidadActual(c1.getCantidadActual()-taza);
            System.out.println("La taza se llenó");
        }
        System.out.println("\nIngrese cualquier caracter para continuar");
        h=leer.next();
    }
    
    public void vaciarCafetera(){
        c1.setCantidadActual(0);
        System.out.println("Se vacio cafetera");
        System.out.println("\nIngrese cualquier caracter para continuar");
        h=leer.next();
    }
    
    public void agregarCafe(){
        System.out.println("Cuantos ml desea agregar");
        int agregar= leer.nextInt();
        c1.setCantidadActual(c1.getCantidadActual()+agregar);
        if(c1.getCantidadActual()>c1.getCapacidadMaxima()){
            System.out.println("Se lleno la cafetera");
            System.out.println("Se agrego solo "+ (agregar - (c1.getCantidadActual()- c1.getCapacidadMaxima()))+ "ml");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }
        System.out.println("\nIngrese cualquier caracter para continuar");
        h=leer.next();
    }
    
    public void mostrar(){
        System.out.println(c1.toString());
        System.out.println("\nIngrese cualquier caracter para continuar");
        h=leer.next();
    }
}

package ej5_guia9.servicios;

import ej5_guia9.entidades.Persona;
import java.util.Date;
import java.util.Scanner;



public class PersonaServicios {
Scanner leer= new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese dia de nacimiento");
        int dia= leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes= leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        int anio= leer.nextInt();
        Date fecha= new Date(anio-1900, mes-1, dia);
        
        return new Persona(nombre, fecha);
    }
    
    public int calcularEdad(Persona p1){
        Date fecha= new Date();
        int edad= fecha.getYear()- p1.getNacimiento().getYear();
        
        return edad;
    }
    
    public boolean menorQue(int edad, Persona p1){
        boolean bandera=false;
        int edadPersona= calcularEdad(p1);
        if(edadPersona<edad){
            bandera= true;
            System.out.println("La persona es menor que la ingresada");
        }
        else{
            System.out.println("La persona es mayor que la ingresada");
        }
        return bandera;   
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: "+ p1.getNombre());
        System.out.println("Cumpleaños: " + p1.getNacimiento());
        System.out.println("Edad: "+ calcularEdad(p1));
        
    }
    
}

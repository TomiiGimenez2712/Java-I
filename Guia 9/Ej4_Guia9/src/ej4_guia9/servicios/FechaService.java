package ej4_guia9.servicios;

import java.util.Date;
import java.util.Scanner;


public class FechaService {
  Scanner leer= new Scanner(System.in);
    
    public Date fechaNacimiento(){
        System.out.println("Fecha de nacimiento");
        
        System.out.println("Ingrese dia");
        int dia= leer.nextInt();
        System.out.println("Ingrese mes");
        int mes= leer.nextInt();
        System.out.println("Ingrese año");
        int anio= leer.nextInt();
        
       return new Date(anio-1900, mes, dia);
   
    }
    public Date fechaActual(){
        return new Date();
    }
    
    public int edad(Date nacimiento, Date fecha){
        return fecha.getYear()- nacimiento.getYear();
    }
}

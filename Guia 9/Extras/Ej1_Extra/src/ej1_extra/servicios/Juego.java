package ej1_extra.servicios;

import ej1_extra.entidades.Meses;
import java.util.Scanner;


public class Juego {
    Scanner leer = new Scanner(System.in);
    
    
    
    public Meses cargarAnio(){
      String [] anio={"enero", "febrero", "marzo", "abril", "mayo","junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
      return new Meses(anio);
    }
    
    public void adivinar(){
        String mesSecreto = cargarAnio().getMeses()[(int) (Math.random() * 12)];
        System.out.println(mesSecreto);
        
        String ingresado;
        do {
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
            ingresado= leer.next();
        }while(!ingresado.equalsIgnoreCase(mesSecreto));
       
            System.out.println("Felicidades, acertaste el Mes.!!!");  
        
    }
    
    
    
    
   
    
    
    

}

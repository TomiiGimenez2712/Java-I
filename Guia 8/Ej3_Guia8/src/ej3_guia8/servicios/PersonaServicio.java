
package ej3_guia8.servicios;

import ej3_guia8.entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer= new Scanner(System.in);
    
    
    
    public Persona crearPersona(){
        System.out.println("Ingrese nombre de la persona");
        String nombre= leer.next();
        System.out.println("Ingrese la edad");
        short edad= leer.nextShort();
        System.out.println("Ingrese el peso");
        float peso= leer.nextFloat();
        System.out.println("Ingrese la altura");
        float altura= leer.nextFloat();
        
        return new Persona(nombre, edad, peso, altura);
        
    }
    
    public boolean esMayorDeEdad(Persona p1){
        boolean bandera=false;
        if(p1.getEdad()>=18){
            bandera=true;
 
        }
        return bandera;
    }
    
    public short calcularIMC(Persona p1){
        float IMC;
        short valor;
        
        IMC= (float)((p1.getPeso())/(Math.pow(p1.getAltura(), 2)));
        
        if(IMC<20){
            valor=-1;
        }
        else if(IMC>=20 && IMC<=25){
            valor=0;  
        }
        else{  
            valor=1;
        }
       return valor;
    }
    
    
    
    
}

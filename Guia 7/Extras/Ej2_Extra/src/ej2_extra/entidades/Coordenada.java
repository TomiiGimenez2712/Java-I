package ej2_extra.entidades;

import java.util.Scanner;


public class Coordenada {
     Scanner leer= new Scanner(System.in);
    
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    
    public void  crearPuntos(){
        
        System.out.println("Ingrese el punto 1");
        x1= leer.nextInt();
        y1= leer.nextInt();
        
        System.out.println("Ingrese el punto 2");
        x2= leer.nextInt();
        y2= leer.nextInt();
 
    }
    
    public double calcularDistancia(){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        
    }
    
    
    
    

}

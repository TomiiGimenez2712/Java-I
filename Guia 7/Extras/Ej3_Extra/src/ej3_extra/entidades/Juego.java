package ej3_extra.entidades;

import java.util.Scanner;


public class Juego {
    Scanner leer= new Scanner(System.in);
    
    private int numero;

    public Juego() {
    }
    
    
  
public void iniciar_juego(){
   int respuesta, cont=0;
    System.out.println("Jugador 1: Ingrese el numero secreto");
    numero=leer.nextInt();
    
    
    System.out.println("Jugador 2: Intente adivinar el numero del jugador 1");
    
    do{
        respuesta= leer.nextInt();
        if(respuesta< numero){
            System.out.println("Mas alto");
        }
        else if (respuesta> numero){
            System.out.println("Mas bajo");
        }
        cont++;
    }while(respuesta!=numero && cont<5);
    
    
    if(cont>4){
        System.out.println("Superaste la cantidad de intentos");
    }
    else{
        System.out.println("Felicidades, acertaste el numero.!!!");
    }

}
}




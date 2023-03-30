package ej3_guia7.entidades;

import java.util.Scanner;


public class Operacion {
    
     Scanner leer= new Scanner(System.in);
    
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    
    public void crearOperacion(){
        System.out.println("Ingrese el Numero 1");
        this.numero1= leer.nextInt();
        System.out.println("Ingrese el Numero 2");
        this.numero2= leer.nextInt();
    }
    
    public int sumar(){
    return this.numero1+this.numero2;   
    }
    
    public int restar(){
    return this.numero1-this.numero2;
    }
    
    public double multiplicar(){
        double resultado;
        
        if(numero1==0 || numero2==0){
            System.out.println("Error, no se puede multiplicar por cero");
            resultado=0;
        }
        else{
            resultado= numero1*numero2;
        }
       return resultado;
    }
    
     public double dividir(){
        double resultado;
        
        if(numero1==0 || numero2==0){
            System.out.println("Error, no se puede dividir por cero");
            resultado=0;
        }
        else{
            resultado= numero1/numero2;
        }
       return resultado;
    }
}
    
    
    
    

 
    
    
    
    

  
    


    
    
    
    
    
    
    
    
    
    



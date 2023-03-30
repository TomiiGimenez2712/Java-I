package ej5_extra.entidades;

import java.util.Scanner;


public class Cuenta {
    Scanner leer = new Scanner(System.in);
    
    private double saldo;
    private String titular;
    
    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    
    
    public void retirar_dinero(){
        double retiro;
        System.out.println("Dinero disponible: "+ this.saldo);
        System.out.println("Cuanto desea retirar?");
        retiro= leer.nextDouble();
        
        if(retiro> this.saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            this.saldo -= retiro;
            System.out.println("Se retiraron "+retiro+ " pesos");
            System.out.println("Nuevo saldo disponible: "+ this.saldo);
        }
        
    }

}

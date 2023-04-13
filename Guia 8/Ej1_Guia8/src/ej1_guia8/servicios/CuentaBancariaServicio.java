
package ej1_guia8.servicios;

import java.util.Scanner;

import ej1_guia8.entidades.CuentaBancaria;

public class CuentaBancariaServicio {
    
  Scanner leer= new Scanner(System.in);
  double saldo;
  
    public CuentaBancaria crearCuenta(){

        System.out.println("Ingrese el numero de cuenta");
        int ncuenta= leer.nextInt();
        System.out.println("Ingrese DNI");
        long dni= leer.nextLong();
        System.out.println("Ingrese el saldo actual");
        saldo= leer.nextDouble();
        
        return new CuentaBancaria(ncuenta, dni, saldo);
}

    
    public double ingresar(){
        System.out.println("Cuanto desea agregar a su cuenta?");
        saldo+= leer.nextDouble();
        return(saldo);
    }
    
    public double retirar(){
        System.out.println("Cuanto desea retirar?");
         double retiro= leer.nextDouble();
         
         if (saldo<retiro){
             System.out.println("Saldo insuficiente");
             System.out.println("Se retiró: " + saldo);
             saldo=0.0;
         }
         saldo-=retiro;
            System.out.println("Se retiró: " + retiro);
        return(saldo);
    }
    
    public double retiro20(){
        double nuevosaldo=saldo;
        do{
            System.out.println("Cuanto desea retirar?");
            double retiro= leer.nextDouble();


            if(retiro<= saldo*0.20){
                nuevosaldo =saldo-retiro;
                System.out.println("Se retiró: " + retiro);
            }
            else{
                System.out.println("El retiro debe ser menor o igual a:" + saldo*0.2);
            }
        }while(nuevosaldo== saldo);
        
        saldo=nuevosaldo;
        return saldo;
    }
    
    public double consulta(){
        return saldo;
    }

}//CuentaBancariaServicio





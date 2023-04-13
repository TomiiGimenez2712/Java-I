
package ej1_guia8;

import ej1_guia8.entidades.CuentaBancaria;
import ej1_guia8.servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Ej1_Guia8 {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        
        CuentaBancariaServicio servicio= new CuentaBancariaServicio();
        CuentaBancaria cuenta0= servicio.crearCuenta();
        boolean bandera=false;
        do{
        System.out.println("Ingresa una opcion:");
        System.out.println("1. Ingreso de dinero");
        System.out.println("2. Retiro de dinero");
        System.out.println("3. Retiro rapido");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Información de la cuenta");
        System.out.println("6. Salir");
        short opcion;
       
        do{
            opcion= leer.nextShort();
        }while(opcion<1 || opcion>6);
        
        
            switch(opcion){
                case 1:
                    cuenta0.setSaldoActual(servicio.ingresar());
                    break;
                case 2:
                     cuenta0.setSaldoActual(servicio.retirar());
                    break;
                case 3:
                    cuenta0.setSaldoActual(servicio.retiro20());
                    break;
                case 4:
                    System.out.println("saldo: "+ cuenta0.getSaldoActual());
                    System.out.println("Ingrese cualquier caracter para continuar");
                    String h= leer.next();
                    break;
                case 5:
                    System.out.println(cuenta0.toString());
                    System.out.println("Ingrese cualquier caracter para continuar");
                     h= leer.next();
                    break;
                case 6:
                    bandera=true;
                    break;      
            }
        }while(bandera==false);

    }

}

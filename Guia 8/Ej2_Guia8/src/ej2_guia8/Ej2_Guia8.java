
package ej2_guia8;

import ej2_guia8.servicios.CafeteraServicio;
import java.util.Scanner;

public class Ej2_Guia8 {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        CafeteraServicio servicio= new CafeteraServicio();

        boolean bandera=false;
        do{
        System.out.println("Ingresa una opcion:");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar cafe");
        System.out.println("5. Mostrar informacion");
        System.out.println("6. Salir");
        short opcion;
       
        do{
            opcion= leer.nextShort();
        }while(opcion<1 || opcion>6);
        
        
            switch(opcion){
                case 1:
                    servicio.llenarCafetera();
                    break;
                case 2:
                     servicio.servirTaza();
                    break;
                case 3:
                    servicio.vaciarCafetera();
                    break;
                case 4:
                    servicio.agregarCafe();
                    break;
                case 5:
                    servicio.mostrar();
                    break;
                case 6:
                    bandera=true;
                    break;      
            }
        }while(bandera==false);



    }

}

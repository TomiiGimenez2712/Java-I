
package ej3_guia7;
import ej3_guia7.entidades.Operacion;
import java.util.Scanner;


public class Ej3_Guia7 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);

       Operacion op1= new Operacion();
       
       
       op1.crearOperacion();
       int suma= op1.sumar();
       int resta= op1.restar();
       double multiplicacion =op1.multiplicar();
       double dividir= op1.dividir();
       
        System.out.println("El resultado de la resta es: "+ resta);
         System.out.println("El resultado de la suma es: "+ suma);
          System.out.println("El resultado de la multiplicación es: "+ multiplicacion);
           System.out.println("El resultado de la divición es: "+ op1.dividir());
          
    }

}




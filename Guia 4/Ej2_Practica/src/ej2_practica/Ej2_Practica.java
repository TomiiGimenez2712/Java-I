
package ej2_practica;
import java.util.Scanner;


public class Ej2_Practica {


    public static void main(String[] args) {
 
    Scanner leer = new Scanner(System.in);
      int num1, num2;
      
        System.out.println("Ingrese dos numeros: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        System.out.println(EsMultiplo(num1, num2));
        
        
      
    }
    
    public static String EsMultiplo(int num1, int num2){
    String mensaje;
        if (num1%num2==0){
            mensaje="El primer numero es multiplo del segundo";
        }else{
        mensaje="El primer numero no es multiplo del segundo";
        }
    return mensaje;

    }
}

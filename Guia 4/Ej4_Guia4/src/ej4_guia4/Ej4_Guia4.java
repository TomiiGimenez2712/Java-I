
package ej4_guia4;
import java.util.Scanner;


public class Ej4_Guia4 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
        System.out.println("Ingrese un numero para comprobar si es primo");
        double num=leer.nextInt();
        System.out.println(numPrimo(num));

    }
    
    public static boolean numPrimo (double num){
        boolean resultado=false;
        int cont=0;
        
        
     
        for(int i=1; i<=num; i++){
            
            if(num%i==0){
                cont= cont+1;
            }
        }
        if (cont<=2){
                resultado=true;
        }
        return resultado;
    }
        
        
        
    

}

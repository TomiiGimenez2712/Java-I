
package ej3_guia4;
import java.util.Scanner;


public class Ej3_Guia4 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
        int divisa;

        System.out.println("Cuantos euros desea convertir?");
        double euros=leer.nextDouble();
        
        System.out.println("CONVERSOR");
        System.out.println("1.Libra");
        System.out.println("2.Dolar");
        System.out.println("3.Yenes");
        System.out.println("Elija una opción");
        do{
            divisa=leer.nextInt();
            
        }while(divisa<1 || divisa>3);
    
        conversor(euros, divisa);
    
    }

   public static void conversor(double euros, int divisa){
       double libra, dolar, yen;
       
       switch(divisa){
           case 1:
               libra=euros*0.86;
               System.out.println(euros+" es igual a: "+libra+" Libras");
               
           break;
           case 2:
               dolar=euros*1.28611;
                System.out.println(euros+" es igual a: "+dolar+" Dolares");
           break;
           case 3:
               yen=euros*129.852;
                System.out.println(euros+" es igual a: "+yen+" Yenes");
               
           break;
       }
       
       
       
   }
    
    
}

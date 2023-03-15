
package extra3_guia3;
import java.util.Scanner;

public class Extra3_Guia3 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      String letra;
     
        System.out.println("Ingrese una letra");
        do{
            letra= leer.next();
           
        }while(letra.length()!=1);
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra ingresada es una vocal");
         }
        else{
            System.out.println("La letra ingresada no es una vocal");
        }
        
        
        
        
        
    }  

}


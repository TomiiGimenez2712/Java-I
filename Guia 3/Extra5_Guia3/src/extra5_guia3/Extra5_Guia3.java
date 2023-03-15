
package extra5_guia3;
import java.util.Scanner;

public class Extra5_Guia3 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      
    String letra;
    int tratamiento;
    double descuento;
    
        System.out.println("Que clase de socio es? (A-B-C)");
        
        do{
            letra= leer.next();
            letra= letra.toUpperCase();
        }while(!letra.equals("A") && !letra.equals("B") && !letra.equals("C"));
        
        System.out.println("Cual es el costo del tratamiento?");
        tratamiento= leer.nextInt();
        
        switch(letra){
            case "A":
                System.out.println("El tratamiento tendra un costo de: "+ tratamiento*0.5);
            break;
            case "B":
                System.out.println("El tratamiento tendra un costo de: "+ tratamiento*0.65);
            break;
            case "C":
                System.out.println("El tratamiento tendra un costo de: "+ tratamiento);
            break;
        }
            
    
    
    
    }

}

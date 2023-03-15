
package extra6_guia3;
import java.util.Scanner;

public class Extra6_Guia3 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    double cont1, cont2;
    double altura, suma;
    int p;
    suma=0;
    cont1=0;
    cont2=0;
    
        System.out.println("Cuantas personas desera ingresar?");
        p= leer.nextInt();
        
        for(int i=0; i<p; ++i){
            System.out.println("Ingrese la altura de la persona " +(i+1));
            altura=leer.nextDouble();
            suma += altura;
            
            if(altura<1.60){
                cont1 += altura;
                cont2++;
            }
        }
         System.out.println("el promedio de altura es de: " + suma/p);
         System.out.println("el promedio de altura de los que miden menos de 1.60m es de: " + cont1/cont2);
      
    }

}

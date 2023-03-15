
package extra1_guia3;
import java.util.Scanner;

public class Extra1_Guia3 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      
   double mins, hora, dia;
 
    
        System.out.println("Ingrese la cantidad de minutos para pasarlos a dias y horas");
        mins= leer.nextDouble();
        
        if(mins%1440==0.0){
            dia= mins/1440;
            System.out.println(mins+ " minutos es equivalente a " + dia + " dias exactos");
        }
        else if(mins%60==0.0){
            hora= mins/60;
            dia= hora/24;
            hora=hora%24;
            System.out.println(mins+ " minutos es equivalente a " + Math.floor(dia) + " dias "+ hora+ " horas");
        }
        else{
            hora= mins/60;
            dia= hora/24;
            hora=hora%24;
            mins= mins%60;
            System.out.println(mins+ " minutos es equivalente a " + Math.floor(dia) + " dias "+ Math.floor(hora)+ " horas "+mins+" minutos");
        }

    
    
    
    }

}

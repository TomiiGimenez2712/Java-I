
package extra2_guia3;
import java.util.Scanner;

public class Extra2_Guia3 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      int A=4;
      int B=2;
      int C=9;
      int D=7;
      int aux;
      
        System.out.println("A:"+ A+" B:"+B+ " C:"+C+" D:"+D);
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("A:"+ A+" B:"+B+ " C:"+C+" D:"+D);
                
        
    }

}

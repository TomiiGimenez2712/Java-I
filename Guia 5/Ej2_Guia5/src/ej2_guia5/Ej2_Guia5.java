
package ej2_guia5;
import java.util.Scanner;


public class Ej2_Guia5 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);

 int[] Vector =new int[10];
    String aux= " ";
    	for (int i = 0; i < Vector.length; i++) {
           Vector[i] = (int) (Math.random() * 10);
       
       
           
                }
                 System.out.println("INGRESA UN  NUMERO DEL 1 AL 10");
            int num=leer.nextInt();
       int cont=0;
            for (int j = 0; j < Vector.length; j++) {
                if (Vector[j]==num){
                    cont++;
                   
                   aux= aux.concat(String.valueOf(j));
                   aux= aux.concat(" ");
                }
                    
                }
                if (cont==0) {
                    System.out.println("NO SE ENCONTRO TU NUMERO");
                } else if (cont>1) {
                    System.out.println("SU NUMERO SE ENCUENTRA EN LAS POSICION "+ aux );
                }else {
                    System.out.println("SU NUMERO SE ENCUENTRA UNA VEZ");
            }
       
       
       for (int elemento : Vector)                    //forma mejorada
            System.out.print("[" + elemento + "]");



    }
    
    

    
}

package ej1_practica;
import java.util.Scanner;


public class Ej1_Practica {


    public static void main(String[] args) {
 
   Scanner leer= new Scanner(System.in);
        String frase, resultado;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        System.out.println(codificar(frase));
    }
    
    public static String codificar(String frase){
    String codificado="";
    int longitudfrase;
    
    longitudfrase=frase.length();
    
        for (int i = 0; i <= longitudfrase-1; i++) {
          String letra=frase.substring(i, i+1);   
            switch (letra) {
                case "a": letra="@";                    
                break;
                case "e": letra="#";                    
                break;
                case "i": letra="$";                    
                break;
                case "o": letra="%";                    
                break;
                case "u": letra="*";                    
                break;
            }
            codificado=codificado.concat(letra);
            
            
        }
    return codificado; 
        
        
    }

}

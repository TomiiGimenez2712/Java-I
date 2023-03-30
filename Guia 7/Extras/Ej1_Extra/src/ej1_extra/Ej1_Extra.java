
package ej1_extra;
import ej1_extra.entidades.Cancion;
import java.util.Scanner;


public class Ej1_Extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    Cancion c1= new Cancion("Un Get", "Ozuna" );
 
    
        System.out.println(" Autor:"+c1.getAutor()+"\n Titulo: "+ c1.getTitulo());

    }

}

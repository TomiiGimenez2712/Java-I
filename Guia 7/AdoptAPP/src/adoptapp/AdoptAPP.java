package adoptapp;

import adoptapp.entidades.Mascota;
import java.util.Scanner;

public class AdoptAPP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Perro", "Callejero", "macho");
        
        m1.setSexo("Hembra");
        
        System.out.println(m1.getTipo());
        System.out.println(m1.getSexo());
        
        
         m1.pasear(150);
        System.out.println(m1);
        
           m1.pasear(150, 3);
        System.out.println(m1);
 
      
        
        
        
                
                
        
    
//    public String tipo;
//    public String raza;
//    public String color;
//    public String sexo;
//    public Date edad;

}

}

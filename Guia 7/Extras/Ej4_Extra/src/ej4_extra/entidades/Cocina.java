package ej4_extra.entidades;

import java.util.Scanner;


public class Cocina {

   private String nombre;
   
    Scanner leer= new Scanner(System.in);
 
    String[] recetas =new String[5];
      
 
    public void guardar(){
      String nom;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de una receta");
            recetas[i]= leer.next();
        }
        
    }
      public void buscar(){
          
          System.out.println("Que recerta desea buscar?");
        
          String busqueda=leer.next();
          int cont=0;
          for (int i = 0; i < 5; i++) {
              if(recetas[i].equals(busqueda)){
                  System.out.println("Se econtro la receta: "+ recetas[i]);
                  break;
              }
             cont++;
          }
          if(cont>4){
              System.out.println("no se encotro la receta");
          }
      }
          
      
      public void mostrar(){
          for (int i = 0; i < 5; i++) {
              System.out.println(recetas[i]);
              
          }   
      }
}

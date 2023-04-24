package ej1_guia9.servicios;

import ej1_guia9.entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String frase="";
    Cadena c1;

    
    public void cargarFrase(){
        System.out.println("Ingrese una frase");
        frase=leer.next();
        c1 = new Cadena(frase);
    }
    
    
    public void mostrarVocales() {
        int vocales = 0;
        String letra;
        int largo=c1.getLargo();
        
        for (int i = 0; i < largo; i++) {
            letra = c1.getFrase().substring(i, i+1);

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                vocales++;
            }
        }
        System.out.println("Se encontraron: " + vocales + " vocales");
    }

    public String invertirFrase() {
        String letra;
        String invertida="";
        
        for (int i = c1.getLargo(); i > 0; i--) {
            letra = c1.getFrase().substring(i-1, i);
            invertida=invertida.concat(letra);
        }
        System.out.println("Frase invertida: "+invertida);
        System.out.println(c1.getLargo());
        System.out.println(c1.getFrase());
        return invertida;
    }
    
    
    public void vecesRepetido(){
        System.out.println("Que letra dese buscar?");
        String buscar= leer.next();
        String letra;
        int cont=0;
        
         for (int i = 0; i < c1.getLargo(); i++) {
            letra = c1.getFrase().substring(i, i+1);

            if (letra.equals(buscar)){
                cont++;
            }
        }
         System.out.println("Se encotro "+ cont+ " veces la letra "+ buscar);
    }
    
    public void compararLongitud(){
        System.out.println("Ingrese una nueva frase");
        String nuevafrase=leer.next();
        int largo2= nuevafrase.length();
        
        if(c1.getLargo()<largo2){
            System.out.println("La nueva frase es mas larga");
            
        }else if(c1.getLargo()>largo2){
            System.out.println("La nueva frase es mas corta");
        }else{
            System.out.println("Son iguales");
        }
    }
    
    public void unirFrases(){
        System.out.println("Ingrese una nueva frase");
        String nuevafrase=leer.next();
        
        String frasesunidas= c1.getFrase().concat(nuevafrase);
        System.out.println("Frases unidas: "+frasesunidas);
    }
    
    public void reemplazar(){
        String frasenueva="";
        String letra;
        
        System.out.println("Por que caracter desea reemplazar las (a)");
        String caracter= leer.next();
        
        for (int i = 0; i < c1.getLargo(); i++) {
            
            letra= c1.getFrase().substring(i, i+1);
            
            if(letra.equals("a")){
                letra=caracter;
            }
           frasenueva=frasenueva.concat(letra);
        }
        System.out.println("Frase con caracteres cambiados: "+ frasenueva);
    }
    
    public void contiene(){
        String letra;
        boolean bandera= false;
        
        System.out.println("Que letra desea buscar");
        String buscar=leer.next();
        
        for (int i = 0; i < c1.getLargo(); i++) {
            letra= c1.getFrase().substring(i, i+1);
            if(letra.equals(buscar)){
                bandera=true;
            }
            if(bandera){
                break;
            }
        }
        System.out.println(bandera);
   
    }
    
    
    
    
    
}

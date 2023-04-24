package ej1_guia9.entidades;

import java.util.Scanner;



public class Cadena {
    
    
    private String frase;
    private int largo;
    
    
//Constructores
    public Cadena() {
    }
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena(String frase) {
        this.frase = frase;
        this.largo= frase.length();
    }

    
    
    //getters y setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    
    
    
    
    
    
    
    
    

}

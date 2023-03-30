package ej4_guia7.entidades;

import java.util.Scanner;


public class Rectangulo {
    
    Scanner leer= new Scanner(System.in);
    
    private int base;
    private int altura;

    
    
    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        this.base=leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura= leer.nextInt();
    }
    
    public double calcSuperficie(){
        return this.base*this.altura;
    }
    
    public double calcPerimetro(){
      return (this.base+this.altura)*2;
    }
    
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                
                if (i==0 || i==altura-1){
                    System.out.print("*");
                }
                else if(j==0|| j==base-1){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    

}

package ej2_guia7.entidades;

import java.util.Scanner;


public class Circunferencia {
    Scanner leer= new Scanner(System.in);
    
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        this.radio=leer.nextDouble();
        
        
    }
    
    public double area(){
        
        this.area= Math.PI*Math.pow((radio),2);
        
        return area;
    }
    
    public double perimetro(){
        this.perimetro= 2*Math.PI*radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "leer=" + leer + ", radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
   
    
    
    
    
    

}

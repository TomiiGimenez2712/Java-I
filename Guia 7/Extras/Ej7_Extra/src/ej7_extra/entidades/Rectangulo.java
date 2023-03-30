package ej7_extra.entidades;


public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double calcular_area(){
       return lado1*lado2;
    }
    
    

}

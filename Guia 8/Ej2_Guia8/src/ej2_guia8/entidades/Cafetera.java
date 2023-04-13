
package ej2_guia8.entidades;

public class Cafetera {
    //Entidades
    private int capacidadMaxima;
    private int cantidadActual;

    //Constructores
    public Cafetera() {
        this.capacidadMaxima=2000;
    }

    public Cafetera(int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima=2000;
    }

    //Getters y Setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    

}

   


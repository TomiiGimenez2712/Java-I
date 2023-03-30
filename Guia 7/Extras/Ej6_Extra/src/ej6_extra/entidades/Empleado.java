package ej6_extra.entidades;


public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        
       if(this.edad<30){
           System.out.println("Le corresponde un aumento del 5%");
           System.out.println("Salario anterior: "+this.salario);
           this.salario= this.salario*1.05;
           System.out.println("Nuevo salario: "+this.salario);
       }
       else{
           System.out.println("Le corresponde un aumento del 10%");
           System.out.println("Salario anterior: "+this.salario);
           this.salario= this.salario*1.10;
           System.out.println("Nuevo salario: "+this.salario);
       }  
    }   
}

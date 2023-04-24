package ej2_guia9.servicios;

import ej2_guia9.entidades.ParDeNumeros;
import java.text.DecimalFormat;


public class ParDeNumerosService {
    DecimalFormat d1= new DecimalFormat("#.00");
     ParDeNumeros p1;
    public void crearNumeros(){
       p1= new ParDeNumeros();
    }
    
    public void mostrarValores(){
        System.out.println("Numero 1 "+d1.format(p1.getNum1()));
        System.out.println("Numero 2 "+d1.format(p1.getNum2()));
    }
    
    public void devolverMayor(){
        if(p1.getNum1()>p1.getNum2()){
            System.out.println("El mayor es: "+d1.format(p1.getNum1()) );
        }else{
            System.out.println("El mayor es: "+ d1.format(p1.getNum2()));
        }
    }
    public void calcularPotencia(){
       int num1=Math.round(p1.getNum1());
       int num2=Math.round(p1.getNum2());
        if(num1>num2){
            System.out.println(Math.pow(num1, num2));
        }else{
            System.out.println(Math.pow(num2, num1));    
        }
    }
    
    public void calculaRaiz(){
        float numabs;
        if(p1.getNum1()>p1.getNum2()){
           numabs= Math.abs(p1.getNum2());
           System.out.println("Raiz cuadrada: " + d1.format(Math.sqrt(numabs)));
        }else{
            numabs= Math.abs(p1.getNum1());
            System.out.println("Raiz cuadrada: " + d1.format(Math.sqrt(numabs)));
        }
     
    }
    
    
    
 }



package ej1_guia4;
import java.util.Scanner;


public class Ej1_Guia4 {


    public static void main(String[] args) {
 
    Scanner leer = new Scanner(System.in);
        int num1, num2, opc;
        
        System.out.println("Ingrese dos numeros: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        System.out.println("Menu: ");
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        
        do{
            System.out.println("Elija operacion: ");
            opc=leer.nextInt();
            }while(opc<1 || opc>4);
        switch (opc) {
            case 1:System.out.println("La suma es: "+sumar(num1, num2));
            break;
            case 2:System.out.println("La resta es: "+restar(num1, num2));
            break;
            case 3:System.out.println("La multiplicacion es: "+multiplicar(num1, num2));
            break;
            case 4:System.out.println("La division es: "+dividir(num1, num2));
            break;
            
        }
        
    }
    
    public static int sumar(int num1,int num2){
    int resultado=num1+num2;
    
    return resultado;
       
    }
    public static int restar(int num1,int num2){
    int resultado=num1-num2;
    
    return resultado;
    }   
    public static int multiplicar(int num1,int num2){
    int resultado=num1*num2;
    
    return resultado;
    }  
    public static double dividir(double num1,double num2){
    double resultado=num1/num2;
    
    return resultado;
    }

}

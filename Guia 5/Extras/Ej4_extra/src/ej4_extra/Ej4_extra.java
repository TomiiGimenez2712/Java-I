
package ej4_extra;
import java.util.Scanner;


public class Ej4_extra {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    
    double nota=0, nota1=0, nota2=0, nota3=0, nota4=0, promedio;
    int  aprob=0, desaprob=0;
    
    
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("Ingrese la nota N° "+j+" del alumno N° "+i);
                do{
                   nota=leer.nextDouble(); 
                }while(nota<1 || nota>10);
                
                switch(j){
                    case 1: nota1=nota;
                    break;
                    case 2: nota2=nota;
                    break;
                    case 3: nota3=nota;
                    break;
                    case 4: nota4=nota;
                    break;
                    
                }
                
            }
            promedio=(((nota1*0.1)+(nota2*0.15)+(nota3*0.25)+(nota4*0.5)));
            System.out.println("");
            
            if(promedio>=7){
                aprob++;
            }
            else{
                desaprob++;
            }
            
            
        }
        System.out.println("Aprobados: "+aprob);
        System.out.println("Desaprobados: "+desaprob);

    
    }

}

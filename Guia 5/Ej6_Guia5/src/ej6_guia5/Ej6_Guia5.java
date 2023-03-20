
package ej6_guia5;
import java.util.Scanner;


public class Ej6_Guia5 {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);

    int[][] matriz =new int[3][3];

    int i, j, num, suma1=0, suma2=0, suma3=0, diagonal1, diagonal2;
   
    
    
    //---------------------LLENAR MATRICES------------------------
    
      for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++){
             
              System.out.println("Ingrese un numero del 1 al 9");
              do{
                num=leer.nextInt();
              }while(num<1 || num>9);
              
              matriz[i][j] = num;
          }
      }
          
        //--------------------COMPROBACIÓN--------------------
        
 
        
        for (i = 0; i < 3; i++) {
          for (j = 0; j < 3; j++){
              
              switch(i){
                  case 0:
                      suma1+= matriz[i][j];
                      break;
                  case 1:
                      suma2+= matriz[i][j];
                      break;
                  case 2:
                      suma3+= matriz[i][j];
                      break;
              } 
          }
        }
        diagonal1= matriz[0][0]+matriz[1][1]+matriz[2][2];
        diagonal2= matriz[2][0]+matriz[1][1]+matriz[0][2];
          
          //-------------------IMPRIMIR--------------------
          
          
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
              System.out.print("|"+ matriz[i][j]+"|");
            } 
              System.out.println("");      
        }

        
        
        if(suma1==suma2 && suma1==suma3 && suma1==diagonal1 && suma1==diagonal2){
            System.out.println("La Matriz es magica");
        }
        else{
            System.out.println("La Matriz NO es magica");
        }
        
    

    }

}



package ej3_guia5.otro;
import java.util.Scanner;


public class Ej3_Guia5Otro {


    public static void main(String[] args) {
 
    Scanner leer= new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
               int[][] matriza= new int[3][3];
        String comprobante = " ";
        System.out.println("Ingrese la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriza[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriza[i][j]+"]");
            }
            System.out.println(" ");
        }
        System.out.println("La matriz traspuesta seria:");
        int[][] matrizb= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizb[i][j]=matriza [j][i];
                System.out.print("["+matrizb[i][j]+"]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriza[i][j] == matrizb[i][j]*-1) {
                    comprobante = "antisimétrica";
                }else {
                    comprobante = "no antisimétrica";
                }
                
            }
        }
        System.out.println("La matriz es: "+ comprobante);
    }
}

 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_guia3;

import java.util.Scanner;

/**
 *
 * @author Silvana
 */
public class Ej8_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("De cuanto desea que sea el cuadrado");
        n = leer.nextInt();

        for (int i = 0; i < n; ++i) {
            
            if (i == 0 || i == n-1) {
                for (int j = 0; j < n; ++j) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < n - 2; ++j) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}


package ej6_guia3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvana
 */
public class Extra6_Guia3_otro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char tipoSocio = ' ';
        double importe, total = 0;
        do {
            System.out.print("Ingrese categoría de asociado: ");
            tipoSocio = leer.next().charAt(0);

        } while (tipoSocio != 'a' && tipoSocio != 'A' && tipoSocio != 'b' && tipoSocio != 'B' && tipoSocio != 'c' && tipoSocio != 'C');
        System.out.print("Ingrese monto del tratamiento: ");
        importe = leer.nextDouble();

        switch (tipoSocio) {
            case 'A':
            case 'a':
                total = importe * 0.5;
                break;
            case 'B':
            case 'b':
                total = importe * 0.65;
                break;
            case 'C':
            case 'c':
                total = importe;
                break;
            default:
                System.out.println("Ingresaste una opción inválida");
        }
        System.out.println("\nEl importe a abonar por ser asociado categoría " + tipoSocio + " es $ " + total);
    }
}

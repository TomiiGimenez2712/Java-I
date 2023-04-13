package ej3_guia8;

import ej3_guia8.entidades.Persona;
import ej3_guia8.servicios.PersonaServicio;
import java.util.Scanner;

public class Ej3_Guia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Persona vpersona[] = new Persona[4];
        boolean vedad[] = new boolean[4];
        short vimc[] = new short[4];

        PersonaServicio servicio = new PersonaServicio();

        for (int i = 0; i < 4; i++) {
            vpersona[i] = servicio.crearPersona();

            servicio.calcularIMC(vpersona[i]);
        }

        //----------------------------------------------
        for (int i = 0; i < 4; i++) {
            vedad[i] = servicio.esMayorDeEdad(vpersona[i]);
            vimc[i] = servicio.calcularIMC(vpersona[i]);
        }

        int ideal = 0, debajo = 0, arriba = 0;
        for (int i = 0; i < 4; i++) {

            switch (vimc[i]) {
                case -1:
                    debajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                default:
                    arriba++;
                    break;
            }
        }
        System.out.println("IMC inferior: " + (debajo * 100 / 4) + "%");
        System.out.println("IMC ideal: " + (ideal * 100 / 4) + "%");
        System.out.println("IMC elevado: " + (arriba * 100 / 4) + "%");

        int mayor = 0, menor = 0;
        for (int i = 0; i < 4; i++) {
            if (vedad[i]) {
                mayor++;
            } else {
                menor++;
            }

        }
        System.out.println("Mayores: " + (mayor * 100 / 4));
        System.out.println("Menores: " + (menor * 100 / 4));

    }

}

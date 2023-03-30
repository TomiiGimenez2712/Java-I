
package ej6_extra;

import java.util.Scanner;

public class Ej6_Extra {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
   System.out.println("ingrese tamaño de la matriz");
        int n = leer.nextInt();

        System.out.println("cuantas palabras va a ingresar?");
        int cP = leer.nextInt();

        String matriz[][] = new String[n][n];
        String listaPalabras[] = new String[cP];

//        String palabra = leer.next();
//        System.out.println(palabra.substring(0, 1));
//        System.out.println(palabra.substring(1, 2));
//        System.out.println(palabra.substring(2, 3));
//        System.out.println(palabra.substring(3, 4));
//        System.out.println(palabra.substring(4, 5));
//
        System.out.println("ingrese" +cP+ " palabras de 5 caracteres maximo y 3 minimo");
       
        //creamos una lista de palabras
        for (int i = 0; i < cP; i++) {  
            String palabra = leer.next().toUpperCase();
            if (palabra.length()<=5 && palabra.length()>=3) {
                listaPalabras[i] = palabra;
            }else{
            i--;
            } }

        //mostramos la lista de palabras
        System.out.println("Lista de palabras es: ");
        for (int i = 0; i < cP; i++) {
            System.out.println(listaPalabras[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //el metodo random me permite general numeros aleatorios y estos castearlos a char
                matriz[i][j]= String.valueOf((int) (Math.random() * 9 + 1));
            }
        }       
//        cargo la matriz con los valores de la lista
        for (int i = 0; i < listaPalabras.length; i++) {
             int rnd = (int)(Math.random() * 19 );
             System.out.println("numero aleatorio generado "+rnd);
             
            for (int j = 0; j < listaPalabras[i].length(); j++) { 
               
                matriz[rnd][j] = listaPalabras[i].substring(j, j + 1);  
                } }

        System.out.println("MOSTRAR MATRIZ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);     
            }
            System.out.println("");
        } 
    }



    }

}

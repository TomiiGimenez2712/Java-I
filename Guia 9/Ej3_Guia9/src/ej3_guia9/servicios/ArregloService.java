package ej3_guia9.servicios;

import java.util.Arrays;


public class ArregloService {
    
    public double [] inicializarA(double [] X){
        
        for (int i = 0; i < X.length; i++) {
            
            X[i]= (int) (Math.random()*50); 
        }
        
        return X;
    }
    
    public void mostrar( double [] X){
        for (int i = 0; i < X.length; i++) {
           System.out.print(" ["+X[i]+ "]");
            
        }
        System.out.println(" ");
    }
    
    
    public void ordenar(double[] X){
     double [] C = new double [X.length];
     int cont=0;
     Arrays.sort(X);

        for (int i = X.length-1; i>= 0; i--) {
                C[cont]=X[i]; 
                cont++;     
        }
        for (int i = 0; i < C.length; i++) {
            X[i]=C[i];
            
        } 
}
    
    public void inicializarB(double[] A, double[] B){
        
        for (int i = 0; i < B.length; i++) {
            if (i<10){
               B[i]=A[i] ;
            }
            else{
                B[i]=0.5;
            }
        }
    }
    

}


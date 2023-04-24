package ej6_guia9.servicios;

import ej6_guia9.entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;


public class CursoServicios {
    
    Scanner leer= new Scanner(System.in);
    
    public String [] cargarAlumnos(){
        String [] alumnos= new String[5];
        
        for (int i = 1; i < 6; i++) {
            System.out.println("Ingrese el nombre de alumno: " + i);
            alumnos[i-1]= leer.next();
        }
        return alumnos;
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso= leer.next();
        System.out.println("Ingrese las horas por dia");
        int HorasPorDia= leer.nextInt();
        System.out.println("Ingrese los dias por semana");
         int DiasPorSemana=leer.nextInt();
        System.out.println("Ingrese el turno");
        String turno= leer.next();
        System.out.println("Ingrese el precio por hora");
        double precioPorHora= leer.nextDouble();
        String[] alumnos= cargarAlumnos();
    
        return new Curso(nombreCurso, HorasPorDia, DiasPorSemana, turno, precioPorHora, alumnos);
    }

    public double calcularGananciaSemanal(Curso c1){
        
        return(c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getAlumnos().length*c1.getCantidadDiasPorSemana());
    }
    
    public void mostrar (Curso c1){
        System.out.println("Nombre: "+ c1.getNombreCurso());
        System.out.println("Horas por dia: "+ c1.getCantidadHorasPorDia());
        System.out.println("Dias por semana :" + c1.getCantidadDiasPorSemana());
        System.out.println("Turno: "+ c1.getTurno());
        System.out.println("Precio por hora: "+c1.getPrecioPorHora());
        System.out.println(Arrays.toString(c1.getAlumnos()));
  
    }
    
  
   
   
   
    

}

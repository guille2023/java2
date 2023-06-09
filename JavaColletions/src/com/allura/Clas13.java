package com.allura;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clas13 {
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pedrito";
        String alumno5 = "Gustavo sanchez";
        String alumno6 = "Marcia Maria";
        String alumno7 = "Marcia Maria";
        String alumno8 = "Gustavo Sanchez";


        Set<String> listaAlumnos = new HashSet<>();
        //Collection<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);


        listaAlumnos.forEach(alumno ->{
            System.out.println(alumno);
        });
        //busqueda
        boolean valida= listaAlumnos.contains("Luis Miguel");
        System.out.println(valida);
        String max = listaAlumnos.stream().max(Comparator.comparing(String::length)).get();

        System.out.println(max.length());

        listaAlumnos.removeIf(alumno -> "Marta Marcia".equalsIgnoreCase(alumno));
        listaAlumnos.forEach(alumno ->{
            System.out.println(alumno);
        });



    }
}

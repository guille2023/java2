package com.allura;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Clas12 {
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepe Lopez";
        String alumno3 = "Maria de los Angeles";
        String alumno4 = "Marta Marcia";
        String alumno5 = "Gomez Gustavo";

        Set<String> listaAlumnos = new HashSet<>();
        //Collection<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);

        for (String alumno : listaAlumnos){
            System.out.println(alumno);
        }
        listaAlumnos.forEach(alumno ->{
            System.out.println(alumno);
        });
    }
}

package com.allura;

import com.allura.model.Alumno;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clas14 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno( "Luis Miguel","001");
        Alumno alumno2 = new Alumno( "Pepito los palotes","002");
        Alumno alumno3 = new Alumno( "Juan Carlos","003");
        Alumno alumno4 = new Alumno( "Pedro Pedrito","004");
        Alumno alumno5 = new Alumno( "Gustavo sanchez","005");
        Alumno alumno6 = new Alumno( "Marcia Maria","006");
        Alumno alumno7 = new Alumno( "Marcia Maria","007");
        Alumno alumno8 = new Alumno( "Gustavo Sanchez","008");


        Collection<Alumno> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);


        Alumno alumnoNuevo = new Alumno("Luis Miguel","001");

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));

    }
}
package com.allura;

import com.allura.model.Alumno;
import com.allura.model.Curso;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Clas16 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("HISTORIA", 30);

        Alumno alumno1 = new Alumno( "Luis Miguel","001");
        Alumno alumno2 = new Alumno( "Pepito los palotes","002");
        Alumno alumno3 = new Alumno( "Juan Carlos","003");
        Alumno alumno4 = new Alumno( "Pedro Pedrito","004");
        Alumno alumno5 = new Alumno( "Gustavo sanchez","005");
        Alumno alumno6 = new Alumno( "Marcia Maria","006");
        Alumno alumno7 = new Alumno( "Marcia Maria","007");
        Alumno alumno8 = new Alumno( "Gustavo Sanchez","008");


        Collection<Alumno> listaAlumnos = new HashSet<>();

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        curso1.addAlumno(alumno8);

       // curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
        while (alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next());
        }


    }
}

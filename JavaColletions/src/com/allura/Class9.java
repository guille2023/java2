package com.allura;

import com.allura.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Class9 {


    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<Integer>());
            add(new ArrayList<Integer>());
        }
    };

    public static void main(String[] args) {

        Curso curso1 = new Curso("HISTORIA", 30);
        Curso curso2 = new Curso("ALGEBRA", 50);
        Curso curso3 = new Curso("ARITMETICA", 20);
        Curso curso4 = new Curso("GEOMETRIA", 15);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);


        System.out.println(cursos);

        Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());

        int tiempo = 0;
        for (Curso curso: cursos){
            tiempo += curso.getTiempo();
        }
        System.out.println(tiempo);

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());

        int mayor = 0;
        for (Curso curso: cursos){
            if(curso.getTiempo() > mayor){
                mayor = curso.getTiempo();
            }
        }
        System.out.println(mayor);

        System.out.println(cursos.stream().filter(curso ->  !curso.getNombre().equalsIgnoreCase("HISTORIA")).mapToInt(Curso::getTiempo).sum());

        int suma = 0;
        for (Curso curso: cursos){
            if(!curso.getNombre().equalsIgnoreCase("HISTORIA"))
                suma+= curso.getTiempo();
        }
        System.out.println(suma);



    }
}
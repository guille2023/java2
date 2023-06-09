package com.allura;

import com.allura.model.Curso;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.stream.Collectors;

public class Class10 {


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
        Curso curso4 = new Curso("FISICA", 20);
        Curso curso5 = new Curso("QUIMICA", 30);
        Curso curso6 = new Curso("ED.FISCA", 60);
        Curso curso7 = new Curso("LENGUA", 90);
        Curso curso8 = new Curso("MATEMATICA", 40);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);


        System.out.println(cursos);

        Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());

            Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
            groupCurso.forEach((key , value) ->System.out.println( key + " - "+value.size()));
        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());




    }
}
package com.allura;

import com.allura.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Class5 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java",30);
        Curso curso2 = new Curso("PHP",10);
        Curso curso3 = new Curso("Ruby",20);
        Curso curso4 = new Curso("Python",15);



        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);


       // Collections.sort(cursos);
        System.out.println(cursos);

        cursos.sort(Comparator.comparing(Curso:: getNombre));

        System.out.println(cursos);

        cursos.sort(Comparator.comparing(Curso:: getNombre).reversed());
        System.out.println(cursos);

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        System.out.println(cursoList);
    }
}

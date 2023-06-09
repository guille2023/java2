package com.allura;

import com.allura.model.Aula;
import com.allura.model.Curso;

import java.util.ArrayList;


public class Class6 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java",30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getClass7List());
    }
}

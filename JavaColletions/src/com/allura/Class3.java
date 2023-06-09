package com.allura;

import java.util.*;
import java.util.stream.Collectors;

public class Class3 {
    public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(curso1);
        lista.add(curso2);
        lista.add(curso3);
        lista.add(curso4);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);

        lista.sort(Comparator.naturalOrder());
        System.out.println(lista);

       List<String> cursoList = lista.stream().sorted().collect(Collectors.toList());
        System.out.println(cursoList);
    }
}

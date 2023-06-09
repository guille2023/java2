package com.allura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Class8 {


        public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
            {    add(new LinkedList<Integer>());
                    add(new ArrayList<Integer>());
        }
        };

        public static void main(String[] args) {
            for(List<Integer> lista : listas){
                final String nombreImplementacion = lista.getClass().getSimpleName();
                long inicio = System.currentTimeMillis();
                for(int i=0 ; i < 10000 ; i++){
                    lista.add(i);
                }
                long fin = System.currentTimeMillis();
                long duracion = fin - inicio;
                System.out.println(nombreImplementacion + " add: "+ duracion);

                inicio = System.currentTimeMillis();
                for (int i = 0 ; i < 10000 ; i++){
                    lista.get(i);
                }
                fin = System.currentTimeMillis();
                duracion = fin - inicio;
                System.out.println(nombreImplementacion + " get: "+ duracion);
                inicio = System.currentTimeMillis();
                for (int i = 9999 ; i > 10000 ; i++){
                    lista.remove(i);
                }
                fin = System.currentTimeMillis();
                duracion = fin - inicio;
                System.out.println(nombreImplementacion + " remove: "+ duracion);
            }
    }

}

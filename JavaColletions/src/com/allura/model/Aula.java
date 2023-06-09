package com.allura.model;

public class Aula {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Aula(String nombre){
        this.nombre = nombre;
    }
    @Override
    public  String toString(){
        return this.nombre;
    }
}

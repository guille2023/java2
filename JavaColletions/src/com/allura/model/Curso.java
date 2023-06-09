package com.allura.model;

import java.util.*;

public class Curso {
    private  String nombre;
    private int tiempo;
    private List<Aula> aulaList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
//    private Collection<Alumno> alumnos = new LinkedHashSet<>();
  //  private Map<String, Alumno> alumnoMap = new HashMap<>();
    private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    public Curso(String nombre, int tiempo, List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }



    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void  addAlumno (Alumno alumno){ this.alumnos.add(alumno);this.alumnoMap.put(alumno.getCodigo(), alumno);}

    public boolean verficaAlumno( Alumno alumno){
        return this.alumnos.contains(alumno);
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    public List<Aula> getClass7List() {
        return Collections.unmodifiableList(aulaList);
    }

    public void setClass7List(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }
    public void addAula(Aula aula){
        this.aulaList.add(aula);
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }
}

package Primero.SegundoTrimestre.Practica.Interfaces_Graficas.Ejemplo1;

import java.util.Arrays;

public class Modelo {
    private Alumno tAlumnos[];

    public Modelo() {
        this.tAlumnos = new Alumno[0];
    }

    public void anadeAlumno(Alumno a) {
        Alumno[] nueva = Arrays.copyOf(this.tAlumnos, this.tAlumnos.length+1);
        nueva[this.tAlumnos.length] = a;
        this.tAlumnos = nueva;
    }
}

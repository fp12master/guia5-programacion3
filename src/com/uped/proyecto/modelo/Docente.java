package com.uped.proyecto.modelo;

public class Docente extends Persona {
    private String especialidad;
    private int añosExperiencia;

    // 1. Constructor invocando super() en la primera línea
    public Docente(String nombre, String dui, String especialidad, int añosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    // 2. Método para impartir clase
    public void impartirClase(String materia) {
        System.out.println(nombre + " imparte: " + materia); // Reutilizando la variable protected 'nombre'
    }

    // 3. Sobrescribiendo toString() reutilizando presentarse()
    @Override
    public String toString() {
        return presentarse() + " | " + especialidad + " (" + añosExperiencia + " años)";
    }
}
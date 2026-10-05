package com.uped.proyecto.modelo;

public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, String dui, double salario) {
        super(nombre, dui);
        this.salario = salario;
    }

    public void actualizarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre; // acceso directo por ser protected
    }

    public double getSalario() {
        return salario;
    }
}
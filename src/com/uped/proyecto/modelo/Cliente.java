package com.uped.proyecto.modelo;

public class Cliente extends Persona {
    private String telefono;

    public Cliente(String nombre, String dui, String telefono) {
        super(nombre, dui);
        this.telefono = telefono;
        System.out.println("Cliente creado");
    }

    public String getTelefono() {
        return telefono;
    }
}
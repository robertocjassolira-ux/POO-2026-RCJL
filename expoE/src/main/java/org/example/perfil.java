package org.example;

public class perfil {
    String nombre;

    perfil(String nombre) {
        this.nombre = nombre;
    }

    void mostrarSaludo() {

        System.out.println("Hola, " + nombre.toUpperCase());
    }
}

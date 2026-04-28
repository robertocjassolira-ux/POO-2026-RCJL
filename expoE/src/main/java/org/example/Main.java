package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        perfil perfil = null;  // No se crea el objeto, queda null

        try {
            perfil.mostrarSaludo();
        } catch (NullPointerException e) {
            System.out.println("Atrapamos NullPointerException: el perfil no fue inicializado.");
            System.out.println("Mensaje del error: " + e.getMessage());
        }

        System.out.println("El programa continúa normalmente.");
    }

    }


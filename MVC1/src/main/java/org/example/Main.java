package org.example;

import unam.fesa.ico.controlador.controladorPrincipal;
import unam.fesa.ico.vista.ventanaPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ventanaPrincipal v1  = new ventanaPrincipal();
        controladorPrincipal controlador = new controladorPrincipal(v1);
    }
}

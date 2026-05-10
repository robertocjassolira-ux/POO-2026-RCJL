package Unam.fesa.ico.controlador;

import Unam.fesa.ico.vista.ventanaPrincipal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class controladorPrincipal implements MouseListener {

    private ventanaPrincipal view;

    public controladorPrincipal(ventanaPrincipal vista) {
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getLblSalida().addMouseListener(this);
        this.view.getLblNombre().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Segunda vez");
        if (e.getSource() == this.view.getLblNombre()) {
            System.out.println(" Hola desde el Etiqueta nombre");

        }


        if (e.getSource() == this.view.getBtnSaludar()) {
            this.view.getLblSalida().setText("Saludo: " + this.view.getTxtNombre().getText());
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

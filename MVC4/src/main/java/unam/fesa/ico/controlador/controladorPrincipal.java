package unam.fesa.ico.controlador;

import unam.fesa.ico.vista.ventanaPrincipal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class controladorPrincipal implements MouseListener {


private ventanaPrincipal view;

public  controladorPrincipal(ventanaPrincipal vista) {
    this.view = vista;
    this.view.getBtnSaludar().addMouseListener(this);
    this.view.getLblNombre().addMouseListener(this);
}
    @Override
    public void mouseClicked(MouseEvent e) {
 if (e.getSource() == this.view.getBtnSaludar()) {
     this.view.getLblSalida().setText("hola compañerito del bosque" + this.view.getTxtNombre().getText());

     if (e.getSource() == this.view.getLblNombre()){
         System.out.println("Hola desde et nombre");
     }
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

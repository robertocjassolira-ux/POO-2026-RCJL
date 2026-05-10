package unam.fesa.ico.vista;

import javax.swing.*;
import java.awt.*;

public class ventanaPrincipal extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;


    public ventanaPrincipal ( ){
        super("Vista Principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));



        // Declarar los paneles
        panel1 = new JPanel();
        panel1.setBackground(new Color(22,224,45));
        panel2 = new JPanel();
        panel2.setBackground(new Color(34,82,147));



        //Declarar los componentes

        lblNombre = new JLabel("Escribe tu Nombre;");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar");
        lblSalida = new JLabel(".....");



        //Agregar los componentes al panel principal
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(btnSaludar);
        panel1.add(lblSalida);




        // Agregar el panel 1 y 2 al frame
        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);


        setVisible(true);
        setSize(800,600);


    }

    public JButton getBtnSaludar() {
        return btnSaludar;
    }

    public void setBtnSaludar(JButton btnSaludar) {
        this.btnSaludar = btnSaludar;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
}

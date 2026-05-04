package org.example.unam.fesa.ico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vswing extends JFrame {

    private JLabel etiqueta;
    private JTextField tf1;
    private JButton b1;


    public Vswing() {
        super("Swing de pocas tuercas");
etiqueta=new JLabel("Dame un número");
tf1=new JTextField(10);
b1=new JButton("Agregar");
b1.setForeground(new Color(150,25,141));
b1.setBackground(new Color(70,214,227));
etiqueta.setForeground(new Color(56,250,30));



        getContentPane().setLayout(new GridLayout(3,3));
        getContentPane().add(etiqueta,0);
        getContentPane().add(tf1,1);
        getContentPane().add(b1,2);


setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double entradaCelsius = Double.parseDouble(tf1.getText());
                double gradosF = (entradaCelsius * 9 / 5)+ 32;
                JOptionPane.showMessageDialog(null,"Grados de farenheit: "+gradosF);


            }
        });
        tf1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("hola desde cilck al cuadro de texto");

            }
        });
tf1.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(" hola desde evento Keytyped ");
        System.out.println("tecla que presionó:"+ e.getKeyChar());
        System.out.println("codigo de tecla:"+ e.getKeyCode());
    }
});






    }
}

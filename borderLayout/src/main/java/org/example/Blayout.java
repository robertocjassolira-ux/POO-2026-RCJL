package org.example;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Blayout extends Frame {
    Button b1 = new Button("Ni idea");
    Button b2 = new Button("como termine aqui");
    Button b3 = new Button("puro ICO");
    Button b4 = new Button("sin ideas ...");

    public Blayout() {
        super("Vemtana en los 4 puntos cardinales");
        setSize(400, 300);
        setResizable(false);
        setLayout(new BorderLayout());


        setVisible(true);


        add("North", b1);
        add("South", b2);
        add("West", b3);
        add("East", b4);

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                        super.windowClosing(e);
                    }
                }
        );

    }

}

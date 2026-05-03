package org.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Glayout  extends Frame {

Button b1 = new Button("primer lugar");
    Button b2 = new Button("Segundo lugar");
    Button b3 = new Button("Tercer lugar");
    Button b4 = new Button("Ultimo  lugar");

public Glayout(){
    super("Algo más bonito");
    setSize(400,300);
    setResizable(false);
    setLayout(new GridLayout(3,2));
    setVisible(true);

add(b1,0);
    add(b2,1);
    add(b3,2);
    add(b4,3);

    addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);

                }
            }
    );


}

}

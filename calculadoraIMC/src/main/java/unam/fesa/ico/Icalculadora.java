package unam.fesa.ico;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Icalculadora extends Frame {

    private Button b1;
    private Label l1;
    private TextField tf1;
    private Label l2;
    private TextField tf2;
    private Label l3;

    public Icalculadora() {
        super("Calculadora IMC :)");
        setLayout(new FlowLayout());
        l1 = new Label("Introduce tu peso (kg)");
        tf1 = new TextField(10);
        l2 = new Label("Introduce tu altura (metros)");
        tf2 = new TextField(10);
        b1 = new Button("Calcular el IMC");
        l3 = new Label("0.0");


        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double Pe=  Double.parseDouble(tf1.getText());
                double Al=Double.parseDouble(tf2.getText());
                double Rfinal = (Pe/(Al*Al));
                l3.setText(""+Rfinal);


            }
        });

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(l3);



addWindowListener(new Ewindow() );

        setVisible(true);

    }
}

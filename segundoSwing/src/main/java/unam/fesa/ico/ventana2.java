package unam.fesa.ico;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ventana2  extends JFrame {

    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel lb1;
    private JButton b1;
    private JComboBox<String> cb1;



    public ventana2(){
        super("Mi segundo swing");
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel1.setBackground(Color.GRAY);
        getContentPane().add(panel1,0);

        panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        getContentPane().add(panel2,1);

        panel3 = new JPanel();
        panel3.setBackground(Color.RED);
        getContentPane().add(panel3,2);

        panel4 = new JPanel();
        panel4.setBackground(Color.YELLOW);
        getContentPane().add(panel4,3);

        lb1 = new JLabel("Soy una etiqueta");
        b1 = new JButton("Soy una botón");

        panel1.add(lb1);
        panel2.add(b1);

        cb1 = new JComboBox<>();
        panel3.add(cb1);
        ArrayList<String>nombres = new ArrayList<>();
        nombres.add("Juanito");
        nombres.add("Marco");
        nombres.add("Pedro");
        nombres.add("Julio");
        nombres.add("Antonio");

        modeloComboNombres mcn = new modeloComboNombres(nombres);
        cb1.setModel(mcn);

        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setSize(800,600);
        setVisible(true);


    }

}

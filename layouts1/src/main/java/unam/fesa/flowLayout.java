package unam.fesa;
import java.awt.*;

public class flowLayout extends Frame{
    private Button b1;
    private Button b2;
    private Button b3;

    public flowLayout(){
       super("flowLayout sencillo");
       setSize(800,600);

       setLayout(new FlowLayout());
    b1 = new Button("Soy tibiiooo aah");
        b2 = new Button("Ya Gonzálo te estan viendo tus hijos");
        b3 = new Button("Arriba las chivas");
       add(b1);
       add(b2);
        add(b3);
        b1.addMouseListener(new Eraton());
        b2.addMouseListener(new Eraton());

        addWindowListener(new Ewindows());
       setVisible(true);
   }
}

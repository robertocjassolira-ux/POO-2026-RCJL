import unam.fesa.ico.alumno;
import unam.fesa.ico.persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
persona p1 = new persona(18,"Masculino","Roberto");
        System.out.println(p1);
        p1.comiendo();
        alumno a1= new alumno(22,"Femenino","María","ICO",323204073);
        System.out.println(a1);
        a1.comiendo();
        a1.hablar();
        a1.estudiar();
    }
}
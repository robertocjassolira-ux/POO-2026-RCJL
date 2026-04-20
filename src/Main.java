import unam.fesa.ico.persona;
import unam.fesa.ico.profesor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

persona p1=new persona(17,"Daniel");
        System.out.println(p1);
        p1.presentarse();
        profesor r1=new profesor(26,"Josue","Matemáticas");
        System.out.println(r1);
        r1.impartirClase();




    }
}
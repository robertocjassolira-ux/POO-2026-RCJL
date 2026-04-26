import unam.fesa.ico.bibliotecario;
import unam.fesa.ico.persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
persona p1 = new persona(18,"Roberto");
        System.out.println(p1);
        p1.mostrarDatos();
        bibliotecario b1= new bibliotecario(27,"Raúl",3990);
        System.out.println("bibliotecario: "+b1);
        b1.mostrarDatos();
    }
}
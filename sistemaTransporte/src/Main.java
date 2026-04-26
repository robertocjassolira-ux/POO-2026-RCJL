import unam.fesa.ico.automovil;
import unam.fesa.ico.vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

vehiculo v1=new vehiculo("Nissan ","Tsuru");
v1.mostrarInformacion();
        System.out.println(v1);
        automovil a1=new automovil("Chrevolet ","Camaro",4);
        a1.mostrarInformacion();
        a1.encenderMotor();
        System.out.println(a1);

    }
}
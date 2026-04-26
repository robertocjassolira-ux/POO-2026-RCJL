import unam.fesa.ico.circulo;
import unam.fesa.ico.cuadrado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

circulo c1 = new circulo(2.56);
c1.calcularArea();
cuadrado c2 = new cuadrado(4.68);
c2.calcularArea();
c2.dibujar();
c1.rotar();
c1.dibujar();
    }
}
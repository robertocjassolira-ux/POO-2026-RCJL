import unam.fesa.ico.aspiradora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
aspiradora b1 = new aspiradora();
System.out.println(b1);
b1.soportarBasura(10.4F);
aspiradora b2 = new aspiradora(99.5f,1.0f,"circular","Samsung", 400.0f );
b2.soportarBasura(600.0f);
System.out.println(b2);
    }
}
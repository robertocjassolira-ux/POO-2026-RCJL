import unam.fesa.ico.libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
       libro b1 = new libro("La Odisea","Homero Simpson",1975,4);
       System.out.println(b1);
       libro b2 = new libro();
       System.out.println(b2);
        }
    }

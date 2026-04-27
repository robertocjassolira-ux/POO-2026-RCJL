package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        calculadoraIMC c1 = new calculadoraIMC();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println(" Ingrese su peso :");
            c1.setPeso(teclado.nextDouble());
            System.out.println(" Ingrese su altura :");
            c1.setEstatura(teclado.nextDouble());


            Integer numero = new Integer(10);
            numero = null;
            System.out.println(numero.byteValue());


        }catch (InputMismatchException e){
            System.out.println("Error revisa tu entrada");
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Objeto nulo revisa tu entrada");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(" error desconocido");
            System.out.println(e.getMessage());
        }


        c1.calcularIMC();

        System.out.println("Su IMC es :" + c1.getImc());

    }
}
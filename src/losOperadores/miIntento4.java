package losOperadores;

/*
Unas ardillas encuentran unas nueces y deciden dividirlas equitativamente. Escribe un programa que pregunte por el número de ardillas y nueces, y, a continuación, calcule (y muestre) cuántas nueces corresponden a cada ardilla y cuántas sobrarán tras el reparto.
 */

import java.util.Scanner;

public class miIntento4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de ardillas y de nueces");
        int ardillas = teclado.nextInt();
        int nueces = teclado.nextInt();

        // division
        int division = nueces / ardillas;
        System.out.println(nueces + " / " + ardillas + " = " +division);
        // resto
        int resto = nueces % ardillas;
        System.out.println(nueces  + " % " + ardillas + " = " + resto);

    }
}

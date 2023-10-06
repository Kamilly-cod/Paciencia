package Operacionesconif;

import java.util.Scanner;

public class EjemploElseIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ponga tu edad");
        int edad = teclado.nextInt();
        if (edad <16) {
            System.out.println("No trabajas");}
            else if ( edad >= 16 && edad < 64) {
            System.out.println("A trabajar");}
            else  {
            System.out.println("Jubilación");
        }

    }
}

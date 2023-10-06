package Operacionesconif;

import java.util.Scanner;

public class EjemplosElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();;
        if (edad >= 18) {
            System.out.println("Pasa, puedes ver la peli");
        } else {
            System.out.println("No puede pasar");
        }




    }
}

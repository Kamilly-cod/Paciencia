package Iniciais;

import java.util.Scanner;

/**
 * @see <a href="https://java.codeandcoke.com/apuntes:introduccion">Ver</a>
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        // Haz un programa que solicite dos números y diga si son o no iguales
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        int numero1 = teclado.nextInt(); teclado.nextLine();
        System.out.println("Introduce segundo número: ");
        int numero2 = teclado.nextInt(); teclado.nextLine();
        // y diga si son o no iguales
        boolean iguales = (numero1 == numero2); // comparo si son iguales
        System.out.println("Son iguales: " + iguales);

    }


}

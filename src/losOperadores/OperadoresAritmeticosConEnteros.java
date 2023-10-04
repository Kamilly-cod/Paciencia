package losOperadores;

import java.util.Scanner;

public class OperadoresAritmeticosConEnteros {
    public static void main(String[] args) {
        // Son enteros los int que no ponen decimales
        // suma para quebrar a regra e fazer virar deciamal

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        // suma
        int suma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);

        // resta
        int resta = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " +resta);

        // multiplicacion
        int multiplicacion = numero1 * numero2;
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);

        // division
        int cociente = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + cociente);

        // resto de la division entera o módulo
        int resto = numero1 % numero2;
        System.out.println(numero1 + " % " + numero2 + " = " + resto);


    }
}

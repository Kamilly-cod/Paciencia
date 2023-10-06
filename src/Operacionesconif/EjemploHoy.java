package Operacionesconif;

import java.util.Scanner;

public class EjemploHoy {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();

        boolean mayorDeEdad = edad >=18;
        if (mayorDeEdad) { // es lo mismo que poner mayorDeEdad == true
            System.out.println("Solo poniendo la variable mayorDeEdad, si es true se va a imprimir esto");
        }
        if (!mayorDeEdad) { // es lo mismo so que ao contrario, o mismo que poner mayorDeEdad == false
            System.out.println("No eres mayor de edad.");

            }


    }
}

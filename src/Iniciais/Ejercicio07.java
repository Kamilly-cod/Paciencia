package Iniciais;

/*
Escribe un programa que lea tres cadenas de texto y las muestre en orden inverso, cada una en una nueva línea.
Entrada:
Java
Programación
Idioma
Salida:
Idioma
Programación
Java

 */

/*
Como introduciomos dados desde o teclado ao programa

Escrivimos as seguintes linhas:
Scanner teclado = new scanner
 */


import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // para poder escrever UN TEXTO
        String palabra1 = teclado.nextLine();
        String palabra2 = teclado.nextLine();
        String palabra3 = teclado.nextLine();

        System.out.println();
        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra1);




    }

}

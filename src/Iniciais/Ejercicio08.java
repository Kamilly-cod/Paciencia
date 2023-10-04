package Iniciais;

/*
Imagina que eres un gerente de recursos humanos en un restaurante y necesitas contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares sobre los candidatos, concretamente 5 campos: nombre, edad, años de experiencia, preferencia de cocina. Escribe un programa que lea todas las palabras (o números) una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE COCINA>".
Entrada:
Eugenio
33
8
vegetariana
Salida:
El formulario de Eugenio, de 33 años y 8 de experiencia, está completo. Nos nos comunicaremos con usted si necesitamos alguien que cocine comida vegetariana.

 */

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        // Tenemos que pedir los datos para el usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine(); // cuando lo que meto por teclado es un string, el método es nextline();
        System.out.println("Edad: ");
        int edad = teclado.nextInt(); // cuando lo que meto por teclado es un int, el método es nextInt(); //int é numero
        System.out.println("Años de experiencia: ");
        int añosExperiencia = teclado.nextInt();
        System.out.println("Preferencia de cocina: ");
        String prederenciaCocina = teclado.nextLine(); teclado.nextInt(); // Aqui eu coloquei dois tecclado.nextLine pq tava dando erro //string é texto

        //O que vem a seguir é muito importante
        System.out.println("El formulario de " + nombre +", de " + edad + " años y " +añosExperiencia+ "  de experiencia, está completo. Nos nos comunicaremos con usted si necesitamos alguien que cocine comida vegetariana.");



    }

}

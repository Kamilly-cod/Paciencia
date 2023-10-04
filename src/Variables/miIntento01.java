package PrimeraEvaluacion.Tema02.ejemplos.Operadores;

/*
A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.

 */


import java.util.Scanner;

public class miIntento01 {
    public static void main(String[] args) {
        System.out.println("A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4");
        int num1 = 12;
        System.out.println(num1);
        int num2 = 4;
        System.out.println(num2);

        System.out.println("crear nuevas variables que almacenen el resultado de realizar las ecuaciones matematicas");

        //suma
        int suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " +suma);

        //resta
        int resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " +resta);

        //multiplicacion
        int multiplicacion = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " +multiplicacion);


        //division
        int division = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " +division);



    }
}

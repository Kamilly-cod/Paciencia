package losOperadores;
/*
Si un empleado está casado o no.
Valor máximo no modificable: 999999.
Día de la semana
Día del año.
Sexo: con dos valores posibles 'H' o 'M'
Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
Almacenar el total de una factura.
Población mundial del planeta tierra.

 */


import java.util.Scanner;

public class semTempoIrmao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca la nota del modulo ****:");
        double num1 = teclado.nextDouble();
        System.out.printf("Introduzca la nota del modulo ****:");
        double num2 = teclado.nextDouble();
        System.out.printf("Introduzca la nota del modulo ****:");
        double num3 = teclado.nextDouble();
        //OPERACION MATEMATICA

        double suma = num1 + num2 + num3;
        double media = suma / 3.0;

        System.out.printf("pelooo amor %.0f %n", + media);





    }
}

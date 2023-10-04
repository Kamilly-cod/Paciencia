package losOperadores;

import java.util.Scanner;

public class Ejemplo06 {

    public static void main(String[] args) {
        // SON VARIABLES QUE SOLOS PUEDEN TOMAR DOS VALORES: TRUE, FALSE
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce edad: ");
        int edad = teclado.nextInt(); teclado.nextLine();

        boolean mayorDeEdad = edad >= 18; // si edad es >=18, guardará true; si no, false
        System.out.print("Eres mayor de edad: " + mayorDeEdad);

    }
}

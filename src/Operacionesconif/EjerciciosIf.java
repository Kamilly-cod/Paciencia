package Operacionesconif;

import java.util.Scanner;

public class EjerciciosIf {
    public static void main(String[] args) {
        // tengo que tener previamente un usuario y una contraseña, para comparar luego.
        String user = "dam1";
        String password = "Girl321";

        //Escribe un programa que pida un nombre de usuario y una contraseña.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime tu nombre");
        String usuario = teclado.nextLine();
        System.out.println("Contraseña");
        String contraseña = teclado.nextLine();

        //Esos datos se comparan con dos valores guardados previamente en el programa.
        // NEW ****** OJO ****** CUANDO SE TRATA DE STRING, LA COMPARACIÓN NO SE HACE COM ==
        // SE UTILIZA EL MÉTODO EQUALS: cadena.equals(cadena2)
        // POR EJEMPLO, en ese caso, pondriamos user. euals(usuario)
    }
}

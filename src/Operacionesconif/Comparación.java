package Operacionesconif;

import java.sql.SQLOutput;

public class Comparación {
    public static void main(String[] args) {
        //Esos datos se comparan con dos valores guardados previamente en el programa.
        // NEW ****** OJO ****** CUANDO SE TRATA DE STRING, LA COMPARACIÓN NO SE HACE COM ==
        // SE UTILIZA EL MÉTODO EQUALS: cadena.equals(cadena2)
        // POR EJEMPLO, en ese caso, pondriamos user. euals(usuario)
        System.out.println("Adriano".equals("adriano")); // false
        System.out.println("Adriano".equals("Adriano")); // false
    }
}

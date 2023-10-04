package Variables;

import java.util.Scanner;

public class nextLevel {
    public static void main(String[] args) {
        double tempo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una temperatura");
        tempo = teclado.nextDouble();

        if (tempo > 30) {
            System.out.println("Hace mucho calor");
        }

        else {
            System.out.println("Hace frio");
        }
            // else=  do contrario




    }
}

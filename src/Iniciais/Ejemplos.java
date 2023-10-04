package Iniciais;

public class Ejemplos {

    public static void main(String[] args) {
        //println ele,n --> imprime o conteudo dentro dos parenteses e acrescenta um salto de línea
        System.out.println("Hola,mundo");
        System.out.println("Otra línea");
        System.out.println();
        // print --> imprime o conteudo mais nao acrescenta um salto de linea, eles se completam

        System.out.print("Hola, ");
        System.out.print("mundo");
        System.out.println();
        System.out.println();

        //printf --> imprime con formato

        /*

        %s para cadenas ( nomes )
        %d para enteros ( números )
        %f para numeros de punto flotante, etc.
         */

        String  nombre = "Juan";
        System.out.printf("Nombre: %s\n", nombre);  // en lugar de poner +, ponemos %S dentro de lads comillas y, deswpues de la variable




        int edad = 25;
        System.out.printf("Edad: %d\n", edad);

        double altura = 1.757575757575757577575;
        System.out.printf("Altura: %.2f \n", altura );  //quiero mostrar solo dos decimales poe eso he escrito el .2 al lado deste símbolo

        System.out.printf("\n\nLas tres variables en el mismo texto seria: %s, %d, %.2f metros", nombre, edad, altura);

    }

}

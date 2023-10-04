package losOperadores;

public class Ejemplo2 {
    public static void main(String[] args) {
        // TIPOS DE VARIABLES
        // Numéricas
        // Si son números enteros tenemos :
        // int --> para guardar variables enteras
        int edadDelCliente = 25;
        System.out.println("Hoy es el cumpleaños. Romeu tenia esa edad " + edadDelCliente);
        edadDelCliente = edadDelCliente + 1;
        System.out.println( "Pero hizo "  + edadDelCliente + " años de edad");
        // long --> ocupa 64 bits, entonces es utilizada para números mayores, que no caben en una variable de tipo int
        long dineroDeKylieJenner = 100000000000000000L; // SIEMPRE PONGA EL L AO FINAL
        // Si son números decimales entonces utiliza double.
        double peso = 72.5;
        System.out.println("El peso es " + peso);


    }
}


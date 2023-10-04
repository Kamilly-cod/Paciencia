package Variables;
/*
Declara variables con el tipo de dato de menos bits posibles que puedan representar el valor. Justifica tu elección.
Si un empleado está casado o no.
Valor máximo no modificable: 999999.
Día de la semana
Día del año.
Sexo: con dos valores posibles 'H' o 'M'
Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
Almacenar el total de una factura.
Población mundial del planeta tierra.

 */



public class nervios {

    public enum sexo {V,M}
    public static void main(String[] args) {
        boolean casado = true;
        final  int MAXIMO = 999999;
        byte diasem[] = {1,2,3,4,5,6,7};
        short diaanual = 275;
        long miliseg = 1671408000L;
        float totalfactura = 10350.678F;
        long poblacion = 80000000L;
        sexo genero = sexo.M;

        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.println("\tEl valor de la variable casado es "+ casado);
        System.out.println("\tEl valor de la variable MAXIMO es "+ MAXIMO);
        System.out.println("\tEl valor de la variable diasem es "+ diasem[0]);
        System.out.println("\tEl valor de la variable diaanual es "+ diaanual);
        System.out.println("\tEl valor de la variable miliseg es "+ miliseg);
        System.out.println("\tEl valor de la variable totalfactura es "+ totalfactura);
        System.out.println("\tEl valor de la variable poblacion es "+ poblacion);
        System.out.println("\tEl valor de la variable sexo es "+ genero);

        // visualización de las variables con print
        System.out.print("\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.print("\n\tEl valor de la variable casado es "+ casado);
        System.out.print("\n\tEl valor de la variable MAXIMO es "+ MAXIMO);
        System.out.print("\n\tEl valor de la variable diasem es "+ diasem[0]);
        System.out.print("\n\tEl valor de la variable diaanual es "+ diaanual);
        System.out.print("\n\tEl valor de la variable miliseg es "+ miliseg);
        System.out.print("\n\tEl valor de la variable totalfactura es "+ totalfactura);
        System.out.print("\n\tEl valor de la variable poblacion es "+ poblacion);
        System.out.print("\n\tEl valor de la variable sexo es "+ genero);

        // visualización de las variables con printf
        System.out.printf("\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.printf("\n\tEl valor de la variable casado es "+ casado);
        System.out.printf("\n\tEl valor de la variable MAXIMO es "+ MAXIMO);
        System.out.printf("\n\tEl valor de la variable diasem es "+ diasem[0]);
        System.out.printf("\n\tEl valor de la variable diaanual es "+ diaanual);
        System.out.printf("\n\tEl valor de la variable miliseg es "+ miliseg);
        System.out.printf("\n\tEl valor de la variable totalfactura es "+ totalfactura);
        System.out.printf("\n\tEl valor de la variable poblacion es "+ poblacion);
        System.out.printf("\n\tEl valor de la variable sexo es "+ genero);





    }
}

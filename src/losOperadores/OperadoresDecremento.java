package losOperadores;

public class OperadoresDecremento {
    public static void main(String[] args) {

        // Operador de DECREMENTO
        //* SIrve para QUITAR una unidad a una variable de tipo intero: int

        int variable = 0;
        System.out.println(variable + " antes de decrementar");
        variable--; // incremento la variable en una unidad
        System.out.println(variable + " después de incrementarla");
        variable--; // incremento la variable en una unidad
        System.out.println(variable + " después de incrementarla");

        // y asi sucesivamente
        // es lo mismo que hacer variable = variable +1
        variable = variable - 1; //es lo mismo que variable += 1
        System.out.println(variable + " después de sumarle");
        // también se puede poner así: variable -= 1
        variable -= 1;
        System.out.println(variable + " después de poner -= 1");


    }

}

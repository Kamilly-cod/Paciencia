package Float;

public class floatEjercicio2 {
    public static void main(String[] args) {

    }
   public enum Estacion {
       PRIMAVERA (10, 20.5f),
       VERANO (23, 40),
       OTONO (5.3f, 15),
       INVIERNO (-2.1f, 10);

       private final float temperaturaMinima;
       private final float temperaturaMaxima;

       Estacion(float minima, float maxima) {
           temperaturaMinima = minima;
           temperaturaMaxima = maxima;
       }
       public float temperaturaMinima() {
           return temperaturaMinima;
       }

       public float temperaturaMaxima() {
           return temperaturaMaxima;
       }

       public float diferenciaTemperatura() {
           return temperaturaMaxima - temperaturaMinima;





    }


}
    }
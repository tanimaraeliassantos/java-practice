package inmutable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InmutableFlight flight1 = new InmutableFlight("1", "MAD", "BCN", 100.0, false);

        // flight1 no se modifica, flight2 es una instancia nueva.
        InmutableFlight flight2 = flight1.withCancelled();

        // Usar InmutableRoute
        List<String> escalas = new ArrayList<>();
        escalas.add("LIS");
        InmutableRoute ruta = new InmutableRoute("MAD", "BCN", escalas);
        // Modificamos la lista externa original
        escalas.add("PAR");

        // Si InmutableRoute usó copia defensiva, esto imprimirá 1 (no se vio afectada)
        System.out.println("Número de escalas en la ruta: " + ruta.getStops().size());

        // Intentar modificar la lista devuelta por el getter
        try {
            ruta.getStops().add("NYC");
        } catch (UnsupportedOperationException e) {
            System.out.println("Éxito! La lista de escalas está protegida contra modificaciones.");
        }

    }
}

package streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creamos nueva lista de vuelos
        List<Flight> flights = new ArrayList<>();
        // añadimos datos de prueba
        flights.add(new Flight("1", "MAD", "PAR", 200.0, false));
        flights.add(new Flight("2", "MAD", "LON", 300.0, false));
        flights.add(new Flight("3", "MAD", "IBZ", 500.0, false));
        flights.add(new Flight("4", "MAD", "AMS", 300.0, true));
        flights.add(new Flight("5", "MAD", "ALI", 100.0, false));
        flights.add(new Flight("6", "VAL", "MAD", 100.0, false));

        // instanciamos el servicio
        FlightService service = new FlightService();

        // Fijamos el presupuesto máximo
        double maxBudget = 400.0;

        System.out.println("--- INICIANDO TEST FILTERAVAILABLEFLIGHTS ---");

        List<Flight> disponibles = service.filterAvailableFlights(flights, maxBudget);

        System.out.println(
                "Vuelos disponibles dentro del presupuesto de: " + maxBudget + " euros: " + disponibles.size());

        for (Flight flight : disponibles) {
            System.out.println("ID: " + flight.getId() + " | Origen: " + flight.getOrigin() + " | Destino: "
                    + flight.getDestination() + " | Precio: " + flight.getBasePrice());
        }
        System.out.println("--- FINALIZANDO TEST FILTERAVAILABLEFLIGHTS ---");
        System.out.println("--- INICIANDO TEST FINDCHEAPESTFLIGHTS ---");
        List<Flight> baratos = service.getCheapestFlights(flights, 3);
        System.out.println("Vuelos más baratos encontrados: " + baratos.size());
        for (Flight flight : baratos) {
            System.out.println("ID: " + flight.getId() + " | Origen: " + flight.getOrigin() + " | Destino: "
                    + flight.getDestination() + " | Precio: " + flight.getBasePrice());
        }
        System.out.println("--- FINALIZANDO TEST FINDCHEAPESTFLIGHTS ---");
        System.out.println("--- INICIANDO TEST FINDUNIQUEDESTINATION ---");
        List<String> unique = service.getUniqueFlights(flights);
        System.out.println("Vuelos con destinos únicos encontrados: " + unique.size());
        for (String destino : unique) {
            System.out.println("-" + destino);

        }
        System.out.println("--- FINALIZANDO TEST FINDUNIQUEDESTINATION ---");

    }

}

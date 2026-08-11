package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    // Recibido: lista de vuelos, presupuesto máximo
    // Proceso: filtrar no cancelados -> filtrar por precio con descuento BCN ->
    // recoger
    // Devuelvo: lista de vuelos que pasan los filtros

    public List<Flight> filterAvailableFlights(List<Flight> flights, double maxBudget) {
        return flights.stream()
                .filter(flight -> !flight.isCancelled())
                .filter(flight -> calculateFinalPrice(flight) <= maxBudget)
                .collect(Collectors.toList());
    }

    private double calculateFinalPrice(Flight flight) {
        if ("BCN".equalsIgnoreCase(flight.getDestination())) {
            return flight.getBasePrice() * 0.90;
        }
        return flight.getBasePrice();
    }

    // Quiero los N vuelos más baratos disponibles
    // Pasos: fitlrar disponibles
    // Ordenar por precio
    // Coger los N primeros
    public List<Flight> getCheapestFlights(List<Flight> flights, int limit) {
        return flights.stream()
                .filter(flight -> !flight.isCancelled())
                .sorted(Comparator.comparingDouble(Flight::getBasePrice))
                .limit(limit)
                .collect(Collectors.toList());
    }

    // Lista de destinos únicos como Strings
    public List<String> getUniqueFlights(List<Flight> flights) {
        if (flights == null) return List.of();

        return flights.stream()
                .filter(flight -> !flight.isCancelled())
                .map(Flight::getDestination)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}

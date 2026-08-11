package streams;

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
}

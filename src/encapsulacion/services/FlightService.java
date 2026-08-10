package encapsulacion.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import encapsulacion.Airport;
import encapsulacion.Flight;

public class FlightService {
    public Optional<Flight> findDirectFlight(List<Airport> airports, String originCode, String destinationCode) {
        if (airports == null || originCode == null || destinationCode == null) {
            return Optional.empty();
        }
        // Buscar el primer vuelo directo que coincida con el código de origen y
        // destino.
        return airports.stream()
                // buscar el aeropuerto de origen
                .filter(airport -> airport.getCode().equalsIgnoreCase(originCode))
                // obtener lista de vuelos
                .flatMap(airport -> airport.getFlights().stream())
                // filtrar por el código de destino del vuelo
                .filter(flight -> flight.getDestinationCode().equalsIgnoreCase(destinationCode))
                // retornar el primero que coincida
                .findFirst();
    }

    // Buscar TODOS los vuelos directos entre un origen y un destino
    public List<Flight> findAllDirectFlights(List<Airport> airports, String originCode, String destinationCode) {
        if (airports == null || originCode == null || destinationCode || null) {
            return List.of();// devuelve una lista vacía inmutable
        }

        return airports.stream()
                .filter(airport -> airport.getCode().equalsIgnoreCase(originCode))
                .flatMap(airport -> airport.getFlights().stream())
                .filter(flight -> flight.getDestinationCode().equalsIgnoreCase(destinationCode))
                .collect(Collectors.toList());
    }

}

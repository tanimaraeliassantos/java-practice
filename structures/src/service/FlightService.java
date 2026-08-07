package service;

import java.util.List;
import java.util.Optional;
import model.Flight;

public class FlightService {
    // Recorrer una lista y buscar vuelo por id usando stream()
    public Optional<Flight> findById(List<Flight> flights, String id) {
        return flights.stream()
                .filter(flight -> flight.getId().equals(id))
                .findFirst();
    }

    public Optional<Flight> findByDestination(List<Flight> flights, String destination) {
        return flights.stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .findFirst();
    }

    public Optional<Flight> findByOrigin(List<Flight> flights, String origin) {
        return flights.stream()
                .filter(flight -> flight.getOrigin().equals(origin))
                .findFirst();
    }

    public Optional<Flight> findByIsCancelled(List<Flight> flights, boolean cancelled) {
        return flights.stream()
                .filter(flight -> flight.getIsCancelled() == cancelled)
                .findFirst();
    }

    public Optional<Flight> findByIsNotCancelled(List<Flight> flights, boolean cancelled) {
        return flights.stream()
                .filter(flight -> flight.getIsCancelled() == cancelled)
                .findFirst();
    }
    //Recorrer elementos de una lista,
    //si cumple la condición, lo devuelvo
    //si no los cumple, devuelvo null


}

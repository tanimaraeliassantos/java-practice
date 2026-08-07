package service;

import java.util.ArrayList;
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

    // Recorrer elementos de una lista,
    // si cumple la condición, lo devuelvo
    // si no los cumple, devuelvo null
    public Flight findByIdClassic(List<Flight> flights, String id) {
        for (Flight flight : flights) {
            if (flight.getId().equals(id)) {
                return flight;
            }
        }
        return null;
    }

    public Flight findByOriginClassic(List<Flight> flights, String origin) {
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin)) {
                return flight;
            }
        }

        return null;
    }

    public Flight findByDestinationClassic(List<Flight> flights, String destination) {
        for (Flight flight : flights) {
            if (flight.getDestination().equals(destination)) {
                return flight;
            }
        }
        return null;
    }

    public Flight findByBasePrice(List<Flight> flights, double basePrice) {
        for (Flight flight : flights) {
            if (flight.getBasePrice() == basePrice) {
                return flight;
            }
        }
        return null;
    }

    public Flight findByIsCancelledClassic(List<Flight> flights, boolean cancelled) {
        for (Flight flight : flights) {
            if (flight.getIsCancelled() == cancelled) {
                return flight;
            }
        }
        return null;
    }

    // Filtrar una lista
    // Crear una lista vacía de resultados para cada elemento
    // Si cumple las condiciones -> añadirlo a resultados
    // Devolver resultados
    public List<Flight> filterByOrigin(List<Flight> flights, String origin) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : flights) {
            if (!flight.getIsCancelled() && flight.getOrigin().equals(origin)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> filterByDestination(List<Flight> flights, String destination) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : flights) {
            if (!flight.getIsCancelled() && flight.getDestination().equals(destination)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> filterByMaxPrice(List<Flight> flights, double maxPrice) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : flights) {
            if (!flight.getIsCancelled() && flight.getBasePrice() <= maxPrice) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> filterByNotCancelled(List<Flight> flights, boolean cancelled) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : flights) {
            if (!flight.getIsCancelled()) {
                result.add(flight);
            }
        }
        return result;
    }

    

}

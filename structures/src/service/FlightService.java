package service;

import java.util.ArrayList;
import java.util.List;
import model.Flight;

public class FlightService {
    // Recorrer una lista y buscar vuelo por id usando stream()
    // public Optional<Flight> findById(List<Flight> flights, String id) {
    // return flights.stream()
    // .filter(flight -> flight.getId().equals(id))
    // .findFirst();
    // }

    // public Optional<Flight> findByDestination(List<Flight> flights, String
    // destination) {
    // return flights.stream()
    // .filter(flight -> flight.getDestination().equals(destination))
    // .findFirst();
    // }

    // public Optional<Flight> findByOrigin(List<Flight> flights, String origin) {
    // return flights.stream()
    // .filter(flight -> flight.getOrigin().equals(origin))
    // .findFirst();
    // }

    // public Optional<Flight> findByIsCancelled(List<Flight> flights, boolean
    // cancelled) {
    // return flights.stream()
    // .filter(flight -> flight.getIsCancelled() == cancelled)
    // .findFirst();
    // }

    // public Optional<Flight> findByIsNotCancelled(List<Flight> flights, boolean
    // cancelled) {
    // return flights.stream()
    // .filter(flight -> flight.getIsCancelled() == cancelled)
    // .findFirst();
    // }

    // Recorrer elementos de una lista,
    // si cumple la condición, lo devuelvo
    // si no los cumple, devuelvo null
    // public Flight findByIdClassic(List<Flight> flights, String id) {
    // for (Flight flight : flights) {
    // if (flight.getId().equals(id)) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // public Flight findByOriginClassic(List<Flight> flights, String origin) {
    // for (Flight flight : flights) {
    // if (flight.getOrigin().equals(origin)) {
    // return flight;
    // }
    // }

    // return null;
    // }

    // public Flight findByDestinationClassic(List<Flight> flights, String
    // destination) {
    // for (Flight flight : flights) {
    // if (flight.getDestination().equals(destination)) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // public Flight findByBasePrice(List<Flight> flights, double basePrice) {
    // for (Flight flight : flights) {
    // if (flight.getBasePrice() == basePrice) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // public Flight findByIsCancelledClassic(List<Flight> flights, boolean
    // cancelled) {
    // for (Flight flight : flights) {
    // if (flight.getIsCancelled() == cancelled) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // Filtrar una lista
    // Crear una lista vacía de resultados para cada elemento
    // Si cumple las condiciones -> añadirlo a resultados
    // Devolver resultados
    // public List<Flight> filterByOrigin(List<Flight> flights, String origin) {
    // List<Flight> result = new ArrayList<>();

    // for (Flight flight : flights) {
    // if (!flight.getIsCancelled() && flight.getOrigin().equals(origin)) {
    // result.add(flight);
    // }
    // }
    // return result;
    // }

    // public List<Flight> filterByDestination(List<Flight> flights, String
    // destination) {
    // List<Flight> result = new ArrayList<>();

    // for (Flight flight : flights) {
    // if (!flight.getIsCancelled() && flight.getDestination().equals(destination))
    // {
    // result.add(flight);
    // }
    // }
    // return result;
    // }

    // public List<Flight> filterByMaxPrice(List<Flight> flights, double maxPrice) {
    // List<Flight> result = new ArrayList<>();

    // for (Flight flight : flights) {
    // if (!flight.getIsCancelled() && flight.getBasePrice() <= maxPrice) {
    // result.add(flight);
    // }
    // }
    // return result;
    // }

    // public List<Flight> filterByNotCancelled(List<Flight> flights, boolean
    // cancelled) {
    // List<Flight> result = new ArrayList<>();

    // for (Flight flight : flights) {
    // if (!flight.getIsCancelled()) {
    // result.add(flight);
    // }
    // }
    // return result;
    // }
    // Recorrer una lista y buscar algo (08 Agosto)
    // public Flight findById(List<Flight> flights, String id) {
    // for (Flight flight : flights) {
    // if (flight.getId().equals(id)) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // public Flight findByOrigin(List<Flight> flights, String origin) {
    // for (Flight flight : flights) {
    // if (flight.getOrigin().equals(origin)) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // public Flight findByDestination(List<Flight> flights, String destination) {
    // for (Flight flight : flights) {
    // if (flight.getDestination().equals(destination)) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // public Flight findBybasePrice(List<Flight> flights, double basePrice) {
    // for (Flight flight : flights) {
    // if (flight.getBasePrice() == basePrice) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // public Flight findByIsCancelled(List<Flight> flights, boolean cancelled) {
    // for (Flight flight : flights) {
    // if (!flight.getIsCancelled() == cancelled) {
    // return flight;
    // }
    // }
    // return null;
    // }

    // Recorrer una lista y buscar algo con stream() - O(n)
    // public Optional<Flight> findById(List<Flight> flights, String id) {
    // return flights.stream()
    // .filter(flight -> flight.getId().equals(id))
    // .findFirst();
    // }

    // public Optional<Flight> findByOrigin(List<Flight> flights, String origin) {
    // return flights.stream()
    // .filter(flight -> flight.getOrigin().equals(origin))
    // .findFirst();
    // }

    // public Optional<Flight> findByDestination(List<Flight> flights, String
    // destination) {
    // return flights.stream()
    // .filter(flight -> flight.getDestination().equals(destination))
    // .findFirst();
    // }

    // public Optional<Flight> findByBasePrice(List<Flight> flights, double
    // basePrice) {
    // return flights.stream()
    // .filter(flight -> flight.getBasePrice() == basePrice)
    // .findFirst();
    // }

    // public Optional<Flight> findByIsCancelled(List<Flight> flights, boolean
    // cancelled) {
    // return flights.stream()
    // .filter(flight -> flight.getIsCancelled() == cancelled)
    // .findFirst();
    // }

    // Filtrar una lista
    // Crear lista vacía para poner los resultados
    // Recorrer cada elemento, si cumple las condiciones, añadirlo a los resultados
    // Si no cumple, no.
    // Devolver los resultados
    public List<Flight> filterById(List<Flight> flights, String id) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : flights) {
            if (!flight.getIsCancelled() && flight.getId().equals(id)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> filterByOrigin(List<Flight> flights, String origin) {
        List<Flight> result = new ArrayList<>();

        for (Flight flight : flights) {
            if (!flight.getIsCancelled() && flight.getOrigin().equals(origin)) {
                result.add(flight);
            }
        }
        return result;
    }

    // crear una lista vacía para poner los resultados
    // recorrer cada elemento
    // si cumple la condición, añado a la lista
    // si no cumple, no.
    // devuelvo la lista
    //Elijo ArrayList porque crece automaticamente cada vez que se add
    //Es una operación rápida de O(1). Es la estructura de datos más
    // ligera y eficiente en memoria para operaciones secuenciales
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
        for(Flight flight: flights) {
            if(!flight.getIsCancelled() && flight.getBasePrice() <= maxPrice) {
                result.add(flight);
            }
        } return result;
    }

    public List<Flight> filterByMinPrice(List<Flight> flights, double minPrice) {
        List<Flight> result = new ArrayList<>();
        for(Flight flight: flights) {
            if(!flight.getIsCancelled() && flight.getBasePrice() >= minPrice) {
                result.add(flight);
            }
        }
        return result;
    }

}

package solid.srp.good.services;

import java.util.ArrayList;
import java.util.List;
import solid.srp.good.models.Flight;

public class FlightSearchService {
    public List<Flight> search(String origin, String destination) {
        System.out.println("Buscando vuelos desde " + origin + " hacia " + destination);

        List<Flight> results = new ArrayList<>();
        results.add(new Flight("IB3190", origin, destination, 150.0));
        return results;
    }
}

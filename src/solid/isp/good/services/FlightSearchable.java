package solid.isp.good.services;

import java.util.List;

import solid.ocp.good.models.Flight;

public interface FlightSearchable {
    List<Flight> searchFlights(String origin, String destination);
}

package solid.ocp.good.strategies;

import java.util.List;

import solid.ocp.good.models.Flight;

public interface FlightSearchStrategy {
    List<Flight> search();

}

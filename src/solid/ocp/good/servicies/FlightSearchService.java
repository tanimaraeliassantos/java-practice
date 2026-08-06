package solid.ocp.good.servicies;

import java.util.List;
import solid.ocp.good.models.Flight;
import solid.ocp.good.strategies.FlightSearchStrategy;

public class FlightSearchService {
    public List<Flight> search(FlightSearchStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("La estrategia de búsqueda no puede ser nula");
        }
        return strategy.search();
    }
}

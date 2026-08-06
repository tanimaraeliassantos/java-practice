package solid.ocp.good.strategies;

import java.util.List;
import solid.ocp.good.strategies.*;
import solid.ocp.good.models.*;

public class CheapFlightSearch implements FlightSearchStrategy {
    @Override
    public List<Flight> search() {
        return List.of();
    }

}

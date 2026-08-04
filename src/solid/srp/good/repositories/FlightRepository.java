package solid.srp.good.repositories;

import solid.srp.good.models.Flight;

public interface FlightRepository {
    void save(Flight flight, String userId);
}

package solid.srp.good.repositories;

import solid.srp.good.models.Flight;

public class FlightImplRepository implements FlightRepository {
    @Override
    public void save(Flight flight, String userId) {
        System.out
                .println("BD: guardando reserva del vuelo " + flight.getFlightNumber() + " para el usuario " + userId);
    }
}

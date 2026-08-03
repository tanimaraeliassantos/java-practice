package solid.srp.good.repositories;

import solid.srp.good.models.Reservation;

public class ReservationImplRepository implements ReservationRepository {
    @Override
    public void save(Reservation reservation) {
        System.out.println("Guardando en BD " + reservation.getFlightId());
    }

}
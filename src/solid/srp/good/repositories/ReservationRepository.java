package solid.srp.good.repositories;

import solid.srp.good.models.Reservation;

public interface ReservationRepository {
    void save(Reservation reservation);
}

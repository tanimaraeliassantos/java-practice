package solid.dip.good.services;

public class BookingService {
    private final ReservationRepository repository;

    public BookingService(ReservationRepository repository) {
        this.repository = repository;
    }

    public void createBooking(Reservation reservation) {
        repository.save(reservation);
    }
}

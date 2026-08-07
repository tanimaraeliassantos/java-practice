package solid.dip.bad;

public class BookingService {
    private MySQLReservationRepository repository = new MySQLReservationRepository();

    public void createBooking(Reservation reservation) {
        repository.save(reservation);
    }
}

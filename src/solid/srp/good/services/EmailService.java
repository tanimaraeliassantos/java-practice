package solid.srp.good.services;

import solid.srp.good.models.Reservation;

public class EmailService {
    public void sendConfirmationEmail(Reservation reservation) {
        System.out.println("Enviando email de confirmación para el vuelo: " + reservation.getFlightId());
    }
}

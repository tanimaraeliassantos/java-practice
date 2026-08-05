package solid.srp.good.services;

import solid.srp.good.models.Reservation;
import solid.srp.good.models.User;

public class EmailService {
    public void sendConfirmationEmail(Reservation reservation) {
        System.out.println("Enviando email de confirmación para el vuelo: " + reservation.getFlightId());
    }

    public void sendWelcomeEmail(User user) {
        System.out.println("Enviando email de bienvenida a usuario " + user.getEmail());
    }
}

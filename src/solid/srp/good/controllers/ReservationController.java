package solid.srp.good.controllers;

import solid.srp.good.models.Reservation;
import solid.srp.good.repositories.ReservationRepository;
import solid.srp.good.services.EmailService;

public class ReservationController {
    private final ReservationRepository repository;
    private final EmailService emailService;

    public ReservationController(ReservationRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void createReservation(String flightId, String userId, double price) {
        Reservation reservation = new Reservation(flightId, userId, price);

        repository.save(reservation);

        emailService.sendConfirmationEmail(reservation);

        System.out.println("Reserva procesada con éxito: " + reservation.calculateTax() + "euros");
    }
}

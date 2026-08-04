package solid.srp.good.services;

import solid.srp.good.models.Flight;
import solid.srp.good.models.Reservation;
import solid.srp.good.repositories.FlightRepository;

public class FlightBookingService {
    private final FlightRepository flightRepository;
    private final PdfReportService pdfService;
    private final EmailService emailService;

    public FlightBookingService(FlightRepository flightRepository, PdfReportService pdfService,
            EmailService emailService) {
        this.flightRepository = flightRepository;
        this.pdfService = pdfService;
        this.emailService = emailService;
    }

    public void book(Flight flight, String userId, String userEmail) {
        System.out.println(
                "Procesando la reserva para el vuelo: " + flight.getFlightNumber() + " para el usuario " + userId);

        flightRepository.save(flight, userId);

        pdfService.generatePdf(flight, userId);

        Reservation reservation = new Reservation(flight.getFlightNumber(), userId, flight.getPrice());

        emailService.sendConfirmationEmail(reservation);
    }
}

package solid.srp.good.controllers;

import solid.srp.good.models.Flight;
import solid.srp.good.services.FlightBookingService;

public class BookingController {
    private final FlightBookingService bookingService;

    // Constructor
    public BookingController(FlightBookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void processBooking(Flight flight, String userId, String userEmail) {
        bookingService.book(flight, userId, userEmail);
    }
}

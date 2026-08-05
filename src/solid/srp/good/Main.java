package solid.srp.good;

import solid.srp.good.controllers.*;
import solid.srp.good.models.*;
import solid.srp.good.repositories.*;
import solid.srp.good.services.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO PRUEBA GUARDAR RESERVA ---");

        Reservation reservation = new Reservation("IB1234", "1233", 100.0);

        double tax = reservation.calculateTax();
        System.out.println("Precio base: " + reservation.getPrice() + "euros");
        System.out.println("Impuesto calculado (21%): " + tax + "euros");

        ReservationRepository reservationRepository = new ReservationImplRepository();
        reservationRepository.save(reservation);

        System.out.println(" --- PRUEBA COMPLETADA EXITOSAMENTE --- ");

        System.out.println("--- INICIANDO SISTEMA DE RESERVAS ENVIAR EMAIL---");

        // Instanciamos las dependencias
        EmailService emailService = new EmailService();

        // Creamos el controlador inyectando sus dependencias
        ReservationController controller = new ReservationController(reservationRepository, emailService);

        // Simulamos una petición del usuario
        controller.createReservation("IB1234", "USER_99", 100.0);

        System.out.println("--- PRUEBA COMPLETADA EXITOSAMENTE ---");

        System.out.println("--- INICIANDO SISTEMA DE RESERVAS PARA BOOKINGCONTROLLER ---");
        FlightRepository flightRepository = new FlightImplRepository();
        PdfReportService pdfService = new PdfReportService();

        FlightBookingService bookingService = new FlightBookingService(flightRepository, pdfService, emailService);

        BookingController bookingController = new BookingController(bookingService);

        Flight flight = new Flight("IB33180", "MAD", "BCN", 1000.0);
        bookingController.processBooking(flight, "U_1233", "tanimara@email.com");

        System.out.println(" --- INICIANDO PRUEBA USERSERVICE --- ");
        UserRepository userRepository = new UserImplRepository();
        PasswordService passwordService = new PasswordService();
        UserValidationService validationService = new UserValidationService();
        ActivityLogService logService = new ActivityLogService();

        UserService userService = new UserService(
                userRepository,
                passwordService,
                validationService,
                emailService,
                logService);

        UserController userController = new UserController(userService);

        User newUser = userController.createUser(1L, "tanimara", "tani@email.com", "miPassword123");

        System.out.println("Usuario registrado correctamente con ID: " + newUser.getId());
        System.out.println(" --- FINALIZANDO PRUEBA USERSERVICE --- ");
    }

}
package solid.srp.good;

import solid.srp.good.controllers.ReservationController;
import solid.srp.good.models.Reservation;
import solid.srp.good.repositories.ReservationImplRepository;
import solid.srp.good.repositories.ReservationRepository;
import solid.srp.good.services.EmailService;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO PRUEBA GUARDAR RESERVA ---");

        Reservation reservation = new Reservation("IB1234", "1233", 100.0);

        double tax = reservation.calculateTax();
        System.out.println("Precio base: " + reservation.getPrice() + "euros");
        System.out.println("Impuesto calculado (21%): " + tax + "euros");

        ReservationRepository repository = new ReservationImplRepository();
        repository.save(reservation);

        System.out.println(" --- PRUEBA COMPLETADA EXITOSAMENTE --- ");

        System.out.println("--- INICIANDO SISTEMA DE RESERVAS ENVIAR EMAIL---");

        // Instanciamos las dependencias
        EmailService emailService = new EmailService();

        // Creamos el controlador inyectando sus dependencias
        ReservationController controller = new ReservationController(repository, emailService);

        // Simulamos una petición del usuario
        controller.createReservation("IB1234", "USER_99", 100.0);

        System.out.println("--- PRUEBA COMPLETADA EXITOSAMENTE ---");
    }

}
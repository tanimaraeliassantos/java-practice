package encapsulacion;

public class Reservation {
    //Atributos de clase
    private final String id;
    private final String flightId;
    private final String userId;
    private final double totalPrice;
    private ReservationStatus status;

    //Enumerador de estados
    public enum ReservationStatus {
        PENDING, CONFIRMED, CANCELLED
    }

    //Constructor público para instanciar una nueva reserva
    public Reservation(String id, String flightId, String userId, double totalPrice) {
        if (totalPrice <= 0)
            throw new IllegalArgumentException("Precio debe ser positivo");
        //asignar el argumento al atributo de la instancia
        this.id = id;
        this.flightId = flightId;
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.status = ReservationStatus.PENDING;
    }

    //Métodos de negocio
    public void confirm() {
        if (status != ReservationStatus.PENDING) {
            throw new IllegalStateException("Solo se puede confirmar una reserva pendiente");
        }
        this.status = ReservationStatus.CONFIRMED;
    }

    public void cancel() {
        if (status == ReservationStatus.CANCELLED) {
            throw new IllegalStateException("La reserva ya está cancelada");
        }
        this.status = ReservationStatus.CANCELLED;
    }
    //Getters
    public String getId() {
        return id;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getUserId() {
        return userId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ReservationStatus getStatus() {
        return status;
    }
}

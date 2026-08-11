package streams;

public class Flight {
    private final String id;
    private final String origin;
    private final String destination;
    private double basePrice;
    private boolean cancelled;

    // Constructor
    public Flight(String id, String origin, String destination, double basePrice, boolean cancelled) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("Vuelo no puede tener id inválido");
        if (origin == null || origin.isEmpty())
            throw new IllegalArgumentException("Vuelo debe tener origen válido");
        if (destination == null || destination.isEmpty())
            throw new IllegalArgumentException("Vuelo debe tener destino válido");
        if (basePrice < 0)
            throw new IllegalArgumentException("Precio debe ser positivo");

        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.basePrice = basePrice;
        this.cancelled = false;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public String toString() {
        return "Flight: " + id + " | Origen: " + origin + " | Destino: " + destination;
    }
}

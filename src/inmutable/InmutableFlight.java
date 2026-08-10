package inmutable;

public class InmutableFlight {
    private final String id;
    private final String origin;
    private final String destination;
    private final double price;
    private final boolean cancelled;

    // Constructor
    public InmutableFlight(String id, String origin, String destination, double price, boolean cancelled) {
        if (price < 0)
            throw new IllegalArgumentException("Precio inválido");
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public InmutableFlight withCancelled() {
        return new InmutableFlight(this.id, this.origin, this.destination, this.price, true);
    }

    public InmutableFlight withPrice(double newPrice) {
        return new InmutableFlight(this.id, this.origin, this.destination, newPrice, this.cancelled);
    }
}

package model;

public class Flight {
    private String id;
    private String origin;
    private String destination;
    private double basePrice;
    private boolean cancelled;

    public Flight(String id, String origin, String destination, double basePrice, boolean cancelled) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.basePrice = basePrice;
        this.cancelled = cancelled;
    }

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

    public boolean getIsCancelled() {
        return cancelled;
    }



    @Override
    public String toString() {
        return id + " | " + origin + "->" + destination + " | " + basePrice + "Euros | "
                + (cancelled ? "CANCELADO" : "DISPONIBLE");
    }
}

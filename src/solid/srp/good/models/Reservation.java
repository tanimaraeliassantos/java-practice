package solid.srp.good.models;

public class Reservation {
    private String flightId;
    private String userId;
    private double price;

    // Constructor
    public Reservation(String flightId, String userId, double price) {
        this.flightId = flightId;
        this.userId = userId;
        this.price = price;
    }

    // Getters
    public String getFlightId() {
        return flightId;
    }

    public String getUserId() {
        return userId;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTax() {
        return price * 0.21;
    }

}
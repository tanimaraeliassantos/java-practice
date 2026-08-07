package solid.lsp.good.models;

public abstract class Flight {
    protected String id;
    protected double basePrice;

    public Flight(String id, double basePrice) {
        this.id = id;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double getPrice();
}

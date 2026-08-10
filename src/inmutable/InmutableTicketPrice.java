package inmutable;

public class InmutableTicketPrice {
    private final double basePrice;
    private final double taxes;
    private final double fees;
    private final String currency;

    public InmutableTicketPrice(double basePrice, double taxes, double fees, String currency) {
        if (basePrice < 0 || taxes < 0 || fees < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos");
        }
        this.basePrice = basePrice;
        this.taxes = taxes;
        this.fees = fees;
        this.currency = currency;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getFees() {
        return fees;
    }

    public String getCurrency() {
        return currency;
    }

    public double getTotalPrice() {
        return basePrice + taxes + fees;
    }

    public InmutableTicketPrice applyDiscount(double discountPercentage) {
        double newBase = basePrice * (1 - discountPercentage);
        return new InmutableTicketPrice(newBase, taxes, fees, currency);
    }
}

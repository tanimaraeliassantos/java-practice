package solid.lsp.good.models;

public class PrimeFlight extends Flight {

    public PrimeFlight(String id, double basePrice) {
        super(id, basePrice);
    }

    @Override
    public double getPrice() {
        return this.basePrice * 0.85;
    }
}

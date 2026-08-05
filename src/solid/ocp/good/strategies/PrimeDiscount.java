package solid.ocp.good.strategies;

public class PrimeDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}

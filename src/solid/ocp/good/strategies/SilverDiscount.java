package solid.ocp.good.strategies;

public class SilverDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.90;
    }

}

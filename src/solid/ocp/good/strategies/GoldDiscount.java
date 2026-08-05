package solid.ocp.good.strategies;

public class GoldDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.80;
    }

}

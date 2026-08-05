package solid.ocp.good.models;

import solid.ocp.good.strategies.DiscountStrategy;

public class DiscountCalculator {
    public double calculate(DiscountStrategy strategy, double price) {
        if (strategy == null) {
            return price;
        }
        return strategy.applyDiscount(price);
    }
}

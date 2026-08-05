package solid.ocp.good;

import solid.ocp.good.models.DiscountCalculator;
import solid.ocp.good.strategies.GoldDiscount;
import solid.ocp.good.strategies.PrimeDiscount;
import solid.ocp.good.strategies.SilverDiscount;

public class Main {
    public static void main(String[] args) {
        System.out.println("INICIAR TEST DISCOUNT CALCULATOR OCP");
        DiscountCalculator calculator = new DiscountCalculator();

        double precioBase = 100.0;

        double precioPrime = calculator.calculate(new PrimeDiscount(), precioBase);
        System.out.println("Precio para Prime: " + precioPrime);

        double precioGold = calculator.calculate(new GoldDiscount(), precioBase);
        System.out.println("Precio para Gold: " + precioGold);

        double precioSilver = calculator.calculate(new SilverDiscount(), precioBase);
        System.out.println("Precio para Silver: " + precioSilver);
    }
}

package solid.ocp.good;

import solid.ocp.good.models.*;
import solid.ocp.good.servicies.*;
import solid.ocp.good.strategies.*;

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
        System.out.println("FINALIZAR TEST DISCOUNT CALCULATOR OCP");
        System.out.println("-------------");
        System.out.println("INICIAR TEST PAYMENT PROCESSOR OCP");
        // Inicializamos el servicio
        PaymentProcessor processor = new PaymentProcessor();
        double monto = 150.0;

        // Probamos pago con los diferentes métodos:
        PaymentStrategy tarjeta = new CardPayment();
        processor.process(tarjeta, monto);

        PaymentStrategy paypal = new PayPalPayment();
        processor.process(paypal, monto);

        PaymentStrategy bizum = new BizumPayment();
        processor.process(bizum, monto);

        System.out.println("INICIAR TEST PAYMENT PROCESSOR OCP");
    }
}

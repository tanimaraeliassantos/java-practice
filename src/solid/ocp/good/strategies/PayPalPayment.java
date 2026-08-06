package solid.ocp.good.strategies;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando pago con PayPal por: " + amount);
    }
}

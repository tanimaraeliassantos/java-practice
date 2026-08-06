package solid.ocp.good.strategies;

public class CardPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando pago con Tarjeta por: " + amount);
    }
}

package solid.ocp.good.strategies;

public class BizumPayment implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando pago con Bizum por: " + amount);
    }
}

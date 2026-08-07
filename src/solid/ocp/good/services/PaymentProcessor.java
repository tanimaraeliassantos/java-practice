package solid.ocp.good.servicies;

import solid.ocp.good.strategies.*;

public class PaymentProcessor {
    public void process(PaymentStrategy paymentStrategy, double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.process(amount);
        }
    }
}

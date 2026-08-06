package solid.ocp.bad;

public class PaymentProcessor {
    public void process(String type, double amount) {
        if (type.equals("CARD")) {
        } else if (type.equals("PAYPAL")) {
        } else if (type.equals("BIZUM")) {
        }
    }

    //Aquí tenemos una clase para procesar pagos
    // Para añadir nuevos métodos de pago, habría
    //que modificar esa clase. Eso viola el OCP -
    //OPEN/CLOSED Principle, que dice que una clase
    //debe estar abierta para extensión, cerrada para
    //modificación. Para modificarla, habría que crear
    // una interfaz con PaymentMethod con método process.
    //Después creamos clases CardPayment, PayPalPayment,
    //BizumPayment. Entonces alteramos PaymentProcessor
    //para que use la interfaz PaymentMethod y nunca
    //sea necesario cambiarla.
}

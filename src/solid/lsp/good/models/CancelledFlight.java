package solid.lsp.good.models;

public class CancelledFlight extends Flight {
    @Override
    public double getPrice() {
        return 0.0;
    }

    public String getCancellationReason() {
        return "Condiciones meteorológicas";
    }
}

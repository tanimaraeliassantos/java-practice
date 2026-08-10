package encapsulacion;

import java.time.LocalDate;

public class PrimeSubscription {
    private final String userId;
    private final LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    public PrimeSubscription(String userId) {
        this.userId = userId;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now().plusYears(1);
        this.active = true;
    }

    public boolean isValid() {
        return active && LocalDate.now().isBefore(endDate);
    }

    public void renew() {
        if (!active)
            throw new IllegalStateException("No se puede renovar una suscripción cancelada");
        this.endDate = endDate.plusYears(1);
    }

    public void cancel() {
        this.active = false;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}

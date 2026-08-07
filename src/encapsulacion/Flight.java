package encapsulacion;

//Quiero una clase Flight que
//Tenga id, origen, destino, precio base, si está cancelado
//No permita precios negativos
//No permita strings vacíos para origen y destino
//solo se pueda cancelar, no descancelar
//clcule el precio final con descuento BCN internamente

public class Flight {
    private final String id;
    private final String origin;
    private final String destination;
    private double basePrice;
    private boolean cancelled;

    // Constructor: punto de entrada para crear un vuelo válido
    public Flight(String id, String origin, String destination, double basePrice) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("ID requerido");
        if (origin == null || origin.isEmpty())
            throw new IllegalArgumentException("Origen requerido");
        if (destination == null || destination.isEmpty())
            throw new IllegalArgumentException("Destino requerido");
        if (basePrice < 0)
            throw new IllegalArgumentException("Precio no puede ser negativo");

        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.basePrice = basePrice;
        this.cancelled = false;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    // Setter
    public void setBasePrice(double basePrice) {
        if (basePrice < 0)
            throw new IllegalArgumentException("Precio no puede ser negativo");
        this.basePrice = basePrice;
    }

    public void cancel() {
        if (this.cancelled)
            throw new IllegalStateException("El vuelo ya está cancelado");
        this.cancelled = true;
    }

    public double getFinalPrice() {
        if ("BCN".equalsIgnoreCase(destination)) {
            return basePrice * 0.90;
        }
        return basePrice;
    }

    @Override
    public String toString() {
        return "Flight{id='" + id + "', " + origin + " → " + destination +
                ", precio=" + basePrice + ", cancelado=" + cancelled + "}";
    }
}

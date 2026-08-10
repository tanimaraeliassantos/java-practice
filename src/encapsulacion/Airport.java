package encapsulacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airport {
    private final String code;
    private final String name;
    private final List<Flight> flights;

    public Airport(String code, String name) {
        if (code == null || code.length() != 3) {
            throw new IllegalArgumentException("Código debe tener tres caracteres");

        }
        this.code = code.toUpperCase();
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Flight> getFlights() {
        return Collections.unmodifiableList(flights);
    }

    public void addFlight(Flight flight) {
        if (flight == null)
            throw new IllegalArgumentException("Vuelo no puede ser null");
        flights.add(flight);
    }
}

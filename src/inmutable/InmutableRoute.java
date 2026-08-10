package inmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InmutableRoute {
    private final String origin;
    private final String destination;
    private final List<String> stops;

    public InmutableRoute(String origin, String destination, List<String> stops) {
        this.origin = origin;
        this.destination = destination;
        this.stops = new ArrayList<>(stops);
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public List<String> getStops() {
        return Collections.unmodifiableList(stops);
    }
}

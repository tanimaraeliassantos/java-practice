package solid.ocp.bad;

import java.util.List;

public class FlightSearch {
    public List<Flight> search(String type) {
        if (type.equals("CHEAP")) {
        } else if (type.equals("FAST")) {
        } else if (type.equals("DIRECT")) {
        }
        return null;
    }

}
// Aquí tenemos una clase que busca vuelos por tipo, comparando strings.
// Viola el principio de Open extensión/Closed para modificación, pues
// cada nueva categoría de búsqueda implicará en cambiar esa clase.
// Para arreglar ese problema, iremos crear un patrón de búsqueda en
// strategies, y crear diferentes strategies para cada tipo búsqueda.
// luego alteramos el flightserach service para que use el patrón y
// las diferentes estrategias.

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Flight;
import service.FlightService;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("1", "MAD", "BCN", 100.0, false));
        flights.add(new Flight("2", "MAD", "FRA", 200.0, true));
        flights.add(new Flight("3", "MAD", "PAR", 300.0, false));
        flights.add(new Flight("4", "MAD", "ROM", 200.0, false));
        flights.add(new Flight("5", "MAD", "IBZ", 300.0, false));
        flights.add(new Flight("6", "MAD", "AMS", 100.0, false));

        FlightService service = new FlightService();

        System.out.println("--- INICIANDO TEST FINDBYID ---");
        Optional<Flight> resultado = service.findById(flights, "1");
        System.out.println("Vuelo disponbile con el id 1: ");
        resultado.ifPresent(System.out::println);
        System.out.println("--- FINALIZANDO TEST FINDBYID ---");

        System.out.println("--- INICIANDO TEST FINDBYDESTINATION ---");
        Optional<Flight> resultado1 = service.findByDestination(flights, "FRA");
        System.out.println("Vuelo disponible con destino a FRA");
        resultado1.ifPresent(System.out::println);
        System.out.println("--- FINALIZANDO TEST FINDBYDESTINATION ---");

        System.out.println("--- INICIANDO TEST FINDBYORIGIN ---");
        Optional<Flight> resultado2 = service.findByOrigin(flights, "MAD");
        System.out.println("Vuelo disponible con origen en MAD");
        resultado2.ifPresent(System.out::println);
        System.out.println("--- FINALIZANDO TEST FINDBYORIGIN ---");

        System.out.println(" --- INICIANDO TEST FINDBYISCANCELLED ---");
        Optional<Flight> resultado3 = service.findByIsCancelled(flights, true);
        resultado3.ifPresent(System.out::println);
        System.out.println("--- FINALIZANDO TEST FINBBYISCANCELLED ---");

        System.out.println(" --- INICIANDO TEST FINDBYISNOTCANCELLED ---");
        Optional<Flight> resultado4 = service.findByIsNotCancelled(flights, false);
        resultado4.ifPresent(System.out::println);
        System.out.println("--- FINALIZANDO TEST FINBBYISNOTCANCELLED ---");

        System.out.println("--- INICIANDO TEST FINDBYIDCLASSIC ---");
        Flight resultado5 = service.findByIdClassic(flights, "1");
        System.out.println("Vuelo disponbile con el id 1: " + resultado5);
        System.out.println("--- FINALIZANDO TEST FINDBYIDCLASSIC ---");

        System.out.println("--- INICIANDO TEST FINDBYORIGINCLASSIC ---");
        Flight resultado6 = service.findByOriginClassic(flights, "MAD");
        System.out.println("Vuelo disponible con el origen MAD: " + resultado6);
        System.out.println("--- FINALIZANDO TEST FINDBYORIGINCLASSIC ---");

        System.out.println("--- INICIANDO TEST FINDBYDESTINATIONCLASSIC ---");
        Flight resultado7 = service.findByDestinationClassic(flights, "AMS");
        System.out.println("Vuelo disponible con el destino AMS: " + resultado7);
        System.out.println("--- FINALIZANDO TEST FINDBYDESTINATIONCLASSIC ---");

        System.out.println("--- INICIANDO TEST FINDBYBASEPRICECLASSIC ---");
        Flight resultado8 = service.findByBasePrice(flights, 300.0);
        System.out.println("Vuelo disponible con el valor de 300.0: " + resultado8);
        System.out.println("--- FINALIZANDO TEST FINDBYBASEPRICECLASSIC ---");

        System.out.println("--- INICIANDO TEST FINDBYISCANCELLEDCLASSIC ---");
        Flight resultado9 = service.findByIsCancelledClassic(flights, true);
        System.out.println("Vuelo cancelado: " + resultado9);
        System.out.println("--- FINALIZANDO TEST FINDBYISCANCELLEDCLASSIC ---");

        System.out.println("--- INICIANDO TEST FILTERBYORIGIN ---");
        Flight resultado10 = service.filterByOrigin(flights, origin)

    }
}

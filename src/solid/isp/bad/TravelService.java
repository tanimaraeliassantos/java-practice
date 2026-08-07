package solid.isp.bad;

import java.util.List;

import model.Flight;

public interface TravelService {
    List<Flight> searchFlights(String origin, String destination);

    List<Hotel> searchHotels(String city);

    CarRental rentCar(String city);

    Insurance getInsurance(String type);

    void bookTrain(String route);

}

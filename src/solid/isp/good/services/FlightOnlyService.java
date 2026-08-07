package solid.isp.good.services;

import java.util.ArrayList;
import java.util.List;

import solid.ocp.good.models.Flight;

public class FlightOnlyService implements FlightSearchable {
    public List<Flight> searchFlights(String origin, String destination) {
        return new ArrayList<>();
    }

}

public class FlightOnlyService implements HotelSearchable {
    public List<Hotel> searchHotels(String city) {
        return new ArrayList<>();
    }
}

public class FlightOnlyService implements CarRentable {
    public List<CarRental> rentCar(String city) {
        return new ArrayList<>();
    }
}

public class FullTravelService implements FlightSearchable, HotelSearchable, CarRentable {
    public List<Flight> searchFlights(String o, String d) {
        return null;
    }

    public List<Hotel> searchHotels(String city) {
        return null;
    }

    public CarRental rentCar(String city) {
        return null;
    }
}

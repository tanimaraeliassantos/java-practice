package solid.isp.good.services;

import java.util.List;

public interface HotelSearchable {
    List<Hotel> searchHotels(String city);
}

import java.util.ArrayList;
import java.util.List;

public class Airport {

    String name;
    String address;
    String number;
    List<Flight> flight = new ArrayList<>();
    List<Flight> airlines = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Flight> getFlight() {
        return flight;
    }

    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

    public List<Flight> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Flight> airlines) {
        this.airlines = airlines;
    }
}

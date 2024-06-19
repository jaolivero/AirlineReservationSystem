public class Reservation {

    Customer customer;

    Flight flight;

    private String confirmationNumber;


    public Reservation(Customer customer, Flight flight) {
        this.customer = customer;
        this.flight = flight;
    }
}

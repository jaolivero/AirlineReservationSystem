public class Customer {

    private static int  id;
    private String firstName;
    String lastName;

    Flight flight;

    boolean checkedIn;

    String email;

    public Customer(String firstName, String lastName, Flight flight, boolean checkedIn, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flight = flight;
        this.checkedIn = checkedIn;
        this.email = email;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", flight=" + flight +
                ", checkedIn=" + checkedIn +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public String toString() {
        return street + "\n" + city + ", " + state + " " + zip;
    }
}

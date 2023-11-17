package app.entity;

public class Address {

    private final String city;
    private final String street;
    private final String house;

    public Address(String city, String street, String house) {

        this.city = city;
        this.street = street;
        this.house = house;
    }
    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }
}

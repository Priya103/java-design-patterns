package main.java.com.iluwatar.microservices.dto;

public class Address {
    private String city;
    private String address;
    private String state;
    private String pinCode;

    public Address(String city, String address, String state, String pinCode) {
        this.city = city;
        this.address = address;
        this.state = state;
        this.pinCode = pinCode;
    }
}

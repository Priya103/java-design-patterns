package main.java.com.iluwatar.microservices.dto;

public class WareHouse {
    public String code;
    public Address address;
    public int totalContainer;

    public WareHouse(String code, Address address, int totalContainer) {
        this.code = code;
        this.address = address;
        this.totalContainer = totalContainer;
    }
}

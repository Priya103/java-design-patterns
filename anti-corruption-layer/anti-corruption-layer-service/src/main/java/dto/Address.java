package dto;

public class Address {
    private String city;
    private String address;
    private String state;
    private Long pinCode;

    public Address(String city, String address, String state, Long pinCode) {
        this.city = city;
        this.address = address;
        this.state = state;
        this.pinCode = pinCode;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public Long getPinCode() {
        return pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}

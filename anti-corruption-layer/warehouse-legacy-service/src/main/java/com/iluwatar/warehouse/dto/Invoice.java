package main.java.com.iluwatar.microservices.dto;

public class Invoice {
    private Address from;
    private Address to;
    private double amount;

    public Invoice(Address from, Address to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}

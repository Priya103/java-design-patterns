package main.java.com.iluwatar.microservices.dto;

public class Product {
    private String name;
    private String type;
    private double pricePerItem;
    private String quantity;
    private Size size;
    private boolean isGift;
    private boolean colour;

    public Product(String name, String type, double pricePerItem, String quantity, Size size, boolean isGift, boolean colour) {
        this.name = name;
        this.type = type;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.size = size;
        this.isGift = isGift;
        this.colour = colour;
    }
}

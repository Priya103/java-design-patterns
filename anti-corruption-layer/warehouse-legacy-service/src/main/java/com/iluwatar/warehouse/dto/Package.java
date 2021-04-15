package main.java.com.iluwatar.microservices.dto;

public class Package {

    private float length;
    private float width;
    private float height;
    private String colour;
    private boolean isGift;
    private Invoice invoice;
    private boolean isFragile;

    public Package(float length, float width, float height, String colour, boolean isGift, Invoice invoice, boolean isFragile) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.colour = colour;
        this.isGift = isGift;
        this.invoice = invoice;
        this.isFragile = isFragile;
    }
}

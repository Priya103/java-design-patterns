package dto;

public class Product {
    private String name;
    private String type;
    private Double pricePerItem;
    private Integer quantity;
    private Size size;
    private Boolean isGift;
    private String colour;

    public Product(String name, String type, Double pricePerItem, Integer quantity, Size size, Boolean isGift, String colour) {
        this.name = name;
        this.type = type;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
        this.size = size;
        this.isGift = isGift;
        this.colour = colour;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getPricePerItem() {
        return pricePerItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Size getSize() {
        return size;
    }

    public Boolean getGift() {
        return isGift;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pricePerItem=" + pricePerItem +
                ", quantity=" + quantity +
                ", size=" + size +
                ", isGift=" + isGift +
                ", colour='" + colour + '\'' +
                '}';
    }
}

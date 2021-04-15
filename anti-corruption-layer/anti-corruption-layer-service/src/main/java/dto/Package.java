package dto;

public class Package {

    private Float length;
    private Float width;
    private Float height;
    private String colour;
    private Boolean isGift;
    private Invoice invoice;
    private Boolean isFragile;
    private Product product;

    public Package(Float length, Float width, Float height, String colour, Boolean isGift, Invoice invoice, Boolean isFragile, Product product) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.colour = colour;
        this.isGift = isGift;
        this.invoice = invoice;
        this.isFragile = isFragile;
        this.product = product;
    }

    public Package() {
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Boolean getGift() {
        return isGift;
    }

    public void setGift(Boolean gift) {
        isGift = gift;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Boolean getFragile() {
        return isFragile;
    }

    public void setFragile(Boolean fragile) {
        isFragile = fragile;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Package{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", colour='" + colour + '\'' +
                ", isGift=" + isGift +
                ", invoice=" + invoice +
                ", isFragile=" + isFragile +
                ", product=" + product +
                '}';
    }
}

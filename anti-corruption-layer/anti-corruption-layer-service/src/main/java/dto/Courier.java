package dto;

public class Courier {
    private final Float length;
    private final Float width;
    private final Float height;
    private final Boolean isFragile;

    public Courier(Float length, Float width, Float height, Boolean isFragile) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.isFragile = isFragile;
    }
}

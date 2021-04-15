package main.java.com.iluwatar.microservices.dto;

public class PackageItem {
    private Package aPackage;
    private WareHouse wareHouse;

    public PackageItem(Package aPackage, WareHouse wareHouse) {
        this.aPackage = aPackage;
        this.wareHouse = wareHouse;
    }
}

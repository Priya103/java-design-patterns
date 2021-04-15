package dto;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    public Integer code;
    public Address address;
    public Integer totalContainer;
    public List<PackageItem> itemsToBeShipped = new ArrayList<>();

    public WareHouse() {
        this.address = new Address("Pune","91 Hello Appartment","Maharastra",208778L);
        this.code = 2123;
        this.totalContainer= 45;
        itemsToBeShipped.add(new PackageItem());
    }
    public List<PackageItem> getItemsToBeShipped() {
        return itemsToBeShipped;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "code=" + code +
                ", address=" + address +
                ", totalContainer=" + totalContainer +
                ", itemsToBeShipped=" + itemsToBeShipped +
                '}';
    }
}

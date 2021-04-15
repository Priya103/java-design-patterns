package service;

import com.iluwatar.warehouse.dto.PackageItem;
import com.iluwatar.warehouse.dto.WareHouse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WareHouseService {

    public List<PackageItem> getListOfPackages()
    {
        WareHouse wareHouse = new WareHouse();
        return wareHouse.getItemsToBeShipped();
    }
}

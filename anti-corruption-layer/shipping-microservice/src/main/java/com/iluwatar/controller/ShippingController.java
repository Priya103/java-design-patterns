

import com.iluwatar.microservice.dto.Courier;
import com.iluwatar.service.CourierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller providing endpoints to retrieve product inventories.
 */
@RestController
public class ShippingController {

    private CourierService courierService;

    public ShippingController(CourierService courierService) {
        this.courierService = courierService;
    }

    /**
     * Endpoint which receive the packaged courier and deliver to its destination
     * @return
     */
    @RequestMapping(value = "/courier", method = RequestMethod.POST)
    public ResponseEntity<String> sendCouriers(@RequestBody List<Courier> couriers) {
        courierService.sendCouriers(couriers);
        return new ResponseEntity<String>("Items shipped", HttpStatus.ACCEPTED);
    }

}

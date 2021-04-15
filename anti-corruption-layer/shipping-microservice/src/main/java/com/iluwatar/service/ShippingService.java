package com.iluwatar.service;

import com.iluwatar.microservice.dto.Courier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierService {
    //Identify cost of courier and dispatch for delivery

    public void sendCouriers(List<Courier> couriers) {
        for(Courier courier: couriers) {
            //Call delivery service to assign delivery person and all.... logic goes here
            System.out.println("Item dispatched for delivery with courier cost "+ courier.cost());
        }
    }
}

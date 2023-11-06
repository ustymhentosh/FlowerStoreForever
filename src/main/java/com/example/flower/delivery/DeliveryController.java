package com.example.flower.delivery;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/flowers")
public class DeliveryController {
    
    @GetMapping("/delivery")
    public List getDeliveryStrategies() {
        return List.of(DHLDeliveryStrategy.class, PostDeliveryStrategy.class);
    }

}
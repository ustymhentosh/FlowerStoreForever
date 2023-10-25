package flower.payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers")
public class PaymentController {
    
    @GetMapping("/payment")
    public List getDeliveryStrategies() {
        return List.of(
            PayPalPaymentStrategy.class,
            CreditCardPaymentStrategy.class);
    }

}
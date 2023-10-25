package flower.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import flower.payment.PaymentController;


@WebMvcTest(PaymentController.class)
public class EndpointsTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testDeliveryStrategies() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/api/flowers/delivery"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testPaymentStrategies() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/api/flowers/payment"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
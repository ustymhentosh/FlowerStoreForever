package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentControllerTest {

    @Test
    public void testGetPaymentStrategies() throws IOException {

        URL url = new URL("http://localhost:8080" + "/api/flowers/payment");

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        assertEquals(200, responseCode);

        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            String responseContent = content.toString();

            assertTrue(responseContent.contains("PayPalPaymentStrategy"));
            assertTrue(responseContent.contains("CreditCardPaymentStrategy"));
        } else {
            // Handle the case where the request did not return a 200 status code
        }
        connection.disconnect();
    }

    @Test
    public void testGetDeliveryStrategies() throws IOException {

        URL url = new URL("http://localhost:8080" + "/api/flowers/delivery");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        assertEquals(200, responseCode);

        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            String responseContent = content.toString();

            assertTrue(responseContent.contains("DHLDeliveryStrategy"));
            assertTrue(responseContent.contains("PostDeliveryStrategy"));
        } else {
            // Handle the case where the request did not return a 200 status code
        }
        connection.disconnect();
    }
}

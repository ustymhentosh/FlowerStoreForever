package flower.control;

import java.util.List;

import flower.delivery.Delivery;
import flower.payment.Payment;
import flower.store.Item;
import lombok.Getter;

@Getter
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment stratedy) {
        this.payment = stratedy;
    }

    public void setDeliveryStrategy(Delivery stratedy) {
        this.delivery = stratedy;
    }

    public float calculateTotalPrice() {
        float totalPrice = 0;
        for (int i = 0; i < this.items.size(); i++){
            totalPrice += this.items.get(i).getPrice();
        }
        return totalPrice;
    }

    public void placeOrder() {
        System.out.println("Order Placed");
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }
}

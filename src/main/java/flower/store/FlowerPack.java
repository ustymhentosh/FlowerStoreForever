package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int someQuantity) {
        if (someQuantity < 1) {
            this.quantity = 1;
        } else {
            this.quantity = someQuantity;
        }
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}

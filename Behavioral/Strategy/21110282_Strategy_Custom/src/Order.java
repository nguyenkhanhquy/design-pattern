public class Order {

    public void shipOrder(ShippingStrategy shippingStrategy) {
        if (shippingStrategy != null) {
            shippingStrategy.ship(this);
        } else {
            System.out.println("No shipping strategy provided.");
        }
    }

}

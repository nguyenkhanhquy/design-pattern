public class Order {

    private final String customerName;
    private final String customerAddress;
    private final int price;

    public void shipOrder(ShippingStrategy shippingStrategy) {
        if (shippingStrategy != null) {
            shippingStrategy.ship(this);
        } else {
            System.out.println("No shipping strategy provided.");
        }
    }

    public Order(String customerName, String customerAddress, int price) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", price=" + price +
                '}';
    }

}

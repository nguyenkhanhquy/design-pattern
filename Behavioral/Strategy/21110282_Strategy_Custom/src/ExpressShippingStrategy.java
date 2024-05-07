public class ExpressShippingStrategy implements ShippingStrategy {

    @Override
    public void ship(Order order) {
        System.out.println(order.toString() + " - Using express shipping");
    }

}

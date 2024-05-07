public class NormalShippingStrategy implements ShippingStrategy {

    @Override
    public void ship(Order order) {
        System.out.println(order.toString()  + " - Using normal shipping");
    }

}

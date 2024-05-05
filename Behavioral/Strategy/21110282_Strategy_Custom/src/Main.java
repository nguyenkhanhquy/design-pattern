public class Main {

    public static void main(String[] args) {
        // Tạo đơn hàng
        Order order = new Order();

        // Vận chuyển bằng phương thức vận chuyển Normal Shipping
        ShippingStrategy normalShippingStrategy = new NormalShippingStrategy();
        order.shipOrder(normalShippingStrategy);

        // Vận chuyển bằng phương thức vận chuyển Express Shipping
        ShippingStrategy expressShippingStrategy = new ExpressShippingStrategy();
        order.shipOrder(expressShippingStrategy);
    }

}

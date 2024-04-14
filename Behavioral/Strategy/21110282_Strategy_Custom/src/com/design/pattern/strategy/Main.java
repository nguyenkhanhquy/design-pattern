package com.design.pattern.strategy;

public class Main {

    public static void main(String[] args) {
        // Tạo đơn hàng
        Order order = new Order(new NormalShipping());
        // Vận chuyển đơn hàng
        order.shipOrder();

        // Thay đổi phương thức vận chuyển
        order.setShippingStrategy(new ExpressShipping());
        // Vận chuyển đơn hàng
        order.shipOrder();
    }

}

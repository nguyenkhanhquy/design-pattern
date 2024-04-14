package com.design.pattern.strategy;

public class ExpressShipping implements ShippingStrategy {

    @Override
    public void ship(Order order) {
        System.out.println("Express Shipping");
    }

}

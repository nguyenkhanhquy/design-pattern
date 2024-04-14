package com.design.pattern.strategy;

public class NormalShipping implements ShippingStrategy {

    @Override
    public void ship(Order order) {
        System.out.println("Normal Shipping");
    }

}

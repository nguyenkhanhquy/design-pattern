package com.design.pattern.mediator;

public class Developer extends Colleague {

    public Developer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Developer received: " + message);
    }

}

package com.design.pattern.mediator;

public class Tester extends Colleague {

    public Tester(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Tester received: " + message);
    }

}

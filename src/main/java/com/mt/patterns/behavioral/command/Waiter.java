package com.mt.patterns.behavioral.command;

/*
 * The invoker gets the order(command)
 * */
public class Waiter {

    private final Order order;

    public Waiter(Order order) {
        this.order = order;
    }

    public void submitOrder() {
        order.execute();
    }
}

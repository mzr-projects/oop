package com.mt.patterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

/*
* One of the orders
* The command needs to know who is the target(here it the cook) and what action it needs to do(receiver methods)
* */
@Slf4j
public class OrderSalad implements Order {

    private final Cook cook;

    public OrderSalad(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        log.info("Order salad");
        cook.prepareSalad();
    }
}

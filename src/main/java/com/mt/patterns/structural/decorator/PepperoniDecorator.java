package com.mt.patterns.structural.decorator;

public class PepperoniDecorator extends PizzaToppingDecorator {

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " add pepperoni";
    }

    @Override
    public double getPrice() {
        return 2.0 + pizza.getPrice();
    }
}

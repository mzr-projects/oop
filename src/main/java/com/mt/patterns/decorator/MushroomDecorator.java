package com.mt.patterns.decorator;

public class MushroomDecorator extends PizzaToppingDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " add mushroom";
    }

    @Override
    public double getPrice() {
        return 3.4 + pizza.getPrice();
    }
}

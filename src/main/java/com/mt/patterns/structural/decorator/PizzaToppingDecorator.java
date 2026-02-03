package com.mt.patterns.structural.decorator;

public abstract class PizzaToppingDecorator implements Pizza {

    /*
    * Here in our decorator we have a reference to the object we are decorating
    * */
    protected Pizza pizza;

    public PizzaToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}

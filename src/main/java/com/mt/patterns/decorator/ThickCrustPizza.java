package com.mt.patterns.decorator;

public class ThickCrustPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thick crust pizza";
    }

    @Override
    public double getPrice() {
        return 6.8;
    }
}

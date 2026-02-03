package com.mt.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThinCrustPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin crust pizza";
    }

    @Override
    public double getPrice() {
        return 5.7;
    }
}

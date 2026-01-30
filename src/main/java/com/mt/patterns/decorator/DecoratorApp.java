package com.mt.patterns.decorator;

import lombok.extern.slf4j.Slf4j;

/*
* Add new behavior to an existing object at run-time
* Decorator is actually the sub-class of What we're going to decorate
* */
@Slf4j
public class DecoratorApp {

    static void main() {
        Pizza p1 = new ThickCrustPizza();
        log.info("Pizza 1: {}, price: {}", p1.getDescription(), p1.getPrice());

        Pizza p2 = new ThinCrustPizza();
        log.info("Pizza 2: {}, price: {}", p2.getDescription(), p2.getPrice());

        Pizza p3 = new ThickCrustPizza();
        p3 = new PepperoniDecorator(p3);
        log.info("Pizza 3: {}, price: {}", p3.getDescription(), p3.getPrice());

        Pizza p4 = new ThickCrustPizza();
        p4 = new PepperoniDecorator(p4);
        p4 = new MushroomDecorator(p4);
        p4 = new PepperoniDecorator(p4);
        log.info("Pizza 3: {}, price: {}", p4.getDescription(), p4.getPrice());
    }

}

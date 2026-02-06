package com.mt.patterns.behavioral.strategy.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WoodenDuck extends Duck {

    public void render() {
        log.info("Wooden Duck render");
    }
}

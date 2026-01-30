package com.mt.patterns.strategy.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RubberDuck extends Duck {

    public void render() {
        log.info("Rubber Duck render");
    }
}

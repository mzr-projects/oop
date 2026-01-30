package com.mt.patterns.strategy.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {

    @Override
    public void render() {
        log.info("Mallard Duck render");
    }
}

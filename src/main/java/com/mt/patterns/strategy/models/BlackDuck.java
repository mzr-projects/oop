package com.mt.patterns.strategy.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlackDuck extends Duck {

    @Override
    public void render() {
        log.info("Black Duck render");
    }
}

package com.mt.patterns.strategy.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WingFlier implements FlightBehavior {

    @Override
    public void fly() {
        log.info("WingFlier flying");
    }
}

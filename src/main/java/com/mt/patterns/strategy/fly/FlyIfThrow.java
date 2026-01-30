package com.mt.patterns.strategy.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyIfThrow implements FlightBehavior {

    @Override
    public void fly() {
        log.info("Cant fly if being thrown...");
    }
}

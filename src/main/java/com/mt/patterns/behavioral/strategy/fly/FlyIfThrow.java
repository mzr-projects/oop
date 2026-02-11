package com.mt.patterns.behavioral.strategy.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyIfThrow implements FlightBehavior {

    @Override
    public void fly() {
        log.info("Can fly if being thrown...");
    }
}

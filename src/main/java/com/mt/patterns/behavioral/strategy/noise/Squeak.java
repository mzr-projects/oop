package com.mt.patterns.behavioral.strategy.noise;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Squeak implements NoiseBehavior {

    @Override
    public void makeNoise() {
        log.info("Squeak has been made");
    }
}

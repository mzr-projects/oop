package com.mt.patterns.strategy.models;

import com.mt.patterns.strategy.fly.FlightBehavior;
import com.mt.patterns.strategy.noise.NoiseBehavior;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public abstract class Duck {

    private String name;

    /*
     * Here we are adding behaviors using composition to make the strategies for flying and making noise
     * */
    private FlightBehavior flightBehavior;
    private NoiseBehavior noiseBehavior;

    public abstract void render();

    public void swim() {
        log.info("All Ducks at least can float !!!");
    }

    public void doFly() {
        if (flightBehavior != null) {
            this.flightBehavior.fly();
        }
    }

    public void doNoise() {
        if (noiseBehavior != null) {
            noiseBehavior.makeNoise();
        }
    }
}
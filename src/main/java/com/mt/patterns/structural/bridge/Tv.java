package com.mt.patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tv implements Device {

    @Override
    public void turnOff() {
        log.info("Tv TurnOff");
    }

    @Override
    public void turnOn() {
        log.info("Tv TurnOn");
    }

    @Override
    public void setChannel(int channel) {
        log.info("Tv SetChannel to {}", channel);
    }

    @Override
    public void setVolume(int volume) {
        log.info("Tv SetVolume to {}", volume);
    }
}

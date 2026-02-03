package com.mt.patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Radio implements Device {

    @Override
    public void turnOff() {
        log.info("Radio TurnOff");
    }

    @Override
    public void turnOn() {
        log.info("Radio TurnOn");
    }

    @Override
    public void setChannel(int channel) {
        log.info("Radio SetChannel to {}", channel);
    }

    @Override
    public void setVolume(int volume) {
        log.info("Radio SetVolume to {}", volume);
    }
}

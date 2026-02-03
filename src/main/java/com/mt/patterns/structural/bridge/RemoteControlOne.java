package com.mt.patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoteControlOne extends RemoteControl {

    public RemoteControlOne(Device device) {
        super(device);
    }

    @Override
    public void turnOff() {
        log.info("Remote control two turnOff");
        device.turnOff();
    }

    @Override
    public void turnOn() {
        log.info("Remote control two turnOn");
        device.turnOn();
    }

    @Override
    public void setChannel(int channel) {
        log.info("Remote control one setChannel");
        device.setChannel(channel);
    }
}

package com.mt.patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoteControlTwo extends RemoteControl {

    public RemoteControlTwo(Device device) {
        super(device);
    }

    @Override
    public void turnOff() {
        log.info("Remote control two turnOff");
    }

    @Override
    public void turnOn() {
        log.info("Remote control two turn on");
    }

    @Override
    public void setChannel(int channel) {
        log.info("Remote control two setChannel");
        device.setChannel(channel);
    }

    public void Mute() {
        log.info("remote control two Mute");
        device.setVolume(0);
    }
}

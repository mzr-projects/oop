package com.mt.patterns.structural.bridge;

public interface Device {

    void turnOff();
    void turnOn();
    void setChannel(int channel);
    void setVolume(int volume);
}

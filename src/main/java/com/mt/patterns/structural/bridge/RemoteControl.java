package com.mt.patterns.structural.bridge;

import lombok.Setter;

public abstract class RemoteControl {

    @Setter
    protected int channel;
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOff();

    public abstract void turnOn();
}

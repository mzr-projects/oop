package com.mt.patterns.structural.bridge;

/*
 * Decouples abstraction from its implementation so that the tow can vary independently
 * */
public class BridgeApp {

    static void main(String[] args) {
        Device tv = new Tv();
        Device radio = new Radio();

        RemoteControl tvRemoteControlOne = new RemoteControlOne(tv);
        RemoteControl radioRemoteControlOne = new RemoteControlOne(radio);

        RemoteControl tvRemoteControlTwo = new RemoteControlTwo(tv);
        RemoteControl radioRemoteControlTwo = new RemoteControlTwo(radio);

        tvRemoteControlOne.turnOn();
        tvRemoteControlOne.setChannel(10);
        tvRemoteControlOne.turnOff();

        tvRemoteControlTwo.turnOn();
        tvRemoteControlTwo.setChannel(12);
        ((RemoteControlTwo) tvRemoteControlTwo).Mute();
        tvRemoteControlTwo.turnOff();

        radioRemoteControlOne.turnOn();
        radioRemoteControlOne.setChannel(98);
        ((RemoteControlTwo) radioRemoteControlTwo).Mute();
        radioRemoteControlOne.turnOff();

    }
}


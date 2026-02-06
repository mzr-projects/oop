package com.mt.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver() {
        observers.clear();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public float getHumidity() {
        return (float) (70 + Math.random() * 10);
    }

    public float getTemperature() {
        return (float) (50 + Math.random() * 10);
    }

    public void sensorUpdate() {
        notifyObservers();
    }
}

package com.mt.patterns.behavioral.observer;

public interface Publisher {

    void addObserver(Observer observer);
    void removeObserver();
    void notifyObservers();
}

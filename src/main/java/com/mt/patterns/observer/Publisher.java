package com.mt.patterns.observer;

public interface Publisher {

    void addObserver(Observer observer);
    void removeObserver();
    void notifyObservers();
}

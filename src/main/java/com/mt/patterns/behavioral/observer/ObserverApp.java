package com.mt.patterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverApp {

    static void main() {
        PublisherImpl publisherImpl = new PublisherImpl();
        ObserverImpl observerImpl = new ObserverImpl(publisherImpl);

        log.info("Starting...");

        int counter = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                log.warn(e.getMessage());
                return;
            }

            if (++counter > 5) {
                counter = 0;
                publisherImpl.sensorUpdate();
            }

            observerImpl.updateDisplay();
        }
    }
}

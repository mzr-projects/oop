package com.mt.patterns.behavioral.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class ObserverImpl implements Observer {

    private String data;
    private boolean isNewData;
    private float lastHumidity;
    private float lastTemp;

    private PublisherImpl publisher;

    public ObserverImpl(PublisherImpl publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
        isNewData = false;
        getUpdatedData();
    }

    public void getUpdatedData() {
        log.info("Getting Updated Data...");
        lastHumidity = publisher.getHumidity();
        lastTemp = publisher.getTemperature();
    }

    public void updateDisplay() {
        if (isNewData) {
            getUpdatedData();
            log.info("updateDisplay-> lastHumidity: {}, lastTemp: {}", lastHumidity, lastTemp);
            isNewData = false;
        } else {
            log.warn("No new data.");
        }
    }

    @Override
    public void update() {
        log.info("Observer update");
        isNewData = true;
    }
}

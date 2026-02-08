package com.mt.patterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cook {

    public void prepareSteak() {
        log.info("Prepare Steak");
    }

    public void prepareSalad() {
        log.info("Prepare Salad");
    }
}

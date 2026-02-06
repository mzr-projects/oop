package com.mt.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Talker {

    private final String name;

    Talker(String name) {
        this.name = name;
    }

    public void talk() {
        log.info("{} talks", name);
    }
}

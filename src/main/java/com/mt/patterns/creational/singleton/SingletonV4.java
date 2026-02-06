package com.mt.patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/*
 * JVM guarantees for thread-safety of enums
 * */
@Slf4j
public enum SingletonV4 {
    INSTANCE;

    @Setter
    @Getter
    private String color;

    public void bounce() {
        log.info("Bouncing ball with color {}", color);
    }
}

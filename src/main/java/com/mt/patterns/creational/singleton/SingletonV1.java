package com.mt.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonV1 {

    private static Table instance;

    private SingletonV1() {

    }

    public static Table getInstance() {
        if (instance == null) {
            log.info("Creating Table instance");
            instance = new Table();
            return instance;
        } else {
            log.info("Table already created");
            return instance;
        }
    }
}

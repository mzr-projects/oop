package com.mt.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonV2 {

    private static Table instance;

    private SingletonV2() {

    }

    /*
     * Solving the multi-threading issues
     * */
    public static synchronized Table getInstance() {
        if (instance == null) {
            log.info("Creating Table instance");
            /*
             * Lazy initialization
             * */
            instance = new Table();
            return instance;
        } else {
            log.info("Table already created");
            return instance;
        }
    }
}
